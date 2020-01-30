package main;

public class spaService {
	private String serviceDesc;
	private double price; 
	public void setServiceDesc(String service) {
		serviceDesc = service;
	}
	public void setPrice(double pr) {
		price = pr;
	}
public String getServiceDesc() {
	return serviceDesc;
    }
public double getPrice() {
	return price;
    }

}