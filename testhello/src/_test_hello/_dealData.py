#coding:UTF-8 
import  xdrlib,sys
import xlrd
import time
import _test_cal
import _huyu
from logging import _startTime
from _test_hello._dutingting import dic_newTable, list_newTable
latetime='10:00:00'

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
                workhours=time.strftime('%H:%M:%S',time.gmtime(endtime-starttime))
                list_newTable.append(x[0])
                list_newTable.append(x[1])
                list_newTable.append(x[2])
                list_newTable.append(workhours)
            list_finallyTable.append(list_newTable)
        dic_newTable[name]=list_finallyTable
    return dic_newTable
    '''            
def chuqin():
    for name in table.keys():
        list_nabnormalCondition=[]#清空
        list_be_late=[]#迟到清空 
        list_leave_early=[]#早退清空
        list_offhalfday=[]
        for x in table.get(name,None):
            if x[0]=='':
                #list_nabnormalCondition.append(x[0])
                #print(list_nabnormalCondition)
                pass
            else:
               
                start_timeArry= time.strptime(x[0]+" "+x[1],'%Y/%m/%d %H:%M:%S')#转换为时间数组
                starttime=time.mktime(start_timeArry)#转化成时间戳starttime是上班时间
    
                settimeArry= time.strptime(x[0]+" "+latetime,'%Y/%m/%d %H:%M:%S')#转换为时间数组固定时间
                settime=time.mktime(settimeArry)#设定的迟到时间点，转化为时间戳
               
                end_timeArry1= time.strptime(x[0]+" "+x[2],'%Y/%m/%d %H:%M:%S')#转换为时间数组
                endtime=time.mktime(end_timeArry1)#endtime是下班时间
                #迟到 
               
                if (30*60>=starttime-settime>0):
                    timeDiff=time.strftime('%H:%M:%S',time.gmtime(starttime-settime))#timeDiffs迟到时间
                    #print(x[0],+time.strftime('%H:%M:%S',time.gmtime(t3)))
                    #print(name,'迟到')
                    #print(x[0],timeDiff)
                    list_be_late.append(x[0])
                    list_be_late.append(timeDiff)
                   
                    #print(dic_be_late)
                    #list_be_late.append(name+' '+[x[0],timeDiff])
                     
                #早退
                elif (8*3600<endtime-starttime<9*3600)or(13<end_timeArry1[3]<18) :
                    
                    #workhours=time.strftime('%H:%M:%S',time.gmtime(endtime-starttime))#工作时长
                    timeDiffs=time.strftime('%H:%M:%S',time.gmtime(9*3600-(endtime-starttime)))#timeDiffs早退时间
                    list_leave_early.append(x[0])
                    #list_leave_early.append(workhours)
                    list_leave_early.append(timeDiffs)
                    #list_leave_early.append(name+[x[0],workhours,timeDiffs])
                #打卡异常
                    
                elif (0<endtime-starttime<=4*3600)or(x[1][0:4]==x[2][0:4]):
                    halfworkhours=time.strftime('%H:%M:%S',time.gmtime(endtime-starttime))#工作时长
                    list_nabnormalCondition.append(x[0])
                    list_nabnormalCondition.append(halfworkhours)
                #请假半天
                elif (4*3600<=endtime-starttime<=8*3600):
                    offhalfworkhours=time.strftime('%H:%M:%S',time.gmtime(endtime-starttime))#工作时长
                    list_offhalfday.append(x[0])
                    list_offhalfday.append(offhalfworkhours)
   
                else:
                    pass
        
        
        dic_leave_early[name]=list_leave_early
        dic_nabnormalCondition[name]=list_nabnormalCondition
        dic_offhalfday[name]=list_offhalfday
    return dic_leave_early,dic_nabnormalCondition
'''
        
if __name__=="__main__":
    print(dealTable())
   
    