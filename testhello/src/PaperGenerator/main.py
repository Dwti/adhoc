#coding=utf-8
import parser2,jsonutil,getopt,os,sys,replacefile
from PaperGenerator.replacefile import check_ipa, un_zip, modifySuffix
def main():
    inputFolder = ''
    outputFile = ''

    argv = sys.argv[1:]
    opts, args = getopt.getopt(argv, 'i:o:')
    for opt, arg in opts:
        if opt in ('-i',):
            inputFolder = arg
        elif opt in ('-o',):
            outputFile = arg

    if os.path.exists(inputFolder) == False:
        print('Error: The input folder path not exists! Please specify a existing folder using -i option.')
        return
    if os.path.isdir(inputFolder) == False:
        print('Error: The input path is not a folder! Please specify a folder path.')
        return
    if os.path.exists(outputFile) is False:
        print('Error: The output file path not exists! Please specify a existing file using -o option.')
        return
    if os.path.isfile(outputFile) is False:
        print('Error: The output path is not a file! Please specify a file path.')
        return

    print('******** Begin parsing ********')
    paperContainer = parser2.parseFolder(inputFolder)
    s = jsonutil.convertObjToString(paperContainer)
    f = open(outputFile, 'w')
    f.write(s)
    f.close()
    print('******** End parsing ********')
    

if __name__ == '__main__':
    
# #     main()
#     modifySuffix('F:\V2.0.0')
    un_zip()
    print()
    
     

