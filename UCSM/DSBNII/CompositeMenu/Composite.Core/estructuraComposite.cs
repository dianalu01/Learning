using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Composite.Core
{
    public class estructuraComposite
    {
        public Component loadComponent()
        {
            Component[] arrComponents;
            int i = 1;
            Fakes entfalso= new Fakes();

            List<Tuple<int, string , int>> lista = entfalso.getOpciones();
            bool []isComposite = defComposites(lista);

            arrComponents = new Component[lista.Count+1];
            arrComponents[0] = new Composite("Raiz");
            
            foreach (Tuple<int, string, int> item in lista)
           {
               if (isComposite[i] == true)
               {
                   arrComponents[i] = new Composite(item.Item2);
               }
               else
               {
                   arrComponents[i] = new Leaf(item.Item2);
               }
               arrComponents[item.Item3].Add(arrComponents[i]);
               i++;
           }

            return arrComponents[0];
        }
        private bool[] defComposites(List<Tuple<int, string, int>> lista)
        {
            bool[] isComposite = new bool[lista.Count+1];
            isComposite[0] = true;
           foreach (Tuple<int, string, int> item in lista)
           {
               if(isComposite[item.Item3] != true)
               {
                   isComposite[item.Item3] = true;
               }
            
           }
           return isComposite;
        }
    }
}
