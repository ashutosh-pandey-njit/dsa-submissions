class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Dictionary to store value -> index mapping
        seen = {}
        
        for i, num in enumerate(nums):
            diff = target - num
            if diff in seen:
                # Found the pair: seen[diff] is the earlier index
                return [seen[diff], i]
            # Store current number's index
            seen[num] = i