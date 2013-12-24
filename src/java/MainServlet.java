/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

/**
 *
 * @author TATARAO
 */
public class MainServlet extends HttpServlet {

    Model mod1=null;
    @Override
    public void init()
        {
            System.out.println("Init Method");
            ClassPathResource res=new ClassPathResource("modelconfig.xml");
//            FileSystemResource res=new FileSystemResource("modelconfig.xml");
            XmlBeanFactory factory=new XmlBeanFactory(res);
            mod1=(Model)factory.getBean("mdb");
        }
         
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
        String name=request.getParameter("job");
        ArrayList al=mod1.search(name);
        request.setAttribute("result",al);
        
        RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
        rd.forward(request,response);
        }
        catch(Exception e){}
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
        doGet(request,response);
        }
        catch(Exception e){}
    }
    @Override
    public void destroy()
        {
            System.out.println("destroy()");
            mod1=null;
        }  
}
