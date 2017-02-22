using AbstractFactory.Core.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.DataAccess
{
    public class ConcreteSubjectFile : Subject
    {
        public FileModel cambio
        {
            get;
            private set;
        }

        public void Cambiar(FileModel newValue)
        {
            cambio = newValue;
            Notify();
        }

        public void Attach(ConcreteObserverFile observer)
        {
            _observers.Add(observer);
        }
        public void Detach(ConcreteObserverFile observer)
        {
            _observers.Remove(observer);
        }
    }
}
