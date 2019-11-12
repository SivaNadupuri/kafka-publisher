package com.ikea.spring.kafka.api;



public class User {
	private int id;
	/**
	 * @param id
	 * @param name
	 * @param address
	 */
	public User(int id, String name, String[] address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String[] getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String[] address) {
		this.address = address;
	}
	private String[] address;

}
