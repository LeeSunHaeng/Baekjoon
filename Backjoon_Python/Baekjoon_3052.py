list = [0 for i in range(42)]

for i in range(10) :
    n = int(input())
    list[n%42] += 1
count = int(0)
for i in range(42) :
    if list[i] == 0 :
        count += 1

print(42-count)
