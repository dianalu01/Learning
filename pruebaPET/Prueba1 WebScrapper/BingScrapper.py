"""
Contains a scrapper parent for search news in Bing engine Search

"""
from Scrapper import *

class BingScrapper(Scrapper):
   
    def __init__(self, keyWords):
        '''
        Initializes a BingScrapper object
        
        keyWords (list): the list of keywords
        
        a BingScrapper object inherits from Scrapper and has one attribute:
        self.keyWords (List of string, determined by input)
        
        '''        
        Scrapper.__init__(self, keyWords)
    def listToString (self):
        '''
        Turn a list of Strings into a String separate with "+"
        Returns: a String 
        '''
        allKeyWords=''
        for keyWord in self.keyWords:
            allKeyWords+= keyWord + ' '
        allKeyWords=allKeyWords[:-1]
        return allKeyWords

    def scrapp_news(self):
        '''
        get url by searching news with the keywords specified in the constructor        
        in Bing search engine
        Return a list of Url form the news
        '''
        allKeyWords=self.listToString()
        headers = {'user-agent': 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36', "Accept-Language": "en-Us", "content-language": "en-us", "country":"US"}
        urlSearch="http://www.bing.com/news/search?q="+allKeyWords+" damage&go=Buscar&qs=ds&form=QBNT&scope=news"
        r = requests.get(urlSearch, headers=headers)
        soup = BeautifulSoup(r.text, "html.parser")
        letters = soup.find_all("div", class_="t_t")        
        newsURL = []
        for letter in letters:
            newsURL.append(letter.a["href"])
        return newsURL