"""
Methods are used for code reusablility
Methods keyword : def
Code executes sequencially
"""

"""
Difference between methods and functions : 

Functions can be called only by its name, 
as it is defined independently. 

But methods can’t be called by its name only, 
we need to invoke the class by a reference 
of that class in which it is defined,

i.e. method is defined within a class and 
hence they are dependent on that class.
"""

x,y = 5, 6

def minus(x,y): # method  and parameters
    print (y-x)

minus(y,x)

ten_numbers = list(range(1,11))  # typecasted

print(len(ten_numbers))



"""
Sum of two numbers 
"""

def sum_num(num1, num2):
    return num1 + num2

print(sum_num(5,6)) # calling the function with arguments
    
l = ['a','b','c']

def isPresent(value):
    """
     Find if the value is present in list l
     :value - is the value in question
     :return boolean value   
    """
    if value in l:
        return True
    return False

x = isPresent('b')
print(x)


"""
Positional Parameters 
Has default positional parameters so arguments need not match or have any values
"""

def positional(a=2, b=5):
    return a + b

print(positional(b=10))

"""
Scope of Variable
Variables decleared in the method has local scope
Global keyword - used to access variable in global scope inside the method. 
"""

a_variable = 10

def local_scope(value):
    global a_variable  
    a_variable = 20
    print(a_variable)

local_scope(a_variable)
print(a_variable)

print("**********")
"""
More Built in Functions 
min() 
max()
abs()
type()
"""
# *args -> Any number of args

# print(min(10,20,30,40))
# print(max(20,240,6,7))
# print(abs(4445.22))
# print(type(True))


def net_income(state, gross):
    federal = gross * 0.10
    states = {'va': 0.5, 'ma' : 0.6}

    if state in states.keys():
        return ( gross - ( federal + states[state]))
    else:
        return ( gross - federal )

print(net_income('ma', 90000))