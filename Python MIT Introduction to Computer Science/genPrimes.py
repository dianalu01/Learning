# -*- coding: utf-8 -*-
"""
Created on Mon Feb 20 21:17:45 2017

@author: Mi Pc
"""


def genPrimes():
    '''
    Have the generator keep a list of the primes it's generated. 
    A candidate number x is prime if (x % p) != 0 for all earlier primes p
    '''
    primes=[]
    next=1
    yield next
    flag=False
    while True:
        next+=1
        for prime in primes:
            if next % prime==0:
                flag=True
        if flag:
            flag=False            
        else:
            primes.append(next)
            yield next
        