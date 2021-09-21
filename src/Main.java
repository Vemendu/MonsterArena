public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        Monster lizard = new Lizard("Artemka", new WeaponLongSword(), new ArmorSteel());
        lizard.checkMonster();
        Monster dwarf = new Dwarf("Brendish", new WeaponShortSword(), new ArmorChainmail());
        dwarf.checkMonster();
        lizard.fight(dwarf);
    }
}
