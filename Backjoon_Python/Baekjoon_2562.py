max = int(0)
count = int(0)
for i in range(1,10) :
    num = int(input())
    if num > max :
        max = num
        count = i
print(max)
print(count)
