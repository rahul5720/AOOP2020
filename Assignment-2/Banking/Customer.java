class Customer {
	static long lastid = 19001100;
	long cid;
	String name;
	double currLoan;
	String phNo;
	static protected Scanner psc = Scanner(System.in);
	 
	Customer() {
		cid = (++lastid);
	}
	
	void setValues() {
		System.out.print("ENTER NAME: ");
		name = psc.nextLine();
		System.out.print("ENTER PHONE NUMBER: ");
		phNo = psc.nextLine();
	}
	
	void showValues() {
		
	}
	// abstract boolean isExceeded();
}
