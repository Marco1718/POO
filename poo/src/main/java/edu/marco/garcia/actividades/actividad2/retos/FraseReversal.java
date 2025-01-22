package edu.marco.garcia.actividades.actividad2.retos;

public class FraseReversal {

        public static String reverseFrase(String myString) {
            if (myString == null)
              return null;

            return new StringBuilder(myString).reverse().toString();
        }

        public static void main(String[] args) {
            String myString1 = "Hello World!!";
            System.out.println("Reverse:\n" + myString1 + "\n"+reverseFrase(myString1));
        }
}
