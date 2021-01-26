import java.util.Timer;
import java.util.TimerTask;

public class Main
{
    public static void main(String[] args)
    {
        Input input = new Input();
        Player player = new Player();
        Canvas canvas = new Canvas(player);
        GUI gui = new GUI(input, canvas);
        Control control = new Control(input, gui, player);

        control.start();
        Timer t = new Timer();
        TimerTask tt = new TimerTask()
        {
            @Override
            public void run()
            {
                control.update();
            }
        };
        t.scheduleAtFixedRate(tt, 1, 150);

    }
}
