

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S2
 */
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			 con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:49672:xe","system","3309");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int cid=Integer.parseInt(request.getParameter("cid"));
		String cname=request.getParameter("cname");
		
		out.print("<br> Roll :"+cid);
		out.print("<br> Name :"+cname);
		
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql="insert into courseregd values ("+cid+",'"+cname+"')";
		int status = 0;
		try {
			status = st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (status>0) 
		{
			System.out.println("yes record inserted");
			out.println("<br>register successfully");
		}
		else
		{
			System.out.println("error in insertation");
			out.print("<br> error in registeration");
		}
		
	}

}
