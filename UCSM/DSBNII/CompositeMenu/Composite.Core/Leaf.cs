using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Composite.Core
{
    public class Leaf : Component
    {
        public Leaf(string name)
        {
            Name = name;
        }
        public override string Operation(int level)
        {
            return Name;
        }

        public override void Add(Component component)
        {
            throw new NotImplementedException();
        }

        public override void Remove(Component component)
        {
            throw new NotImplementedException();
        }
    }
}
