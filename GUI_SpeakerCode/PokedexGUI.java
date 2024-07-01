import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class PokedexGUI extends JFrame {
    private JButton btnAdd;
    private JButton btnClear;
    private JButton btnPrev;
    private JButton btnNext;

    private JTextField tfName;
    private JTextArea taDesc;

    private JLabel lblPage;

    public PokedexGUI() {
        super("Pokedex");
        setLayout(new BorderLayout());

        setSize(450, 500);
        init();

        // by default, the window will not be displayed
        setVisible(true);
        setResizable(false);

        // so that the program will actually stop running
        // when you press the close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {
        // SOUTH PANEL
        JPanel panelSouth = new JPanel();
        panelSouth.setLayout(new FlowLayout());
        panelSouth.setBackground(Color.decode("#CE2211"));

        btnAdd = new JButton("Add");
        panelSouth.add(btnAdd);

        btnClear = new JButton("Clear");
        panelSouth.add(btnClear);

        this.add(panelSouth, BorderLayout.SOUTH);

        // NORTH PANEL
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new FlowLayout());
        panelNorth.setBackground(Color.decode("#0A285F"));

        JLabel lblPokedex = new JLabel("Pokedex");
        lblPokedex.setForeground(Color.WHITE);
        lblPokedex.setFont(new Font("Verdana", Font.BOLD, 20));
        panelNorth.add(lblPokedex);

        lblPage = new JLabel("Page");
        lblPage.setForeground(Color.WHITE);
        lblPage.setFont(new Font("Verdana", Font.BOLD, 20));
        panelNorth.add(lblPage);

        this.add(panelNorth, BorderLayout.NORTH);

        // WEST PANEL
        JPanel panelWest = new JPanel();
        panelWest.setLayout(new GridBagLayout());
        panelWest.setBackground(Color.decode("#dfdfdf"));

        btnPrev = new JButton("<");
        panelWest.add(btnPrev);

        this.add(panelWest, BorderLayout.WEST);

        // EAST PANEL
        JPanel panelEast = new JPanel();
        panelEast.setLayout(new GridBagLayout());
        panelEast.setBackground(Color.decode("#dfdfdf"));

        btnNext = new JButton(">");
        panelEast.add(btnNext);

        this.add(panelEast, BorderLayout.EAST);

        // CENTER PANEL
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new BorderLayout());
        panelCenter.setBackground(Color.decode("#dfdfdf"));

        // Name panel inside CENTER PANEL
        JPanel panelName = new JPanel();
        panelName.setLayout(new FlowLayout());
        panelName.setBackground(Color.decode("#dfdfdf"));

        JLabel lblName = new JLabel("Pokemon Name");
        lblName.setForeground(Color.decode("#0A285F"));
        panelName.add(lblName);

        tfName = new JTextField(20);
        panelName.add(tfName);

        panelCenter.add(panelName, BorderLayout.NORTH);

        // Description inside CENTER PANEL
        taDesc = new JTextArea();
        JScrollPane scroll = new JScrollPane(taDesc);
        panelCenter.add(scroll, BorderLayout.CENTER);

        this.add(panelCenter, BorderLayout.CENTER);
    }

    // Add listeners
    public void setActionListener(ActionListener listener) {
        btnAdd.addActionListener(listener);
        btnClear.addActionListener(listener);
        btnPrev.addActionListener(listener);
        btnNext.addActionListener(listener);
    }

    public void setDocumentListener(DocumentListener listener) {
        tfName.getDocument().addDocumentListener(listener);
        taDesc.getDocument().addDocumentListener(listener);
    }

    public void setPokemonNumber(int currNum, int numPokemons) {
        lblPage.setText("(Pokemon " + currNum + " of " + numPokemons + ")");
    }

    public void setPrevEnabled(boolean enabled) {
        btnPrev.setEnabled(enabled);
    }

    public void setNextEnabled(boolean enabled) {
        btnNext.setEnabled(enabled);
    }

    public String getPokemonName() {
        return tfName.getText();
    }

    public void setPokemonName(String name) {
        tfName.setText(name);
    }

    public String getPokemonDesc() {
        return taDesc.getText();
    }

    public void setPokemonDesc(String desc) {
        taDesc.setText(desc);
    }
}