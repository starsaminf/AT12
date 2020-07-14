import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class PacmanDraw extends JComponent {
    private Pacman pacman = new Pacman(60, 60, true);
    public int x = pacman.getX();
    public int y = pacman.getY();

    //Method to draw pacman in the frame
    public void paintComponent(Graphics g) {
        drawWall(g);
        ImageIcon pacmanIcon = new ImageIcon(DrawComponents.class.getResource("pacmanIcon.png"));
        Image pacmanImg = pacmanIcon.getImage();
        g.drawImage(pacmanImg, x, y, 30, 30, null);
    }

    public void drawWall(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect(0, 0, 30, 30); //izquierda
        g.drawRect(0, 30, 30, 30);
        g.drawRect(0, 60, 30, 30);
        g.drawRect(0, 90, 30, 30);
        g.drawRect(0, 120, 30, 30);

        g.drawRect(30, 0, 30, 30); //arriba
        g.drawRect(60, 0, 30, 30);
        g.drawRect(90, 0, 30, 30);
        g.drawRect(120, 0, 30, 30);
        g.drawRect(870, 870, 30, 30);

        g.drawRect(870, 0, 30, 30); // derecha
        g.drawRect(870, 30, 30, 30);

        g.drawRect(0, 870, 30, 30); // abajo
        g.drawRect(30, 870, 30, 30);
    }

    //Method to move pacman to right 10 pixels
    public void moveRight() {
        x = pacman.right();
        y = y;
        repaint();
    }

    //Method to move pacman to left 10 pixels
    public void moveLeft() {
        x = pacman.left();
        y = y;
        repaint();
    }

    //Method to move pacman to down 10 pixels
    public void moveDown() {
        y = pacman.down();
        x = x;
        repaint();
    }

    //Method to move pacman to up 10 pixels
    public void moveUp() {
        y = pacman.up();
        x = x;
        repaint();
    }
}
