import sys

def compute_total_burn_time(forestlayout,cr,cc,r,c,forestfiretime,time):
  if((cr>=r) or (cr<0) or (cc>=c) or (cc<0)):
    return
  if(forestlayout[cr][cc]=='W'):
    return
  if((forestfiretime[cr][cc]!=sys.maxsize)and(time>=forestfiretime[cr][cc])):
     return
  forestfiretime[cr][cc]=time
  
  compute_total_burn_time(forestlayout,cr,cc+1,r,c,forestfiretime,time+1)   
  compute_total_burn_time(forestlayout,cr,cc-1,r,c,forestfiretime,time+1)   
  compute_total_burn_time(forestlayout,cr+1,cc,r,c,forestfiretime,time+1)   
  compute_total_burn_time(forestlayout,cr-1,cc,r,c,forestfiretime,time+1)   
  compute_total_burn_time(forestlayout,cr+1,cc+1,r,c,forestfiretime,time+1)   
  compute_total_burn_time(forestlayout,cr-1,cc+1,r,c,forestfiretime,time+1)   
  compute_total_burn_time(forestlayout,cr+1,cc-1,r,c,forestfiretime,time+1)   
  compute_total_burn_time(forestlayout,cr-1,cc-1,r,c,forestfiretime,time+1)   
  return   

def complete_total_burn_wrap(forestlayout,fire_r,fire_c,r,c):                            
  forestfiretime=[0]*r
  for i in range (r):
    forestfiretime[i]=[0]*c
    for j in range (c):
      forestfiretime[i][j]=sys.maxsize
                           
  compute_total_burn_time(forestlayout,fire_r,fire_c,r,r,forestfiretime,1)
  
  max_value=0
  for i in range(0,r):
     for j in range(0,c):
       if((forestfiretime[i][j]!=sys.maxsize)and(max_value<forestfiretime[i][j])):
         max_value=forestfiretime[i][j] 
  return max_value   
     
if __name__ == '__main__':
  r,c=input().split()
  r=int(r)
  c=int(c)

  fire_r,fire_c=input().split()
  fire_r=int(fire_r)
  fire_c=int(fire_c)

  forestlayout=[]
  for i in range(0,r):
    forestlayout.append(list(input().rstrip().split()))

  timetaken= complete_total_burn_wrap(forestlayout,fire_r-1,fire_c-1,r,c)
  print(timetaken)                                              
 