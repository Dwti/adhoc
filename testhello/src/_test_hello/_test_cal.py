#!/usr/bin/env python
#-*- coding:UTF-8 -*-
import  xdrlib,sys
import xlrd
import re

file='E:\\移动___月考勤.xlsx'

def open_excel():
   try:
     data = xlrd.open_workbook(file)
     return data
   except Exception as e:
     print (e)

#将set类型转换为list类型
def setTobeList(setDate):
    listDate=[]
    for date in setDate:
        listDate.append(date)
    return listDate


# 将[['2016/7/4', '10:03:55'], ['2016/7/4', '10:04:02']]转为['2016/7/4', '10:03:55', '10:04:02']
def distinctDateAndTime(Data):
    workday = []  # 上班日期,如：2016/7/4
    result = []  # 处理后的数据列表
    # 取出上班日期
    for n in range(0, len(Data)):
        workday.append(Data[n][0])
    workday = setTobeList(set(workday))

    # 将上班日期对应的时间合并为一个列表
    for m in range(0, len(workday)):
        time = []
        orderlyTime=[]
        for x in range(0, len(Data)):
            if workday[m] == Data[x][0]:
                time.append(Data[x][1])
        orderlyTime.insert(0, workday[m])
        orderlyTime.insert(1,time[0])
        orderlyTime.insert(2, time[-1])
        result.append(orderlyTime)
    return result



 #根据索引获取Excel表格中的数据  参数:file：Excel文件路径
def excel_table_byindex():
   data = open_excel()
   table = data.sheets()[0]#0表示表的索引
   nrows = table.nrows #行数
   ncols = table.ncols #列数
   excelDate=[]#excel中的数据
   excelDataFinal = {}  # 最终数据
   worker=[]#打卡人员
   workerDate=[]#上班日期
   interimDate=[]

   #获取excel中的数据，存入临时列表中
   for rownum in range(1, nrows):
       row = table.row_values(rownum)  # 获取每行的数据
       excelDate.append([row[1],row[3]]) #将姓名，日期取出生成excel数据表
       worker.append(row[1])#打卡人员列表
   worker=setTobeList(set(worker))

   # 遍历excelDate中的所有数据，按人分类
   for n in range(0, len(worker)):
       workerDate = []  # 将workerDate清空
       for x in range(0, len(excelDate)):
           if worker[n] == excelDate[x][0]:
               splitDate = re.split(" ", excelDate[x][1])  # 将日期进行切片
               workerDate.append(splitDate)  # 将切片后的日期存储至workerDate
       excelDataFinal[worker[n]] = distinctDateAndTime(workerDate)  # 将列表按人名存储至excelDataFinal
   return excelDataFinal
