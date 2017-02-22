using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Greeting.Lib;

namespace Greeting.Console
{
    class Program
    {
        static void Main(string[] args)
        {
            ConcreteObservable a = new ConcreteObservable();
            a.Attach(new ConcreteObserverE ("asdfasdf","aseasfd"));


        }
    }
}
