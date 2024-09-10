package no.dat100.hvl;
import javax.swing.*;

import static java.lang.Integer.parseInt;

public class OppgaveG3 {
    public static void main(String[] args) {
        int nedreGrense = parseInt(JOptionPane.showInputDialog("Nedre grense"));
        int oevreGrense = parseInt(JOptionPane.showInputDialog("Øvre grense"));
        System.out.println("Nedre Grense: " + nedreGrense);
        System.out.println("Øvre Grense: " + oevreGrense);

        if (nedreGrense % 2 == 0) {
            nedreGrense++;
        }
        for (int i = nedreGrense; i <= oevreGrense; i+=2) {
            System.out.println(i);
        }
    }

}
