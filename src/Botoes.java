import javax.swing.*;
import java.io.File;

public class Botoes extends JButton {
    public Botoes(){
        setOpaque(true);
        setContentAreaFilled(false);
        setBorder(null);
    }

    public void mudarBotaoImg(String imgs) {
        File fileName = new File("");
        String url = fileName.getAbsolutePath() + "\\src\\images\\" + imgs;
        Icon icone = new ImageIcon(url);

        this.setIcon(icone);
    }
}
