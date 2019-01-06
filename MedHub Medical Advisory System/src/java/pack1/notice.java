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
public class notice {
    //int flag=0;
    int sno;
   String tip;
    conn con;
    PreparedStatement ps;
        
   
    //String MedName,Constituents;
    
 
        
     
     
    public notice()
    {
        this.sno=0;
       
        this.tip=null;
   
    }
   public ResultSet viewreq() throws InstantiationException, IllegalAccessException
    {
        ResultSet rs=null;
        try
        {
        con=new conn();
        //System.out.println(a);
         ps=con.con.prepareStatement("SELECT * FROM healthtips)");
        // ps.setString(1, mname);
         //ps=con.con.prepareStatement("select * from exam");
        rs=ps.executeQuery();
        rs.beforeFirst();
         }
        catch(SQLException e1)
        { }
       return rs;
    }        
        
}

