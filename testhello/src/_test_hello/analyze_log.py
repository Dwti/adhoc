#coding=utf-8
'''
Created on 2017��1��3��

@author: srt-k12001
'''
import os,sys
#��ȡtxt�ļ�
log ="D:\\hello.txt"
def openfile():
  with open(log,'r') as test:
      print(test.read())
    
def copyErrorLog():
        try:
            anr = "D:\\monkeylog\\anr"
            if not os.path.isdir(anr):
                os.makedirs(anr)
                dontpanic = "D:\\monkeylog\\dontpanic"
            if not os.path.isdir(dontpanic):
                os.path.isdir(dontpanic)
                crash="D:\\monkeylog\\crash"
            if not os.path.isdir(crash):
                os.makedirs(crash)
                tombstones = "D:\\monkeylog\\tombstones"
            if not os.path.isdir(tombstones):
                bugreports = "D:\\monkeylog\\bugreports"
            if not os.path.isdir(bugreports):
                os.makedirs(bugreports)                                            
                os.popen("adb pull /data/anr  D://monkeylog//anr",'r')
                os.popen("adb pull /data/dontpanic  D://monkeylog//dontpanic",'r')
                os.popen("adb pull /data/tombstones  D://monkeylog//tombstones",'r')
                os.popen("adb pull /data/data/com.android.shell/files/bugreports D://monkeylog//bugreports",'r')
        except Exception:
            print (Exception)      
  
        
if __name__=="__main__":
#   openfile()
    
    for i in range(1, 1000000):
        monkeylog = open('D:\hellotestmymonkey.txt')
        try:
            temp = monkeylog.read( )
        finally:
            monkeylog.close( )
            copyErrorLog()
            break
        
  
