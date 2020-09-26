"""
min and max of a given arary
"""


# Easiest solution

def min_max(an_array):
    print(min(an_array))
    print(max(an_array))

# min_max([3,5,7])


# Basic solution 

def manual_min_max(an_array):

    temp = an_array[0]
    n = len(an_array)
 
    for i in range(2,n):
        if temp > an_array[i]:
            temp = an_array[i]
    print(temp) # How do I return multiple variable

    for i in range(2,n):
        if temp < an_array[i]:
            temp = an_array[i]
    print(temp)


manual_min_max([3,5,7,11])


# Elegant Solution

def min_max_optimized(an_array):
    results = sorted(an_array)
    return results[0], results[-1]

print(min_max_optimized([3,5,6,9,1,2,4])) 