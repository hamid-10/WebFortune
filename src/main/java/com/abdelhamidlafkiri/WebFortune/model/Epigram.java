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

    public static String getRandomText() {
        Collections.shuffle(epigramList);
        return epigramList.get(0).getText();
    }

}