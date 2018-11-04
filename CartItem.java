/**
 * 
 */
package com.drools.model;

import java.io.Serializable;

/**
 * @author Dattathri
 * 
 */
public class CartItem implements Serializable {

	private static final long serialVersionUID = 2364053208522053965L;

	private Cart cart;
	private Product product;
	private int qty;
	private boolean errors;
	private String error;
	private String cartStatus;

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
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @param qty
	 *            the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/**
	 * @return the errors
	 */
	public boolean isErrors() {
		return errors;
	}

	/**
	 * @param errors
	 *            the errors to set
	 */
	public void setErrors(boolean errors) {
		this.errors = errors;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * @return the cartStatus
	 */
	public String getCartStatus() {
		return cartStatus;
	}

	/**
	 * @param cartStatus
	 *            the cartStatus to set
	 */
	public void setCartStatus(String cartStatus) {
		this.cartStatus = cartStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "CartItem [cart=" + cart + ", cartStatus=" + cartStatus
				+ ", error=" + error + ", errors=" + errors + ", product="
				+ product + ", qty=" + qty + "]";
	}

}
