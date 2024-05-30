package com.javaInnerClasses;

public class TestClass2 {

	public static void main(String[] args) {
		// Cannot instantiate the type Department
		// anonymous inner class **
		Department department = new Department(101, "QA") {

			@Override
			public void getDepartmentDetails() {
				System.out.println(getDepartmentId());
				System.out.println(getDepartmentName());

			}

		};
		department.getDepartmentDetails();

		// by lambda expression
	}

}
