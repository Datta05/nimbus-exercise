/**
 * 
 */
package com.drools.model;

import java.io.Serializable;

/**
 * @author Dattathri
 * 
 */
public class Customer implements Serializable {

	private static final long serialVersionUID = -6272979592077129599L;
	
	private String id;
	private Cart cart;
	private String coupon;
	private boolean isNew;
	private String registeredProducts;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the cart
	 */
	public Cart getCart() {
		return cart;
	}

	/**
	 * @param cart
	 *            the cart to set
	 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	/**
	 * @return the coupon
	 */
	public String getCoupon() {
		return coupon;
	}

	/**
	 * @param coupon
	 *            the coupon to set
	 */
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	/**
	 * @return the isNew
	 */
	public boolean isNew() {
		return isNew;
	}

	/**
	 * @param isNew
	 *            the isNew to set
	 */
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	/**
	 * @return the registeredProducts
	 */
	public String getRegisteredProducts() {
		return registeredProducts;
	}

	/**
	 * @param registeredProducts
	 *            the registeredProducts to set
	 */
	public void setRegisteredProducts(String registeredProducts) {
		this.registeredProducts = registeredProducts;
	}

}
