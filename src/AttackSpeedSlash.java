public class AttackSpeedSlash implements IAttackBehaviour{
    @Override
    public void attack(Monster monster)
    {
        int accuracy = 130-monster.getDodge();
        if((int)(Math.random()*100)>accuracy)
        {
            System.out.println(monster.getName() + " avoided the Speed Slash Attack!");
            System.out.println(monster.getName() + "'s hp equals " + monster.getHp() + "\n");
        }
        else
        {
            monster.setHp(monster.getHp()-(int)(15*(100 - monster.getProtection())/100));
            System.out.println(monster.getName() + " was hit by the Speed Slash Attack! It lost " + (int)(15*(100 - monster.getProtection())/100) + "hp");
            System.out.println(monster.getName() + "'s hp equals " + monster.getHp() + "\n");
        }
    }
}
