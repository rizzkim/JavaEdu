package javaapp1026;

public class Boards {
	private int idxNum;
	private String brand;
	private String product;
	private double length;
	private double width;
	private int price;
	public int getIdxNum() {
		return idxNum;
	}
	public void setIdxNum(int idxNum) {
		this.idxNum = idxNum;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Boards [idxNum=" + idxNum + ", brand=" + brand + ", product=" + product + ", length=" + length
				+ ", width=" + width + ", price=" + price + "]";
	}
	
	
}
