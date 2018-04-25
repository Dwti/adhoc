#! usr/bin/env
# coding=utf-8

import os, zipfile, hashlib, shutil,sys

# env_config_Md5 = "A5DFDD4E25FC6A95A550AF1BA3AAC2FF"
path = "F:/testcheck"
# origin_path = "D:/APK/app.ipa"#jenkins路径
origin_path = "F:/V2.0.0/app.ipa"#jenkins路径
# workspace=os.getenv("WORKSPACE")
# jenkinsHome=os.getenv("JENKINS_HOME")
# path=os.getenv("JENKINS_HOME")+"/scripts/tempzip"
# origin_path=os.getenv("WORKSPACE")+"/EXueELian_IOS(Release)/YanXiuStudentApp/build/app.ipa"

def choose_md5(app):
    if app=='yxyl':
        env_config_Md5="A5DFDD4E25FC6A95A550AF1BA3AAC2FF"
    elif app=='sanke':
        env_config_Md5="25D20B862D0E9981EA2B3EB07D86D33E"
    elif app=='lst':
        env_config_Md5="0762A06024793ACBC088999764603AD3"
    return env_config_Md5

def copy_apk(origin_PATH, PATH):
    shutil.copy(origin_path, path)

def exist_zip():  # 检查zip包是否存在，如果不存在创建并修改后缀
    copy_apk("origin_path", "path")
    zip_file(path)

def zip_file(Path):  # 修改后缀名为：zip
    filelist = os.listdir(path)
    for files in filelist:
        oldname = os.path.join(path, files)  # 得到文件完整路径
        filename = os.path.splitext(files)
        if filename[0] == "app" and filename[1] == ".ipa":
            global newname
            newname = os.path.join(path, filename[0] + ".zip")
            os.rename(oldname, newname)  # 重命名为zip文件
    return newname

def choose_item(app):
    new_apk=zip_file(path)
    z = zipfile.ZipFile(new_apk, 'r')  # 获取zip文件并读取
    for file in z.namelist():
        z.extract(file, path + "/APP")
    # global hash
    if app=='yxyl':
        with open(path + '/APP/Payload/YanXiuStudentApp-iPhone.app/env_config.json', 'rb') as f:
            md5 = hashlib.md5()
            md5.update(f.read())
            hash = md5.hexdigest()
            print(hash)

    elif app=='lst':
        with open(path + '/APP/Payload/TrainApp.app/env_config.json', 'rb') as f:
            md5 = hashlib.md5()
            md5.update(f.read())
            hash = md5.hexdigest()
            print(hash)
    elif app=='sanke':
        with open(path + '/APP/Payload/SanKeApp.app/env_config.json', 'rb') as f:
            md5 = hashlib.md5()
            md5.update(f.read())
            hash = md5.hexdigest()
            print(hash)
    return hash


def contrast_file(Md5, Hash):
#     hash = choose_item(app)
    if hash == Md5:
        print("MD5 hash match,是release包")
    else:
        print("不是release正式包")
    shutil.rmtree(path + "/APP")

if __name__ == '__main__':
    if os.path.exists(path+"/APP"):
        shutil.rmtree(path+"/APP")
    if os.path.exists(path+"/app.zip"):
        os.remove(path+"/app.zip") 
    args = sys.argv
    app = args[1]
    exist_zip()
#   print(choose_item(app))
#     choose_item(app)
#     contrast_file(choose_md5(app).lower(), hash)
    contrast_file(choose_md5(app).lower(),choose_item(app))