package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // String texteingabe = "La ger, - rE ! gal.";
        String texteingabe = "Tu erfreut!";
        boolean ergebnis = checkPalindrom(texteingabe);
        if (ergebnis) {
            System.out.println(texteingabe + " ist ein Palindrom.");
        } else {
            System.out.println(texteingabe + " ist kein Palindrom.");
        }


    }

    private static boolean checkPalindrom(String texteingabe) {
        boolean antwort = true;
        String noSpecialCharacters = texteingabe.replaceAll("[^a-zA-Z]", "");
        System.out.println("Ohne Sonderzeichen: " + noSpecialCharacters);
        String lowerCasePalindrom = noSpecialCharacters.toLowerCase();
        System.out.println("Konvertierung in Kleinbuchstaben: " + lowerCasePalindrom);
        // Ermitteln der Wortlaenge und Wortmitte
        int wortmitte = lowerCasePalindrom.length() / 2;
        System.out.println("Wortlaenge: " + lowerCasePalindrom.length());
        System.out.println("Wortmitte: " + wortmitte);
        for(int i=0;i<wortmitte;i++) {
            if(lowerCasePalindrom.charAt(i) == lowerCasePalindrom.charAt(lowerCasePalindrom.length() -1 - i)) {
                continue;
            } else {
                antwort = false;
            }

        }
        return antwort;
    }
}
