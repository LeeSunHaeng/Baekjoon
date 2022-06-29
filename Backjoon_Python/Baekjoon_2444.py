N = int(input())
count = 1
for i in range(1,N*2):
    if(i<N):
      print(" "*(N-i) + "*"*count)
      count += 2
    else:
        print(" "*(i-N) + "*"*count)
        count -= 2

    