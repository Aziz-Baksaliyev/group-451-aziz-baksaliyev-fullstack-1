package classwork_11;

public class GameCharacter {
    private String name;
    private int health = 100;
    private int level = 1;

    public GameCharacter(String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    public void heal(int amount) {
        this.health = Math.min(100, this.health + amount);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void levelUp() {
        this.level++;
    }

    public int getHealth() { return health; }
    public String getName() { return name; }
    public int getLevel() { return level; }
}
