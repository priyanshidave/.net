using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace db1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {

            try
            {
                String Conn = @"Data Source = (LocalDB)\MSSQLLocalDB; Initial Catalog = Piyu; Integrated Security = True";
                SqlConnection Con = new SqlConnection(Conn);
                SqlCommand cmd = new SqlCommand("select * from Emp");
                cmd.Connection = Con;
                Con.Open();
                SqlDataReader data = cmd.ExecuteReader();

                while (data.Read())
                {
                    string id = data.GetInt32(0).ToString();
                    string name = data.GetString(1);
                    decimal salary = data.GetDecimal(2);
                    MessageBox.Show(" id : " + id + " | " + " name : " + name + " | " + " salary : " + salary);
                    MessageBox.Show("1");
                }

            }
            catch(Exception ex) {

                MessageBox.Show(ex.Message.ToString());


            }




        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void bindingNavigator1_RefreshItems(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'piyuDataSet3.Emp' table. You can move, or remove it, as needed.
            this.empTableAdapter.Fill(this.piyuDataSet3.Emp);

        }
    }
}
