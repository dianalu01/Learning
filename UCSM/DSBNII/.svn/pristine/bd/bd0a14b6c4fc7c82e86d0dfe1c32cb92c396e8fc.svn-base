using AbstractFactory.DataAccess;
using AbstractFactory.Core;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.Lib
{
    public class concreteAbstractFactoryReal : AbstractFactories
    {
        public AbstractFile createFile()
        {
            return new RealFile();
        }
        public AbstractUser createUser()
        {
            return new RealUser();
        }
        public AbstractRepo createRepo()
        {
            return new RealRepository();
        }
    }
}
