import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class WelcomeServlet extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res)
   {
     try{
           String s=req.getParameter("uname");
            PrintWriter pw=res.getWriter();
             pw.println("<html><body bgcolor=orange text=blue><center><h1>");
             pw.println("Wellcome ="+s);
             pw.println("</h1></center></body></html>");
        }
        catch(Exception e)
        {
         System.out.println(e);
        }
   }

}