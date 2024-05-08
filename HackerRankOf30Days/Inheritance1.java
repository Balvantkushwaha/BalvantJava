package HackerRankOf30Days;

import java.io.*;
import java.util.*;

class Person { // parrent class and subclas and drived class
    protected String firstName;
    protected String LastName;
    protected int idNumber;

    // constructer
    Person(String firstName, String LastName, int identification) {
        this.firstName = firstName;
        this.LastName = LastName;
        this.idNumber = identification;

    }

    // print person data
    public void printPerson() {
        System.out.println("Name:" + LastName + "," + firstName + "\nID:" + idNumber);
    }
}

class Student extends Person {
    private int[] testScore;

    Student(String firstName, String LastName, int identification, int[] testScore) {
        super(firstName, LastName, identification);
        this.testScore = testScore;
    }

    public char calculate() {
        int sum = 0;

        for (int i = 0; i < testScore.length; i++) {
            sum = sum + testScore[i];
        }
        int avg = sum / testScore.length;

        if (avg >= 90) {
            return 'O';
        } else if (avg >= 80) {
            return 'E';
        } else if (avg >= 70) {
            return 'O';
        } else if (avg >= 55) {
            return 'A';
        } else if (avg >= 40) {
            return 'P';
        } else if (avg >= 40) {
            return 'D';
        } else {
            return 'T';

        }

    }
}

public class Inheritance1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstName = sc.next(); // input firstName , lastName id testScore ;
        sc.next();
        String LastName = sc.next();
        int id = sc.nextInt();
        int numScores = sc.nextInt();
        int[] testScore = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScore[i] = sc.nextInt();
        }
        Student st = new Student(firstName, LastName, id, testScore);
        st.printPerson();
        System.out.println("Grade:" + st.calculate());
    }

}
