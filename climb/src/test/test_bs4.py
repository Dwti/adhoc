#coding:utf-8

import bs4
from bs4 import BeautifulSoup
import os
from _hashlib import new

import urllib.request

    
def pageloop(page):
    url="http://www.baidu.com"
    respone=urllib.request.urlopen(url, data=None, timeout=None)
    soup=BeautifulSoup(respone)
    my_messages=soup.find_all('a')
    for message in my_messages:
        print(message.name,message['href'],message.get_text())

if __name__=="__main__":
#创建文件夹
  
    pageloop(page=1)
           
   
        