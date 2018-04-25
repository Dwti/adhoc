#coding=utf-8
import model

#单选题
def question_choice():
    t = model.PaperTest()
    q = t.questions
    q.type_id = '1'
    q.template = 'choice'
    q.stem = '请完成这道单选题'
    q.answer = ['0']
    q.analysis = '这是单选题的解析lalalallala'
    q.difficulty = '3'
    q.content.choices = ['选项A','选项B','选项C','选项D']
    point = model.QuestionPoint()
    point.name = '单选题考点'
    q.point = [point]
    q.pad.jsonAnswer = ['1']
    q.extend.data.answerCompare = '这是单选题的作答结果'
    q.extend.data.globalStatis = '这是单选题的个人统计'
    return t

#多选题
def question_multichoice():
    t = model.PaperTest()
    q = t.questions
    q.type_id = '2'
    q.template = 'multi-choice'
    q.stem = '请完成这道多选题'
    q.answer = ['0','1']
    q.analysis = '这是多选题的解析lalalallala'
    q.difficulty = '3'
    q.content.choices = ['选项A','选项B','选项C','选项D']
    point = model.QuestionPoint()
    point.name = '多选题考点'
    q.point = [point]
    q.pad.jsonAnswer = ['1','2']
    q.extend.data.answerCompare = '这是多选题的作答结果'
    q.extend.data.globalStatis = '这是多选题的个人统计'
    return t

#判断题
def question_alter():
    t = model.PaperTest()
    q = t.questions
    q.type_id = '4'
    q.template = 'alter'
    q.stem = '请完成这道判断题'
    q.answer = ['1']
    q.analysis = '这是判断题的解析lalalallala'
    q.difficulty = '3'
    point = model.QuestionPoint()
    point.name = '判断题考点'
    q.point = [point]
    q.pad.jsonAnswer = ['0']
    q.extend.data.answerCompare = '这是判断题的作答结果'
    q.extend.data.globalStatis = '这是判断题的个人统计'
    return t

#填空题
def question_fill():
    t = model.PaperTest()
    q = t.questions
    q.type_id = '3'
    q.template = 'fill'
    q.stem = '这是一道填空题：请填第一个空(_)，<img src="http://tiku.21cnjy.com/tikupic/b8/45/b80458c951161c0dd5fa1a5ed13252e3.png"/>请填第二个空(_)，请填第三个空(_)'
    q.answer = ['one','two','three']
    q.analysis = '这是填空题的解析lalalallala'
    q.difficulty = '3'
    point = model.QuestionPoint()
    point.name = '填空题考点'
    q.point = [point]
    q.pad.jsonAnswer = ['one','two','three']
    q.extend.data.answerCompare = '这是填空题的作答结果'
    q.extend.data.globalStatis = '这是填空题的个人统计'
    return t

#主观题
def question_answer():
    t = model.PaperTest()
    q = t.questions
    q.type_id = '3'
    q.template = 'answer'
    q.stem = '请完成这道主观题，需要上传图片哦'
    q.answer = ['这是主观题的答案啦啦啦啦啦啦']
    q.analysis = '这是主观题的解析lalalallala'
    q.difficulty = '3'
    point = model.QuestionPoint()
    point.name = '主观题考点'
    q.point = [point]
    q.pad.jsonAnswer = ['http://pic.qiantucdn.com/58pic/15/40/27/49B58PICXHQ_1024.jpg','http://pic.qiantucdn.com/58pic/15/40/27/49B58PICXHQ_1024.jpg']
    q.extend.data.answerCompare = '这是主观题的作答结果'
    q.extend.data.globalStatis = '这是主观题的个人统计'
    q.pad.status = '5'
    q.pad.teachercheck.score = '5'
    q.pad.jsonAudioComment.append({'length':'3','url':'http://scc.jsyxw.cn/audio/2017/0215/file_58a3bd901224b.mp3'})
    q.pad.jsonAudioComment.append({'length':'2','url':'http://scc.jsyxw.cn/audio/2017/0215/file_58a3bd9948c66.mp3'})
    q.pad.jsonAudioComment.append({'length':'7','url':'http://scc.jsyxw.cn/audio/2017/0215/file_58a3be693cc8e.mp3'})
    return t

#归类题
def question_classify():
    t = model.PaperTest()
    q = t.questions
    q.type_id = '13'
    q.template = 'classify'
    q.stem = '请完成这道归类题'
    q.answer = [{'name':'水果','answer':'0,1'},{'name':'汽车','answer':'2,3'}]
    q.analysis = '这是归类题的解析lalalallala'
    q.difficulty = '3'
    q.content.choices = ['苹果', '梨', '奔驰', '宝马']
    point = model.QuestionPoint()
    point.name = '归类题考点'
    q.point = [point]
    q.pad.jsonAnswer = ['0,1','2,3']
    q.extend.data.answerCompare = '这是归类题的作答结果'
    q.extend.data.globalStatis = '这是归类题的个人统计'
    return t

#连线题
def question_connect():
    t = model.PaperTest()
    q = t.questions
    q.type_id = '7'
    q.template = 'connect'
    q.stem = '请完成这道连线题'
    q.answer = [{'answer':'0,2'},{'answer':'1,3'}]
    q.analysis = '这是连线题的解析lalalallala'
    q.difficulty = '3'
    q.content.choices = ['中国', '法国', '<p>函数<img src=\"http://scc.jsyxw.cn/image/qs/47/1850047/852865a8bf937ce39b5b9cebfcac5a55.png\" >的定义域是（　　）</p>', '欧洲']
    point = model.QuestionPoint()
    point.name = '连线题考点'
    q.point = [point]
    q.pad.jsonAnswer = ['0,2','1,3']
    q.extend.data.answerCompare = '这是连线题的作答结果'
    q.extend.data.globalStatis = '这是连线题的个人统计'
    return t

#复合题
def question_multi():
    t = model.PaperTest()
    q = t.questions
    q.type_id = '14'
    q.template = 'multi'
    q.stem = '请完成这道复合题---首节开打，美国队延续了之前几场的慢热。尽管，杜兰特和巴恩斯的三分球，一度帮他们9-2领先。但在防守端，梦之队却表现的非常松散，尼日利亚这边，尤佐突破暴扣得手，尼日利亚将分差迫近到1分。'
    return t

#完形填空
def question_cloze():
    t = model.PaperTest()
    q = t.questions
    q.type_id = '15'
    q.template = 'cloze'
    q.stem = '请完成这道完形填空，添加小题时请保证题干中空的数量与小题数量一致'
    return t

#听力复合题
def question_listen():
    t = model.PaperTest()
    q = t.questions
    q.type_id = '9'
    q.template = 'listen'
    q.stem = '请听这段语音并完成这道听力题'
    q.url = 'http://data.5sing.kgimg.com/G064/M0B/16/1B/IJQEAFeZk5qAW5N1AJhfREa5tSk663.mp3'
    return t

