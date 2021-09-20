public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        Monster lizard = new Lizard("Artemka", new WeaponLongSword());
        lizard.checkMonster();
        Monster dwarf = new Dwarf("Yarik", new WeaponShortSword());
        dwarf.checkMonster();
        lizard.fight(dwarf);
    }
}
