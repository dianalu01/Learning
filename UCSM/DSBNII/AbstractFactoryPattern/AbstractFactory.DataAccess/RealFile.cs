using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Core.Models;
using AbstractFactory.Core;

namespace AbstractFactory.DataAccess
{
    public class RealFile : ConcreteSubjectFile, AbstractFile 
    {     
        public List<FileModel> GetAll()
        {
            using (var ctx = new SCMEntities())
            {
                return (from iFile in ctx.Archivo
                        select new FileModel()
                        {
                            IdFile = iFile.id_archivo,
                            NombreArchivoFile = iFile.Nombre_Archivo,
                            NombrePathFile = iFile.nombre_Path
                        }).ToList();
            }
        }

        public void setAll(FileModel newFile)
        {
            using (var ctx = new SCMEntities())
            {
                var file = (from iFile in ctx.Archivo
                            where iFile.id_archivo == newFile.IdFile
                            select iFile).First();
                file.Nombre_Archivo = newFile.NombreArchivoFile;
                file.nombre_Path = newFile.NombrePathFile;
                ctx.SaveChanges();
            }
            this.Cambiar(newFile);

        }

    }
}
