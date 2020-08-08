import itertools as it

a,b=input().split()

la=[]
lb=[]
kl=[]

if len(b)>len(a):
    print("-1")
else:
    for ev in a:
        la.append(ev)

    r=list(sorted(it.permutations(la)))
    for i in r:
        for j in i:
            res="".join(i)
            res=int(res)
            if res not in lb:
                lb.append(res)
    
    result=-1
    for k in lb:
        if k>int(b):
            result=k
            break
    print(result)