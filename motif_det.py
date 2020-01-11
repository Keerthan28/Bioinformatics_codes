import numpy as np;
import scipy as sp;
def hamming(s,p):
	i=0
	m=0
	while(i<len(s)):
		if(s[i]!=p[i]):
			m=m+1
		i=i+1
	return m
def motif(s,k,d):
	p=["Null"]
	count=[0]
	i=0
	j=0
	while(i<len(s)-k):
		while(j<len(p)-1):
			if(hamming(p[j+1],s[i,i+k])<=d):
				count[j+1]=count[j+1]+1
			else:
				p.append(s[i,i+k])
				count.append(0)
			j=j+1
		i=i+1
	large=0
	pos=0
	i=0
	while(i<len(count)):
		if(count[i]>large):
			large=count[i]
			pos=i
		i=i+1
	return p[pos]
if "__name__"=="__main__":
	input(s)
	input(k)
	input(d)
	print(motif(s,int(k),int(d)))


