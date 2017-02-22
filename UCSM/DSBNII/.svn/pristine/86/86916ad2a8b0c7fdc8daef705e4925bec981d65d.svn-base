using AbstractFactory.Core.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.DataAccess
{
    public class ConcreteSubjectUser: Subject
    {

        public UsersModel cambio {
            get ;private set;
        }
        
        public void Cambiar(UsersModel newValue)
        {
            cambio = newValue;
            Notify();
         
        }
        
        public void Attach(ConcreteObserverUser observer)
        {
            _observers.Add(observer);
        }
        public void Detach(ConcreteObserverUser observer)
        {
            _observers.Remove(observer);
        }
    }
}
