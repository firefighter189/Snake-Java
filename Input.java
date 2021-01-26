import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener
{
    private boolean up, down, left, right;

    {
         down = left = right = false;
         up = true;

    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_W:
                up = true;
                down = right = left = false;
                break;
            case KeyEvent.VK_S:
                down = true;
                up = right = left = false;
                break;
            case KeyEvent.VK_A:
                left = true;
                up = down = right = false;
                break;
            case KeyEvent.VK_D:
                right = true;
                up = down = left = false;
                break;
            case KeyEvent.VK_UP:
                up = true;
                down = right = left = false;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                up = right = left = false;
                break;
            case KeyEvent.VK_LEFT:
                left = true;
                up = down = right = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                up = down = left = false;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }

    public boolean getUp(){return up;}
    public boolean getDown(){return down;}
    public boolean getLeft(){return left;}
    public boolean getRight(){return right;}

}
