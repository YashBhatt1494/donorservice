class DonorContectInfo{
	String email;
	String phone;
	int zipCode;
	
	private boolean checkEmail(String email) {
		int indexOfAt=email.indexOf('@');
		int indexOfFullpoint=email.indexOf('.', indexOfAt);
		
		if(indexOfAt>0 && indexOfFullpoint > 2 && indexOfFullpoint>indexOfAt )
			return true;
		throw new IllegalArgumentException("invalid email ");
	}
	
	private boolean checkPhone(String phone) {
		if(phone.length()==10)
			return true;
		throw new IllegalArgumentException("invalid Phone Num ");
	}
	
	private boolean checkZip(int zip) {
		if(zip<99999)
			return true;
		throw new IllegalArgumentException("invalid Zip code ");
	}
	
	
	public DonorContectInfo(String email, String phone, int zipCode) {
		this.email = email;
		this.phone = phone;
		this.zipCode = zipCode;
		
		checkEmail(email);
		checkPhone(phone);
		checkZip(zipCode);
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public int getZipCode() {
		return zipCode;
	}
}

class DonorBasicInfo{
	String firtsName,lastName;
	char gender;
	int birthDate,birthMont;
	int birthYear;
	
	private boolean checkFirstName(String firtsName) {
		if(firtsName.length()>0)
			return true;
		throw new IllegalArgumentException("enter First name ");
	}
	private boolean checkLastName(String lastName) {
		if(lastName.length()>0)
			return true;
		throw new IllegalArgumentException("enter last name ");
	}
	private boolean checkGender(char gender) {
		if(gender=='m'||gender=='f')
			return true;
		else if(gender=='M'||gender=='F')
			return true;
		throw new IllegalArgumentException("enter gender ");	
	}
	
	private boolean checkBirthDate(int birthDate) {
		if(birthDate<32 && birthDate>0)
			return true;
		throw new IllegalArgumentException("invalid Birth date ");
	}
	
	private boolean checkBirthMonth(int birthDate) {
		if(birthDate<13 && birthDate>0)
			return true;
		throw new IllegalArgumentException("invalid birth Month ");
	}
	
	private boolean checkBirthYear(int birthDate) {
		
			if(birthDate<2019 && birthDate>1800)
				return true;
			throw new IllegalArgumentException("invelid birth year ");
			
	}
	
	
	public String getFirtsName() {
		return firtsName;
	}

	public String getSecondNmae() {
		return lastName;
	}

	public char getGender() {
		return gender;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public int getBirthMont() {
		return birthMont;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public DonorBasicInfo(String firtsName, String lastName, char gender, int birthDate, int birthMont,
			int birthYear) {
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.birthMont = birthMont;
		this.birthYear = birthYear;
		
		checkFirstName(firtsName);
		checkLastName(lastName);
		checkGender(gender);
		checkBirthDate(birthDate);
		checkBirthMonth(birthDate);
		checkBirthYear(birthYear);
	}
}

class DonorLoginInfo{
	String username;
	String password;
	
	private boolean chechUsername(String username) {
		if(username.length()>0)
			return true;
		throw new IllegalArgumentException("invalid username ");
		
	}
	
	private boolean checkPassword(String password) {
		if(password.length()>9 && password.matches(".*\\d+.*") )
			return true;
		throw new IllegalArgumentException("Password Must be 10 char long and muxt contain a digit  ");
		
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		
		if(password.length()>9 && password.matches(".*\\d+.*") )
			this.password = password;
		else
			throw new IllegalArgumentException("Password Must be 10 char long and muxt contain a digit  ");
		
	}

	public String getPassword() {
			return password;
	}

	public DonorLoginInfo(String username ) {
		this.username = username;
		//this.password = password;
		chechUsername(username);
	//	checkPassword(password);
		
	}
}
public class DonorInfo {

	private final DonorLoginInfo loginInfo;
	private final DonorContectInfo contactInfo;
	private final DonorBasicInfo basicInfo;
	
	public DonorInfo(DonorLoginInfo loginInfo, DonorContectInfo contactInfo, DonorBasicInfo basicInfo) {
		this.loginInfo = loginInfo;
		this.contactInfo = contactInfo;
		this.basicInfo = basicInfo;
	}

	public DonorLoginInfo getLoginInfo() {
		return loginInfo;
	}
	
	public DonorContectInfo getContactInfo() {
		return contactInfo;
	}

	public DonorBasicInfo getBasicInfo() {
		return basicInfo;
	}
	
}
