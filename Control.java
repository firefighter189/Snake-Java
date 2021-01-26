public class Control
{
    private GUI gui;
    private Input input;
    private Player player;
    public Control(Input input, GUI gui, Player player)
    {
        this.gui = gui;
        this.input = input;
        this.player = player;
    }

    private int lastX, lastY;
    private int lastLength;

    public void start()
    {
        gui.create();
        player.setX(20);
        player.setY(20);
        player.setWidth(1);
        player.setHeight(1);
        player.setLength(0);
        lastX = lastY = 0;
        lastLength = -1;
        gui.getCanvas().paintComponents(gui.getCanvas().getGraphics());

        player.setItemX((int) (Math.random() * 38));
        player.setItemY((int) (Math.random() * 38));
    }



    public void update()
    {


        if(input.getUp())
        {
            player.setY(player.getY() - 1);
        }
        if(input.getDown())
        {
            player.setY(player.getY() + 1);
        }
        if(input.getLeft())
        {
            player.setX(player.getX() - 1);
        }
        if(input.getRight())
        {
            player.setX(player.getX() + 1);
        }

        if(player.checkItemCollision())
        {
            player.setLength(player.getLength() + 1);
            player.setItemX((int) (Math.random() * 38));
            player.setItemY((int) (Math.random() * 38));
        }

        if(player.checkBorderCollision() || player.checkInnerCollision())
        {
            System.exit(0);
        }

        if(player.getLength() > lastLength)
        {
            System.out.println(player.getLength());
            player.xBlocks.add(player.getX());
            player.yBlocks.add(player.getY());
        }

        if(player.getLength() > 0)
        {
            player.xBlocks.set(player.getLength(), lastX);
            player.yBlocks.set(player.getLength(), lastY);
        }

        for(int i = 0; i < player.getLength(); i++)
        {
            player.xBlocks.set(i, player.xBlocks.get(i + 1));
            player.yBlocks.set(i, player.yBlocks.get(i + 1));
        }

        lastX = player.getX();
        lastY = player.getY();
        lastLength = player.getLength();
    }
}
