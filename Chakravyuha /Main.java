n=int(input())

c=[[0 for x in range(n)] for y in range(n)]
p=[]
p.append((0,0))

start=0
end=n-1
n1=1 

for i in range(int((n+1)/2)):
    for j in range(start,end+1):
        c[start][j]=n1 
        if n1%11==0:
            p.append((start,j))
        n1+=1
    for j in range(start+1,end+1):
        c[j][end]=n1 
        if n1%11==0:
            p.append((j,end))
        n1+=1
    for j in range(end-1,start-1,-1):
        c[end][j]=n1 
        if n1%11==0:
            p.append((end,j))
        n1+=1
    for j in range(end-1,start,-1):
        c[j][start]=n1 
        if n1%11==0:
            p.append((j,start))
        n1+=1
    start+=1 
    end-=1 
    
for i in range(n):
    for j in range(n):
        print(c[i][j],end="\t")
    print()
print("Total Power points :",len(p))
print(*p,sep="\n")