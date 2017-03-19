"""
Contains a scrapper parent for search news in NewsLookup engine Search

"""
from Scrapper import *

class NewsLookupScrapper(Scrapper):
   
    def __init__(self, keyWords):
        '''
        Initializes a NewsLookupScrapper object
        
        keyWords (list): the list of keywords
        
        a NewsLookupScrapper object inherits from Scrapper and has one attribute:
        self.keyWords (List of string, determined by input)
        
        '''        
        Scrapper.__init__(self, keyWords)

    def scrapp_news(self):
        '''
        get url by searching news with the keywords specified in the constructor        
        in NewsLookup search engine
        Return a list of Url form the news
        '''
        allKeyWords=''
        allKeyWords=self.listToString()
        headers = {'user-agent': 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36'}
        urlSearch="http://www.newslookup.com/results?ovs=&dp=&mt=-1&tp=&s=&groupby=no&cat=-1&fmt=&ut=&q="+allKeyWords+"&m="
        r = requests.get(urlSearch, headers=headers)
        soup = BeautifulSoup(r.text, "html.parser")
        letters = soup.find_all("a", class_="title")          
        newsURL = []
        for letter in letters:
            newsURL.append(letter["href"])
        return newsURL
