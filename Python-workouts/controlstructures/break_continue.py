"""
Break & Continue - are used in conjunction with Loops
Break : Breaks out of the closest enclosing loop
Continue : Returns the pointer to the closest enclosing loop
"""

# 
# flag = 0

# while flag <= 10:
#     if flag != 0:
#         a_list.append(flag)
#     if flag == 6:
#         continue
#         print("This is a Line")
#     flag += 1
# print(a_list)


# x = 0
# while x < 10:
#     print("Value of x is: " + str(x))
#     x = x + 1

#     if x == 8:
#         break
#     print("This example is awesome")
#     print("*"*20)
# else:
#     print("Just broke out of the loop")

x = 0
a_list = []
while x <= 10:   
    x = x + 1 # Why is this loop not running if it's in Line 38 ?
    if x != 0:
        a_list.append(x)

    if x == 8:
        continue

print(a_list)