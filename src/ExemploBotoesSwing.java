import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ExemploBotoesSwing {


    public static void main(String[] args) {
        ArrayList<Botoes> btns = new ArrayList<>();
        JFrame frame = new JFrame("Exemplo de Botoes Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crie um painel com GridLayout
        JPanel panel = new JPanel(new GridLayout(1, 1));

        // Crie um painel intermediário com um layout personalizado
        JPanel buttonPanel = new JPanel(new GridLayout(5, 5, 10, 10)); // 10 pixels de espaçamento entre os botões
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(70, 150, 70, 150)); // 20 pixels de espaçamento nas bordas

        // Crie e adicione 25 botões ao painel intermediário com tamanhos personalizados
        for (int i = 1; i <= 25; i++) {
            Botoes button = new Botoes();
            btns.add(button);
            button.mudarBotaoImg("bau.png");
            button.setPreferredSize(new Dimension(50, 50)); // Defina um tamanho fixo para os botões (largura x altura)
            buttonPanel.add(button);


        }

        Random random = new Random();
        int index = random.nextInt(25);
        Botoes sorteado = btns.get(index);

        if (sorteado.addActionListener(e -> )){

        }

        // Adicione o painel intermediário ao painel principal
        panel.add(buttonPanel);

        // Adicione o painel à janela
        frame.getContentPane().add(panel);

        // Configure o tamanho da janela
        frame.setSize(800, 600);

        // Centralize a janela na tela
        frame.setLocationRelativeTo(null);

        // Torne a janela visível
        frame.setVisible(true);
    }

    public void sortear(){

    }
}