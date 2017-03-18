"""
Contains a scrapper parent for search news in Google engine Search

"""
from Scrapper import *


class GoogleScrapper(Scrapper):
   
    def __init__(self, keyWords):
        '''
        Initializes a GoogleScrapper object
        
        keyWords (list): the list of keywords
        
        a GoogleScrapper object inherits from Scrapper and has one attribute:
        self.keyWords (List of string, determined by input)
        
        '''        
        Scrapper.__init__(self, keyWords)
    
    def scrapp_news(self):
        '''
        get url by searching news with the keywords specified in the constructor        
        in google search engine
        Return a list of Url form the news
        '''
        allKeyWords=''
        allKeyWords=self.listToString()
        headers = {'user-agent': 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36'}
        urlSearch="https://www.google.com/search?q=%"+allKeyWords+"%22&tbm=nws&tbs=qdr:y"
        r = requests.get(urlSearch, headers=headers)
        soup = BeautifulSoup(r.text, "html.parser")
        letters = soup.find_all("div", class_="_cnc")        
        newsURL = []
        for letter in letters[:10]:
            newsURL.append(letter.a["href"])
        return newsURL
 
