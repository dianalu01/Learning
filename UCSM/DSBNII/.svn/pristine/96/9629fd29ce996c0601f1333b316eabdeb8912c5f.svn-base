using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Composite.Logic;
using System.Windows.Controls;

namespace Composite.Logic
{
    public class contextState
    {
        private string userName;
        private state estado;

        public Menu request()
        {
            userName = System.Configuration.ConfigurationManager.AppSettings["myUsername"];

            if (userName == "standar")
                estado = new standartState();
            else if (userName == "administrator")
                estado = new adminState();

            Menu menu=estado.obtenerOpcionesPermitidas(userName);
            return menu;
            


        }

    }
}
