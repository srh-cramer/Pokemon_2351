//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pokemon my_starter_pokemon = new Pokemon("Feuer", "Herbert", 1);
        Pokemon enemy_pokemon = new Pokemon("Elektro", "Voltron", 8);
        my_starter_pokemon.setLevel(10);
        System.out.println(my_starter_pokemon.getName());
        System.out.println(my_starter_pokemon.getLevel());
        // das "generische" Pokemon hat keine Ability, daher kann es nicht angreifen
        // my_starter_pokemon.attack(enemy_pokemon);

        // das "konkrete" Pikachu kann angreifen mit seiner festen Ability Donnerblitz
        Pikachu peterkachu = new Pikachu("lila", "Peter", 5);
        peterkachu.attack(enemy_pokemon);

    }
}