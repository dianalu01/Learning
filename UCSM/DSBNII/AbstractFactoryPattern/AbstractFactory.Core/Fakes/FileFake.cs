using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbstractFactory.Core.Models;

namespace AbstractFactory.Core
{
    public class FileFake : AbstractFile
    {
        FileModel fm = new FileModel("f01", "file01.cs", "dsbn_src");
        FileModel fm1 = new FileModel("f02", "file02.cs", "dsbn_src");
        public List<FileModel> GetAll()
        {
            return
                new List<FileModel>
                {
                    fm,fm1

                };
        }
        public void setAll(FileModel mFile)
        {
            fm = mFile;
        }

    }
}
