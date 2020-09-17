"""
While Loops
Also know as Infinite loops
Iterates over Strings, List, Tuples, Dictionaries
"""

# Infinite Loop Example 

# x = 10
# while x <=10:
#     print(x)
#     x -= 1

# Adding Value to empty List 

a_list = []
flag = 1

while flag <= 10:
    a_list.append(flag)
    flag+=1
print(a_list)