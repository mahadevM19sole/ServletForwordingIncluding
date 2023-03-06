import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegServlet extends HttpServlet
{
     Connection con;
     
     public void service(HttpServletRequest request,HttpServletResponse response)
     {
       try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
            String s1=request.getParameter("fname");
            String s2=request.getParameter("lname");     
            String s3=request.getParameter("uname");        
            String s4=request.getParameter("pwd");    
             PreparedStatement pstmt=con.prepareStatement("insert into uinfo values(?,?,?,?)"); 
             pstmt.setString(1,s1);
             pstmt.setString(2,s2);
             pstmt.setString(3,s3);
             pstmt.setString(4,s4);
             pstmt.executeUpdate();
                 
            PrintWriter  pw=response.getWriter();
            pw.println("<html><body bgcolor=lightyellow text=red><center>");
            pw.println("<h1>You  have  register  Successfully </h1>");
            pw.println("<a href=login.html>LOGIN</a>");
            pw.println("</center></body></html>");
          }
        catch(Exception e)
        {
          System.out.println(e);
        }

     }

}