package businesslogicservice.repertoryblservice;

public interface RepertoryblService {
	public void stockin(String id);
	public void stockout(String id);
	public void check(String time1,String time2);
	public void inventory(String timeNow);
}
