package buttonrun;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Locale;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame{
    
    JButton button;
    Random r = new Random();
    
    Window() {
        setTitle("ButtonRun");
        setSize(300, 300);
        setLocation(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        
        button = new JButton("Catch me");
        button.setLocation(100,110);
        button.setSize(100, 25);
        add(button);
        
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setLocation(r.nextInt(getBounds().x - button.getWidth()), r.nextInt(getBounds().y - button.getHeight()));
            }
            
        });
    }
    
}
