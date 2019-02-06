package com.runner;


import com.student.Student;
import com.student.StudentMogilyanka;
import com.student.StudentNki;
import com.student.StudentPedin;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
/*
        // Create instance of NKI student
        StudentNki studentNki = new StudentNki();

        // Imagine that GUI opens
        studentNki.openGui();

        // Parse data
        List<String> data = studentNki.parseData();

        // Write data to 'DB'
        studentNki.writeToDb(data);

        // Clear list for reusing
        data.clear();

        // Create instance of Mogilyanka student
        StudentMogilyanka studentMogilyanka = new StudentMogilyanka();

        // Imagine that GUI opens one more time
        studentMogilyanka.openGui();

        // Parse data again
        data = studentMogilyanka.parseData();

        // Write data to another 'DB'
        studentMogilyanka.writeToDb(data);
*/
        //Path to file with student data
        String pathToFile = "src\\com\\files\\studentInfo.txt";
        //Create instance of the Pedin student
        StudentPedin studentPedin = new StudentPedin();
        //Get data from file with student data
        ArrayList<String> list = studentPedin.getDataFromFile(pathToFile);
        //Write student info to to the MS SQL data base
        studentPedin.writeToDb(list);


        // It's possible to create instance of class in that way
        // using inheritance
        Student student1 = new StudentMogilyanka();
        Student student2 = new StudentNki();

    }

    // Overloading as is
    private void setId(int id) {

    }

    private void setId(String id) {

    }

    private void setId(String idString, int id) {

    }

    private void setId() {

    }

}
