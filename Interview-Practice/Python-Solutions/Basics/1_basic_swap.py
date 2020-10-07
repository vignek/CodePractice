"""
Basic 25 Programming Questions warm up
"""

"""
Swap 2 Numbers
"""

num1 = 1
num2 = 10

num1,num2 = num2,num1
print(num1)
print(num2)

print('-------------------------------')

a_list = list(range(1,101))

a_list[0],a_list[-1] = a_list[-1],a_list[0]

print(a_list)

print('-------------------------------')

b_list = list(range(1,101))

start,*middle,end = b_list

b_list.pop(-1)
b_list.pop(0)

b_list.insert(0,end)
b_list.append(start)

print(b_list)