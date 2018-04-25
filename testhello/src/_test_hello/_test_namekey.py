# coding:UTF-8 
import  xdrlib,sys
import xlrd
import re
import time
import datetime

import _test_cal
from pickle import NONE
import _huyu
#from _test_hello import _dutingting
list_workdates=[]
'''打卡异常处理'''
table=_test_cal.excel_table_byindex()
list_date=_huyu.date_mange()

#key='贾培军'

def abnormalCondition():
    #print(excelDataFinal.get(key,None))
    #list1=excelDataFinal.get(key,None)
    dic={}
    list_name=[]
    for name in table.keys():
        list=[]#清空列表
        for x in table.get(name,None):
            if x[1][0:4]==x[2][0:4]:
                list.append(x[0]) 
        dic[name]=list        
    print(dic)             
         
     
    
def get_key():  
     now=datetime.date(2016,9,2)
     print(time.strptime("2016/8/9", '%Y/%m/%d'))
     s=time.strptime("2016/8/9", '%Y/%m/%d')
     print(time.strftime('%Y-%m-%d',s))
     print(now.isoformat())
dic={}
list=[]
def work_overtime(): 
    #print(list_date[0])
    print(table)
    list=[]#清空列表
    for name in table.keys():
        for i in range(0,len(table.values())):
            for  x in table.values():
                print(x[i][0])
        list.append(x[i][0])
        dic[name]=list             
    print(dic)
           
        
def test():
    list=[]
    #print(table.get('杜婷婷',None))
    for x in table.get('杜婷婷',None):
        list.append(time.strftime('%Y/%m/%d',(time.strptime(x[0],'%Y/%m/%d'))))
    #print(list)  
    list.sort()     
    return list
    
def test1():
    list=[]
    list1=test()
    print(list1)
    print(list_date[0])
    set1=set(list1)
    set2=set(list_date[0])
    set3=set(list_date[1])
    print(set2.difference(set1))#请假
    print(set1&set3)#加班
       
if __name__=="__main__":
   #abnormalCondition()
   #get_key()
    #work_overtime()
    test1()
    #qu0()