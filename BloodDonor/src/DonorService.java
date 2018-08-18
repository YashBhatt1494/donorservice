import java.sql.*;

public class DonorService {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	private static final String DB_URL = "jdbc:mysql://localhost:3306/donor?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "";

	public DonorInfo findDonor(String bloodGroup) {
		return null;
	}
	
	public void findPlaceToDonamte(DonorInfo donor) {
		
	}
	public DonorInfo findPersonInNeed(DonorInfo donor) {
		
		return donor;
	}
	
	
	public boolean validate(String userName, String password) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement stmt = null;
		 Class.forName("com.mysql.jdbc.Driver");
		
		 //3
		 System.out.println("Connecting to a selected database...");
	     conn = DriverManager.getConnection(DB_URL, USER, PASS);
	     System.out.println("Connected database successfully...");
		
	     
	     System.out.println("Creating statement...");
	     stmt = conn.createStatement();

	     String getPassSql = "SELECT password FROM  donor.donor_login_info where user_name = 'zzz'";
	     ResultSet rs = stmt.executeQuery(getPassSql);
	     
	     String dbPass=null;
	     
	     while(rs.next())
	     {
	    
	    	 dbPass=rs .getString("password");
	     }
	  
	     
	     
	     //System.out.println("this is pass of asked userr name "+dbPass+" you enterd "+password);
		
		if(dbPass.equals(dbPass)) {
			 System.out.println("you have enterd correct pass  "+dbPass+"for user"+userName);
			return true;
		}
		
		
		return false;
	}
	
	public void register(DonorInfo donor) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {		
		
		// STEP 2: Register JDBC driver
		Class.forName(JDBC_DRIVER).newInstance();

        // STEP 3: Open a connection
        System.out.print("\nConnecting to database...");
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
       
        conn.setAutoCommit(false);
        
        String loginInfoSql = "insert into donor.donor_login_info values ('"  + donor.getLoginInfo().getUsername() + "','" +
        		donor.getLoginInfo().getPassword()+"')";
        String contactInfoSql = "insert into donor.donor_contact_info values ('"  + donor.getLoginInfo().getUsername() + "','" +
        		donor.getContactInfo().getEmail()+ "'," + Integer.parseInt(donor.getContactInfo().getPhone()) + "," + donor.getContactInfo().getZipCode() +")";
        String basicInfoSql = "insert into donor.donor_basic_info values ('"  + donor.getLoginInfo().getUsername() + "','" +donor.getBasicInfo().firtsName+"','"+donor.getBasicInfo().lastName+"',"+
        		donor.getBasicInfo().getBirthDate()+ "," + donor.getBasicInfo().birthMont + "," + donor.getBasicInfo().birthYear +",'"+
        		donor.getBasicInfo().gender+ "')";
        
        System.out.println(loginInfoSql);
        System.out.println(basicInfoSql);
        System.out.println(contactInfoSql);
        
        
        conn.createStatement().execute(loginInfoSql);
        conn.createStatement().execute(basicInfoSql);
        conn.createStatement().execute(contactInfoSql);
        conn.commit();
        conn.rollback();
//        PreparedStatement statement = conn.prepareStatement("insert into donor.donor_contact_info values(?,?,?,?)");
//        statement.setString(1, donor.getLoginInfo().getUsername());
//        statement.setString(2, donor.getContactInfo().getEmail());
//        statement.setInt(3, Integer.parseInt(donor.getContactInfo().getPhone()));
//        statement.setInt(4, donor.getContactInfo().getZipCode());
//        
//        statement.execute();
//        statement.close();
        conn.close();
        System.out.println(" SUCCESS!\n");
		
	}
	
	
	
	
}
