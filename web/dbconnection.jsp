<%-- 
    Document   : dbconnection
    Created on : 8 Jan, 2021, 11:24:05 PM
    Author     : Arvinth
--%>

<%@page import="java.sql.*"%>
<%
    
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tb", "root", "root");
        //PreparedStatement ps=c.prepareStatement("insert into x values(?)");
        //ps.setString(1, name);
        //int y=ps.executeUpdate();
        //System.out.println(y);
        
   
%>