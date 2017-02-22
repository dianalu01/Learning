using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Real
{
    public class User
    {
        public List<String[]>  getAll()
        {
            AccesoDatos lista = new AccesoDatos();
            List<String[]> data = lista.getDataUser();
           
            return data;
        }
    }



}
