"""
Two Sums
"""


class Solution(self):
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        for i in range(len(nums)):
            j = i+1
            for j in range(len(nums)):
                if nums[i] + nums [j] == target:
                    return [i,j]
        
        return []

    def twoSum1(self, nums, target):
        dic = {}
        for i, num in enumerate(nums):
            # print(i)
            # print(num)
            if target-num in dic:
                print(dic[target-num])
                return (dic[target-num]+1, i+1)
            dic[num] = i
        # print(dic.keys())
        # print(dic.values())

    print(twoSum1(nums=[2,3,4,5,6,7,8,9,10], target=6))

    def twoSum(self, nums, target):
            
        for i in range(len(nums)):
            j = i+1
            for j in range(len(nums)):
                if nums[i] + nums [j] == target:
                    return [i,j]

        return []

    print(twoSum(nums=[2,3,4,5,6,7,8,9,10], target=6))