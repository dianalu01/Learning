using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory.Core.Models
{
    public class UsersModel
    {
        public string IdUser { get; set; }
        public string NombreUser { get; set; }
        public string NickUser { get; set; }

        public UsersModel(string idUser, string nombreUser, string nickUser)
        {
            IdUser = idUser;
            NombreUser = nombreUser;
            NickUser = nickUser;
        }

        public UsersModel() : this(String.Empty, String.Empty, String.Empty) { }

    }
}
