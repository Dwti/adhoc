
# coding:utf-8 
from datetime import time
from datetime import date
from datetime import datetime
from datetime import timedelta 
import time
from time import struct_time
import xlrd
from xlrd.sheet import Sheet
import calendar
dict={}
data=xlrd.open_workbook('F:/移动___月考勤.xlsx')
Sheet=data.sheets()[0]
#获取表格行数
nrows=Sheet.nrows
#获取表格列数
nclos=Sheet.ncols
for i in range(1,nrows):
    data =Sheet.cell(i,1).value
    data1=Sheet.cell(i,3).value
    dict[data]=data1#加入字典中
    dict.items()
dict={0:'星期日',1:'星期一',2:'星期二',3:'星期三',4:'星期四',5:'星期五',6:'星期六'}
#print(datetime.now().weekday())
if datetime.now().weekday()==1:
    print("星期二")