
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.Random;

public class ExemploBotoesSwing extends JFrame implements ActionListener {
    Botoes sorteado;
    int chances = 3;
    private BufferedImage imagemDeFundo;
    ArrayList<Botoes> btns = new ArrayList<>();

    public ExemploBotoesSwing() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1, 1));
        JPanel buttonPanel = new JPanel(new GridLayout(5, 5, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(70, 150, 70, 150));

        for (int i = 1; i <= 25; i++) {
            Botoes button = new Botoes();
            btns.add(button);
            button.mudarBotaoImg("bau.png");
            button.setPreferredSize(new Dimension(50, 50));
            button.addActionListener(this);
            button.putClientProperty("indice", i - 1); // Adicione o índice aos botões
            buttonPanel.add(button);
        }
        panel.add(buttonPanel);

        sortear();

        buttonPanel.setBackground(new Color(107,88,1));
        this.getContentPane().add(panel);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public void sortear() {
        Random random = new Random();
        int index = random.nextInt(25);
        sorteado = btns.get(index);
        System.out.println(index);
        btns.remove(index);
        sorteado.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
            chances -= 1;
            Botoes botaoClicado = (Botoes) e.getSource();
            if (chances == 0 && botaoClicado != sorteado){
                botaoClicado.mudarBotaoImg("vazio-aberto.png");
                JOptionPane.showMessageDialog(null, "Voce perdeu");
                System.exit(0);
            }
            if (botaoClicado == sorteado) {
                sorteado.mudarBotaoImg("acertou.png");
                JOptionPane.showMessageDialog(null, "Você encontrou o tesouro sorteado!");
                this.setVisible(false);
                System.exit(0);
            } else {
                botaoClicado.setEnabled(false);
                botaoClicado.mudarBotaoImg("vazio-aberto.png");
            }
        }
    }

