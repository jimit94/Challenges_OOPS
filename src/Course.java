public class Course {
    static int maxCapacity;
    String courseName;
    int enrolledStudents;
    String[] students;

    Course(String courseName){
        this.courseName = courseName;
        this.enrolledStudents = 0;
        this.students =  new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
    void enrollStudent(String studentName){
students[enrolledStudents] = studentName;
enrolledStudents++;
    }


}
