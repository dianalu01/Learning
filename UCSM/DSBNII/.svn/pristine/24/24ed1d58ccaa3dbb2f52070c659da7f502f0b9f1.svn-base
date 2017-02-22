using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.DataAccess
{
    public class ConcreteObserverFile : IObserver
    {
        private string _name;
        private RealFile _rFile;
        public ConcreteObserverFile(string name, RealFile f)
        {
            _name = name;
            _rFile = f;
        }
        public void Update() {
            Console.WriteLine("Hey World, I changed! I'm {0} Observer for File, and y new value is {1} ", _name, _rFile.cambio.IdFile + " " + _rFile.cambio.NombreArchivoFile + " " + _rFile.cambio.NombrePathFile + "\n");
           
        }

    }
}
