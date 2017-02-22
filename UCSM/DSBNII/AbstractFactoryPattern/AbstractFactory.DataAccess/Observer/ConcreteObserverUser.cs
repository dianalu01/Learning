using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.DataAccess
{
    public class ConcreteObserverUser : IObserver
    {
        private string _name;
        private RealUser _rUser;

        public ConcreteObserverUser(string name, RealUser u)
        {
            _name = name;
            _rUser = u;
        }
        public void Update() { 
                Console.WriteLine("Hey World, I changed! I'm {0} Observer for User, and y new value is {1} ", _name, _rUser.cambio.IdUser + " " + _rUser.cambio.NickUser + "   " + _rUser.cambio.NombreUser + "\n");
        }

    }
}
