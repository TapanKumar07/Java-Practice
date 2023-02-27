package Encapsulation;

public class player {
    public String name, weapon;
    public int health;


    public void loseHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Player is Out!");
            health = 0;
        }


    }

    public int healthRemaining() {

    return health;
   }
    public void restoreHealth(int extraHealth) {
        health += extraHealth;
        if(health > 100) {
            System.out.println("Player resored to max");
            health = 100;
        }
    }

}
