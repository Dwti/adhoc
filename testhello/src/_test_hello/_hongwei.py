#-*- coding:UTF-8 -*-
import  xdrlib,sys
import xlrd
import re
import time
import _test_cal
from pickle import NONE

'''打卡异常处理'''
table=_test_cal.excel_table_byindex()
#print(table)
#key='贾培军'

def abnormalCondition():
  print("打卡异常日期")
  #print(excelDataFinal.get(key,None))
  #list1=excelDataFinal.get(key,None)
dic={}
list=[]
list_name=[]
key='杜婷婷','贾培军'

for x in table.get(key[1],None):
    if x[1][0:4]==x[2][0:4]:
        list.append(x[0])
        dic[key[1]]=list
print(dic)


     
'''迟到'''
#固定时间

def be_late():
    print(key,"迟到")
    for x in table.get(key,None):
       if x[1][0:4]==x[2][0:4]:
        continue 
       else:  
           #print(x[1].time())
            timeArry= time.strptime(x[0]+" "+x[1],'%Y/%m/%d %H:%M:%S')#转换为时间数组
            starttime=time.mktime(timeArry)#转化成时间戳starttime是上班时间
            settimeArry= time.strptime(x[0]+" "+"10:00:00",'%Y/%m/%d %H:%M:%S')#转换为时间数组固定时间
            settime=time.mktime(settimeArry)#设定的迟到时间点
            if (5*60>=starttime-settime>0):
                timeDiff=time.strftime('%H:%M:%S',time.gmtime(starttime-settime))#timeDiffs迟到时间
                #print(x[0],+time.strftime('%H:%M:%S',time.gmtime(t3)))
                print(x[0],timeDiff)
               
      
'''早退'''
def leave_early ():
    print(key,'早退：')
    
    for x in table.get(key,None):
        if x[1][0:4]==x[2][0:4]:
           continue
        else :
            timeArry= time.strptime(x[0]+" "+x[1],'%Y/%m/%d %H:%M:%S')#转换为时间数组
            starttime=time.mktime(timeArry)#转化成时间戳starttime是上班时间
            timeArry1= time.strptime(x[0]+" "+x[2],'%Y/%m/%d %H:%M:%S')#转换为时间数组
            endtime=time.mktime(timeArry1)#endtime是下班时间
            #timeDiff=time.strftime('%H:%M:%S',time.gmtime(endtime-starttime))
            #print(timeDiff)
            if  (endtime-starttime<9*3600)or(13<timeArry1[3]<18):
                workhours=time.strftime('%H:%M:%S',time.gmtime(endtime-starttime))#工作时长
                timeDiffs=time.strftime('%H:%M:%S',time.gmtime(9*3600-(endtime-starttime)))#timeDiffs早退时间
                print(x[0],workhours,timeDiffs)
                    
       


def main():
    
        #get_name()
        abnormalCondition()
        #be_late()
        #leave_early()
    #print(table.get("杜婷婷",None))

if __name__=="__main__":
   main()