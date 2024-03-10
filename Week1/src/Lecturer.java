import java.util.Scanner;
public class Lecturer {
    private final
    String employeeId;
    String fullName;
    int rank;
    boolean status = true ;
    public
    Lecturer(String employeeIdVal, String fullNameVal, int rankVal){
        this.employeeId = employeeIdVal;
        this.fullName = fullNameVal;
        this.rank = rankVal;
    }
    void showInfo(){
        System.out.print("\nFull name of Lecture: " + fullName + "\n Rank: " + rank);
    }
    void leadProject(Project project) {

                project.setHost(this);
                this.status = false;
                System.out.print("You're the host of this course\n");



    }
    void joinProject(Project project){

            project.LecturerList.add(this);
            System.out.print("Join successfully\n");

    }
}
