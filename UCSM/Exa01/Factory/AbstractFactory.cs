using SCM;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
    public abstract class AbstractFactory
    {
        public abstract AbstractFile createFile();
        public abstract AbstractUser createUser();
        public abstract AbstractRepo createRepo();
    }
}
