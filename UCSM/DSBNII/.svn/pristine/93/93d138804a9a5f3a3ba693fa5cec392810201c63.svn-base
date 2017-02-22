using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.DataAccess
{
    public abstract class Subject
    {

        protected IList<IObserver> _observers; 

        public Subject()
        {
            _observers = new List<IObserver>();
            
        }

       public   void Attach (IObserver observer)
        {
            _observers.Add(observer);
        }
       public void Detach(IObserver observer)
        {
            _observers.Remove(observer);
        }
        protected void Notify()
        {
            foreach (IObserver obj in _observers)
            {
                obj.Update();
            }           
        }
    }
}
