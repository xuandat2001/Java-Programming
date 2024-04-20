package Problem1;

public class student {
    private String stuId;
    private String stuName;
    private String stuMajor;

    public student(String stuId, String stuName, String stuMajor) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuMajor = stuMajor;
    }

    public student() {}

    public String getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuMajor() {
        return stuMajor;
    }
}
