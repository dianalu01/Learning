﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SCM
{
    abstract class AbstractFile
    {
        List<Tuple<string, string>> GetAll();
    }
}
