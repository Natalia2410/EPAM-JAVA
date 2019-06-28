package ProgrammingWithClasses.Block1.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Student> listStudent = new ArrayList<>();
        Student student1 = new Student("Tom", 1);
        student1.initialize();
        Student student2 = new Student("Jack", 2);
        student2.initialize();
        Student student3 = new Student("Danny", 3);
        student3.initialize();
        Student student4 = new Student("Lisa", 4);
        student4.initialize();
        Student student5 = new Student("Garry", 5);
        student5.initialize();
        Student student6 = new Student("Nick", 6);
        student6.initialize();
        Student student7 = new Student("Pamella", 7);
        student7.initialize();
        Student student8 = new Student("Melissa", 8);
        student8.initialize();
        Student student9 = new Student("George", 9);
        student9.initialize();
        Student student10 = new Student("Piter", 10);
        student10.setLearningAchievement(new int[]{9, 9, 10, 9, 10});
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        listStudent.add(student6);
        listStudent.add(student7);
        listStudent.add(student8);
        listStudent.add(student9);
        listStudent.add(student10);
        int m = listStudent.size();
        System.out.println("All student: ");
        for (int i = 0; i < m; i++) {
            listStudent.get(i).print();
            System.out.println("\n");
        }
        System.out.println("Student with only 9 and 10: ");
        for (int i = 0; i < m; i++) {
            listStudent.get(i).printStudentWith9And10();
        }
    }
}
