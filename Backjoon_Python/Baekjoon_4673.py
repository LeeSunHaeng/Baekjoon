from operator import index


list = [0 for i in range(10001)]
for i in range(10001) :
    temp = i
    for j in str(i) :
        temp += int(j)
    if temp <10001 :
        list[temp] = 1 


for i in range(len(list)) :
    if list[i] == 0 :
        print(i)