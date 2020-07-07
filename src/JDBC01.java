/**
 * 
 */

/**
 * @author t.yoshizawa
 *
 */

import java.sql.*;

public class JDBC01 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		final String driverName = "oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@192.168.54.226:1521/orcl";
		final String id = "scott";
		final String pass = "tiger";

		Class.forName(driverName);
		Connection connection=DriverManager.getConnection(url,id,pass);
		PreparedStatement st = 
				connection.prepareStatement(
					"SELECT EMPNO , ENAME , JOB , SAL FROM EMP"
					);
		ResultSet rs = st.executeQuery();
		
		while(rs.next() != false) {
			System.out.print( rs.getString("EMPNO"));
			System.out.print( "|");
			System.out.print( rs.getString("ENAME"));
			System.out.print( "|");
			System.out.print( rs.getString("JOB"));
			System.out.print( "|");
			System.out.print(rs.getString("SAL"));
			System.out.println( );
			
			
			
		}
		
	}

}

