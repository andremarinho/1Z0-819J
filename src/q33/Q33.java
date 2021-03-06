package q33;

public class Q33 {

	//How many objects of Pen class are eligible for Garbage Collection at Line 11?
	
	public static void main(String[] args) {
        new Pen(); //Line 1
        Pen p = new Pen(); // Line 2
        change(p); //Line 3
        System.out.println("About to end."); //Line 11
    }

    public static void change(Pen pen) { //Line 5
        pen = new Pen(); //Line 6
    }
}
