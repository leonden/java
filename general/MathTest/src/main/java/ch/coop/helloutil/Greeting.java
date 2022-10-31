package ch.coop.helloutil;

public class Greeting {
    private String text;
    private String lang;

    public Greeting(String text, String lang) {
        this.text = text;
        this.lang = lang;
    }

    public String getText() {
        return text;
    }

    public String getLang() {
        return lang;
    }
}
