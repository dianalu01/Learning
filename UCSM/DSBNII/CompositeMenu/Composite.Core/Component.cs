using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Composite.Core
{
    public abstract class Component
    {
        protected string Name;
        public abstract string Operation(int level);
        public abstract void Add(Component component);
        public abstract void Remove(Component component);
    }
}
