"""
Contains a scrapper parent for search news in Yahoo engine Search

"""
from Scrapper import *

class YahooScrapper(Scrapper):
   
    def __init__(self, keyWords):
        '''
        Initializes a YahooScrapper object
        
        keyWords (list): the list of keywords
        
        a YahooScrapper object inherits from Scrapper and has one attribute:
        self.keyWords (List of string, determined by input)
        
        '''        
        Scrapper.__init__(self, keyWords)

    def scrapp_news(self):
        '''
        get url by searching news with the keywords specified in the constructor        
        in Yahoo search engine
        Return a list of Url form the news
        '''
        allKeyWords=''
        allKeyWords=self.listToString()
        headers = {'user-agent': 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36'}
        urlSearch="https://news.search.yahoo.com/search?p="+allKeyWords+"&fr=uh3_news_web_gs&fr2=p%3Anews%2Cm%3Asb"
        r = requests.get(urlSearch, headers=headers)
        soup = BeautifulSoup(r.text, "html.parser")
        letters = soup.find_all("div", class_="compTitle")          
        newsURL = []
        for letter in letters:
            newsURL.append(letter.a["href"])
        return newsURL

