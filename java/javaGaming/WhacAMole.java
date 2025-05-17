import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

import java.net.URL;

public class WhacAMole{
    int boardWidth = 600;
    int boardHeight = 650;

    // window-
    JFrame frame = new JFrame("Mario: Whac a mole");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel(); 

    JButton[] board = new JButton[9];
    ImageIcon moleIcon;
    ImageIcon plantIcon;

    WhacAMole() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);  //center
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //text
        textLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Score: 0");
        textLabel.setOpaque(true);

        //panel
        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);   
        frame.add(textPanel, BorderLayout.NORTH); 

        //board
        boardPanel.setLayout(new GridLayout(3,3));
        // boardPanel.setBackground(Color.black);
        frame.add(boardPanel);

        // plantIcon = new ImageIcon(getClass().getResource("./piranha.png"));
        // Image plantImg = new ImageIcon(getClass().getResource("./piranhha.png")).getImage();

        Image plantImg = new ImageIcon(getClass().getResource("piranhha.png")).getImage();
        plantIcon = new ImageIcon("C:\\Users\\prath\\Desktop\\gitdemo\\Java-Journey\\java\\javaGaming\\piranhha.png");
        URL imageURL = getClass().getResource("piranhha.png");
        plantIcon = new ImageIcon(plantImg.getScaledInstance(150,150, java.awt.Image.SCALE_SMOOTH));

        for(int i=0; i<9; i++){
            JButton tile = new JButton();
            board[i] = tile;
            boardPanel.add(tile);
            tile.setIcon(plantIcon);
        }
}

     public static void main(String[] args) {
        new WhacAMole();
    }

}
