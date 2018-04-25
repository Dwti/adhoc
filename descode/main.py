#!/usr/bin/python

import base64, pyDes, sys

def decrypt():
    inputPath = '{}/input.txt'.format(sys.path[0])
    with open(inputPath, 'r') as f:
        encryptData = f.read()

    base64Data = base64.b64decode(encryptData)
    desKey = pyDes.des("ws3edaw4", pyDes.ECB, "\0\0\0\0\0\0\0\0", pad=None, padmode=pyDes.PAD_PKCS5)
    decryptData = desKey.decrypt(base64Data, padmode=pyDes.PAD_PKCS5)

    outputPath = '{}/output.txt'.format(sys.path[0])
    with open(outputPath, 'w') as f:
        f.write(decryptData)

if __name__ == '__main__':
    decrypt()



