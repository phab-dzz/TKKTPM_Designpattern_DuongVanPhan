package iuh.fit.edu.vn.bai1;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<ClassRoom> classRooms = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public void addClass(ClassRoom classRoom) {
        classRooms.add(classRoom);
        System.out.println("Da them lop " + classRoom.getClassName() + " vao khoa " + name);
    }

    public ClassRoom getClassByName(String className) {
        for (ClassRoom classRoom : classRooms) {
            if (classRoom.getClassName().equals(className)) {
                return classRoom;
            }
        }
        return null;
    }

    public void broadcastToAllClasses(String message) {
        System.out.println("Khoa " + name + " gui thong bao den tat ca cac lop : " + message);
        for (ClassRoom classRoom : classRooms) {
            classRoom.addMessage("[Thong bao tu Khoa] " + message);
        }
    }
}
