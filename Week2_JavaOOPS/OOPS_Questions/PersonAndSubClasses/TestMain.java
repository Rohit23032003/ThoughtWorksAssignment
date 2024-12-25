package PersonAndSubClasses;

public class TestMain {

    public static void main(String[] args) {

        Student student1 = new Student("John Doe", "New York", "Computer Science", 2023, 20000);
        System.out.println(student1);

        student1.setHomeAddress("California");
        student1.setTuitionFee(21000);
        student1.setCourseName("Data Science");
        student1.setAcademicYear(2024);
        System.out.println("Updated Student Details:");
        System.out.println(student1);

        System.out.println("Full Name: " + student1.getFullName());
        System.out.println("Home Address: " + student1.getHomeAddress());
        System.out.println("Tuition Fee: $" + student1.getTuitionFee());
        System.out.println("Course Name: " + student1.getCourseName());
        System.out.println("Academic Year: " + student1.getAcademicYear());


        Staff staff1 = new Staff("Jane Smith", "Chicago", "Tech University", 50000);
        System.out.println(staff1);

        staff1.setHomeAddress("Seattle");
        staff1.setSalary(55000);
        staff1.setInstitution("Global Tech Institute");
        System.out.println("Updated Staff Details:");
        System.out.println(staff1);

        System.out.println("Full Name: " + staff1.getFullName());
        System.out.println("Home Address: " + staff1.getHomeAddress());
        System.out.println("Salary: $" + staff1.getSalary());
        System.out.println("Institution: " + staff1.getInstitution());
    }
}
