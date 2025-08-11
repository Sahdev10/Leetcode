# class Solution:
#     def twoSum(self, nums: List[int], target: int) -> List[int]:
#         for i in range(len(nums)):
#             s = nums[i]
#             for j in range(i+1,len(nums)):
#                 s = s + nums[j]
#                 if(s==target):
#                     return [i,j]
#                 s = s - nums[j]
#         return [-1,-1]

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
        return []  # Fallback (problem guarantees a solution)
        