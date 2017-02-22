using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;

namespace Composite.Logic
{
    public class adminState : state
    {
        public Menu obtenerOpcionesPermitidas(string user)
        {
            string[] botonesPermitidos = { "File", "Open", "Close", "Reports","R1","R2"};
            estructuraMenu estruMenu = new estructuraMenu();

            Menu menu = estruMenu.getMenus(botonesPermitidos);
            return menu;
        }
    }
}
