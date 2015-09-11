'''
Created on Sep 11, 2015

@author: Test
'''
import math


def main():
    
    f=1
    n=0
    for n in range(20):
        f=math.factorial(n)
        print (n, " ! = ", f),
    
main()
        
'''def main(): 
    f=1
    n=0
    for n in range(0,20):
        print(n, " != ",f)
        n+=1
        f=f*n

main() '''

