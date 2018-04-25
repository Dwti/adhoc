#coding=utf-8

class PaperBase:
    pass

class PaperContainer(PaperBase):
    def __init__(self):
        self.data = []

class Paper(PaperBase):
    def __init__(self):
        self.id = ''
        self.ptype = ''
        self.authorid = ''
        self.name = ''
        self.subjectid = ''
        self.bedition = ''
        self.stageid = ''
        self.gradeid = ''
        self.volume = ''
        self.chapterid = ''
        self.sectionid = ''
        self.begintime = ''
        self.buildtime = ''
        self.quesnum = ''
        self.endtime = ''
        self.status = ''
        self.subjectName = ''
        self.editionName = ''
        self.volumeName = ''
        self.stageName = ''
        self.chapterName = ''
        self.cellid = ''
        self.showana = ''
        self.paperTest = []
        self.paperStatus = PaperStatus()

class PaperStatus(PaperBase):
    def __init__(self):
        self.id = ''
        self.uid = ''
        self.tid = ''
        self.ppid = ''
        self.status = '2'
        self.begintime = ''
        self.endtime = ''
        self.costtime = ''

class PaperTest(PaperBase):
    def __init__(self):
        self.id = ''
        self.qid = ''
        self.pid = ''
        self.status = ''
        self.sectionid = ''
        self.isfavorite = ''
        self.difficulty = ''
        self.wqid = ''
        self.questions = Question()

class Question(PaperBase):
    def __init__(self):
        self.id = ''
        self.stem = ''
        self.type_id = ''
        self.template = ''
        self.analysis = ''
        self.difficulty = ''
        self.url = ''
        self.wqid = ''
        self.content = QuestionContent()
        self.answer = []
        self.point = []
        self.children = []
        self.pad = QuestionPad()
        self.extend = QuestionExtend()

class QuestionContent(PaperBase):
    def __init__(self):
        self.choices = []

class QuestionPoint(PaperBase):
    def __init__(self):
        self.id = ''
        self.name = ''

class QuestionPad(PaperBase):
    def __init__(self):
        self.id = ''
        self.uid = ''
        self.ptid = ''
        self.status = ''
        self.costtime = ''
        self.jsonAnswer = []
        self.teachercheck = QuestionTeacherCheck()
        self.jsonAudioComment = []

class QuestionAudioComment(PaperBase):
    def __init__(self):
        self.url = ''
        self.length = ''

class QuestionTeacherCheck(PaperBase):
    def __init__(self):
        self.qcomment = ''
        self.score = ''

class QuestionExtend(PaperBase):
    def __init__(self):
        self.data = QuestionExtendData()

class QuestionExtendData(PaperBase):
    def __init__(self):
        self.globalStatis = ''
        self.answerCompare = ''

