package com.javaInnerClasses;

public class TestClass {

	public static void main(String[] args) {

		Customer customer = new Customer(6789, "Radha", 8989909011L);
		System.out.println(customer.toString());

		System.out.println("------------------------------------------------------------------");

		Customer.Address address = customer.new Address("Pune");
		address.getCustomerDetails();

		System.out.println("------------------------------------------------------------------");

		Customer.Qualification.getQualificationDetails();

	}

}
