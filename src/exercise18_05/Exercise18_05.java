package exercise18_05;

public class Exercise18_05 {

    /** Return the current step and step down */
    public static double m(int i) {
        if(i == 1) {
            return 1.0/3.0;
        } else { 
            double sum = i/(2.0 * i + 1);
            return sum + m(i-1);
    }
}
    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(m(i));
        }
    }
    
}
