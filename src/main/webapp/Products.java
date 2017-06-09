import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class Products extends HttpServlet
{
static int cost;
    public static int f(int C2,int C3)
    {
        int i,j=0;
        if(C3==0)
        {  
            i = f1(C2);
            switch(i)
            {
                case 1: j = 1;break;
                case 2: j = 2; break;
                case 3: j = 3; break;
            }
        }
        
        else if(C3<=5)
        {
            i= f1(C2);
            switch(i)
            {
                case 1: j = 4; break;
                case 2: j = 5; break;
                case 3: j = 6; break;
            }
        }
        
        else
        {
            i = f1(C2);
            switch(i)
            {
                case 1: j = 7; break;
                case 2: j = 8; break;
                case 3: j = 9; break;
            }
        }  
        return j;
    }
    
    public static int f1(int C2)
    {
        int i;
        if(C2==0)
        {
            i = 1;
        }
        
        else if(C2<=5)
        {
            i = 2;
        }
        
        else
        {
            i = 3;
        } 
        return i;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        int k,x,y,z,w;
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String aa = request.getParameter("a");
        String bb = request.getParameter("b");
        String cc = request.getParameter("c");
        String dd = request.getParameter("d");
        String ee = request.getParameter("e");
        String ff = request.getParameter("f");
        String gg = request.getParameter("g");
        String hh = request.getParameter("h");
        String ii = request.getParameter("i");
        
        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        int c = Integer.parseInt(cc);
        int d = Integer.parseInt(dd);
        int e = Integer.parseInt(ee);
        int f = Integer.parseInt(ff);
        int g = Integer.parseInt(gg);
        int h = Integer.parseInt(hh);
        int i = Integer.parseInt(ii);
        
        int C1 = (3*a+2*b+8*c);
        int C2 = (12*d+25*e+15*f);
        int C3 = (500*g+h+2*i);  
        if(C1==0)
        {
            k=f(C2,C3); 
            switch(k)
            {
                case 1: Products.cost = 0;
                        break;
                case 2: Products.cost = (int)(2.5*10.0); 
                        break;
                case 3: x = C2/5; 
                        if(C2%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost=(int)(2.5*y);
                        break;
                case 4: Products.cost =(2*10);
                        break;
                case 5: Products.cost = (3*10);
                        w=C3+C2;
                        if (w<=5)
                        {
                          Products.cost += (2*10); 
                        }
                        else
                        {
                          x=w/5;
                          if(w%5==0) y=10+8*(x-1); 
                          else y=10+8*x; 
                          Products.cost+= (int)(2*y);
                        }
                        break;
                case 6: Products.cost = 3*10; 
                        w=C3+C2; 
                        x=w/5; 
                        if(w%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost+= (int)(2.5*y);
                        break;
                case 7: x = C3/5; 
                        if(C3%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost=(2*y); 
                        break;
                case 8: Products.cost = 3*10; 
                        w=C3+C2; 
                        x=w/5; 
                        if(w%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost+= (int)(2*y);
                        break;
                case 9: x = C2/5; 
                        if(C2%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost=(int)(2.5*y);
                        Products.cost +=(10*2);
                        x = C3/5; 
                        if(C3%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost+=(2*y);
                        break;
                default:out.println("Something went wrong");
                        break;
            } 
        }
        
        else if(C1<=5)
        {
            k=f(C2,C3);
            switch(k)
            {
                case 1: Products.cost =(3*10); 
                        break;
                case 2: Products.cost = (4*10);
                        w=C1+C2;
                        if (w<=5)
                        {
                          Products.cost += (int)(2.5*10); 
                        }
                        else
                        {
                          x=w/5;
                          if(w%5==0) y=10+8*(x-1); 
                          else y=10+8*x; 
                          Products.cost += (int)(2.5*y);
                        }
                        break;
                case 3: Products.cost = 4*10; 
                        w=C3+C2; 
                        x=w/5; 
                        if(w%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost+= (int)(2.5*y);  
                        break;
                case 4: Products.cost = ((3+2+2)*10);
                        break;
                case 5: Products.cost = (4*10);
                        w=C1+C2;
                        if (w<=5)
                        {
                          Products.cost += (3*10);
                          w=C1+C2+C3;
                          if(w<=5)
                          {
                              Products.cost += (2*10);
                          }
                          else
                          {
                              x=w/5;
                              if(w%5==0) y=10+8*(x-1); 
                              else y=10+8*x; 
                              Products.cost += (2*y);
                          }
                        }
                        else
                        {
                          x=w/5;
                          if(w%5==0) y=10+8*(x-1); 
                          else y=10+8*x; 
                          Products.cost += (int)(2.5*y);
                          Products.cost += ((2+2)*10);
                        }
                        break;
                case 6: Products.cost = (4*10);
                        w=C1+C2;
                        x=w/5;
                        if(w%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (int)(2.5*y);
                        Products.cost += ((2+2)*10);
                        break;
                case 7: Products.cost = ((3+2)*10);
                        x = C3/5; 
                        if(C3%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (2*y); 
                        break;
                case 8: Products.cost = (4*10);
                        w=C1+C2;
                        if (w<=5)
                        {
                          Products.cost += (3*10);
                          w=C1+C2+C3;
                          x=w/5;
                          if(w%5==0) y=10+8*(x-1); 
                          else y=10+8*x; 
                          Products.cost += (2*y);
                        }
                        else
                        {
                          x=w/5;
                          if(w%5==0) y=10+8*(x-1); 
                          else y=10+8*x; 
                          Products.cost += (int)(2.5*y);
                          Products.cost += (2*10);
                          x = C3/5; 
                          if(C3%5==0) y=10+8*(x-1); 
                          else y=10+8*x; 
                          Products.cost += (2*y);
                        }
                        break;
                case 9: Products.cost = (4*10);
                        w=C1+C2;
                        x=w/5;
                        if(w%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (int)(2.5*y);
                        Products.cost += (2*10);
                        x = C3/5; 
                        if(C3%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (2*y);
                        break;
                default:out.println("Something went wrong");
                        break;          
            } 
        }
        
        else
        {
            k=f(C2,C3);
            switch(k)
            {
                case 1: x = C1/5;
                        if(C1%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost = (3*y);
                        break;
                case 2: Products.cost = (4*10);
                        w=C1+C2;
                        x = w/5;
                        if(w%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost = (3*y);
                        break;
                case 3: x = C1/5;
                        if(C1%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost = (3*y);
                        Products.cost += (2.5*10);
                        x = C2/5;
                        if(C2%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (int)(2.5*y);
                        break;
                case 4: Products.cost = ((2+3)*10);
                        x = C1/5;
                        if(C1%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (3*y);
                        break;
                case 5: Products.cost = (3*10);
                        w=C3+C2;
                        if (w<=5)
                        {
                          Products.cost += (4*10);
                          w=C1+C2+C3;
                          x=w/5;
                          if(w%5==0) y=10+8*(x-1); 
                          else y=10+8*x; 
                          Products.cost += (3*y);
                        }
                        else
                        {
                          x=w/5;
                          if(w%5==0) y=10+8*(x-1); 
                          else y=10+8*x; 
                          Products.cost += (int)(2.5*y);
                          Products.cost += (3*10);
                          x = C1/5; 
                          if(C1%5==0) y=10+8*(x-1); 
                          else y=10+8*x; 
                          Products.cost += (3*y);
                        }
                        break;
                case 6: Products.cost = (3*10);
                        w=C3+C2;
                        x=w/5;
                        if(w%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (int)(2.5*y);
                        Products.cost += (3*10);
                        x = C1/5; 
                        if(C1%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (3*y);
                        break;
                case 7: x = C1/5;
                        if(C1%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost = (3*y);
                        Products.cost += (2*10);
                        x = C3/5;
                        if(C3%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (int)(2*y);
                        break;
                case 8: Products.cost = (4*10);
                        w=C1+C2;
                        x = w/5;
                        if(w%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost = (3*y);
                        Products.cost += (2*10);
                        x = C3/5;
                        if(C3%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (int)(2*y);
                        break;
                case 9: x = C1/5;
                        if(C1%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost = (3*y);
                        Products.cost += (2.5*10);
                        x = C2/5;
                        if(C2%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (int)(2.5*y);
                        Products.cost += (2*10);
                        x = C3/5;
                        if(C3%5==0) y=10+8*(x-1); 
                        else y=10+8*x; 
                        Products.cost += (2*y);
                        break;
                default:out.println("Something went wrong");
                        break;                      
            } 
        }
        out.println("Minimum cost is:"+Products.cost);
    }
}
