import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		DonorBasicInfo donorBasicInfo=new DonorBasicInfo("yash", "bhatt", 'm',6, 4, 1994);
		DonorContectInfo donorContectInfo= new DonorContectInfo("ybhatt@gmail.com", "1234567890", 12345);
		DonorLoginInfo donorLoginInfo=new DonorLoginInfo("ybhattttt","Naruto@1494");
		
		DonorInfo donorInfo=new DonorInfo(donorLoginInfo, donorContectInfo, donorBasicInfo);	
		
		DonorBasicInfo donorBasicInfo1=new DonorBasicInfo("neha", "bhatt", 'f', 03, 9, 1986);
		DonorContectInfo donorContectInfo1= new DonorContectInfo("nbhatt@gmail.com", "1234567890", 12345);
		DonorLoginInfo donorLoginInfo1=new DonorLoginInfo("zjjjzz","1234512345A");	
		
		DonorInfo donorInfo1=new DonorInfo(donorLoginInfo1, donorContectInfo1, donorBasicInfo1);
		
		DonorBasicInfo tempDonorBasicInfo=donorInfo1.getBasicInfo();
		DonorService donorService=new DonorService();
		//donorService.register(donorInfo1);
		
		System.out.println(tempDonorBasicInfo.birthMont);
		
		Registration registration = new Registration(new HashTableBasedStorage());
		registration.register(donorInfo1);
		donorService.register(donorInfo);
		//donorService.validate("zzz", "1234512345A");
	}

}
