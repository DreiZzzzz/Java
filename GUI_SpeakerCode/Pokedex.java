public class Pokedex {
    private Pokemon[] pokemons;
    private int currNum;

    public Pokedex(int numPokemons) {
        pokemons = new Pokemon[numPokemons];
        currNum = 1;

        for (int i = 0; i < pokemons.length; i++) {
            pokemons[i] = new Pokemon(i+1);
        }
    }

    public String getCurrPokemonName() {
        return pokemons[currNum - 1].getName();
    }

    public String getCurrPokemonDesc() {
        return pokemons[currNum - 1].getDesc();
    }

    public void setCurrPokemonName(String name) {
        pokemons[currNum - 1].setName(name);

        System.out.print("Added ");
        System.out.println(pokemons[currNum - 1].getName());
    }

    public void setCurrPokemonDesc(String desc) {
        pokemons[currNum - 1].setDesc(desc);

        System.out.print("Added ");
        System.out.println(pokemons[currNum - 1].getDesc());
    }

    public void nextPokemon() {
        if (!isLastPokemon()) {
            currNum++;
            System.out.println(currNum);
        }
    }

    public void prevPokemon() {
        if (!isFirstPokemon()) {
            currNum--;
            System.out.println(currNum);
        }
    }

    public boolean isLastPokemon() {
        return currNum == pokemons.length;
    }

    public boolean isFirstPokemon() {
        return currNum == 1;
    }

    public int getCurrNum() {
        return currNum;
    }

    public int getNumPokemons() {
        return pokemons.length;
    }
}