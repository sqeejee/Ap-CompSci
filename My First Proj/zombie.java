
/**
 * Write a description of class zombie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class zombie
{
    private double speed;
    private String name;
    private int attack;
    private int health;
    private boolean dead;
    private String weaponName;

    public boolean Zombie (double speed2, String name2, int attack2, int health2, boolean dead2, String weaponName2)
    {
        speed = speed2;
        name = name2;
        attack = attack2;
        health = health2;
        dead = dead2;
        weaponName = weaponName2;
        speed = speed2;

        return (true);

    }

    public void equipWeapon(String newWeaponName)
    {
        if (newWeaponName == "chainsaw"){
            attack = 30;
            weaponName = newWeaponName;
            speed = 50;

        }

    }
}
