energy=list(map(int,input().split()))
count=0
sum=0
for en in energy:
  count+=1
  sum+=en
avg=sum/count


countn=0
for tn in energy:
  if tn>avg:
    countn+=1
print(countn)
