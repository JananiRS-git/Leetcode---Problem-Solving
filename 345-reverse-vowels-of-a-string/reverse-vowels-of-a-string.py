class Solution:
    def reverseVowels(self, s: str) -> str:
        dup = list(s)
        i=0
        j = len(dup)-1
        vow ="aeiouAEIOU"
        while i <j:
            if dup[i] in vow and dup[j] in vow:
                dup[i], dup[j]= dup[j], dup[i]
                i+=1
                j-=1
            if dup[i] not in vow:
                i+=1
            if dup[j] not in vow:
                j-=1
        return "".join(dup)

        