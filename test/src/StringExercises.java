public class StringExercises {
    public static void main(String[] args) {


        // Definiere einen String mit deinem Namen und gib anschliessend die Länge des dieses String-Wertes auf der Konsole aus.

        String myName = "Leon";
        System.out.println(myName.length());

        // Kopiere die unten definierten Strings in dein Programm und gib auf der Konsole für jeden der Werte das boolean-Ergebnis von isEmtpy() und isBlank() aus.
        //Beschreibe mit einem Kommentar inwiefern sich diese beiden Ergebnisse unterscheiden

        String emptyValue = "";
        String blankValue = "   ";

        System.out.println(emptyValue.isEmpty());
        System.out.println(blankValue.isEmpty());
        System.out.println(emptyValue.isBlank());
        System.out.println(blankValue.isBlank());

    }
}
