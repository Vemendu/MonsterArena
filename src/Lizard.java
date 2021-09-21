import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lizard extends Monster{
    public Lizard(String name, IGearBehaviour weaponBehaviour, IGearBehaviour armorBehaviour)
    {
        super(Arrays.asList(new AttackSimple(), new AttackSpeedSlash()), weaponBehaviour, armorBehaviour);
        this.setName("The Fastest "+name);
        this.setHp(110);
        this.setProtection(10);
        this.setDodge(25);
        this.setAccuracy(100);
    }
    public void checkMonster()
    {
        System.out.println("Monster's race is " + getClass().toString().substring(6) + ",\n name is '"+ getName() + "',\n his max hp is " + getHp() + ",\n his protection is " + getProtection() + "%,\n his dodge is " + getDodge() + "%.\n");
    }
}
