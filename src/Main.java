package Lab;

import pokemons.*;
import ru.ifmo.se.pokemon.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        List<Pokemon> pokemons = new ArrayList<>(List.of(new Pichu("Pichu", 10), new Pikachu("Pikachu", 3), new Raichu("Raichu", 12), new Celebi("Celebi", 9), new Seel("Seel", 9), new Dewgong("Dewgong", 3)));

        for (int i = 0; i < pokemons.size(); i++)
            if (i % 2 == 0) {
                b.addFoe(pokemons.get(i));
            }
            else {
                b.addAlly(pokemons.get(i));
            }

        b.go();
    }
}
