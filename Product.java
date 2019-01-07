import java.util.Date;

public class Product {

	private int code;
	private String name;
	private long purchaseCost;
	private Date dop;

	public Product(int code, String name, long purchaseCost, Date dop) {
		super();
		this.code = code;
		this.name = name;
		this.purchaseCost = purchaseCost;
		this.dop = dop;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPurchaseCost() {
		return purchaseCost;
	}

	public void setPurchaseCost(long purchaseCost) {
		this.purchaseCost = purchaseCost;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", purchaseCost=" + purchaseCost + ", dop=" + dop + "]";
	}
	
	

}
