/**
 * 
 */
package com.drools.model;

import java.io.Serializable;

/**
 * @author Dattathri
 * 
 */
public class Cart implements Serializable {

	private static final long serialVersionUID = -3441153409418880844L;

	private Customer customer;
	private String cartItems;
	private double discount;

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the cartItems
	 */
	public String getCartItems() {
		return cartItems;
	}

	/**
	 * @param cartItems
	 *            the cartItems to set
	 */
	public void setCartItems(String cartItems) {
		this.cartItems = cartItems;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * @param discount
	 *            the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
