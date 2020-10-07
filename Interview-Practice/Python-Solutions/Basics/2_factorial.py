"""
Factorial of a Number
"""


# Given a number return factorial of it


num = 3
fact = 1

def factorial(num):
    global fact
    if num < 0:
        return 0
    else:
        for i in range(1,num+1):
            fact = fact * i
    return fact

# print(factorial(num))

def factorial1(num):
    return 1 if (num == 0 or num == 1) else num * factorial(num-1);

print(factorial1(num))