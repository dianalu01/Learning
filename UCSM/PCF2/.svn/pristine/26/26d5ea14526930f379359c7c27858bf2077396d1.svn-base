using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Greeting.Lib
{

    public delegate void NtfObserver(string calle, string numero);

    public class Observable
    {
        public event NtfObserver NtfObserverEvt;
        
        public void Attach (NtfObserver observer)
        {
            NtfObserverEvt += observer;
        }
        public void Detach(NtfObserver observer)
        {
            NtfObserverEvt -= observer;
        }
        protected void Notify(string calle,string numero)
        {
            if (NtfObserverEvt != null)
            {
                NtfObserverEvt(calle,numero);
            }
        }
    }
}
