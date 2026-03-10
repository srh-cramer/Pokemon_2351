// erbt von Pokemon
public class Pikachu extends Pokemon implements Evolvable {

    private final String color;

    public Pikachu(String color, String name, int level) {
        super("Elektro", name, level);
        this.color = color;
        this.health = 150;
        // jedes Pikachu hat immer die gleiche Ability mit gleichem Damage
        this.ability = new Ability("Donnerblitz", 30);
    }
//    nicht erlaubt, da color final
//    public void setColor(String newColor){
//        this.color = newColor;
//    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void attack(Pokemon target) {
        //Gib aus: Herbert greift Voltron mit Flammenwurf an.
        System.out.println(this.getName() + " greift " + target.getName() + " mit " + this.getAbility().getName() + " an.");
        // Kurzschreibweise:
        int my_damage = this.getAbility().getDamage();
        // Langschreibweise:
        // Ability my_ability = this.getAbility();
        // int my_damage = my_ability.getDamage();
        int newTargetHealth = target.getHealth() - my_damage;    //hier wird nichts gesettet
        target.setHealth(newTargetHealth);  //hier überschreiben wir target.health von 100 auf 90
        System.out.println(target.getName() + " hat noch " + target.getHealth() + " HP.");
    }

    @Override
    public Raichu evolve(){
        System.out.println("Hey, Pikachu entwickelt sich zu Raichu!");
        Raichu evolved_pokemon = new Raichu(this.getName(), this.getLevel(), this.getColor());
        return evolved_pokemon;
    }
}
