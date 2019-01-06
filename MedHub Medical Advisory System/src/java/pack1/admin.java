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
public class admin {
    int flag=0;
   
    conn con;
    PreparedStatement ps;
        
   
    String MedName,Constituents;
    
 
        
     
     
    public admin(String MedName,String Constituents)
    {
        this.MedName=MedName;
       
        this.Constituents=Constituents;
   
    }
    public admin()
    {
         this.MedName=null;
       
        this.Constituents=null;
   }
   
     
    
     public ResultSet viewreq(String mname) throws InstantiationException, IllegalAccessException
    {
        ResultSet rs=null;
        try
        {
        con=new conn();
        //System.out.println(a);
         ps=con.con.prepareStatement("SELECT * FROM login.medstable m where m.Constituents IN(Select m1.Constituents from login.medstable m1 where m1.MedName like ? )");
         ps.setString(1, mname);
         //ps=con.con.prepareStatement("select * from exam");
        rs=ps.executeQuery();
        rs.beforeFirst();
         }
        catch(SQLException e1)
        { }
       return rs;
    }        
        
}

