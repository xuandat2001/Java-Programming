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
    }

    void setHost(Lecturer newHost){
        this.host = newHost;
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
            System.out.print("List of Lecture: ");
            for(Lecturer lec : LecturerList){
                lec.showInfo();
                System.out.print("\n");
            }
        }
        else{
            System.out.print("\nNothing here");
        }
    }
}
