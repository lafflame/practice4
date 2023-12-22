import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        int milan = 0;

        JFrame frame = new JFrame("Итог матча");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);

        JButton MIlan = new JButton("AC Milan");
        frame.add(MIlan, BorderLayout.SOUTH);
        frame.setVisible(true);

        JButton RMCF = new JButton("Real Madrid CF");
        frame.add(RMCF, BorderLayout.SOUTH);
        frame.setVisible(true);

        JLabel score = new JLabel("Итоговый счёт: ");
    }
}