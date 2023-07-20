import javax.swing.JFrame;

public class GameFrame extends JFrame {
    
    public GameFrame() {

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // sets size to components
        this.setVisible(true);
        this.setLocationRelativeTo(null); // centers the window on the screen

        

    }

}
