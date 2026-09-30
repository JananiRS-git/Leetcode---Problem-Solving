class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        # st= sorted(strs)
        # fir=st[0]
        # res=[]
        # las=st[-1]
        # for i in range(min(len(fir),len(las))):
        #     if fir[i]==las[i]:
        #         res.append(fir[i])
        #     else:
        #         break
        # return "".join(res)

        pre=strs[0]
        for i in range(1,len(strs)):
            while not strs[i].startswith(pre):
                pre=pre[:-1]
        return pre
        