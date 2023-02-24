package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApp {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student carlos = new Student("Carlos");
        carlos.addGrade(99);
        carlos.addGrade(90);
        carlos.addGrade(92);
        carlos.addGrade(97);
        carlos.addGrade(89);

        Student james = new Student("James");
        james.addGrade(93);
        james.addGrade(85);
        james.addGrade(90);
        james.addGrade(93);
        james.addGrade(92);

        Student brian = new Student("Brian");
        brian.addGrade(93);
        brian.addGrade(85);
        brian.addGrade(90);
        brian.addGrade(93);
        brian.addGrade(92);

        students.put("LosD", carlos);
        students.put("JD", james);
        students.put("B-real", brian);

        String seeStudents = "y";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Welcome To The Grading Portal.%nBelow Is A List Of GitHub Usernames For Available Students: %n");
            System.out.printf("%s%n", students.keySet());
            System.out.printf("Enter The Username Of The Student You Want More Information On: %n");
            String username = scanner.nextLine();

            if (students.get(username) == null) {
                System.out.printf("%s Does Not Match Any Of Our Records", username);
            } else {
                System.out.printf("%s Git Username: %s", students.get(username), username);
            }

            System.out.printf("%nContinue To New Student? y/n %n");
            seeStudents = scanner.nextLine();
        }
        while(seeStudents.equalsIgnoreCase("y"));

        if (seeStudents.equalsIgnoreCase("n")){
            System.out.printf("Thank You For Using The Grading Portal");
        }
    }
}