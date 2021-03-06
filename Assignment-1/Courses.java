import java.util.Scanner;

class Courses {
	public static void main(String[] args) {
		Course c = new Course();
		c.showCourse();
	}
}

class Course {
	Instructor ins;
	TextBook tb;
	
	Course() {
		ins = new Instructor();
		ins.setValues();
		tb = new TextBook();
		tb.setValues();
	}
	
	void showCourse() {
		System.out.println("\n\n--------------------INSTRUCTOR--------------------------------");
		ins.showValues();
		System.out.println("------------------------TEXTBOOK------------------------------");
		tb.showValues();
		System.out.println("--------------------------------------------------------------\n\n");
	}
}

class Instructor {
	String name;
	long phNo;
	
	/*Instructor(String name, long phNo) {
		this.name = new String(name);
		this.phNo = phNo;
	}*/
	
	void setValues() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER INSTRUCTOR NAME: ");
		this.name = sc.nextLine();
		System.out.print("ENTER PHONE NUMBER: ");
		this.phNo = sc.nextLong();
	}
	
	void showValues() {
		System.out.println("--------------------------------------------------------------");
    	System.out.println("NAME: " + name);
    	System.out.println("PHONE NUMBER: " + phNo);
    	System.out.println("--------------------------------------------------------------");
	}
}

class TextBook {
	
	String title, aname, pub;

	/*TextBook(String title, String aname, String pub) {
		this.title = new String(title);
		this.aname = new String(aname);
		this.pub = new String(pub);
	}*/
	
	void setValues() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER TITLE: ");
		this.title = sc.nextLine();
		System.out.print("ENTER AUTHOR NAME: ");
		this.aname = sc.nextLine();
		System.out.print("ENTER PUBLISHER: ");
		this.pub = sc.nextLine();
	}
	
	void showValues() {
		System.out.println("--------------------------------------------------------------");
    	System.out.println("TITLE: " + title);
    	System.out.println("AUTHOR NAME: " + aname);
    	System.out.println("PUBLISHER: " + pub);
    	System.out.println("--------------------------------------------------------------");
	}
}
