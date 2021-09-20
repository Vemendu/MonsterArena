public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        Monster lizard = new Lizard("Artemka");
        lizard.checkMonster();
        Monster dwarf = new Dwarf("Yarik");
        dwarf.checkMonster();
        lizard.fight(dwarf);
    }
}
