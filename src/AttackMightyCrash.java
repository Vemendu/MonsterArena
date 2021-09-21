public class AttackMightyCrash implements IAttackBehaviour{
    @Override
    public void attack(Monster monster1, Monster monster2)
    {
        int accuracy = monster1.getAccuracy()-30-monster2.getDodge();
        if((int)(Math.random()*100)>accuracy)
        {
            System.out.println(monster2.getName() + " avoided the Mighty Crash Attack!");
            System.out.println(monster2.getName() + "'s hp equals " + monster2.getHp() + "\n");
        }
        else
        {
            monster2.setHp(monster2.getHp()-(int)((30 + monster1.getBonusDamage())*(100 - monster2.getProtection())/100));
            System.out.println(monster2.getName() + " was hit by the Mighty Crash Attack! It lost " + (int)((25 + monster1.getBonusDamage())*(100 - monster2.getProtection())/100) + "hp");
            System.out.println(monster2.getName() + "'s hp equals " + monster2.getHp() +"\n");
        }
    }
}
