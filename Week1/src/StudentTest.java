public class StudentTest {
    public static void main (String[] args){
        String name = "Kiet";
        Student stu2 = new Student("01","XuanDat", "Software Engineering");
        Student stu3 = new Student("02","Quang Huy", "Software Engineering");
        stu2.showInfor();
        stu3.showInfor();
        stu2.setName(name);
        stu2.showInfor();
    }
}
