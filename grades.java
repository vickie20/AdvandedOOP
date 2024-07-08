public class grades {

    public static void main(String[] args) {
        double averageMarks = 60; 

        
        double passMark = 75;

        if (averageMarks >= passMark) {
            System.out.println("Pass");
            
            if (averageMarks >= 93) {
                System.out.println("Grade: A");
            } else if (averageMarks >= 85) {
                System.out.println("Grade: B");
            } else if (averageMarks >= 80) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        } else {
            System.out.println("Grade :E");
            System.out.println("Fail");
        }
    }
}