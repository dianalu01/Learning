using SCM;
using Real;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
    public class concreteAbstractFactoryReal : AbstractFactory
    {
        public override AbstractFile createFile()
        {
            return new Archivo();
        }
        public override AbstractUser createUser()
        {
            return new User();
        }
        public override AbstractRepo createRepo()
        {
            return new Repo();
        }
    }
}
