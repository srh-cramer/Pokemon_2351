public abstract class Pokemon {
    private String type;
    private String name;
    private int level;
    protected int health;
    protected Ability ability;

    public Pokemon(String type, String name, int level) {
        this.type = type;
        this.name = name;
        this.level = level;
        this.health = 100;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int newLevel){
        this.level = newLevel;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public abstract void attack(Pokemon target);

}
