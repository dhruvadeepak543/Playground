n=int(input())
l=list(map(int,input().split()))
res=-1
for a in range(n):
    for b in range(n):
        
        if sum(l[0:a])==sum(l[a+1:b])==sum(l[b+1:n]):
            
            print("Indices which form equi pair {%d,%d}" %(a,b))
            x="{"+"0"+","+str(a-1)+"}"
            y="{"+str(a+1)+","+str(b-1)+"}"
            z="{"+str(b+1)+","+str(n-1)+"}"
            res=x+","+y+","+z
            break
if res==-1:
    print("Array does not contain any equi pair")
else:
    print("Slices are",res)