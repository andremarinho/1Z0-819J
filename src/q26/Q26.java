package q26;

public class Q26 {

	 public static void main(String[] args) {
         Student student = new Student("James", 25);
         int marks = 25;
         review(student, marks);
         System.out.println(marks + "-" + student.marks);
     }
 
     private static void review(Student stud, int marks) {
         marks = marks + 10;
         stud.marks+=marks;
     }
}
