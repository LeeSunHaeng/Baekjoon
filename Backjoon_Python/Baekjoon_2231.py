n = int(input())

list = []
for i in range(1,n) :
    sum = i
    m = i
    while(1) :
        if m==0 :
            break

        sum += m%10
        m = m//10
    if sum == n :
        list.append(i)

list.sort()
if len(list) == 0:
    print(0)
else :
    print(list[0])
