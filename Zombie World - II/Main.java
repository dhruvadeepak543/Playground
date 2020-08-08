BE,nzs = list(map(int,input().split()))
l=list(map(int,input().split()))

l.sort()

for i in range(len(l)):
  BE=BE-(l[i]%2+l[i]/2)

if BE>0:
    print("YES")
else:
    print("NO")