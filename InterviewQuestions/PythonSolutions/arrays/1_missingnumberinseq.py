"""
Missing Number in a sequence of given number
Confident
"""

def missingNums(num):
    n = len(num) # len of num
    total = ( n + 2 ) * ( n + 1 ) / 2 # n + 1 * n + 2 / 2 
    sum_of_num = sum(num) # of the given series
    return (total - sum_of_num) # return difference

print(int(missingNums([1,3,4,5,6,7,8,9,10])))
