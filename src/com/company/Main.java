package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println(Main.duplicateCount("aabbcde"));
    }
    public static int duplicateCount(String text) {
        int duplicates = 0;
        text = text.toLowerCase();
        String textArray[] = text.split("");
        for(int i = 0; i < textArray.length; i++){
            for(int f = i + 1; f < textArray.length; f++){
                if(i == -1) {
                    i = 0;
                    f = 1;
                }
                if(textArray[i].equals(textArray[f])) {
                    duplicates = duplicates + 1;
                    text = text.replace(textArray[i], "");
                    textArray = text.split("");
                    if (i != 0){
                        i = i - 1;
                    }else{
                        i = -1;
                    }
                }
            }
        }
        return duplicates;
    }
}