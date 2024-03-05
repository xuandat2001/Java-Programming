import java.util.Scanner;

public class Student {
    protected
    String studentId, nameStu , majorStu;
    public
    Student(String stuId, String nameStu, String majorStu){
        this.studentId = stuId;
        this.nameStu = nameStu;
        this.majorStu = majorStu;
    }
    void setName(String nameStu){
        this.nameStu = nameStu;
    }
    void showInfor(){
        System.out.println("Name of Student: " + nameStu+  "\nMajor of Student: " + majorStu);
    }
    void joinProject(Project project){
            project.studentList.add(this);
            System.out.print("Join successfully\n");
    }
}






