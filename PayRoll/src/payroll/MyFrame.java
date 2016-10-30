/**
 * file MyFrame.java
 * @author Kevin Fry
 * date 2015-04-10
 * purpose provide additional constructors for frames
 */
package payroll;
import javax.swing.*;

public class MyFrame extends JFrame{
    //standard frame size
    public final int WIDTH = 300, HEIGHT = 300;
    
    //constructors
    public MyFrame() {
        super("MyFrame");
        setFrame(WIDTH, HEIGHT);
    }
    public MyFrame(String frameTitle) {
        super(frameTitle);
        setFrame(WIDTH, HEIGHT);
    }
    public MyFrame(String frameTitle, int width, int height) {
        super(frameTitle);
        setFrame(width, height);
    }//end constructors
    
    //method display()
    public void display() {
        setVisible(true);
    }//end display
    
    //method setFrame(), set frame size and other properties
    private void setFrame(int width, int height) {
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//end setFrame()
}//end class MyFrame
