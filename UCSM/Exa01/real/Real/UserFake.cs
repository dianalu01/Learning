using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCM
{
    class UserFake
    {
        IList<Tuple<string, string,string>> GetAll()
        {
            return
                new List<Tuple<string, string,string >>
                {
                    new Tuple<string,string,string>("U01","Guillermo Villena","Gvillena")

                };
        }
    }
}