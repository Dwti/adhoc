#!/usr/bin/env python
#-*- coding:UTF-8 -*-
import os

from com.android.monkeyrunner import MonkeyRunner ,MonkeyImage,MonkeyDevice

# MonkeyRunner.alert('hello', 'title', 'ok')
#连接设备
# device=MonkeyRunner.waitForConnection(5,'402d3418')
device=MonkeyRunner.waitForConnection(5,'c09addc6')
# device=MonkeyRunner.waitForConnection()
# device.installPackage("F:/workspace/testmonkey/src/com/yanxiu/__pycache__/MainApp-yanxiu_com-release.apk")
device.startActivity(component="com.yanxiu.gphone.student/.activity.WelcomeActivity")

MonkeyRunner.sleep(1)
device.touch(500,800,"DOWN_AND_UP")
MonkeyRunner.sleep(1)
device.type("18606703065")
device.touch(800,1000,"DOWN_AND_UP")
MonkeyRunner.sleep(1)
device.type("123456")
MonkeyRunner.sleep(1)
i=0
if (i<=3):
    device.touch(500,1200,"DOWN_AND_UP")
MonkeyRunner.sleep(1)
os.popen("adb shell monkey  -v -p   com.yanxiu.gphone.student --pct-touch 50 --pct-motion 2 --pct-nav 3  --pct-majornav 2 --pct-syskeys 1 --pct-appswitch 2 --pct-trackball 30 --ignore-crashes --ignore-timeouts --throttle 1000 500 >d:\log.txt")
