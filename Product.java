/**
 * 
 */
package com.drools.model;

import java.io.Serializable;

/**
 * @author Dattathri
 * 
 */
public class Product implements Serializable{

	private static final long serialVersionUID = 13209931955557914L;
	
	private int price;
	private String desc;
	private int availableQty;
	private boolean isOutOfStock;
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the availableQty
	 */
	public int getAvailableQty() {
		return availableQty;
	}
	/**
	 * @param availableQty the availableQty to set
	 */
	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}
	/**
	 * @return the isOutOfStock
	 */
	public boolean isOutOfStock() {
		return isOutOfStock;
	}
	/**
	 * @param isOutOfStock the isOutOfStock to set
	 */
	public void setOutOfStock(boolean isOutOfStock) {
		this.isOutOfStock = isOutOfStock;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Product [availableQty=" + availableQty + ", desc=" + desc
				+ ", isOutOfStock=" + isOutOfStock + ", price=" + price + "]";
	}
	
}
