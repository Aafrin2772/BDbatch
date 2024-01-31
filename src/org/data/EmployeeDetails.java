package org.data;

public class EmployeeDetails {
	
	private void empName() {
       System.out.println("Emp name:afrin");
	}
	
    private void empAge() {
		System.out.println("Emp age :42");
	}
    
    private void empLoc() {
		System.out.println("Emp loc: trichy");

	}
    
    public static void main(String[] args) {
		
    	EmployeeDetails e = new EmployeeDetails();
    	
    	e.empName();
    	e.empAge();
    	e.empLoc();
	}
    
    
    
}
