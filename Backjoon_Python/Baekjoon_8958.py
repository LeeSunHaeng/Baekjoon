N = int(input())
for i in range(N) :
    M = input()
    point = int(0)
    straight = int(1)
    for i in range(len(str(M))) :
        if M[i] == "O" :
            point += straight
            straight += 1
        else :
            straight = 1
    print(point)
    point = 0
    straight = 1
