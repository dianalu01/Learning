using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;
using AbstractFactory.Core.Models;

namespace AbstractFactory.DataAccess.Test
{
    [TestFixture]
    public class RepositoryTest
    {
        [Test]
        public void ShouldGetAll()
        {
            //Arrange
            RealRepository repository = new RealRepository();
            List<RepositoryModel> result;
            List<RepositoryModel> expected = new List<RepositoryModel>()
            {
                new  RepositoryModel("R1", "C:\\repo"),
                new  RepositoryModel("R2", "C:\\rep2"),
            };

            //Act
            result = repository.GetAll();


            //Assert            
            Assert.That(result[0].IdRepository, Is.EqualTo(expected[0].IdRepository));
            Assert.That(result[0].PathRepository, Is.EqualTo(expected[0].PathRepository));
            Assert.That(result[1].IdRepository, Is.EqualTo(expected[1].IdRepository));
            Assert.That(result[1].PathRepository, Is.EqualTo(expected[1].PathRepository));
        }

    }
}
