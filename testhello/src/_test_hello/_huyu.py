# coding:UTF-8 
import  datetime

def date_mange():
    start_date = datetime.date(2016,6,25)
    end_date = datetime.date(2016,6,27)

    days_off = 5, 6
    days_work = []
    for x in range(7):
        if x not in days_off:
            days_work.append(x)
            #print(days_work)

#list1节假日    list2调休上班的日期
    list1=[datetime.date(2016,1,1),datetime.date(2016,1,2,),datetime.date(2016,1,3),datetime.date(2016,2,7),datetime.date(2016,2,8),datetime.date(2016,2,9),
       datetime.date(2016,2,10),datetime.date(2016,2,11),datetime.date(2016,2,12),datetime.date(2016,2,13),datetime.date(2016,4,2),datetime.date(2016,4,3),
       datetime.date(2016,4,4),datetime.date(2016,4,30,),datetime.date(2016,5,1),datetime.date(2016,5,2),datetime.date(2016, 6,9 ),datetime.date(2016,6,10),
       datetime.date(2016,6,11),datetime.date(2016,9,15),datetime.date(2016,9,16),datetime.date(2016,9,17),datetime.date(2016, 10, 1),datetime.date(2016, 10, 2),
       datetime.date(2016, 10, 3),datetime.date(2016, 10, 4),datetime.date(2016, 10, 5),datetime.date(2016, 10, 6),datetime.date(2016, 10, 7),]

    list2=[datetime.date(2016,2,6),datetime.date(2016,2,14,),datetime.date(2016,5,2),datetime.date(2016,6,12),datetime.date(2016,9,18,),datetime.date(2016,10,8),datetime.date(2016,10,9),]

    step = datetime.timedelta(days=1)
    workdays= []
    workoffdays=[]
    list_date=[]
    while start_date <= end_date:
        if start_date.weekday() in days_work and start_date not in list1 or start_date in list2:
            workdays.append(start_date.strftime('%Y/%m/%d'))
            #workdays.append(start_date.isoformat())

       

        if start_date not in list2 and start_date.weekday() not in days_work or start_date in list1:
            workoffdays.append(start_date.strftime('%Y/%m/%d'))
            #workoffdays.append(start_date.isoformat())
        start_date += step

    list_date=[]
    list_date.append(workdays)
    list_date.append(workoffdays)
    return list_date
    print("工作日:",workdays)
    print("非工作日:",workoffdays)

'''if __name__=="__main__":
    date_mange()
'''



























