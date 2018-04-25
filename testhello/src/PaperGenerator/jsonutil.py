#coding=utf-8
import json,types,model

def mapStringToObj(jsonstring,obj):
    jsondict = json.loads(jsonstring)
    mapDictToObj(jsondict,obj)

def mapDictToObj(jsondict,obj):
    for key, value in jsondict.items():
        if hasattr(obj, key):
            attr = getattr(obj, key)
            if isinstance(attr,model.PaperBase):
                mapDictToObj(value,attr)
            elif isinstance(attr,list):
                for i in range(len(attr)):
                    e = attr[i]
                    v = value[i]
                    if isinstance(e,model.PaperBase):
                        mapDictToObj(v,e)
                    else:
                        attr[i] = v
            else:
                setattr(obj, key, value)

def convertObjToString(obj):
    jsondict = convertObjToDict(obj)
    return json.dumps(jsondict)

def convertObjToDict(obj):
    jsondict = dict(obj.__dict__)
    for key in jsondict.keys():
        attr = getattr(obj, key)
        if isinstance(attr,model.PaperBase):
            attrdict = convertObjToDict(attr)
            jsondict[key] = attrdict
        if isinstance(attr,list):
            list2 = []
            for e in attr:
                if isinstance(e,model.PaperBase):
                    list2.append(convertObjToDict(e))
                else:
                    list2.append(e)
            jsondict[key] = list2
    return jsondict