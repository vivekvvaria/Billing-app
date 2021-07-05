package PRACTICE;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
public class database 
{
    Connection con;
    public Connection load()
    {
      try
      {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          con= DriverManager.getConnection("jdbc:odbc:Prathmesh_Enterprise");
          //JOptionPane.showMessageDialog(null,"connected.");
          return con;
      }
      catch(ClassNotFoundException | SQLException | HeadlessException e)
      {
          JOptionPane.showMessageDialog(null,e);
      }
      return  null;
    }
}
*/

public class database 
{
    Connection con;
    public Connection load()
    {
      try
      {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          con= DriverManager.getConnection("jdbc:sqlserver://VADOLIYAS-PC\\SQLEXPRESS;databaseName=variya","vivek","system");
          //JOptionPane.showMessageDialog(null,"connected.");
          return con;
      }
      catch(ClassNotFoundException | SQLException | HeadlessException e)
      {
          JOptionPane.showMessageDialog(null,e);
      }
      return  null;
    }
}
