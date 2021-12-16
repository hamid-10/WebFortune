package com.abdelhamidlafkiri.WebFortune.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Epigram {

    private String text;
    private static ArrayList<Epigram> epigramList;

    public Epigram(String epigram) {
        this.text = epigram;
    }

    public String getText() {
        return text;
    }

//  Iterate through the epigrams in the quotes.txt file and add them to an ArrayList
//  This method will be called one time from the main method
    public static void populateEpigramList() {
        Scanner read = null;
        try {
            read = new Scanner(new File("./src/main/resources/quotes.txt"));
            read.useDelimiter("%");
            epigramList = new ArrayList<Epigram>();
            while (read.hasNext()) {
                Epigram currentEpigram = new Epigram(read.next());
                epigramList.add(currentEpigram);
            }

//            System.out.println("Scanner working");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

//    Shuffle the list of epigrams first, then take the first element
    public static String getRandomText() {
        Collections.shuffle(epigramList);
        return epigramList.get(0).getText();
    }

}