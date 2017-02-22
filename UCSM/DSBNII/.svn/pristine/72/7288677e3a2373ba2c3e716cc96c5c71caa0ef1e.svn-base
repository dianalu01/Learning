using AbstractFactory.Core.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.DataAccess
{
    public class ConcreteSubjectRepo : Subject
    {
        public RepositoryModel cambio
        {
             get;
            private set;
        }        

        public void Cambiar(RepositoryModel newValue)
        {
            cambio = newValue;
            Notify();
         
        }

        public void Attach(ConcreteObserverRepo observer)
        {
            _observers.Add(observer);
        }
        public void Detach(ConcreteObserverRepo observer)
        {
            _observers.Remove(observer);
        }
    }
}
