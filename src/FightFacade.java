import Factory.DwarfFactory;
import Factory.LizardFactory;
import Monsters.Dwarf;
import Monsters.Lizard;
import Monsters.Monster;

public class FightFacade {

    //This is NOT facade yet. We need to connect this to adapter somehow
    public void fight(Monster monster1, Monster monster2) throws InterruptedException
    {
        System.out.println("The fight between "+ monster1.getName() +" and " + monster2.getName() + " is starting!\n");
        Thread.sleep(2000);
        monster1.swordBehaviour.equip(monster1);
        monster2.swordBehaviour.equip(monster2);
        monster1.armorBehaviour.equip(monster1);
        monster2.armorBehaviour.equip(monster2);
        if((int)(Math.random()*2)==1)
        {
            System.out.println(monster1.getName()+" moves first!\n");
            Thread.sleep(2000);

            while(monster1.getHp()>0 && monster2.getHp()>0)
            {
                monster1.getListOfAttacks().get((int)(Math.random()*monster1.getListOfAttacks().size())).attack(monster1, monster2);
                Thread.sleep(2000);

                if(monster2.getHp()<=0)
                {
                    System.out.println(monster2.getName()+" was slain! The winner is "+monster1.getName()+"\n" +
                            "The remaining hp is = " + monster1.getHp());
                    break;
                }

                monster2.getListOfAttacks().get((int)(Math.random()*monster2.getListOfAttacks().size())).attack(monster2, monster1);
                Thread.sleep(2000);

                if(monster1.getHp()<=0)
                {
                    System.out.println(monster1.getName()+" was slain! The winner is "+monster2.getName()+"\n" +
                            "The remaining hp is = " + monster2.getHp());
                    break;
                }
            }
        }
        else{
            System.out.println(monster2.getName()+" moves first!\n");
            Thread.sleep(2000);
            while(monster1.getHp()>0 && monster2.getHp()>0)
            {
                monster2.getListOfAttacks().get((int)(Math.random()*monster2.getListOfAttacks().size())).attack(monster2, monster1);
                Thread.sleep(2000);
                if(monster1.getHp()<=0)
                {
                    System.out.println(monster1.getName()+" was slain! The winner is "+monster2.getName()+"\n" +
                            "The remaining hp is = " + monster2.getHp());
                    break;
                }
                monster1.getListOfAttacks().get((int)(Math.random()*monster1.getListOfAttacks().size())).attack(monster1, monster2);
                Thread.sleep(2000);
                if(monster2.getHp()<=0)
                {
                    System.out.println(monster2.getName()+" was slain! The winner is "+monster1.getName()+"\n" +
                            "The remaining hp is = " + monster1.getHp());
                    break;
                }
            }
        }
    }
    public void randomFight() throws InterruptedException
    {
        LizardFactory factoryLizard = new LizardFactory();
        DwarfFactory factoryDwarf = new DwarfFactory();
        int randomNumber = (int)(Math.random()*3);
        Lizard lizard = null;
        Dwarf dwarf = null;
        switch (randomNumber) {
            case 0: lizard = factoryLizard.createWeakMonster(); break;
            case 1: lizard = factoryLizard.createNormalMonster(); break;
            case 2: lizard = factoryLizard.createStrongMonster(); break;
            default:
        }
        randomNumber = (int) (Math.random()*3);
        switch (randomNumber) {
            case 0: dwarf = factoryDwarf.createWeakMonster(); break;
            case 1: dwarf = factoryDwarf.createNormalMonster(); break;
            case 2: dwarf = factoryDwarf.createStrongMonster(); break;
            default: break;
        }
        fight(lizard, dwarf);
        System.out.println("\n");
    }
}
