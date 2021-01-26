import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel
{
    private Graphics2D g2d;
    private int scale = 20;
    private Player player;

    public Canvas(Player player)
    {
        this.player = player;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g2d = (Graphics2D) g;

        g2d.setColor(new Color(100, 100, 100, 50));
        for(int i = 0; i < getWidth(); i+=20)
        {
            g2d.drawLine(i, 0, i, getHeight());
            g2d.drawLine(0, i, getWidth(), i);
        }

        g2d.setColor(new Color(200, 0, 0));
        g2d.fillRect(player.getItemX() * scale, player.getItemY() * scale, scale, scale);

        g2d.setColor(new Color(0, 100, 0));
        g2d.fillRect(player.getX() * scale, player.getY() * scale, player.getWidth() * scale, player.getHeight() * scale);
        for(int i = 0; i < player.getLength(); i++)
        {
            g2d.setColor(new Color(0, 150, 0));
            g2d.fillRect(player.xBlocks.get(i) * scale, player.yBlocks.get(i) * scale, player.getWidth() * scale, player.getHeight() * scale);
        }

        repaint();
    }


}
