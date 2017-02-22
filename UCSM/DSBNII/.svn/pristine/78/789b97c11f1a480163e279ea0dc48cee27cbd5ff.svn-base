using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Core;
using AbstractFactory.Core.Models;

namespace AbstractFactory.DataAccess
{
    public class RealRepository : ConcreteSubjectRepo, AbstractRepo
    {
     
        public List<RepositoryModel> GetAll()
        {
            using (var ctx = new SCMEntities())
            {
                return (from iRepository in ctx.Repositorio
                        select new RepositoryModel()
                        {
                            IdRepository = iRepository.id_repositorio,
                            PathRepository = iRepository.Path_repo
                        }).ToList();
            }
        }
        public void setAll(RepositoryModel newRepo)
        {
            using (var ctx = new SCMEntities())
            {
                var file = (from i in ctx.Repositorio
                            where i.id_repositorio == newRepo.IdRepository
                            select i).First();
                file.Path_repo = newRepo.PathRepository;
                ctx.SaveChanges();
            }
            this.Cambiar(newRepo);

        }
    }
}
