package iuh.fit.edu.vn.bai1;

public class Student implements Observer{
    private String studentId;
    private String name;
    private String className;

    public Student(String studentId, String name, String className) {
        this.studentId = studentId;
        this.name = name;
        this.className = className;
    }
    @Override
    public void update(String message) {
        System.out.println("Sinh vien " + name + " (MSSV: " + studentId + ") lop " +
                className + " nhan thong bao: " + message);
    }
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getClassName() {
        return className;
    }
}
