using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Greeting.Lib
{
    public class ConcreteObservable : Observable
    {
        protected string _Calle  { 
            get { return _Calle; } 
            private set { 
                _Calle = value;
                Notify(this._Calle,this._Numero);
            }
        }
        public void CambiarCalle(string newValue)
        {
            _Calle = newValue;
        }


        protected string _Numero
        {
            get { return _Numero; }
            private set
            {
                _Numero = value;
                Notify(this._Calle,this._Numero);
            }
        }
        public void CambiarNumero(string newValue)
        {
            _Numero = newValue;
        }
    }       
}
