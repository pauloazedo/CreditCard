package br.com.creditcard.action;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test
{
  public static void main(String[] args)
  {
    // Cria um JFrame
    JFrame frame = new JFrame("JOptionPane exemplo");

    // Cria o JOptionPane por showMessageDialog
    int resposta = JOptionPane.showConfirmDialog(frame,"escolha um", "escolha dois", JOptionPane.YES_NO_OPTION);
    //verfica se a resposta é verdadeira
    if (resposta == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Olá");
      }
      else {
         JOptionPane.showMessageDialog(null, "Adeus");
         System.exit(0);
      }
    System.exit(0);
  }
}