import java.util.ArrayList;
public class Project {
    public
    String nameProject;
    long budget;
    Lecturer host;
    ArrayList<Student>studentList = new ArrayList<>();
    ArrayList<Lecturer>LecturerList = new ArrayList<>();
    Project(String nameProjectVal, long budgetVal){
        this.nameProject = nameProjectVal;
        this.budget= budgetVal;
    };
    void setHost(Lecturer host){
        this.host = host;
    }
    void showInfo(){
        System.out.print("\nName of Course: " + nameProject + "\n Budget of Project: " + budget + "\nThe host of Project: " + host.fullName);
    }
    void showMem(){
        if(!studentList.isEmpty() && !LecturerList.isEmpty()){
            System.out.print("\nList of Student: ");
            for(Student stu : studentList){
                stu.showInfor();
            }
            System.out.print("\nList of Lecture: ");
            for(Lecturer lec : LecturerList){
                lec.showInfo();
            }
        }
    }
}
