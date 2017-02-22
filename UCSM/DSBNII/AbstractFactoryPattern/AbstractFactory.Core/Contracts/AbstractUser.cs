using AbstractFactory.Core.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.Core
{
   public  interface AbstractUser
    {
       List<UsersModel> GetAll() ;
       void setAll(UsersModel newFile);
    }
}
