//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("01","XuanDat", "Software Engineering");
        Student stu2 = new Student("01","Kiet", "Software Engineering");
        Student stu3 = new Student("02","Quang Huy", "Software Engineering");
        Student stu4 = new Student("02","HaiLam", "Software Engineering");
        Project pro1 = new Project("Java", 100000000);
        Project pro2 = new Project("Python", 100000000);
        Project pro3 = new Project("C++", 100000000);
        Lecturer lec1 = new Lecturer("01", "Smiling", 5);
        Lecturer lec2 = new Lecturer("02", "Nguyen Huu Hoang Tung", 5);
        Lecturer lec3 = new Lecturer("03", "Oggy", 5);
        stu1.joinProject(pro1);
        stu2.joinProject(pro1);
        stu3.joinProject(pro2);
        stu1.joinProject(pro3);
        stu2.joinProject(pro3);
        stu4.joinProject(pro3);
        lec1.leadProject(pro1);
        lec1.joinProject(pro2);
        lec2.leadProject(pro2);
        lec2.joinProject(pro1);
        lec2.joinProject(pro3);
        lec3.leadProject(pro3);
        pro1.showInfo();
        pro1.showMem();
        pro2.showInfo();
        pro2.showMem();
        pro3.showInfo();
        pro3.showMem();
    }
}