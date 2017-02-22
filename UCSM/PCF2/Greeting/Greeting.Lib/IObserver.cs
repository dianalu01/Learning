using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Greeting.Lib
{
    public interface IObserver
    {
        void NtfObserverEvt(string number,string street);
    }
}
