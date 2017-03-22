# get all the sides of a figure and return how manys square, rectangle and other polygon of 4 sides exist

def searchPolygon():
    square=0
    rectangle=0
    others=0
    while True:
        try:
            inputNumber=input()
            number=[]
            inputNumberSeparated=inputNumber.split()
            for i in inputNumberSeparated:
                number.append(int(i))
            assert len(number)==4
            if((number[0]==number[2]) and (number[0]>=0) and (number[2]>=0)):
                if((number[1]==number[3])and (number[1]>=0 and (number[3]>=0))):
                    if(number[0]==number[1]):
                        #It is a square
                        square+=1            
                    else:
                        #It is a rectangle
                        rectangle+=1
                else:
                    #It is a neither
                    others+=1
            else:
                #It is a neither
                others+=1
        except EOFError:
            print(str(square) + " "+ str(rectangle) + " "+ str(others))
            break
        except AssertionError:
            print(str(square) + " "+ str(rectangle) + " "+ str(others))
            break
searchPolygon()
