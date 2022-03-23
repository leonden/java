package ch.course;

import javax.swing.*;

public class NullNullPointerException {
    public static void main(String[] args) {

        java.awt.Point p = null;
        String s = "";
        int i = 12;

        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("s == null");
        }

        String input = JOptionPane.showInputDialog("Input");

        if (input != null)

        System.out.println(input.length());
    }
}
