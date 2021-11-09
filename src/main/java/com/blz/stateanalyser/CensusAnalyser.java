package com.blz.stateanalyser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Purpose: To implement Indian State Census Analyser

public class CensusAnalyser {
    public static void main(String[] args) throws IOException, StateSensorAnalyesr {
        System.out.println("Welcome To The Program");
        String filePathRead = ".src/main/resources/IndianStateCensusData.csv";
        String fileName = "IndianStateCensusData";
        String delimiter =",";
        List<String> stringName = new ArrayList<>();
        stringName.add("State");
        stringName.add("Population");
        stringName.add("AreaInSqKm");
        stringName.add("DensityPerSqKm");

        Operations readObj = new Operations();
        int count = readObj.readDataCount(filePathRead, fileName);
        System.out.println(count);

        readObj.readDelimiter(filePathRead, delimiter);
        readObj.readHeader(filePathRead, stringName);
    }
}


