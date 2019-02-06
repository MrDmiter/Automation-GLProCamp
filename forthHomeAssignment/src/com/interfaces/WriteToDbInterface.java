package com.interfaces;

import java.util.List;

public interface WriteToDbInterface {

    /**
     * Write to exact DB
     *
     * @param data
     */
    void writeToDb(List<String> data);

}
