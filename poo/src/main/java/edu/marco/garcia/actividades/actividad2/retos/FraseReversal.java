package edu.marco.garcia.actividades.actividad2.retos;

public class FraseReversal {

    public static String reverseFrase(String myString) {
        if (myString == null) {
            return null;
        }

        char[] charArray = myString.toCharArray();
        String stringReverse = "";

        for (int i = charArray.length -1; i >=0; i--){
            stringReverse += charArray[i];
        }

        return stringReverse;
    }

    public static void main(String[] args) {
        String myString1 = "Hello World!!";
        System.out.println("Reverse:\n" + myString1 + "\n"+reverseFrase(myString1));
    }    
}
