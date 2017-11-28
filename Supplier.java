package part01;

import java.util.ArrayList;

public class Supplier {

	private int supCode;
	private String supName;
	private Address supAddress;
	private SupRegion supRegion;
	private ArrayList<Product> supProducts;
	
	public Supplier (int supCode, String supName, Address supAddress, SupRegion supRegion, ArrayList<Product> supProducts) {
		
		this.supCode = supCode;
		this.supName = supName;
		this.supAddress = supAddress;
		this.supRegion = supRegion;
		this.supProducts = supProducts;
				
	}

	public int getSupCodeNum() {
		return supCode;
	}

	public String getSupName() {
		return supName;
	}
	
	public Address getSupAddress() {
		return supAddress;
	}
	
	public SupRegion getSupRegion() {
		return supRegion;
	}
	
	public ArrayList<Product> getSupProducts() {
		return supProducts;
	}
	
	public void setSupAddress(Address supAddress) {
		this.supAddress = supAddress;
	}

	public void setSupRegion(SupRegion supRegion) {
		this.supRegion = supRegion;
	}
	
	public void setSupName(String supName) {
		this.supName = supName;
	}
	
	public void setSupProducts(ArrayList<Product> supProducts) {
		this.supProducts = supProducts;
	}

}
