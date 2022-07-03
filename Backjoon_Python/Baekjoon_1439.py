# num = input()
# A = 0
# B = 0
# for i in range(1,len(str(num))) :
#     if num[i] != num[i-1] :
#         if num[i] == "1":
#             A += 1
#         else :
#             B += 1

# if  A==B :
#     if A ==1 and B ==1 :
#         print(1)
#     elif A ==0 and B ==0 :
#         print(0)
#     else :
#         print(A)
# else :
#     if A>B :
#       print(B)
#     elif B>A :
#       print(A)

S = input()
count = 0
for i in range(len(S)-1):
    if S[i] != S[i+1]:
        count += 1
print((count + 1) // 2)