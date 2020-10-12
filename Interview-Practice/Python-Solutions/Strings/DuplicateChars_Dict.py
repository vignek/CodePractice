"""
Find duplicate characters in a string using hashmap / dictionaries
"""
example = 'interview'
# output: 
# i=2
# e=2

example2 = 'testing'
# output: 
# t = 2

example3 = 'heellooo'
# output:
# e=2
# l=2
# o=3

def duplicate_characters(word):
    result = {}  # result variable
    temp = {}    # temp variables 
    
    for char in word:  # Loops through the string one character at a time
        if char in temp: # checks if the char is already in temp hashmap
             temp[char] += 1  # 
        else:
             temp[char] = 1 

    for key,value in temp.items(): # loops through the temp hash map 
        if value > 1: # checks if the values are duplicate 
            result[key] = value
    
    return result # returns the result
    
print(duplicate_characters(example))

print(duplicate_characters(example2))

print(duplicate_characters(example3))