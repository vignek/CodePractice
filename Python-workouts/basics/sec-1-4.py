#!/usr/bin/python  
# ensures that the interpreter will use the first installed version on your environment's $PATH

"""
Variable assignment
Variable is created without a data type.
"""

a = "nyc"  # Variable of type string, Can have single and quotes and double quotes
b = 123 # Variable of type integer



"""
Variables are stores as Table in memory : 
Example : Object - Reference -  Count
Rules : Start variable name with letter or underscore - xyz _init_
Rules : No Sepecial characters or keywords anywhere in the variable
"""
int_num = 2 # valid syntax for integer
float_num = 20.0 # Valid syntax for floating point numbers


"""
Order of Operations 
()  **  * / % // + - << >> & ^ |   <= < >= >
"""

# Arithmetic Order of operations example : 
a = 20
b = 10
c = 15
d = 5
e = 0

e = a + (b * c) / d;  # 20 + ( 10 * 15 ) / 5  = 20 + 150 / 5 = 20 + 30 = 50
e = ((a + b) * c) / d;  # ( (20+30) * 15 ) / 5 = (30 * 15) / 5 = 600 / 5 = 120

# ** exponent. one raised to the power of the over.

# Modulo - remainder
 
# a = True
# # any thing that has a value from 
# b = False
# x = 0 , Empty object, empty string

bool() #-> Built in fuction




"""
Strings - sequence of characters

Built in String methods : 

len() # built in method
lower() # string method
upper() # string method
str()  # built in string method

"""
# Escape Sequence : Backward Slash
# a = "This is 'a' string"
# b = "This is \"a\" string" # 

# # line breaker 
# a = "Hello \
#     World"

# stri = "This is a Mixed Case"
# print(stri.lower()) 
# print(stri.upper())
# print(len(str))
# print(stri + str(2)) 

"""
Concatination
"""
# print('Hello' + '' + 'World !!!')
# print()

"""
Replace Things in String. Btw Strings are Immutable.
"""
a = "abc1abc2abc3abc4"
print(a.replace('abc', 'ABC'))

"""
Sub-String methods
variable[start:end:step]
slicing of strings
"""
sub = a[1]
# print(sub)
sub2=a[1:6:2]
# print(sub2)

"""
Slicing up strings
"""
# sub3=a[-1]
# sub4=a[1:]
# print(sub3)
# print(sub4)
# sub5=a[:-1] # prints last characters
# print(sub5)
# sub6=a[::-1] # prints string in reverse - everything from the beginning, everythging till the end from last char
# # print(sub6)
# sub7=a[::2] #prints all chars with step 2

"""
String Formatting
"""

# city = "cleveland"
# print("welcome to " + city + " !")
# #print("welcome to %city %sub5" % (city,sub5))
# print("welcome to {city} {sub5}")
# print(city.split('e'))

"""
The len() built-in function deals directly with built-in types
str list dict tuple
"""

"""
Lists
"""
# car = [1,2,3,4]
# print(car[2])
# empty = []

# car.append("Benz") # appends to the end of the list
# print(car)

# car.insert(1, "jeep") # Inserts at a particular index
# print(car)

# x = car.index("honda") # finds index of item in the list
# print(x)

# cars = ["bmw", "honda", "audi"]

# y = cars.pop() # removes from the end - returns output

# cars.remove('item') # does not return anything.


# slicing = cars[0:2] # slices items 0,1 of the list


# cars.count(2) # returns no of times items exist in a list

"""
Dictionaries 
Data type to store more than one value in one variable name 
stored in terms of key value pairs
key: value pairs
{'k1' : 'v1', 'k2' : 'v2'}
Not sequenced, no indexing, works on mapping, accepts all types
"""

dic = {'key1' : 'value1', 'key2' : 'value2', 'key3' : 'value3'}
# print(dic)

dict_1 = {}

dict_1['one'] = 1
dict_1['two'] = 2
dict_1['three'] = dict_1['one'] + dict_1['two']

# print(dict_1)

"""
Nested Dictionaries
"""

