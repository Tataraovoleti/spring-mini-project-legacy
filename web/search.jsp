<%-- 
    Document   : index
    Created on : Jul 6, 2012, 2:42:21 PM
    Author     : TATARAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="pink">
        <form action="controller" target="resultframe">
            <b>Select Job</b>
            <select name="job">
                <option value="clerk">Clerks</option>
                <option value="analylist">Analyst</option>
                <option value="salesman">Sales man</option>
                <option value="manager">Manager</option>
            </select>
            <input type="submit" value="Search" />
        </form>
    </body>
</html>
