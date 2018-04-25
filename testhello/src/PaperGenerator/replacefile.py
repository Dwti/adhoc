# coding=utf-8
'''
Created on 2017��3��7��

@author: srt-k12001
'''
import os
from fileinput import filename
import zipfile
from distutils.archive_util import zipfile
from zipfile import ZipFile
from warnings import catch_warnings

ipapath ='F:\V2.0.0'
def check_ipa():
    filenames=''#获取文件名，保存在此数组中
    if os.path.exists( ipapath) == False:
        print("路径不存在")
  
    if os.path.isfile(ipapath+'/app.ipa') is False:
        print("没有此文件存在")
    else:
        filenames=os.listdir(ipapath)
#         print(filenames)
    return filenames
#      
def modifySuffix(ipapath):
   
    newfilename=''
    for filename in check_ipa():
#         print(filename)
        oldfilename=os.path.join(ipapath,filename)
        oldfile=os.path.splitext(filename)
#         print(oldfile)
#         print(oldfilename[0])
        if oldfile[1]=='.ipa':
#             oldfilename=os.path.join(ipapath,filename)
            newfilename = os.path.join(ipapath,oldfile[0]+'.zip')
#             print(oldfilename[0])
            os.rename(oldfilename, newfilename)
    return newfilename
   
   
   
def un_zip():
#     file=os.open('app.zip',path)
#     z=zipfile.ZipFile(os.path.join(path),'app.zip',"r")
    try:
        z=zipfile.ZipFile('F:\V2.0.0\\app.zip','r')
        z.getinfo('input.json')
        print( z.infolist())
        
  
    finally:
        pass
    
def findJson():
    pass
def replaceFile():
    pass
def zipFiles():
    pass
def secondModifySuffix():
    pass
