package com.interfaces;

import java.util.ArrayList;

public interface ParseFileInterface {
    /**
     * Method which is used for parsing data from file
     * @param pathToFile
     * @return
     */
    ArrayList<String> getDataFromFile(String pathToFile);
}
