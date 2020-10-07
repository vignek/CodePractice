"""
Exception Handling 
Exceptions are erros in run time
Handle Exceptions in our code

"""


def exceptionHandling():
    try:

        a = 10
        b = 0
        c = a / b
    except ZeroDivisionError:
        print("Zero Division Error")
    except:
        print("Exception Occur")
        raise Exception("This exception occured in exceptionHandling Method")
    else:
        print("Occurs when there is no exception")
    finally:
        print("Prints in all cases")