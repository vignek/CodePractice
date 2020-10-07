"""
Car Demo
"""




def printDic():

    try:
        car = {'make' : 'y', 'model' : 'x', 'year' : 2012}
        print(car['color'])
    except:
        print("Exception Occured")
        raise Exception("This is an exception")
    finally:
        print("prints all the time")

print(printDic())
