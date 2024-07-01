import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener, DocumentListener {
    private PokedexGUI gui;
    private Pokedex pokedex;

    public Controller(PokedexGUI gui, Pokedex pokedex) {
        this.gui = gui;
        this.pokedex = pokedex;

        updateView();

        gui.setActionListener(this);
        gui.setDocumentListener(this);
    }

    public void updateView() {
        gui.setPokemonNumber(pokedex.getCurrNum(), pokedex.getNumPokemons());

        // initially all your buttons are enabled
        gui.setPrevEnabled(true);
        gui.setNextEnabled(true);

        // display on the GUI the current pokemon as said by the backend
        gui.setPokemonName(pokedex.getCurrPokemonName());
        gui.setPokemonDesc(pokedex.getCurrPokemonDesc());

        if (pokedex.isFirstPokemon()) {
            gui.setPrevEnabled(false);
        }

        if (pokedex.isLastPokemon()) {
            gui.setNextEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            System.out.println("You clicked add!");

            // Set current pokemon name in the model to whatever the user typed
            pokedex.setCurrPokemonName(gui.getPokemonName());
            pokedex.setCurrPokemonDesc(gui.getPokemonDesc());

        } else if (e.getActionCommand().equals("<")) {
            System.out.println("You clicked previous!");

            pokedex.prevPokemon();      // model
            updateView();               // view
        } else if (e.getActionCommand().equals(">")) {
            System.out.println("You clicked next!");

            pokedex.nextPokemon();      // model
            updateView();               // view
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}