class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        queue = set()
        for num in nums:
            if num in queue:
                return True
            else:
                queue.add(num)
        
        return False
        