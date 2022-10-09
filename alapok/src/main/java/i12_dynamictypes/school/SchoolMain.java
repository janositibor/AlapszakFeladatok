package i12_dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school1=new School("Iskola", 18);
        School school2=new PrimarySchool("Elementary", 8);
        School school3=new SecondarySchool("Highschool", 4);
        System.out.println(school1);
        System.out.println(school2);
        System.out.println(school3);
    }
}
