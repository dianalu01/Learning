using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCM
{
    public abstract class AbstractUser
    {
        public abstract IList<Tuple<string, string,string>> GetAll();
    }
}
