n = int(input())
for i in range(n) :
    ci,st = map(str,input().split())
    word = ""
    for i in range(len(str(st))) :
        for j in range(int(ci)) :
            word += st[i]

    print(word)
