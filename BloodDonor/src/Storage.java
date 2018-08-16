
public interface Storage {
	
	void add(DonorInfo donorInfo);
	void delete(String userName);
	void update(DonorInfo donorInfo);
	DonorInfo get(String userName);
}
