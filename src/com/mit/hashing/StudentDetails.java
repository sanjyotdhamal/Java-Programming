//WAP to store to store the student details in hashset and display the student details 

package com.mit.hashing;

import java.util.HashSet;

public class StudentDetails {

    public static void main(String[] args) {

        HashSet<EmpData> hashSet = new HashSet<EmpData>();

        hashSet.add(new EmpData(10, "Sanjyot"));
        hashSet.add(new EmpData(20, "Pratik"));
        hashSet.add(new EmpData(30, "Prajyot"));

        for (EmpData e : hashSet) {
            System.out.println(e);
        }
    }
}

class EmpData {

    int studentID;
    String name;

    public EmpData(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentID = " + studentID + ", Name = " + name;
    }
}