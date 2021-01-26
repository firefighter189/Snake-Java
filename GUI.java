import javax.swing.*;

public class GUI
{
    private JFrame frame;
    private Canvas canvas;
    private Input input;

    public GUI(Input input, Canvas canvas)
    {
        frame = new JFrame();
        this.canvas = canvas;
        this.input = input;
    }

    public void create()
    {
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setTitle("snake");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(canvas);
        frame.addKeyListener(input);
        frame.setVisible(true);
    }



    public Canvas getCanvas(){return canvas;}


}
