using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Core.Models;

namespace AbstractFactory.Core
{
    public class RepoFake : AbstractRepo
    {
        RepositoryModel rm = new RepositoryModel("0001","C:/");
        RepositoryModel rm1 = new RepositoryModel("0002", "");
        public List<RepositoryModel> GetAll()
        {
            return
                new List<RepositoryModel>
                {
                    rm,rm1

                };
        }
        public void setAll(RepositoryModel mRepo)
        {
            rm = mRepo;
        }


    }
}
