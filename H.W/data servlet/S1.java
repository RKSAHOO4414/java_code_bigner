

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
 * Servlet implementation class S1
 */
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S1() {
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
		
		int roll=Integer.parseInt(request.getParameter("roll"));
		String name=request.getParameter("name");
		
		out.print("<br> Roll :"+roll);
		out.print("<br> Name :"+name);
		
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql="insert into studentregd values ("+roll+",'"+name+"')";
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
