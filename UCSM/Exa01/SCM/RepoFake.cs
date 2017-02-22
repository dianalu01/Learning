using SCM;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCM
{
    public class RepoFake : AbstractRepo
    {
        public override IList<Tuple<string, string>> GetAll()
        {
            return
                new List<Tuple<string, string>>
                {
                    new Tuple<string,string>("0001","C:/"),
                    new Tuple<string,string>("0002","C:/")

                };
        }
    }
}
