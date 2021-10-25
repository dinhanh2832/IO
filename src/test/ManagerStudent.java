package test;

import java.util.ArrayList;

public class ManagerStudent implements Manager<Student> {
    private final ArrayList<Student> listStudent = new ArrayList<>();

    public ManagerStudent() {
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }


    @Override
    public void add(Student student) {
        listStudent.add(student);
    }

    @Override
    public void update(int index, Student student) {
        listStudent.set(index,student);
    }
    public void print() {
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }
}
