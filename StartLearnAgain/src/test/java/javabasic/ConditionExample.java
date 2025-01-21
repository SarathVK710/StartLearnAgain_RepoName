package javabasic;

public class ConditionExample {

    public static void main(String[] args) {

        int Tamil = 50;
        int English = 35;
        int Maths = 60;
        int Sciance = 55;
        int Social = 80;

        int Passtotalmarks = 200;
     //   int Passmark = 35;

        int TotalMarks =  Tamil +  English + Maths + Sciance +  Social;

        if (Passtotalmarks < TotalMarks){
            System.out.println("Student mark is "+ TotalMarks +" So, Student is Pass");
        } else if (Passtotalmarks == TotalMarks) {
            System.out.println("Student is justpass");
        } else {
            System.out.println("Student is fales");
        }

    }
}
