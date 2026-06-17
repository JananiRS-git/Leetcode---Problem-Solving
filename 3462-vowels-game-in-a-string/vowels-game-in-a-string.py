class Solution:
    def doesAliceWin(self, s: str) -> bool:
        v = {'a','e','i','o','u'}
        for i in s:
            if i in v:
                return True
        return False