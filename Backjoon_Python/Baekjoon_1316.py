# n = int(input())
# list = [0 for i in range(26)]
# count = 0
# for i in range(n) :
#     st = input()
#     for j in range(len(str(st))-1) :
#         if st[j] != st[j+1] :
#             if list[int(ord(st[j]))-97] == 0 :
#                 list[int(ord(st[j]))-97] = 1
#             else :
#                 break
#         else :
#             if list[int(ord(st[j]))-97] == 1 :
#                 break
#         if j == len(str(st))-1 :
#              count += 1
   
        
# print(count)

N = int(input())
result = N
for i in range(0,N):
    word=input()
    for j in range(0,len(word)-1):
        if word[j]==word[j+1]:
  
            pass
        elif word[j] in word[j+1:]:   
            print(word[j+1:])        
            result-=1
            break
print(result)
