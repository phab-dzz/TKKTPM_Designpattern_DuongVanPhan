package iuh.fit.edu.vn.bai1;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Faculty itFaculty = new Faculty("Cong nghe thong tin");

        // Tạo các lớp học
        ClassRoom classA = new ClassRoom("CNTT-01");
        ClassRoom classB = new ClassRoom("CNTT-02");

        // Thêm lớp vào khoa
        itFaculty.addClass(classA);
        itFaculty.addClass(classB);

        // Tạo các sinh viên
        Student student1 = new Student("SV001", "Nguyen Van A", "CNTT-01");
        Student student2 = new Student("SV002", "Tran Thi B", "CNTT-01");
        Student student3 = new Student("SV003", "Le Van C", "CNTT-02");
        Student student4 = new Student("SV004", "Pham Thi D", "CNTT-02");

        // Thêm sinh viên vào lớp
        classA.attach(student1);
        classA.attach(student2);
        classB.attach(student3);
        classB.attach(student4);

        // Lớp trưởng gửi thông báo
        System.out.println("\n--- Lop truong thong bao lop ---");
        classA.addMessage("Ngày mai lop hoc som 30 phut");

        // Khoa gửi thông báo cho tất cả các lớp
        System.out.println("\n--- Khoa gui thong bao den cac lop ---");
        itFaculty.broadcastToAllClasses("Tuan sau se co danh gia giua ky");

        // Xóa một sinh viên khỏi lớp
        System.out.println("\n--- Xoa sinh vien khoi lop ---");
        classA.detach(student2);

        // Gửi thông báo mới sau khi sinh viên rời đi
        System.out.println("\n--- Thong bao moi ---");
        classA.addMessage("Doi phong  sang B305");
    }

}
