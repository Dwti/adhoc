#coding=utf-8
'''
Created on 2017年1月17日

@author: srt-k12001
'''

import os
import sys
import time
 
class monkeyTest():
     
    def __init__(self):
        """ init """
             
    #monkey命令，packageName包名，interval间隔时间单位ms ，frequency执行次数
    def monkeyApp(self,packageName,interval,frequency):
        try:
            os.popen("adb shell monkey  -v -p com.yanxiu.gphone.student --pct-touch 50 --pct-motion 2 --pct-nav 3  --pct-majornav 2 --pct-syskeys 1 --pct-appswitch 2 --pct-trackball 30 --ignore-crashes --ignore-timeouts --throttle 1000  100 %s >d:\monkeylog\monkeyScreenLog.log" % (packageName, interval, frequency),'r')
        except Exception,e:
            print e

    #导出日志
    def copyErrorLog(self):
        try:
            anr = "D:\\monkeylog\\anr"
            if not os.path.isdir(anr):
                os.makedirs(anr)
                dontpanic = "D:\\monkeylog\\dontpanic"
            if not os.path.isdir(dontpanic):
                os.makedirs(dontpanic)
                tombstones = "D:\\monkeylog\\tombstones"
            if not os.path.isdir(tombstones):
                bugreports = "D:\\monkeylog\\bugreports"
            if not os.path.isdir(bugreports):
                os.makedirs(bugreports)                                            
                os.popen("adb pull /data/anr  D://monkeylog//anr",'r')
                os.popen("adb pull /data/dontpanic  D://monkeylog//dontpanic",'r')
                os.popen("adb pull /data/tombstones  D://monkeylog//tombstones",'r')
                os.popen("adb pull /data/data/com.android.shell/files/bugreports D://monkeylog//bugreports",'r')
        except Exception,e:
            print e            
            
def main():
    print """"""
     
     
if __name__=="__main__":
     
    packageName = 'com.yanxiu.gphone.student'  
    myApp = monkeyTest()   
    myApp.monkeyApp('com.yanxiu.gphone.student',500,1000)
     #判断是否执行完成，执行完成后导出日志
    for i in range(1, 1000000):
        monkeylog = open('D:\monkeylog\monkeyScreenLog.log')
        try:
           temp = monkeylog.read( )
        finally:
            monkeylog.close( )
        if temp.count('Monkey finished')>0:
            myApp.copyErrorLog()
            break
        else:
            time.sleep(2)
