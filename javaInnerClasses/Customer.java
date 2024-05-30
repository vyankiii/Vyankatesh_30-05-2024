package com.javaInnerClasses;

//outer class
public class Customer {
	// fields
	private int customerId;
	private String customerName;
	private long customerContact;
	public Address address;

	// constructors
	public Customer() {

	}

	public Customer(int customerId, String customerName, long customerContact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;

	}

	// methods
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + "]";
	}

	// non-static inner class

	// inner class/nested class
	public class Address {
		// fields
		private String customerCity;

		// constructors
		public Address() {
			// TODO Auto-generated constructor stub
		}

		public Address(String customerCity) {
			this.customerCity = customerCity;
		}

		// methods
		@Override
		public String toString() {
			return "Address [customerCity=" + customerCity + "]";
		}

		public void getCustomerDetails() {
			System.out.println(customerId);
			System.out.println(customerName);
			System.out.println(customerContact);
			System.out.println(customerCity);
		}

	}

	// static inner class
	public static class Qualification {

		// fields
		public static String education;

		// initializer
		static {
			education = "B.Tech Computer Science and Engineering";
		}

		// methods
		public static void getQualificationDetails() {
			System.out.println(education);
		}

	}
}
