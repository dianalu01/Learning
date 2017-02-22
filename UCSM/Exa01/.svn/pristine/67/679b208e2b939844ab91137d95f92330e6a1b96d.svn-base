
using SCM;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Real
{
    public class User: AbstractUser
    {
        public override IList<Tuple<string, string, string>> GetAll()
        {
            AccesoDatos lista = new AccesoDatos();
            List<String[]> data = lista.getDataUser();
            IList<Tuple<string, string, string>> resultado = new List<Tuple<String, String, String>>(); ;
            foreach (var i in data)
            {
                resultado.Add(new Tuple<string, string, string>(i[0], i[1], i[2]));
            }
            return resultado;
        }
    }



}
