"""
Check if number is Prime or Not
"""

a_list = list(range(0,11))

def isPrime(a_list):

    for value in a_list:
        if value > 1:

            for i in range(1, value):
                if value % i == 0:
                    print(value,'is a prime')
                    break
                else:
                    print(value,'is not a prime')
                    break
        else:
            print(value,'is not a prime')


isPrime(a_list)