package dto;

public class Mobile {
	
	private int mobileId;
	private String mobileBrand;
	
	private double mobilePrice;
	private int mobileRam;
	
	 private String mobileColor;
	 private int mobileStorage;
	
	
	
	
	public Mobile(int mobileId, String mobileBrand, double mobilePrice, int mobileRam, String mobileColor,
			int mobileStorage) {
		super();
		this.mobileId = mobileId;
		this.mobileBrand = mobileBrand;
		this.mobilePrice = mobilePrice;
		this.mobileRam = mobileRam;
		this.mobileColor = mobileColor;
		this.mobileStorage = mobileStorage;
	}


	public Mobile() {
		
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public double getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public int getMobileRam() {
		return mobileRam;
	}
	public void setMobileRam(int mobileRam) {
		this.mobileRam = mobileRam;
	}
	public String getMobileColor() {
		return mobileColor;
	}
	public void setMobileColor(String mobileColor) {
		this.mobileColor = mobileColor;
	}
	public int getMobileStorage() {
		return mobileStorage;
	}
	public void setMobileStorage(int mobileStorage) {
		this.mobileStorage = mobileStorage;
	}
	 
	 

}
