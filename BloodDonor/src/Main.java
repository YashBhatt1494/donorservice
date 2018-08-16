
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DonorBasicInfo donorBasicInfo=new DonorBasicInfo("yash", "bhatt", 'm',6, 4, 1994);
		DonorContectInfo donorContectInfo= new DonorContectInfo("ybhatt@gmail.com", "1234567890", 12345);
		DonorLoginInfo donorLoginInfo=new DonorLoginInfo("ybhatt");
		
		DonorInfo donorInfo=new DonorInfo(donorLoginInfo, donorContectInfo, donorBasicInfo);	
		
		DonorBasicInfo donorBasicInfo1=new DonorBasicInfo("neha", "bhatt", 'f', 03, 9, 1986);
		DonorContectInfo donorContectInfo1= new DonorContectInfo("nbhatt@gmail.com", "1234567890", 12345);
		DonorLoginInfo donorLoginInfo1=new DonorLoginInfo("ybhatt");	
		donorLoginInfo1.setPassword("Neha123890");
		DonorInfo donorInfo1=new DonorInfo(donorLoginInfo1, donorContectInfo1, donorBasicInfo1);
		
		DonorBasicInfo tempDonorBasicInfo=donorInfo1.getBasicInfo();
		
		System.out.println(tempDonorBasicInfo.birthMont);
		
		Registration registration = new Registration(new HashTableBasedStorage());
		registration.register(donorInfo);
		registration.register(donorInfo1);
	}

}
