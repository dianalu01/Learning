"""
Contains a scrapper parent for search news
"""

from bs4 import BeautifulSoup
import requests
import time
from random import randint

class Scrapper (object):
    
    def __init__(self, keyWords):
        '''
        Initializes a Scrapper object
                
        keyWords (list): the list of keywords 

        a scrapper object has one attribute:
            self.keyWords (List of string, determined by input)
        '''        
        self.keyWords = keyWords
   

    def listToString (self):
        '''
        Turn a list of Strings into a String separate with "+"
        Returns: a String 
        '''
        allKeyWords=''
        for keyWord in self.keyWords:
            allKeyWords+= keyWord + '+'
        allKeyWords=allKeyWords[:-1]
        return allKeyWords


