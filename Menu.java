import javax.swing.*;
import javax.swing.border.LineBorder;
import java.text.*;
import java.awt.*;

public class Menu extends JFrame {

    private JLayeredPane layeredPane;

    private JLabel mainBG;
    private ImageIcon posterImage;

    private JScrollPane scrollPane;
    private JPanel scrollPanel;

    private JLabel stageImageLabel;
    private ImageIcon stageImage;
    private JLabel stageNameLabel;
    private JLabel stagePriceLabel;
    private JLabel stageIngredientsLabel;

    private NumberFormat NumberFormat;
    private JTextField amountTextField;
    
    
    public Menu(){
        
        this.setSize(500,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);


        layeredPane=new JLayeredPane();
        mainBG = new JLabel();
        posterImage= new ImageIcon(this.getClass().getResource("./Images/mainBG.png"));

        scrollPanel= new JPanel();
        scrollPane = new JScrollPane(scrollPanel);



        ///////////
        /// 
        /// 
        layeredPane.setPreferredSize(new Dimension(500,750));
        mainBG.setBounds(0, 0, 500, 750);
        mainBG.setIcon(posterImage);
        layeredPane.add(mainBG,JLayeredPane.DEFAULT_LAYER);

        //scroll panel
        scrollPanel.setLayout(new BoxLayout(scrollPanel, BoxLayout.X_AXIS));
        scrollPanel.setBackground(new Color(31,25,27));

        //add labels to scroll panel
        for (int i = 1; i <= 40; i++) {
            JLabel label = new JLabel("Label " + i+"    ");
            label.setFont(new Font("cocon", Font.BOLD, 15));
            label.setForeground(new Color(242,186,0));
            scrollPanel.add(label);
        }

        //scrollpane theem and added it to the layeredpane 
        scrollPane.getHorizontalScrollBar().setBackground(new Color(31,25,27));
        scrollPane.setBorder(new LineBorder(new Color(242,186,0),5));
        scrollPane.setBounds(50, 110, 400 , 75); 
        layeredPane.add(scrollPane, JLayeredPane.PALETTE_LAYER);


        ///////stage//////////
        /// Image
        stageImageLabel = new JLabel();
        stageImage= new ImageIcon(this.getClass().getResource("./Images/mealsImagess/SeasonsPiza.jpg"));
        stageImageLabel.setBounds(125, 200, 250, 166);
        stageImageLabel.setIcon(stageImage);
        stageImageLabel.setBorder(new LineBorder(new Color(242,186,0),5));
        layeredPane.add(stageImageLabel,JLayeredPane.PALETTE_LAYER);
        /// Name
        stageNameLabel = new JLabel();
        stageNameLabel.setText("lsdkfh");
        stageNameLabel.setBounds(125, 370, 250, 50);
        stageNameLabel.setForeground(new Color(242,186,0));
        stageNameLabel.setBackground(new Color(31,25,27));
        stageNameLabel.setBorder(new LineBorder(new Color(242,186,0),5));
        stageNameLabel.setFont(new Font("cocon",Font.BOLD,20));
        stageNameLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        layeredPane.add(stageNameLabel,JLayeredPane.PALETTE_LAYER);
        /// Price
        stagePriceLabel = new JLabel();
        stagePriceLabel.setText("200$");
        stagePriceLabel.setBounds(125, 425, 250, 50);
        stagePriceLabel.setForeground(new Color(242,186,0));
        stagePriceLabel.setBackground(new Color(31,25,27));
        stagePriceLabel.setBorder(new LineBorder(new Color(242,186,0),5));
        stagePriceLabel.setFont(new Font("cocon",Font.BOLD,20));
        stagePriceLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        layeredPane.add(stagePriceLabel,JLayeredPane.PALETTE_LAYER);
        /// Ingredients
        stageIngredientsLabel = new JLabel();
        stageIngredientsLabel.setText("Ingredients");
        stageIngredientsLabel.setBounds(125, 480, 250, 50);
        stageIngredientsLabel.setForeground(new Color(242,186,0));
        stageIngredientsLabel.setBackground(new Color(31,25,27));
        stageIngredientsLabel.setBorder(new LineBorder(new Color(242,186,0),5));
        stageIngredientsLabel.setFont(new Font("cocon",Font.BOLD,20));
        stageIngredientsLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        layeredPane.add(stageIngredientsLabel,JLayeredPane.PALETTE_LAYER);
        // Number Field
        NumberFormat= NumberFormat.getIntegerInstance();
        amountTextField= new JFormattedTextField(NumberFormat);
        amountTextField.setColumns(10);
        amountTextField.setBounds(125, 535, 250, 50);
        amountTextField.setForeground(new Color(242,186,0));
        amountTextField.setBackground(new Color(31,25,27));
        amountTextField.setBorder(new LineBorder(new Color(242,186,0),5));
        amountTextField.setFont(new Font("cocon",Font.BOLD,20));
        amountTextField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        amountTextField.setCaretColor(Color.white);
        amountTextField.setToolTipText("amount");
        amountTextField.setText("Amount: ");
        layeredPane.add(amountTextField,JLayeredPane.PALETTE_LAYER);
        
        this.add(layeredPane);
        this.setVisible(true);
        //
    }

}