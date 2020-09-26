"""
Remove duplicate numbers in an arrays
"""

a_list = [1,2,3,4,5,3,2,1]
temp = []
for i in range(len(a_list)):
    for j in range(i+1, len(a_list)):
        if a_list[i] == a_list[j]:
            temp.append(j)

for val in range(len(set(temp))):
    a_list.pop(val)

print(a_list)



print('-----------------')

a_list = [1,2,3,4,5,3,2,1]
b_list = []
for i in a_list:
    if i not in b_list:
        b_list.append(i)

print(b_list)

print('-----------------')