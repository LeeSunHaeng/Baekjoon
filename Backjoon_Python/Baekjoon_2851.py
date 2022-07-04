# from audioop import avg


# sum = 0
# while(1) :
#     n = int(input())
#     sum += n

#     if sum == 100 :
#         print(sum)
#         break
#     elif sum > 100 :
#         if abs(100-sum) > abs(100-sum+n) :
#             print(sum+n)
#             break
#         elif abs(100-sum) < abs(100-sum+n) :
#             print(sum+n)
#             break
#         elif abs(100-sum) == abs(100-sum+n) :
#             print(sum)

m = []
score = 0
for i in range(10):
    m.append(int(input()))
for j in m:
    score += j
    if score >= 100:
        if score - 100 > 100 - (score - j):
            score -= j
        break
print(score)