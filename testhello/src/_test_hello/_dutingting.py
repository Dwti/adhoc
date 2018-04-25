#-*- coding:UTF-8 -*-
'''
Created on 2016年9月28日

@author: srt-k12001
'''
import  xdrlib,sys
import xlrd
import time
import _test_cal
import _huyu
from pickle import NONE

'''处理数据'''
def dealTable():
    table=_test_cal.excel_table_byindex()
    dic_newTable={}
    list_newTable=[]
    list_finallyTable=[]
    for name in table.keys():
        list_finallyTable=[]
        for x in table.get(name,None):
            if x[0]=='':
                pass
            else:
                list_newTable=[]
                start_timeArry= time.strptime(x[0]+" "+x[1],'%Y/%m/%d %H:%M:%S')#转换为时间数组
                starttime=time.mktime(start_timeArry)#转化成时间戳starttime是上班时间
               
                end_timeArry1= time.strptime(x[0]+" "+x[2],'%Y/%m/%d %H:%M:%S')#转换为时间数组
                endtime=time.mktime(end_timeArry1)#endtime是下班时间
                #workhours=time.strftime('%H:%M:%S',time.gmtime(endtime-starttime))
                list_newTable.append(x[0])
                list_newTable.append(x[1])
                list_newTable.append(x[2])
                list_newTable.append(endtime-starttime)
            list_finallyTable.append(list_newTable)
        dic_newTable[name]=list_finallyTable
    return dic_newTable
    
''''迟到:10点为迟到点，半个小时之内算迟到（<=30分钟）'''
def beLate():
    latetime='10:00:00'
    dic_be_late={}#迟到
    list_be_late=[]#迟到
    for name in dealTable().keys():
        list_be_late=[]#迟到清空
        for x in dealTable().get(name,None):
            if x[0]=='':
                pass
            else:
                start_timeArry= time.strptime(x[0]+" "+x[1],'%Y/%m/%d %H:%M:%S')#转换为时间数组
                starttime=time.mktime(start_timeArry)#转化成时间戳starttime是上班时间
                settimeArry= time.strptime(x[0]+" "+latetime,'%Y/%m/%d %H:%M:%S')#转换为时间数组固定时间
                settime=time.mktime(settimeArry)#设定的迟到时间点，转化为时间戳
                if (30*60>=starttime-settime>0):
                    timeDiff=time.strftime('%H:%M:%S',time.gmtime(starttime-settime))#timeDiffs迟到时间
                    list_be_late.append(x[0])
                    list_be_late.append(timeDiff)
        dic_be_late[name]=list_be_late  
    #print (dic_be_late)  
    return dic_be_late     
'''打卡异常:工作时间为0个小时-3小时算异常包括3小时'''
def  abnormalCondition():
    dic_abnormalCondition={}#打卡异常
    list_abnormalCondition=[]
    for name in dealTable().keys():
        list_abnormalCondition=[]
        for x in dealTable().get(name,None):
            if 0<=x[3]<=3*3600:
                workhalfhours=time.strftime('%H:%M:%S',time.gmtime(x[3]))
                list_abnormalCondition.append(x[0])
                list_abnormalCondition.append(workhalfhours)
        dic_abnormalCondition[name]=list_abnormalCondition           
    return  dic_abnormalCondition         
             
             
'''工作半天:工作3-7.5小时，包括7.5小时算半天'''  
             
'''打卡时间是8点到13点包括13点之间的，显示下午请假，其他是上午请假'''  
def offHalfday():
    dic_offhalfday={}
    list_offhalfday=[]
    for name in dealTable().keys():
        list_offhalfday=[]
        for x in dealTable().get(name,None):
            if 3*3600<x[3]<=7.5*3600:
                workhours=time.strftime('%H:%M:%S',time.gmtime(x[3]))
                list_offhalfday.append(x[0])
                list_offhalfday.append(workhours)
                if 8<= int(x[1][0])<13:
                    list_offhalfday.append("下午")   
                else: 
                    list_offhalfday.append("上午")
               
                  
        dic_offhalfday[name]=list_offhalfday
    return dic_offhalfday   
'''早退：工作时间在7.5-9小时不包括9小时，或者下班打卡时间在15-18点之间（不包括15，18）'''
def leaveEarly():
    dic_leave_early ={}#早退
    list_leave_early=[]#早退
    for name in dealTable().keys():
        list_leave_early=[]#早退
        for x in dealTable().get(name,None):
            if (7.5*3600<x[3]<9*60*60) or (15<int(x[2][0])<18):
                #workhours=time.strftime('%H:%M:%S',time.gmtime(endtime-starttime))#工作时长
                timeDiffs=time.strftime('%H:%M:%S',time.gmtime(9*3600-x[3]))#timeDiffs早退时间
                list_leave_early.append(x[0])
                list_leave_early.append(timeDiffs)
        dic_leave_early[name]=list_leave_early
    return dic_leave_early
    

'''把出勤日期处理成“姓名：日期列表”字典''' 
def workdays(): 
    table=_test_cal.excel_table_byindex()   
    dict_workdays={}
    list_workdays=[]
    for name in table.keys(): 
        list_workdays=[]
        for x in table.get(name,None):
            if x[0]=='':
                pass
            else:
                list_workdays.append(time.strftime('%Y/%m/%d',(time.strptime(x[0],'%Y/%m/%d'))))
    #print(list)  
                list_workdays.sort() 
        dict_workdays[name]=set(list_workdays)
    #print(dict_offday)
    
    return dict_workdays
'''请假缺勤'''
def offday():
    dict_offdays={}#请假
    #list_offdays=[]#请假
    list_workdays=_huyu.date_mange()#工作日
    set_workdays=set(list_workdays[0])#把工作日转化成元组
    dict_attendancedays=workdays()#出勤日期字典
    for name in dict_attendancedays.keys():
        #list_workdays=[]
        #set_dakadays=set(dict_attendancedays.get(name,None))
        dict_offdays[name]=list(set_workdays.difference(dict_attendancedays.get(name,None)))
        #dict_attendancedays[name]=list(set_holiday&set_dakadays)
    return dict_offdays
'''加班'''
def overDays():
    dict_overdays={}#加班
    #list_overdays=[]#加班
    list_workdays=_huyu.date_mange()#工作日
    set_holiday=set(list_workdays[1])#把节假日转化成元组
    dict_attendancedays=workdays()#出勤日期字典
    for name in dict_attendancedays.keys():
        dict_attendancedays[name]=list(set_holiday&dict_attendancedays.get(name,None))
    return dict_attendancedays
def main():
    #print(beLate())
    print(abnormalCondition())
#     print(offHalfday())
#     print(leaveEarly())
#     print(offday())
#     print(overDays())
    
if __name__=="__main__":
    main()
 
