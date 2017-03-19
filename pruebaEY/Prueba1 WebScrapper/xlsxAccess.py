"""
Contains a accessor for excel files
 
"""
import xlsxwriter
import string
from xlrd import open_workbook
 
class XlsxAccess(object):
    def __init__(self, fileName):
        '''
        Initializes a XlsxAccess object
                
        fileName (string): the xlsx file Name

        a XlsxAccess object has three attributes:
            self.fileName (string, determined by input)
            self.dataList (List, determined by input)
            self.workbook empty
        '''
        self.fileName = fileName+'.xlsx'
        self.workbook=None
    def createWorkBook(self):
        '''
            Create a workbook and add a worksheet.  
            Adjust the column width.
            
            Returns: the worksheet
        '''
        try:
            self.workbook = xlsxwriter.Workbook(self.fileName)
            worksheet = self.workbook.add_worksheet()
            worksheet.set_column(5,1000,1000)         
                
        except IOError:            
            print ("Error file could not be created. ")    
            self.workbook=None
        finally:
            return worksheet
        
    def createDataHeaders (self,headers, worksheet):
        '''
            Write some data headers in the worksheet.  
            
            Returns: the worksheet
        '''
        try:
            a=string.ascii_uppercase
            count=0
            for header in headers:
                worksheet.write(a[count]+'1', header)
                count+=1
        except IOError:            
            print ("Error could not write in the file. ")    
            worksheet=None
        finally:
            return worksheet
    
    def read(self):
        '''
            Used to read from the xlsx file specified in the constructor        
            Returns: a List with the data of the file
        '''
        dataList=[]
        try:
            book = open_workbook(self.fileName)
            sheet = book.sheet_by_index(0)
            A = [ A for A in sheet.col_values(0) ]
            B = [ B for B in sheet.col_values(1) ]
            for i in range(0,len(A)):
                dataList.append([A[i], B[i]])            
        except IOError:
            print ("Error file could not be opened. ")    
            dataList=[]
        finally:
            return dataList
        
        
    def write(self,headers,dataList):
        '''
            Used to write on the xlsx file specified in the constructor        
            Returns: Nothing
        
        '''
        try:
            worksheet=self.createWorkBook()
            assert type(worksheet) != None, 'worksheet is empty'
            worksheet=self.createDataHeaders(headers, worksheet)        
            assert type(worksheet) != None, 'worksheet is empty'
            countRow = 1
            for row in dataList: 
                countCol=0
                worksheet.write('A'+str(countRow+1), countRow-1)
                countCol += 1
                for col in row:
                    worksheet.write(countRow, countCol, col)
                    countCol += 1
                countRow += 1
        
        except AssertionError :
            print ('worksheet is empty')
        except IOError:
            print('Can not access to the file')
        finally:
            if (self.workbook):
                self.workbook.close()
            return None
                
    def getFileName(self):
        '''
            Used to return the name of the file specified in the constructor        
            Returns: a String 
        '''
        return self.fileName
    
    def setFileName(self,fileName):
        '''
            Used to change the name of the file specified in the constructor        
            Returns: Nothing
        '''
        self.fileName = fileName+'.xlsx'
    