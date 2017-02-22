using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Core.Models;

namespace AbstractFactory.Core
{
   public class UserFake : AbstractUser
    {
       UsersModel um = new UsersModel("U01", "Guillermo Villena", "Gvillena");
       public List<UsersModel> GetAll()
        {
            return
                new List<UsersModel>
                {
                    um

                };
        }
       public void setAll(UsersModel mUser)
       {
           um = mUser;
       }
    }
}