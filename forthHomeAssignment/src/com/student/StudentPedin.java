package com.student;

import com.interfaces.ParseFileInterface;
import com.interfaces.WriteToDbInterface;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentPedin extends Student implements ParseFileInterface, WriteToDbInterface {
    /**
     * Instances for writing in file
     */
    FileWriter fileWriter = null;
    PrintWriter printWriter = null;

    /**
     * Method which read data from file
     *
     * @param pathToFile
     * @return Collection of the strings, each represents info about student, one line is put into one cell in collection
     */
    @Override
    public ArrayList<String> getDataFromFile(String pathToFile) {
        String line;
        ArrayList<String> studentData = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
            while ((line = reader.readLine()) != null) {
                studentData.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentData;
    }

    /**
     * Write to the MS SQL DB
     *
     * @param data
     */
    @Override
    public void writeToDb(List<String> data) {
        try {
            openConnectionToDB();
            if (dataChecker((ArrayList<String>) data)) {
                for (String datum : data) {
                    printWriter.println(getDate() + " - " + datum);
                }
                printWriter.print("=====================\n");
                System.out.println("All data is written to MSSQL DB");
                closeConnectionToDB();
            }
            else{
                System.err.println("Attempt to write non-valid data to the DB");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Open connection to MS SQL data base
     *
     * @throws IOException
     */
    public void openConnectionToDB() throws IOException {
        String path = "src\\com\\files\\MS_SQL-DB.txt";
        fileWriter = new FileWriter(path);
        printWriter = new PrintWriter(fileWriter);
    }

    /**
     * Close connection to MS SQL data base
     *
     * @throws IOException
     */
    public void closeConnectionToDB() throws IOException {
        fileWriter.close();
        printWriter.close();
    }
}
