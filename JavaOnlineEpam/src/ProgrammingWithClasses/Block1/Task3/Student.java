package ProgrammingWithClasses.Block1.Task3;

import java.util.Random;

public class Student {
    private String name;
    private int numberOfGroup;
    private int[] learningAchievement;


    public void setLearningAchievement(int[] learningAchievement) {
        this.learningAchievement = learningAchievement;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public String getName() {
        return name;
    }

    public int[] getLearningAchievement() {
        return learningAchievement;
    }


    public Student(String name, int number) {
        this.name = name;
        this.numberOfGroup = number;
    }

    public void initialize() {
        int n = 5;
        int range = 10;
        learningAchievement = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            learningAchievement[i] = random.nextInt(range);
        }
    }

    public void printStudentWith9And10() {
        if (isGoodStudent()) {
            System.out.println("Student " + name + " from group № " + numberOfGroup + " has only 9 and 10");
        }
    }

    public void print() {
        System.out.println(name + " " + numberOfGroup + ":");
        for (int i = 0; i < learningAchievement.length; i++) {
            System.out.print(learningAchievement[i] + " ");
        }

    }

    public boolean isGoodStudent() {
        int n = learningAchievement.length;
        boolean isGoodStudent = true;
        for (int i = 0; i < n; i++) {
            if (learningAchievement[i] != 9 && learningAchievement[i] != 10) {
                isGoodStudent = false;
                break;
            }
        }
        return isGoodStudent;
    }
}