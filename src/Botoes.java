import javax.swing.*;
import java.io.File;

public class Botoes extends JButton {
    public Botoes(){
        setOpaque(true);
        setContentAreaFilled(false);
        setBorder(null);

    }

    public void mudarBotaoImg(String anything) {
        File fileName = new File("");
        String url = fileName.getAbsolutePath() + "\\src\\images\\" + anything;
        Icon icone = new ImageIcon(url);

        this.setIcon(icone);
    }

    public void setTesouro(boolean tesouro){
        tesouro = false;
    }
}
