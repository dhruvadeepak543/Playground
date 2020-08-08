minl=int(input())
maxl=int(input())
minw=int(input())
maxw=int(input())
c=0

for i in range(minl,maxl+1):
    for j in range(minw,maxw+1):
        a,b=i,j 
        while(a>1 or b>1):
            if((a>b) and (a!=1) and (b!=1)):
                a=a-b
                c=c+1 
                
            if((a<b) and (a!=1) and (b!=1)):
                b=b-a
                c=c+1 
                
            if((a==b) and (a!=1) and (b!=1)):
                c=c+1 
                a=1 
                b=1 
                
            if((a>b) and (b==1)):
                c=c+a 
                a=1 
                
            if ((a<b) and (a==1)):
                c=c+b 
                b=1 
            if a==b==1:
                break
            
print(c)