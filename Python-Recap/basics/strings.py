
"""
Strings - Is a sequence of characters

Built in String methods : 
len()   # built in method
lower() # string method
upper() # string method
str()   # built in string method
"""

a1 = "This is 'a' string"
b1 = "This is \"a\" string" # Escape Sequence is a  Backward Slash

# \ can also be used as aline breaker 
a3 = "Hello \
     World"

a4 = "This is a Mixed Case"

# print(a4.lower()) 
# print(a4.upper())
# print(a4 + str(2))
# print(len(a4)) 

"""
String Concatination and Replacing of values
Note : Cannot Replace Things in String. Strings are Immutable.
"""
# print('Hello' + '' + 'World !!!')

a5 = "abc1abc2abc3abc4"
# print(a5.replace('abc', 'ABC'))

"""
Sub-String methods
variable[start:end:step]
slicing of strings
"""
# sub1 = a5[1]
# print(sub)
# sub2= a5[1:6:2]
# print(sub2)

"""
Slicing up strings
"""
sub3=a[-1]
sub4=a[1:]
print(sub3)
print(sub4)
sub5=a[:-1] # prints last characters
print(sub5)
sub6=a[::-1] # prints string in reverse - from last char to first
print(sub6)
sub7=a[::2] # prints all chars with step 2

"""
More String Formatting
"""

city = "cleveland"
print("welcome to " + city + " !")
print("welcome to %city %sub5" % (city,sub5))
print("welcome to {city} {sub5}")
print(city.split('e'))

"""
Note : 
The len() function is a built-in function deals directly with built-in types
Example : str list dict tuple
"""