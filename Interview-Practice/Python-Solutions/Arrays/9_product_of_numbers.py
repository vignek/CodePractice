"""
Given an array arr[] of n integers, construct a Product Array prod[] (of same size) 
such that prod[i] is equal to the product of all the elements of arr[] except arr[i]. 
Solve it without division operator in O(n) time.
"""

arr  = [10, 3, 5, 6, 2]

n = len(arr) 

 
def product_array(arr, n):

    left = [None] * n
    right = [None] * n
    prod = [None] * n
    left[0] = 1
    right[n-1] = 1

    print(left)
    print(right)

    for i in range(1, n):
        left[i] = arr[i - 1] * left[i - 1]

    print(left)


    for i in range(n-2, -1, -1):
        right[i] = arr[i + 1] * right[i + 1]

    print(right)

    for i in range(n):
        prod[i] = left[i] * right[i]  

    for i in range(n):  
        print(prod[i], end =' ')  

product_array(arr, n)



def productExceptSelf(self, nums: List[int]) -> List[int]:
    
    length = len(nums)

    L, R, answer = [0]*length, [0]*length, [0]*length
    
    L[0] = 1
    for i in range(1, length):
        
        L[i] = nums[i - 1] * L[i - 1]
    
    R[length - 1] = 1
    for i in reversed(range(length - 1)):
        
        R[i] = nums[i + 1] * R[i + 1]
    
    # Constructing the answer array
    for i in range(length):
        answer[i] = L[i] * R[i]
    
    return answer