public class PokedexDriver {
    public static void main(String[] args) {
        PokedexGUI gui = new PokedexGUI();
        Pokedex pokedex = new Pokedex(10);
        Controller controller = new Controller(gui, pokedex);
    }
}