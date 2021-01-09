<%@page import="java.sql.*"%>
<%
    String leadName=request.getParameter("name");
    System.out.println(leadName);
    String leadGender=(String)request.getParameter("gender");
System.out.println(leadGender);
 String leadSelect=(String)request.getParameter("leadSelect");
 System.out.println(leadSelect);
 String leadParentsname=request.getParameter("leadParentsname");
 System.out.println(leadParentsname);
  String leadContact=request.getParameter("leadContact");
 System.out.println(leadContact);
 
  String leadStatusAndReference=request.getParameter("leadStatusAndReference");
 System.out.println(leadStatusAndReference);
 
  String leadComments=request.getParameter("leadComments");
 System.out.println(leadComments);
 
 String leadSelectReference=(String)request.getParameter("leadSelectReference");
 System.out.println(leadSelectReference);
 session.setAttribute("contact", leadContact);
 
 
 
 try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tb", "root", "root");
        PreparedStatement ps=c.prepareStatement("insert into x values(?)");
        ps.setString(1, leadName);
        int y=ps.executeUpdate();
        System.out.println(y);
        
    }catch(Exception e)
    {
    System.out.println(e);
    }

%>
<a href="ad.jsp" >link</a>