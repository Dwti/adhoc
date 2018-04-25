'''

@author: dudu

'''

import os
from asyncore import read

file_path="F:\\v3.0.4\\packages"
def read_filename():
   print( os.listdir(file_path))
    
    
    
def modify_name():
    os.rename("oldname","newname")


if __name__ == '__main__':
    read_filename()