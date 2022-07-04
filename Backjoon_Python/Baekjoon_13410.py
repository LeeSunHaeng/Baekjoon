N,K = map(int,input().split())
list = []
for i in range(K+1) :
    st = str(N * i)
    sample = ""
    for j in range(len(str(st))-1,-1,-1) :
        sample += st[j]
    list.append(int(sample))

list.sort()
print(list[len(list)-1])