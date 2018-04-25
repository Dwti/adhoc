'''


@author: srt-k12001
'''
from _test_hello import app
import os

def  test(app):
    global a
    if (app=="ll"):
         a="666"
         print("duili")
        
    elif(app=="88"):
         a="555"
         print("bu")
   
    
    return a

def readfile(dir):
    files=os.listdir(dir)
    for filename in files:
        path=dir+os.sep+filename
        print (path)
    for root,dirs,files in os.walk(dir):
        for name in files:
            print(os.path.join(root,name))
def getdir():
    list={"F:\\V2.3.7","F:\\V2.3.6.1","F:\\V2.3.6"}
    for dir in list:
        readfile(dir)
def hello():
        listmy=[];
        a='a'
        b='b'
        c='c'
        d='d'
        rt1 = [a,b]
        rt2 = [{a:1,b:2,c:3,d:4},
               {d:3,a:3,b:3,c:4},
               {d:1,b:1,c:3,a:2},
               {a:5,c:6,d:3,b:0}]
        for k in rt1:
            for item in rt2:
                result=dict[item]

                listmy.append(result)
        
        result = [dict([(k, item[k]) for k in rt1]) for item in rt2]
        print(result)  
        print(listmy)

if __name__=="__main__":
    hello()
    
#     app= input("qingshuruxinxi")
#     print(test(app))
#     readfile("F:\\V2.3.7")
#     getdir()