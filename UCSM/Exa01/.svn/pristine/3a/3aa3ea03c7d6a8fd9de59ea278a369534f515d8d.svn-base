using SCM;
using Real;
using Factory;

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            AbstractFactory facFake = new concreteAbstractFactoryFake();
            Console.WriteLine("Objetos Fake");
            AbstractFile absFileFake = (AbstractFile)facFake.createFile();
            IList<Tuple<string, string, string>> dataFake = absFileFake.GetAll();
            foreach (var value in dataFake)
            {
                Console.WriteLine(value.Item1 + "  " + value.Item2 + "  " + value.Item3);
            }

            AbstractUser absUsuFake = (AbstractUser)facFake.createUser();
            dataFake = absUsuFake.GetAll();
            foreach (var value in dataFake)
            {
                Console.WriteLine(value.Item1 + "  " + value.Item2 + "  " + value.Item3);
            }

            AbstractRepo absRepoFake = (AbstractRepo)facFake.createRepo();
            IList<Tuple<string, string>> dataFake1 = absRepoFake.GetAll();
            foreach (var value in dataFake1)
            {
                Console.WriteLine(value.Item1 + "  " + value.Item2);
            }


            AbstractFactory facReal = new concreteAbstractFactoryReal();

            Console.WriteLine("Objetos Real");

            AbstractFile absFile = (AbstractFile)facReal.createFile();
            IList<Tuple<string, string, string>> data = absFile.GetAll();
            foreach (var value in data)
            {
                Console.WriteLine(value.Item1 +"  "+ value.Item2 +"  "+ value.Item3);
            }

            AbstractUser absUsu = (AbstractUser)facReal.createUser();
            data = absUsu.GetAll();
            foreach (var value in data)
            {
                Console.WriteLine(value.Item1 + "  " + value.Item2 + "  " + value.Item3);
            }

            AbstractRepo absRepo = (AbstractRepo)facReal.createRepo();
            IList<Tuple<string, string>> data1 = absRepo.GetAll();
            foreach (var value in data1)
            {
                Console.WriteLine(value.Item1 + "  " + value.Item2);
            }


            Console.ReadLine();

        }
    }
}
