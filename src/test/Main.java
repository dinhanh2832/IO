package test;

public class Main {
    public static void main(String[] args) {
        final Student student = new Student();
        Student student1 = new Student();
        ManagerStudent listStudent = new ManagerStudent();
        listStudent.add(student);
        listStudent.add(student1);
        listStudent.print();
        Student student2 = new Student("khánh",17);
        listStudent.update(0,student2);
        listStudent.print();

    }
}
