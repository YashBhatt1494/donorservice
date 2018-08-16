import java.util.Hashtable;

public class HashTableBasedStorage implements Storage {

	private final Hashtable<String, DonorInfo> donorData = new Hashtable<String, DonorInfo>();

	@Override
	public void add(DonorInfo donorInfo) {
		donorData.put(donorInfo.getLoginInfo().getUsername(), donorInfo);
	}

	@Override
	public void delete(String userName) {
		if(donorData.containsKey(userName)) {
			donorData.remove(userName);
		} else {
			throw new IllegalArgumentException(userName + " as donor does not exist");
		}
	}

	@Override
	public void update(DonorInfo donorInfo) {
		delete(donorInfo.getLoginInfo().getUsername());
		add(donorInfo);
	}

	@Override
	public DonorInfo get(String userName) {
		return donorData.get(userName);
	}

}
