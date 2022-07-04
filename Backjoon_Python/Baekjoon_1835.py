from collections import deque


N = int(input())

dq = deque()

for i in range(N) :
    card = N-i
    dq.appendleft(card)

    for _ in range(card) :
        popCard = dq.pop()
        dq.appendleft(popCard)
print(*dq)
