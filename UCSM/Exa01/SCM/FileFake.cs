using SCM;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCM
{
    public class FileFake : AbstractFile
    {
        public override IList<Tuple<string, string, string>> GetAll()
        {
            return
                new List<Tuple<string, string, string>>
                {
                    new Tuple<string,string,string>("f01","file01.cs","dsbn_src"),
                    new Tuple<string,string,string>("f02","file02.cs","dsbn_src")

                };
        }
    }
}
