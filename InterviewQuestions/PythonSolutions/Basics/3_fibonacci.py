"""
Fibonacci numbers
Sum of Sequence of two preceeding numbers 
"""

# 0 1 1 2 4 5 8 13 21 ...

def fibonacci(input):
    result = [0,1]
    
    for i in range(2, input-1):
        result.append(result[i-1]+result[i-2])

    return result


print(fibonacci(5))