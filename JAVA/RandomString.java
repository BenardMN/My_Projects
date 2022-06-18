import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
public class RandomString extends JPanel{
    private String message;
    private Font font1, font2, font3, font4, font5;

    public RandomString(){
        this(null);
    }
    public RandomString(String messageString){
        message = messageString;
        if(message == null){
            message = "Java";

            font1 = new Font("Serif f", Font.BOLD, 14);
            font2 = new Font("SansSerif", Font.BOLD+Font.ITALIC, 24);
            font3 = new Font("Monospaced", Font.PLAIN, 30);
            font4 = new Font("Dialog", Font.PLAIN, 36);
            font5 = new Font("Serif", Font.ITALIC, 48);

            setBackground(Color.BLACK);
        }
        public paintComponent(Graphics g){
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();

            for(int i = 0; i < 25; i++){
                int fontNum = (int)(5*Math.random()) + 1);
                switch (fontNum) {
                    case 1:
                        g.setFont(font1);
                        break;
                    case 2:
                        g.setFont(font2);
                        break;
                    case 3:
                        g.setFont(font3);
                        break;
                    case 4:
                        g.setFont(font4);
                        break;
                    case 5:
                        g.setFont(font5);
                        break;
                }
                float hue = (float)Math.random()
                g.setColor(Color.getHSBColor(hue, 1, 1.));

                int x, y;
                x = -50 +(int)(Math.random()*(width+40));
                y = (int)(Math.random()*(height+20));

                g.drawString(message, x, y);
            }
        }
    }
}