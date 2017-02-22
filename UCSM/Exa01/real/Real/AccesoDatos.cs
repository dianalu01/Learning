using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace Real
{
    class AccesoDatos
    {
        public AccesoDatos()
        {
 
        }

        public SqlConnection Conectar()
        {

            string datosConexion = "Data Source=localhost;Initial Catalog=SCM;Integrated Security=True";
            SqlConnection con = new SqlConnection();
            con.ConnectionString = datosConexion;
            return con;
            
        }
        public List<String[]> getDataRepo(){
            List<String[]> data = new List<String[]> ();
            SqlConnection con = Conectar();
            con.Open();
            String textoCmd = "select * from Repositorio;";

            SqlCommand cmd = new SqlCommand(textoCmd, con);
            SqlDataReader reader = cmd.ExecuteReader();
            try
            {

                
                while (reader.Read())
                {
                    String[] campos = new String[2];
                    campos[0]=String.Format("{0}",reader[0]);
                    campos[1] = String.Format("{0}", reader[1]);
                    data.Add(campos);
                }
            }
            catch (SqlException e)
            {
                Console.WriteLine(e.Message);
            }
            reader.Close();

            con.Close();
            return data;
        }

        public List<String[]> getDataUser()
        {
            List<String[]> data = new List<String[]>();
            SqlConnection con = Conectar();
            con.Open();
            String textoCmd = "select * from Usuario;";

            SqlCommand cmd = new SqlCommand(textoCmd, con);
            SqlDataReader reader = cmd.ExecuteReader();
            try
            {


                while (reader.Read())
                {
                    String[] campos = new String[3];
                    campos[0] = String.Format("{0}", reader[0]);
                    campos[1] = String.Format("{0}", reader[1]);
                    campos[2] = String.Format("{0}", reader[2]);
                    data.Add(campos);
                }
            }
            catch (SqlException e)
            {
                Console.WriteLine(e.Message);
            }
            reader.Close();

            con.Close();
            return data;
        }

        public List<String[]> getDataArchivo()
        {
            List<String[]> data = new List<String[]>();
            SqlConnection con = Conectar();
            con.Open();
            String textoCmd = "select * from Archivo;";

            SqlCommand cmd = new SqlCommand(textoCmd, con);
            SqlDataReader reader = cmd.ExecuteReader();
            try
            {


                while (reader.Read())
                {
                    String[] campos = new String[3];
                    campos[0] = String.Format("{0}", reader[0]);
                    campos[1] = String.Format("{0}", reader[1]);
                    campos[2] = String.Format("{0}", reader[2]);
                    data.Add(campos);
                }
            }
            catch (SqlException e)
            {
                Console.WriteLine(e.Message);
            }
            reader.Close();

            con.Close();
            return data;
        }

    }
}
