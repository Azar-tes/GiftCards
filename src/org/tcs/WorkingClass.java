package org.tcs;

public class WorkingClass extends PartialAbstraction {
	
	@Override
	public void paalGoa() {
		System.out.println("Rs.70");
	}
	
	@Override
	public void jeleby() {
		System.out.println("Rs.60");
	}
	
	@Override
	public void rasaMalai() {
		System.out.println("Rs.50");
	}
	
	
	public static void main(String[] args) {
		
		WorkingClass wc = new WorkingClass();
		
		wc.jeleby();
		wc.paalGoa();
		wc.rasaMalai();
	
		

		
		
		
	}

	
	

}
