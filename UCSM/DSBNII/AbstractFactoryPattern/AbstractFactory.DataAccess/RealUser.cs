using AbstractFactory.Core.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Core;

namespace AbstractFactory.DataAccess
{
    public class RealUser : ConcreteSubjectUser, AbstractUser
    {

        public List<UsersModel> GetAll()
        {
            
            using (var ctx = new SCMEntities())
            {
                return (from iUser in ctx.Usuario
                        select new UsersModel()
                        {
                            IdUser = iUser.id_usuario,
                            NombreUser = iUser.Nombre_Usuario,
                            NickUser = iUser.Nick_Usuario
                        }).ToList();
            }
        }


        public void setAll(UsersModel newUser)
        {
            using (var ctx = new SCMEntities())
            {
                var file = (from i in ctx.Usuario
                            where i.id_usuario == newUser.IdUser
                            select i).First();
                file.Nick_Usuario = newUser.NickUser;
                file.Nombre_Usuario = newUser.NombreUser;
                ctx.SaveChanges();
            }
            
            this.Cambiar( newUser);

        }
    }
}
