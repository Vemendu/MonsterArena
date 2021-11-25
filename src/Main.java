import Factory.DwarfFactory;
import Factory.IMonsterFactory;
import Factory.LizardFactory;
import Gear.Armor.ArmorChainmail;
import Gear.Armor.ArmorSteel;
import Gear.Weapons.WeaponLongSword;
import Gear.Weapons.WeaponShortSword;
import Monsters.Dwarf;
import Monsters.Lizard;
import Monsters.Monster;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        LizardFactory factory1 = new LizardFactory();
        DwarfFactory factory2 = new DwarfFactory();
        Lizard monster1 = factory1.createStrongMonster();
        Dwarf monster2 = factory2.createNormalMonster();
        FightFacade fightFacade = new FightFacade();
        fightFacade.fight(monster1, monster2);
    }
}
