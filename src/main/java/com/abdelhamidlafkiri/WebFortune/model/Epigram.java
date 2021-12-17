package com.abdelhamidlafkiri.WebFortune.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Epigram {

    private static ArrayList<Epigram> epigramList;
    private String text;

    public Epigram(String epigram) {
        this.text = epigram;
    }

//  Iterate through the epigrams in the quotes.txt file and add them to an ArrayList
//  This method will be called one time from the main method
    public static void populateEpigramList() {
        Scanner read = null;
        try {
//          quotes.txt contains about 2915 quotes (epigrams) seperared by % symbol
            read = new Scanner(new File("./src/main/resources/quotes.txt"));
            read.useDelimiter("%");
            epigramList = new ArrayList<Epigram>();
            while (read.hasNext()) {
                Epigram currentEpigram = new Epigram(read.next());
                epigramList.add(currentEpigram);
            }

//            System.out.println(epigramList.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

//  Shuffle the list of epigrams first, then take the first element
//  The random pick of quotes feature can be achieved by a different way by
//  generating a random int and passing it as index to the epigramList
    public static String getRandomText() {
        Collections.shuffle(epigramList);
        return epigramList.get(0).getText();
    }

//  get the text from the epigram object
    public String getText() {
        return text;
    }

}