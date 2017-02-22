using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Composite.Core
{
    public class Composite : Component
    {
        List<Component> _collection;

        public Composite(string name){
            Name = name;
            _collection=new List<Component>();
        }
        public override string Operation(int level)
        {
            string result = Name;            
            foreach (Component item in _collection)
            {
                result+="\n"+ new string('-', level) + item.Operation(level+1);
            }
            return result;
        }

        public override void Add(Component component)
        {
            _collection.Add(component);
        }

        public override void Remove(Component component)
        {
            _collection.Remove(component);
        }
    }
}
