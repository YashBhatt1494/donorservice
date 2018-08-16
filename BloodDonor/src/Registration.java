public class Registration {
	private final Storage storage;

	public boolean register(DonorInfo donorInfo) {
		String username = donorInfo.getLoginInfo().getUsername();
		if (storage.get(username) == null) {
			storage.add(donorInfo);
			return true;
		}
		throw new IllegalArgumentException("username is tacken");
	}
	
	public Registration(Storage storage) {
		this.storage = storage;
	}
}
