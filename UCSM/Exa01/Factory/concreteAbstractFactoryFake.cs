using SCM;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
   public  class concreteAbstractFactoryFake : AbstractFactory
    {
        public override AbstractFile createFile()
        {
            return new FileFake();
        }
        public override AbstractUser createUser()
        {
            return new UserFake();
        }
        public override AbstractRepo createRepo()
        {
            return new RepoFake();
        }
    }
}
