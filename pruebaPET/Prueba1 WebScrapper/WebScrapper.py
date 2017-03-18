"""
EP PRUEBA DE CONOCIMIENTO TECNICO

PRUEBA 1: Creación de “Web Scrapper” utilizando Python (tiempo referencial: 8h)
Objetivo: Automatizar la obtención y evaluación de links de noticias, 
a través del uso de consultas directas a motores de búsqueda.
"""
from GoogleScrapper import *
from YahooScrapper import *
from BingScrapper import *
from NewsLookupScrapper import *
from xlsxAccess import *

class WebScrapper(object):
    
    def __init__(self, fileNameInput,fileNameOutput):
        '''
        Initializes a WebScrapper object
                
        fileName (string): the csv file Name

        a WebScrapper object has two attributes:
            self.fileNameInput (string, determined by input text, is the input filename)
            self.fileNameOutput (string, determined by input text, is the output filename)
            
        '''
        self.fileNameInput = fileNameInput        
        self.fileNameOutput = fileNameOutput
        
    def appendDataList(self,data,urlNews) :
        '''
        Read from a csv file
        Search news url in Google, Yahoo, Bing, NewsLookup engines 
        Write the links in excel file
        Return None
        '''
        dataList=[]
        for url in urlNews:
               dataList.append([url,data[0]+' '+data[1]])   
        return dataList
    
    def ScrappNews(self):        
        '''
        Read from a csv file
        Search news url in Google, Yahoo, Bing, NewsLookup engines 
        Write the links in excel file
        Return None
        '''
        try:            
            x=XlsxAccess(self.fileNameInput)
            dataList=x.read()
            newDataList=[]            
            count =0
            for data in dataList:                
               count+=1
               print count
               googleScrapper=GoogleScrapper(data)
               newDataList+=self.appendDataList(data,googleScrapper.scrapp_news())                         
               yahooScrapper=YahooScrapper(data)
               newDataList+=self.appendDataList(data,yahooScrapper.scrapp_news())
               bingScrapper=BingScrapper(data)
               newDataList+=self.appendDataList(data,bingScrapper.scrapp_news())
               newsLookupScrapper=NewsLookupScrapper(data)
               newDataList+=self.appendDataList(data,newsLookupScrapper.scrapp_news())               
               
            x=XlsxAccess(self.fileNameOutput)
            x.write(['Index','URL', 'Keywords'],newDataList)        
        except IOError:
            print ("Error reading from csv or writing in the xlsx")
def main():
    webScrapper=WebScrapper('C:\Users\Mi Pc\Documents\Python Scripts\Prueba1 WebScrapper\Anexo 1.1 INPUT',
                        'C:\Users\Mi Pc\Documents\Python Scripts\Prueba1 WebScrapper\Anexo 1.2 OUTPUT')
    webScrapper.ScrappNews()

if __name__ == '__main__':
    main()
