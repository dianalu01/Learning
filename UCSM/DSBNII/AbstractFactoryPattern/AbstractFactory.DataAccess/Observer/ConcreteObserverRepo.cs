using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.DataAccess
{
    public class ConcreteObserverRepo : IObserver
    {
        private string _name;
        private RealRepository _rRepo;

        public ConcreteObserverRepo(string name, RealRepository r)
        {
            _name = name;
            _rRepo = r;
        }
        public void Update() {
            Console.WriteLine("Hey World, I changed! I'm {0}  Observer for Respository, and y new value is {1} ", _name, _rRepo.cambio.IdRepository + " " + _rRepo.cambio.PathRepository + "\n");

            
        }

    }
}
