<%-- 
    Document   : result
    Created on : Jul 6, 2012, 3:41:54 PM
    Author     : TATARAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList,p1.EmpBean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
       <% ArrayList al=(ArrayList)request.getAttribute("result");
            if(al!=null)
            { %>
            <tr>
                <td>Id</td><td>Name</td><td>Desg</td><td>Salary</td>
            </tr>
            <% for(int i=0;i<al.size();++i)
             {
               EmpBean eb=(EmpBean)al.get(i);
              %>
             <tr>
               <td><%=eb.getId() %></td><td><%=eb.getName() %></td>
               <td><%=eb.getDesg() %></td><td><%=eb.getBsal() %></td>
              </tr>
             <% }
             }
       %>
        </table>
    </body>
</html>
