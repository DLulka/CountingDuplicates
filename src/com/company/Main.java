package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(Main.duplicateCount("Hello"));
    }
    public static int duplicateCount(String text) {
        char[] textArray;
        char[] arrayNoDups = new char[] {};
        int duplicates = 0, dups = 0, stop = 0;
        textArray = text.toLowerCase().toCharArray();
        for(int i = 0; i <= textArray.length; i++){
            while(dups <= arrayNoDups.length){
                if(arrayNoDups[dups] == textArray[i])
                    stop = 1;
                    dups = dups + 1;
                    for(int f = 1; f <= textArray.length; f++){
                        if(textArray[i] == textArray[f] && stop == 0) {
                            duplicates = duplicates + 1;
                            arrayNoDups[dups] = textArray[i];
                        }
                    }
                }
            }
        return duplicates
    }
}