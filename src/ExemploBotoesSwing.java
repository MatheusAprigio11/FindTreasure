import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public class ExemploBotoesSwing extends JFrame implements ActionListener {
    Botoes sorteado;
    Botoes errado;
    int indice = 0;
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
            buttonPanel.add(button);
        }
        panel.add(buttonPanel);

        sortear();


        this.getContentPane().add(panel);

        this.setSize(800, 600);

        this.setLocationRelativeTo(null);

        // Torne a janela visível
        this.setVisible(true);

    }

    public void sortear() {
        Random random = new Random();
        int index = random.nextInt(25);
        sorteado = btns.get(index);
        btns.remove(index);

        sorteado.addActionListener(this);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (sorteado){

                }
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == sorteado) {
                sorteado.mudarBotaoImg("acertou.png");
                JOptionPane.showMessageDialog(null, "achou");
                this.setVisible(false);
            }
        }
    }
