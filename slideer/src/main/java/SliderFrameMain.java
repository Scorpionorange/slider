import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/13.
 */
public class SliderFrameMain {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new SliderFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Slider Frame Main");
            frame.setVisible(true);
        });
    }
}
