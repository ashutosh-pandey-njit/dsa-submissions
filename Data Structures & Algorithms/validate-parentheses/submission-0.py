class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        val_check = {")":"(", "]":"[", "}":"{"}

        for c in s:
            if c in val_check:
                if stack and stack[-1] == val_check[c]:
                    print(val_check[c])
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)

        return True if not stack else False