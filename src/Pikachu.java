// erbt von Pokemon
public class Pikachu extends Pokemon{

    private final String color;

    public Pikachu(String color, String name, int level){
        super("Elektro",name,level);
        this.color = color;
        this.health = 150;
        // jedes Pikachu hat immer die gleiche Ability mit gleichem Damage
        this.ability = new Ability("Donnerblitz", 30);
    }
//    nicht erlaubt, da color final
//    public void setColor(String newColor){
//        this.color = newColor;
//    }

    public String getColor(){
        return this.color;
    }
}
