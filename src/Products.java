/**
 * 
 */

/**
 * @author t.yoshizawa
 *
 */

import java.sql.*;


public class Products {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {
		final String driverName = "oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@192.168.54.226:1521/orcl";
		final String id = "WIEN";
		final String pass = "WIEN";

		Class.forName(driverName);
		Connection connection=DriverManager.getConnection(url,id,pass);
		PreparedStatement st = 
				connection.prepareStatement(
					"SELECT PRODUCT_ID ,PRODUCT_NAME , PRICE , START_DATE FROM PRODUCTS"
					);
		ResultSet rs = st.executeQuery();
		
		
		while(rs.next() != false) {
			String product_id = rs.getString("PRODUCT_ID");
			System.out.print(product_id);
			System.out.print( "|");
			System.out.print( rs.getString("PRODUCT_NAME"));
			System.out.print( "|");
			System.out.print( rs.getString("PRICE"));
			System.out.print( "|");
			System.out.print(rs.getString("START_DATE"));
			System.out.println( );
			
			
			
		}
		
	}

}

