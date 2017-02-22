using Composite.Core;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;

namespace Composite.Logic
{
    public class estructuraMenu
    {
        public Menu getMenus(string []botonesPermitidos)
        {
            estructuraComposite structComposite = new estructuraComposite();
            Menu root= new Menu();
            int nivel = 0;
            Stack<MenuItem>pila = new Stack<MenuItem>();
            Component comRaiz=structComposite.loadComponent();
            String []comSRaiz =comRaiz.Operation(1).Split('\n');
            
            for (int i = 1; i<comSRaiz.Length;i++ )
            {
                int cantGuion=comSRaiz[i].Count(c => c == '-');
                bool existe = false;
                comSRaiz[i] = comSRaiz[i].Remove(0, cantGuion);
                for (int j = 0; j < botonesPermitidos.Length; j++)
                {
                    if (comSRaiz[i] == botonesPermitidos[j])
                    {
                        existe = true;
                        break;
                    }
                }
                if (existe == true)
                {
                    if (nivel == cantGuion)
                    {
                        pila.Pop();
                    }
                    else
                    {
                        if (nivel < cantGuion)
                        {
                            nivel = cantGuion;
                        }
                        else
                        {
                            while (nivel > cantGuion)
                            {
                                pila.Pop();
                                nivel--;
                            }
                            nivel = cantGuion;
                        }
                    }
                    

                    MenuItem newItem = new MenuItem();
                    newItem.Header = comSRaiz[i];
                    if (cantGuion == 1)
                    {
                        root.Items.Add(newItem);
                    }
                    else
                    {
                        MenuItem padreMenu = pila.Pop();
                        pila.Push(padreMenu);
                        padreMenu.Items.Add(newItem);
                    }
                    pila.Push(newItem);
                }
                
            }
            return root;    
        }

    }
}
