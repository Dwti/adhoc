#coding=utf-8

'''this file listed all the keys supported for the paper questions configuration'''

#question tag used to define a question
QUESTION = 'question'

#template tag used to declare the template type of question,placed after QUESTION tag,like QUESTION:TEMPLATE=xxx
TEMPLATE = 'template'

#end tag used to end a question,must match with QUESTION tag
END = 'end'

#type id to define a question type
TYPE_ID = 'type_id'

#stem tag used to customize a stem for the question
STEM = 'stem'

#option tag provides options for choose,classify,connect question, seperated by '|', format: optionA|optionB|optionC
OPTION = 'option'

#tag used to define question's correct answer,for simple question, format is aaa|bbb|ccc, for complex question,
#like classify and connect, the sub element is seperated by ',', format is 0,1|3,5|4,7,6
CORRECT_ANSWER = 'correct_answer'

#tag used to define question's user answer,format is same with CORRECT_ANSWER
MY_ANSWER = 'my_answer'

#tag used only for classify question, format is aaa|bbb|ccc
CLASS_NAME = 'class_name'

#tag used only for subjective question, '5' stands for checked, other numbers stand for not checked
CHECK_STATUS = 'check_status'

#tag used only for subjective question, range is 0~5
SCORE = 'score'

#tag used only for subjective question, format is length,url|length,url  e.g 3,http://aaa.mp3|5,http://bbb.mp3
AUDIO_COMMENT = 'audio_comment'

#tag used only for listen question to specify the url to play
AUDIO_URL = 'audio_url'

#tag used to customize a analysis string for the question
ANALYSIS = 'analysis'

#tag used to customize a answer result string for the question
ANSWER_RESULT = 'answer_result'

#tag used to customize a statistics string for the question
STATISTICS = 'statistics'

#tag used to customize knowledge points for the question,format is pointA|pointB|pointC
KNOWLEDGE_POINT = 'knowledge_point'