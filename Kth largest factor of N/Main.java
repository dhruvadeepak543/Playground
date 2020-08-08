n,k = list(map(int,input().split()))
if k==1:
    print(n)
else:
    l = []
    temp=n
    l.append(n)
    n=n//2
    for i in range(1,n+1):
        if temp%i == 0:
            l.append(i)
        
    l=sorted(l)

    if k>len(l):
        print("1")
    else:
        print(l[-k])
    
    
