package iuh.fit.edu.vn.bai1;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom implements Subject{
    private String className;
    private List<Observer> observers = new ArrayList<>();
    private List<String> messages = new ArrayList<>();

    public ClassRoom(String className) {
        this.className = className;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("Da them sinh vien vao lop " + className);

    }

    @Override
    public void detach(Observer observer) {
        if (observers.remove(observer)) {
            System.out.println("Da xoa sinh vien khoi lop " + className);
        }

    }

    @Override
    public void notifyObservers() {
        if (!messages.isEmpty()) {
            String latestMessage = messages.get(messages.size() - 1);
            for (Observer observer : observers) {
                observer.update(latestMessage);
            }
        }

    }
    public void addMessage(String message) {
        messages.add(message);
        System.out.println("Lop truong lop " + className + " da them thong bao den loo: " + message);
        notifyObservers();
    }

    public String getClassName() {
        return className;
    }
}
