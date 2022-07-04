# N = int(input())
# que = []
# for i in range(N,0,-1) :
#     que.append(i)

# while(len(que) > 1) :
#     que.pop()
#     temp = que.pop()
#     que.append(temp)

# print(que.pop)

#파이썬에서 Queue를 쓸땐 deque를 해줌
from collections import deque

N = int(input())

q = deque()

for card in range(1, N+1) :
    q.append(card)

while len(q) >1 :
    firstCard = q.popleft()
    secondCard = q.popleft()
    q.append(secondCard)

print(q.pop()) 