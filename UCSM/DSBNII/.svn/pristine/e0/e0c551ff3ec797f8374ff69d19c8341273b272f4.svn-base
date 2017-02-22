using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Lib;
using AbstractFactory.Core;
using AbstractFactory.Core.Models;
using AbstractFactory.DataAccess;

namespace AbstractFactory.Consola
{
    class Program
    {
        static void Main(string[] args)
        {
            Singleton mysingleton=null;
            mysingleton=Singleton.Instance;
            AbstractFactories factory = mysingleton.getAbstractFactorie("Falso");
            Console.WriteLine("Objetos Fake");
            AbstractFile absFile = (AbstractFile)factory.createFile();
            List<FileModel> dataFile = absFile.GetAll();
            foreach (var value in dataFile)
            {
                Console.WriteLine(value.IdFile + "  " + value.NombreArchivoFile + "  " + value.NombrePathFile);
            }
            
            AbstractUser absUsu = (AbstractUser)factory.createUser();
            List<UsersModel> dataUser = absUsu.GetAll();
            
            foreach (var value in dataUser)
            {
                Console.WriteLine(value.IdUser + "  " + value.NombreUser + "  " + value.NickUser);
            }

            AbstractRepo absRepo = (AbstractRepo)factory.createRepo();
            List<RepositoryModel> dataRepo = absRepo.GetAll();
            foreach (var value in dataRepo)
            {
                Console.WriteLine(value.IdRepository + "  " + value.PathRepository);
            }


            factory = mysingleton.getAbstractFactorie("Real");

            Console.WriteLine("Objetos Real");

            absFile = factory.createFile();
             dataFile = absFile.GetAll();
             foreach (var value in dataFile)
            {
                Console.WriteLine(value.IdFile +"  "+ value.NombreArchivoFile +"  "+ value.NombrePathFile);
            }

             RealFile absFil = (RealFile)absFile;
             absFil.Attach(new ConcreteObserverFile("File1", absFil));
             FileModel mFile = dataFile.ElementAt(0);
             mFile.NombreArchivoFile = "file03.cs";
             absFile.setAll(mFile);
             dataFile = absFile.GetAll();
             foreach (var value in dataFile)
             {
                 Console.WriteLine(value.IdFile + "  " + value.NombreArchivoFile + "  " + value.NombrePathFile);
             }
            
             absUsu = (AbstractUser)factory.createUser();
            dataUser = absUsu.GetAll();
            foreach (var value in dataUser)
            {
                Console.WriteLine(value.IdUser + "  " + value.NombreUser + "  " + value.NickUser);
            }

            RealUser absUs = (RealUser)absUsu;
            absUs.Attach(new ConcreteObserverUser("User1", absUs));
            UsersModel mUser = dataUser.ElementAt(0);
            mUser.NombreUser = "Diana Rodriguez";
            mUser.NickUser = "Artemisa";
            absUsu.setAll(mUser);
            dataUser = absUsu.GetAll();
            foreach (var value in dataUser)
            {
                Console.WriteLine(value.IdUser + "  " + value.NombreUser + "  " + value.NickUser);
            }


            absRepo = (AbstractRepo)factory.createRepo();
             dataRepo = absRepo.GetAll();
             foreach (var value in dataRepo)
            {
                Console.WriteLine(value.IdRepository + "  " + value.PathRepository);
            }

             RealRepository absRep = (RealRepository)absRepo;
             absRep.Attach(new ConcreteObserverRepo("Repo1", absRep));
             RepositoryModel mRep = dataRepo.ElementAt(0);
             mRep.IdRepository = "rp150431";
             mRep.PathRepository = ".\\dsbn\\repo1";
             absRepo.setAll(mRep);
             dataRepo = absRepo.GetAll();
             foreach (var value in dataRepo)
             {
                Console.WriteLine(value.IdRepository + "  " + value.PathRepository);
             }


            Console.ReadLine();

        }
    }
}
