"""
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
"""

"""
Input: nums = [2,7,11,15], target = 9
Output: [0,1]

Input: nums = [3,2,4], target = 6
Output: [1,2]
"""

def twoSum1(nums, target):
    dic = {}
    for i, num in enumerate(nums):
        if target-num in dic:
            # return (dic[target-num]+1, i+1)
            return True
        dic[num] = i

print(twoSum1(nums=[2,3,1,5,6,7,8,9,10], target=8))


def twoSum2(nums, target):
        
    for i in range(len(nums)):
        j = i+1
        for j in range(len(nums)):
            if nums[i] + nums [j] == target:
                return [i,j]

    return []


# Return All Pairs of a given number

def print_sum_pairs(arr, sum):
    arr_len = len(arr)
    res = {}
    for i in range(arr_len):
        for j in range(i+1, arr_len):
            if (arr[i] + arr[j] == sum):
                res[i] = (arr[i], arr[j])
    
            return res


# print(twoSum(nums=[2,3,4,5,6,7,8,9,10], target=6))

# print(print_sum_pairs([1, 5, 7, -1, 5], 6).values())


"""
Return True or False 

[1,2,3,9] , Sum = 8 
OP : False
[1,2,4,4] , Sum = 8
OP : True 
"""

def isSumPresent(input_array, sum):

    array_len = len(input_array)
    for i in range(array_len-1):
        if input_array[i] + input_array[i+1] == sum:
            return True
    return False

# print(isSumPresent([1,2,3,9], 8 ))

# print(isSumPresent([1,2,3,4,4], 8 ))

# print(isSumPresent([1,4,3,4], 8 ))

"""
Two Sum Interview Qs :
"""

def returnTargetPairs2(nums, target):
    result = {}
    nums_len = len(nums)
    
    for i in range(nums_len):
        if target-nums[i] in result:
            # return (dic[target-num]+1, i+1)
            return (result[target-nums[i]]+1, i+1)
    
        result[nums] = i      


print(returnTargetPairs2([2,7,11,15], 9))