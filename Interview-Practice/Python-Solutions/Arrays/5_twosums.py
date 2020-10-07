"""
Two Sums 
1. One Solution
2. Two Solutions - https://leetcode.com/problems/two-sum/
"""


def twoSum1(nums, target):
    dic = {}
    for i, num in enumerate(nums):
        if target-num in dic:
            return (dic[target-num]+1, i+1)
        dic[num] = i

print(twoSum1(nums=[2,3,4,5,6,7,8,9,10], target=8))

def twoSum2(nums, target):
        
    for i in range(len(nums)):
        j = i+1
        for j in range(len(nums)):
            if nums[i] + nums [j] == target:
                return [i,j]

    return []

# print(twoSum(nums=[2,3,4,5,6,7,8,9,10], target=6))

# Return All Pairs of a given number

def print_sum_pairs(arr, sum):
    arr_len = len(arr)
    res = {}
    for i in range(arr_len):
        for j in range(i+1, arr_len):
            if (arr[i] + arr[j] == sum):
                res[i] = (arr[i], arr[j])
    
    return res

# print(print_sum_pairs([1, 5, 7, -1, 5], 6).values())
