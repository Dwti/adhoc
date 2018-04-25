# coding:utf-8 
#缺勤
import test
from datetime import time
from datetime import date
from datetime import datetime
import time
from time import struct_time
from tempfile import _name_sequence
import timeit
class member:
#考勤日期数据数据
  s = set([('小李','2016/9/1' ),('小李','2016/9/2'),( '小李','2016/9/3'),('小李','2016/9/11')])
#工作日数据
  s1 =set([('小李','2016/9/1' ),('小李','2016/9/2'),( '小李','2016/9/3'),( '小李','2016/9/4'),('小李','2016/9/11')])
#节假日数据
  s2=set([('小李','2016/9/11')])
  #上班打卡时间
  s3 = set([('小李','2016/9/1 9:37:47','2016/9/1 18:39:47'),('小李','2016/9/1 11:37:47','2016/9/1 18:10:47'),('小李','2016/9/1 11:37:47','')])

  
  '''缺勤'''
    
def _absence(): 
    for x in member.s1:
        if x  in member.s: 
           pass
        else:
           print('缺勤：')
           print(x)
'''节假日加班'''
            
def overtime():
    for x in member.s2:
        if x in member.s1:
            if x in  member.s:
                print('节假日加班：')
                print(x)
'''迟到'''
def be_late():
    for x in member.s3:
       if x[1]== '':
        continue
           
       else:  
           timeArry= time.strptime(x[1],'%Y/%m/%d %H:%M:%S')#转换为时间数组
           int(timeArry[3])>=10and  int(timeArry[4])>0 and int(timeArry[5])>0
           print('迟到：')
           print(x[0],+(int(timeArry[3])-10),':',(int(timeArry[4])-5),':',(int(timeArry[5])))
'''早退'''
def leave_early ():
    for x in member.s3:
        if x[2]== '':
           continue
        else :
            timeArry1= time.strptime(x[2],'%Y/%m/%d %H:%M:%S')#转换为时间数组
            int(timeArry1[3])<=18 and  int(timeArry1[4])>0 and int(timeArry1[5])>0
            print('早退：')
            print(x[0],+(int(timeArry1[3])-18),'小时')
            
        
'''漏打卡'''
def abnormal ():
    for x in member.s3:
        if x[1]==x[2]:
            print('打卡异常')
            print(x)
if __name__ == '__main__':
    
  _absence()
  overtime()
  be_late()
  leave_early()
  abnormal()
  
  
  