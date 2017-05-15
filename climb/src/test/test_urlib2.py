#coding:utf-8
'''
Created on 2017��5��15��

@author: srt-k12001
'''
import urllib.request
import http.cookiejar
from http.cookiejar import Cookie
from urllib.request import HTTPCookieProcessor
from setuptools.ssl_support import opener_for

 
url="http://www.baidu.com"
print("第一种方法")
respone1=urllib.request.urlopen(url, data=None, timeout=None)
print(respone1.getcode())
print (len(respone1.read()))
print("---------------")

print("第二种方法")
request=urllib.request.Request(url)
request.add_header("user-agent","Mozilla/5.0")#使用浏览器伪装
respone2=urllib.request.urlopen(request)

print(respone2.getcode())
print (len(respone2.read()))
print("---------------")

print("第三种方法")
cj=http.cookiejar.LWPCookieJar()#设置本地的cookie容器
support_cookie=urllib.request.HTTPCookieProcessor(cj)
opener=urllib.request.build_opener(support_cookie,urllib.request.HTTPHandler)
urllib.request.install_opener(opener)
respone3=urllib.request.urlopen(url)
print(respone3.getcode())
print (len(respone3.read()))
print(cj)



