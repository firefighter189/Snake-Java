import java.util.ArrayList;
import java.util.List;

public class Player
{
    private int x, y;
    private int width, height;
    private int length;
    public List<Integer> xBlocks = new ArrayList<>();
    public List<Integer> yBlocks = new ArrayList<>();
    private int itemX, itemY;

    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}
    public void setWidth(int width){this.width = width;}
    public void setHeight(int height){this.height = height;}
    public void setItemX(int x){itemX = x;}
    public void setItemY(int y){itemY = y;}

    public int getX(){return x;}
    public int getY(){return y;}
    public int getWidth(){return width;}
    public int getHeight(){return height;}
    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }
    public int getItemX(){return itemX;}
    public int getItemY(){return itemY;}

    public boolean checkItemCollision()
    {
        if(x == itemX && y == itemY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean checkBorderCollision()
    {
        if(x > 37 || x < 0 || y > 37 || y < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean checkInnerCollision()
    {
        for(int i = 0; i < xBlocks.size(); i++)
        {
            if(x == xBlocks.get(i) && y == yBlocks.get(i))
            {
                return true;
            }
        }
        return false;
    }

}
