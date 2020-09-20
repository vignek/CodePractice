"""
For Loops 
Useful when you want to specify you condition in the beginning
Iteratables are Strings, List, Tuples, Dictionaries 
"""


a_string = 'AaBbCcDdEeFf'

for character in a_string:
    if character.islower():
        print(character, end= ' ')
    else:
        print('-', end= '')

print('\n')

a_dict = {1 : 'hello', 2: 'world', 3 : 3}

for key in a_dict:
    print(str(a_dict[key]), end = " ")

for key, value in a_dict.items():
    print(key)
    print(value)

a_list = [2,3,4]
b_list = [3,4,5,6,7]

"""
zip function - built in function
helps iterate over multiple iteratable objects until the shortest object is exhausted
"""

for a, b in zip(a_list,b_list):
    if a > b:
        print(a)
    else:
        print(b)

"""
Range function - built-in
Creates a sequence of numbers in memory
Used to create range of numbers
Used to create range via list xrange not anymore.
Pretty useful in the Interview setting
"""

print(list(range(1,11))) # type cast into list

print(type(range(1,10)))

for x in range(0,20,2):
    print(x)
