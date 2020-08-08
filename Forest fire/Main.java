def burntime(forestlayout,cr,cc,r,c,forestfiretime,time):
    if((cr>=r) or (cr<0) or (cc>=c) or (cc<0) or (forestlayout[cr][cc]=="W")):
        return
    if((forestfiretime[cr][cc]!=-1) and (time>=forestfiretime[cr][cc])):
        return
    forestfiretime[cr][cc]=time 
    
    burntime(forestlayout,cr+1,cc+1,r,c,forestfiretime,time+1)
    burntime(forestlayout,cr+1,cc,r,c,forestfiretime,time+1)
    burntime(forestlayout,cr+1,cc-1,r,c,forestfiretime,time+1)
    burntime(forestlayout,cr,cc+1,r,c,forestfiretime,time+1)
    burntime(forestlayout,cr,cc-1,r,c,forestfiretime,time+1)
    burntime(forestlayout,cr-1,cc+1,r,c,forestfiretime,time+1)
    burntime(forestlayout,cr-1,cc,r,c,forestfiretime,time+1)
    burntime(forestlayout,cr-1,cc-1,r,c,forestfiretime,time+1)


if __name__=='__main__':
    
    r,c=input().split()
    
    r=int(r)
    c=int(c)
    
    fire_r,fire_c=input().split()
    fire_r=int(fire_r)
    fire_c=int(fire_c)
    
    forestlayout=[]
    
    for i in range(r):
        forestlayout.append(list(input().rstrip().split()))
        
    forestfiretime=[0]*r
    
    for i in range(r):
        forestfiretime[i]=[0]*c 
        for j in range(c):
            forestfiretime[i][j]=-1 
    
    burntime(forestlayout,fire_r-1,fire_c-1,r,c,forestfiretime,1)
    
    max=0
    for i in range(r):
        for j in range(c):
            if forestfiretime[i][j]>max:
                max=forestfiretime[i][j]
    print(max)