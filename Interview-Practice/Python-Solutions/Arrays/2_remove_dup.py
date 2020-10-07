"""
Find and Remove duplicate numbers in an arrays
Confident
"""

a_list = [1,2,3,4,5,3,2,1]
temp = []
for i in range(len(a_list)):
    for j in range(i+1, len(a_list)):
        if a_list[i] == a_list[j]:
            temp.append(j)

for val in range(len(set(temp))):
    a_list.pop(val)

# print(a_list)



print('-----------------')

a_list = [1,2,3,4,5,1,2,3]
b_list = []
for i in a_list:
    if i in b_list:
        a_list.remove(i)
    else:
        b_list.append(i)

print(b_list)
print(a_list)


print('-----------------')

a_list = [1,2,3,4,5,3,2,1]
b_list = []
c_list = []
for i in a_list:
    if i not in b_list:
        b_list.append(i)
    else:
        c_list.append(i)
# print(b_list)
# print(c_list)