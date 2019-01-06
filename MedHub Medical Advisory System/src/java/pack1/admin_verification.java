/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class admin_verification 
{
    int flag=0;
   
    conn con;
    PreparedStatement ps;
        
   
    String name,addr,email;
    int phn,dd;
    
 
     //public admin_verification()
    //{
      //  name=R_name;
        //addr=Address;
        //mail=Email;
       // phn=Phone_no;
       // dd=DD_no;  
   
    //}
    public admin_verification()
    {
         name=null;
        addr=null;
        email=null;
        phn=0;
        dd=0;
   }
   
     
    
     public ResultSet viewreq() throws InstantiationException, IllegalAccessException
    {
        ResultSet rs=null;
        try
        {
        con=new conn();
        
        //System.out.println(a);
         ps=con.con.prepareStatement("SELECT * FROM r_app_form");
        // ps.setString(1, mname);
         //ps=con.con.prepareStatement("select * from exam");
        rs=ps.executeQuery();
        rs.beforeFirst();
         }
        catch(SQLException e)
        { }
       return rs;
    }        
        
}
