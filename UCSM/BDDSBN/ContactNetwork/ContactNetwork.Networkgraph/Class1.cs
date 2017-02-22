
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace ContactNetwork.Networkgraph
{
    public class Graph
    {
        private String Name;

        protected void addContact(){

        }
        protected  bool exist(Graph G)        
        {

            return true;
        }




    };


    public class Nodes
    {
        private String id;
        private String contactName;
        //private Relation *contacts;

        

    };

    public class Relation
    {
        private Nodes user;
        private Nodes contact;
        Relation(Nodes u, Nodes c)
        {
            this.setUser(u);
            this.setContact(c);
        }
        public void setUser(Nodes u)
        {
            this.user=u;
        }
        public void setContact(Nodes c)
        {
            this.contact = c;
        }

    };


    
}
