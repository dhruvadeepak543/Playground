n=int(input())
l=list(map(int,input().split()))
l1=[]
def str_base(val, base):
    res = ''
    while val > 0:
        res = str(val % base) + res
        # val /= base # only valid for Py2
        val //= base # for getting integer division
    if res: return res
    return '0'
base=6
for val in l:
    l1.append(str_base(val,base))
#print(l1)
l2=[]
for z in l1:
    k=0
    k+=sum(list(map(int,list(z))))
    l2.append(k)
#print(l2)
count=0
for x in range(n):
    for y in range(x+1,n):
        if l2[x]>l2[y]:
            count+=1
print(count)