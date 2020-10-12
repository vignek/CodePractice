
"""
Dictionaries are mutable datastructure
Data type to store more than one value in one variable name 
Stored in terms of key value pairs
key value pairs {'k1' : 'v1', 'k2' : 'v2'}
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
Nested Dictionaries aka Dictionary within dictionary
"""

bikes = {'bmw': {'model' : 'GS1500R', 'year' : 2020, 'price': 25000}, 'harley':{'model' : 'Ironrod', 'year' : 2020, 'price': 35000}}

# print(bikes['harley']['price'])

"""
Dictionary Methods
keys() - method will retrive keys
values() - will retrive values
items() - will retrives keys and values in form of tuples inside an array
clear() - will clear all the common values of the dictionary
pop() - will pop out the specified key and it's value out of dictionary
"""


bikes = {'bmw': {'model' : 'GS1500R', 'year' : 2020, 'price': 25000}, 'harley':{'model' : 'Ironrod', 'year' : 2020, 'price': 35000}}
bikes_2 = {'make' : 'pulsar', 'model' : 'Pulsar', 'year' : 220, 'price': 95000}

# print(bikes.keys())

# print(bikes.values())

# print(bikes.items())

print(bikes['bmw'])

# print(bikes.pop())