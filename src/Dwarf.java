public class Dwarf extends Monster{
    public Dwarf(String name)
    {
        super(new AttackSimple(), new AttackMightyCrash());
        this.setName("The Mightiest "+name);
        this.setHp(90);
        this.setProtection(25);
        this.setDodge(10);
    }
    public void checkMonster()
    {
        System.out.println("Monster's race is " + getClass().toString().substring(6) + ",\n name is '"+ getName() + "',\n his max hp is " + getHp() + ",\n his protection is " + getProtection() + "%,\n his dodge is " + getDodge() + "%.\n");
    }
}
