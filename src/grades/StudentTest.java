package grades;

public class StudentTest {
    public static void main(String[] args){
        Student carlos = new Student("Los");
        System.out.println(carlos.getName());
        carlos.addGrade(88);
        carlos.addGrade(89);
        carlos.addGrade(98);
        System.out.println(carlos.getName());
        System.out.printf("%s's average grade is a %.2f%%%n", carlos.getName(), carlos.getAverageGrade());
    }
}