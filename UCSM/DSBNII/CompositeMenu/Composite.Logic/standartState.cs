using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;

namespace Composite.Logic
{
    public class standartState : state
    {
        public Menu obtenerOpcionesPermitidas(string user)
        {
            string[] botonesPermitidos = { "File", "Open", "Close" };
            estructuraMenu estruMenu = new estructuraMenu();

            Menu menu=estruMenu.getMenus(botonesPermitidos);
            return menu;
        }
    }
}
