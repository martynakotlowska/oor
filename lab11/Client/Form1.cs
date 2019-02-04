using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using System.Net.Sockets;
using System.IO;

namespace Client
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        string n;
        byte[] b1;
        OpenFileDialog op;

        private void button1_Click(object sender, EventArgs e)
        {
            op = new OpenFileDialog();
            if (op.ShowDialog() == DialogResult.OK)
            {
                string t = textBox1.Text;
                t = op.FileName;
                FileInfo fi = new FileInfo(textBox1.Text = op.FileName);
                n = fi.Name + "." + fi.Length;
                TcpClient client = new TcpClient("127.0.0.1", 5050);
                StreamWriter sw = new StreamWriter(client.GetStream());
                sw.WriteLine(n);
                sw.Flush();
                label1.Text = "File Transferred....";
            }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            TcpClient client = new TcpClient("127.0.0.1", 5055);
            Stream s = client.GetStream();
            b1 = File.ReadAllBytes(op.FileName);
            s.Write(b1, 0, b1.Length);
            client.Close();
            label1.Text = "File Transferred....";
        }
    }
}