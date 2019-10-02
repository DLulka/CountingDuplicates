package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(Main.duplicateCount("Hello"));
    }
    public static int duplicateCount(String text) {
        char[] textArray;
        char[] arrayNoDups = new char[] {};
        int duplicates = 0, dups = 0;
        textArray = text.toLowerCase().toCharArray();
        for(int i = 0; i <= textArray.length; i++){
            while(dups <= arrayNoDups.length){
                if(arrayNoDups[dups] == textArray[i]){
                }else{
                    for(int f = 1; f <= textArray.length; f++){
                        if(textArray[i] == textArray[f]) {
                            duplicates = duplicates + 1;
                            arrayNoDups[dups] = textArray[i];
                            dups = dups + 1;
                        }
                    }
                }
                }
            }

        }
    }
}
