/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author TATARAO
 */
public class EmpBean {
    
    int id;
    String name,desg;
    float bsal;
    
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setDesg(String desg)
    {
        this.desg=desg;
    }
    public String getDesg()
    {
        return desg;
    }
    
    public void setBsal(float bsal)
    {
        this.bsal=bsal;
    }
    public float getBsal()
    {
        return bsal;
    }
    
}
