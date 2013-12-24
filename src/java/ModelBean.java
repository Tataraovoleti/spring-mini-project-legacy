
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.sql.DataSource;
import p1.EmpBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TATARAO
 */
public class ModelBean implements Model {
    public DataSource ds;
    
    public void setDs(DataSource ds)
    {
        this.ds=ds;
    }
    public ArrayList search(String desg)
    {
        System.out.println("seach() of Model Bean");
        ArrayList al=new ArrayList();
        try
        {
            Connection con=ds.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from spring_emp where desg=?");
            System.out.println("---------------- "+desg);
            ps.setString(1,desg);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
               EmpBean eb=new EmpBean();
               eb.setId(rs.getInt(1));
               eb.setName(rs.getString(2));
               eb.setDesg(rs.getString(3));
               eb.setBsal(rs.getFloat(4));
               al.add(eb);
            }
        }
        catch(Exception e){}
        return al;
    }
}
