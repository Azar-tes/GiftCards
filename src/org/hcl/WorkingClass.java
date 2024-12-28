package org.hcl;

public class WorkingClass implements FullyAbstraction {

	@Override
	public void savings() {
		System.out.println("5%");
		
	}

	@Override
	public void deposit() {
		System.out.println("8%");
		
	}

	@Override
	public void loan() {
		System.out.println("6%");
		
	}
	
	public static void main(String[] args) {
		
		WorkingClass wc = new WorkingClass();
		
		wc.deposit();
		wc.loan();
		wc.savings();
	}

}
