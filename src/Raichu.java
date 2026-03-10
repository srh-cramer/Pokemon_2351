public class Raichu extends Pokemon{

    private String color;

    public Raichu(String name, int level, String color){
        super("Elektro", name, level);
        this.color = color;
    }

    public void attack(Pokemon target){
        System.out.println("Attacke!");
    }
}
