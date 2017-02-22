using SCM;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Real
{
    public class Repo: AbstractRepo
    {
        public override IList<Tuple<string, string>> GetAll()
        {
            AccesoDatos lista = new AccesoDatos();
            List<String[]> data = lista.getDataRepo();
            IList<Tuple<string, string>> resultado = new List<Tuple<String, String>>(); 
            foreach(var i in data ){
                resultado.Add(new Tuple<string, string>(i[0], i[1]));
            }
            return resultado;
        }
    }



}
