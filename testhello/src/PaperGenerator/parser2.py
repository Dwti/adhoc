#coding=utf-8
import key,question,model,sys,re,os

def endParsing(s):
    print(s)
    print('Parsing failed!')
    sys.exit(1)

def parseFolder(folderpath):
    fileList = [f for f in os.listdir(folderpath)
                if os.path.isfile(os.path.join(folderpath,f))
                if os.path.splitext(f)[1] != '']

    paperContainer = model.PaperContainer()
    for f in fileList:
        paperContainer.data.append(parseFile(os.path.join(folderpath,f)))

    return paperContainer

def parseFile(filePath):
    paper = model.Paper()

    filename = os.path.split(filePath)[1]
    paper.name = os.path.splitext(filename)[0]

    print('Begin parsing file {} ...'.format(filename))
    f = open(filePath)
    questionDataList, otherDataList = parseLines(f.readlines())
    f.close()
    print('There are %d questions.' %len(questionDataList))
    index = 1
    for questionData in questionDataList:
        print('Begin parsing question %d ...' % index)
        q = parseQuestion(questionData)
        paper.paperTest.append(q)
        print('Parsing question %d complete!' %index)
        index = index+1

    print('Parsing file {} complete!'.format(filename))
    return paper

def parseLines(lineList):
    questionDataList = []
    questionTagStack = []
    questionData = []
    otherDataList = []

    for line in lineList:
        l = line.strip()
        if len(l)==0 or l.startswith('#') or l.startswith('//'):
            continue

        if len(questionTagStack) == 0:
            if l.startswith(key.QUESTION.upper()):
                questionTagStack.append(1)
                questionData.append(l)
            else:
                if re.match(r'.*=',l):
                    otherDataList.append(l)
                else:
                    if len(otherDataList)>0:
                        otherDataList[-1]=otherDataList[-1]+l
        else:
            questionData.append(l)
            if l.startswith(key.QUESTION.upper()):
                questionTagStack.append(1)
            elif l.startswith(key.END.upper()):
                questionTagStack.pop()
                if len(questionTagStack) == 0:
                    questionDataList.append(questionData)
                    questionData = []

    return (questionDataList, otherDataList)

def parseQuestion(data):
    pt = model.PaperTest()

    templateStr = data[0].split(':')[1].strip()
    tkey = templateStr.split('=')[0].strip()
    if tkey == key.TEMPLATE.upper():
        tvalue = templateStr.split('=')[1].strip()
        tvalue = tvalue.replace('-','')
        funcname = 'question_%s' % tvalue
        if hasattr(question, funcname) is False:
            endParsing('Error: Template name {} not recognized!'.format(tvalue))

        pt = getattr(question, funcname)()

    data.pop(0)
    data.pop()
    questionDataList, otherDataList = parseLines(data)
    for questionData in questionDataList:
        q = parseQuestion(questionData)
        pt.questions.children.append(q)

    parserModule = sys.modules[__name__]
    for line in otherDataList:
        arr = line.split('=',1)
        name = arr[0].strip()
        value = arr[1].strip()
        funcname = 'parse_%s' %name.lower()
        if hasattr(parserModule, funcname) is False:
            endParsing('Error: Key name {} not recognized!'.format(name))

        parseFunc = getattr(parserModule,funcname)
        parseFunc(pt, value)

    return pt

def elementsFromString(s):
    return [e.strip() for e in s.split('|') if len(e.strip())>0]

def parse_stem(pt, value):
    pt.questions.stem = value

def parse_option(pt, value):
    pt.questions.content.choices = elementsFromString(value)

def parse_type_id(pt, value):
    pt.questions.type_id = value

def parse_correct_answer(pt, value):
    answerArr = elementsFromString(value)
    template = pt.questions.template
    if template == 'classify' or template == 'connect':
        if len(pt.questions.answer) != len(answerArr):
            pt.questions.answer = []
            for i in range(len(answerArr)):
                pt.questions.answer.append({})
        for i in range(len(answerArr)):
            answer = answerArr[i]
            dic = pt.questions.answer[i]
            dic['answer'] = answer
    else:
        pt.questions.answer = answerArr

def parse_my_answer(pt, value):
    answerArr = elementsFromString(value)
    pt.questions.pad.jsonAnswer = answerArr

def parse_class_name(pt, value):
    nameArr = elementsFromString(value)
    template = pt.questions.template
    if template == 'classify' or template == 'connect':
        if len(pt.questions.answer) != len(nameArr):
            pt.questions.answer = []
            for i in range(len(nameArr)):
                pt.questions.answer.append({})
        for i in range(len(nameArr)):
            name = nameArr[i]
            dic = pt.questions.answer[i]
            dic['name'] = name

def parse_check_status(pt, value):
    pt.questions.pad.status = value

def parse_score(pt, value):
    pt.questions.pad.teachercheck.score = value

def parse_audio_comment(pt, value):
    pt.questions.pad.jsonAudioComment = []
    commentArr = elementsFromString(value)
    for element in commentArr:
        arr = element.split(',',1)
        item = model.QuestionAudioComment()
        item.length = arr[0]
        item.url = arr[1]
        pt.questions.pad.jsonAudioComment.append(item)

def parse_audio_url(pt, value):
    pt.questions.url = value

def parse_analysis(pt, value):
    pt.questions.analysis = value

def parse_answer_result(pt, value):
    pt.questions.extend.data.answerCompare = value

def parse_statistics(pt, value):
    pt.questions.extend.data.globalStatis = value

def parse_knowledge_point(pt, value):
    pt.questions.point = []
    pointArr = elementsFromString(value)
    for element in pointArr:
        item = model.QuestionPoint()
        item.name = element
        pt.questions.point.append(item)
