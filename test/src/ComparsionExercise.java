public class ComparsionExercise {
    public static void main(String[] args) {

//        Definiere 2 String Variablen mit dem Wert "Hello".
//        Verlgieche die Werte der beiden Variablen und schreibe das Ergebnis aus die Konsole. Nutze dazu bitte einmal equals() und einmal ==. Du wirst feststellen dass das Ergebnis in beiden Fällen true ist.
//        Füge nun folgenden Code hinzu und prüfe den Wert dieser neuen Variable gegen den Wert deiner zuerst erstellten Variable. Nutze dazu bitte wieder jeweils equals() und ==.
//        Warum gibt der Vergleich mit == nun false?

        String hello1 = "Hello";
        String hello2 = "Hello";

        if (hello1 == hello2) {
            System.out.println(true);
        }

        if (hello1.equals(hello2)) {
            System.out.println(true);
        }

        StringBuilder myStringBuilder = new StringBuilder();
        myStringBuilder.append("Hello");

        String thirdHello = myStringBuilder.toString();

    }
}
