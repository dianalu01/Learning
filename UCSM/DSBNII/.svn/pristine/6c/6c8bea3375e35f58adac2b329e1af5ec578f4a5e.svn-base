using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.Lib
{
    public class Singleton
    {
        private static volatile Singleton instance;
        private static readonly object padlock = new object();
        private  AbstractFactories myabstractFactoryReal= new concreteAbstractFactoryReal(); 
        private  AbstractFactories myabstractFactoryFake= new concreteAbstractFactoryFake(); 

        private Singleton() { }

        public static Singleton Instance
        {
            get
            {
                if (instance == null)
                {
                    lock (padlock)
                    {
                        if (instance == null)
                            instance = new Singleton();
                    }
                }

                return instance;
            }
        }
        public  AbstractFactories getAbstractFactorie(string tipoFactory)
        {
            if (tipoFactory == "Real")
            {
                return myabstractFactoryReal;
            }
            else
            {
                if (tipoFactory == "Falso")
                {
                    return myabstractFactoryFake;
                }
                else
                    return null;
            }            
        }
    }
}
