public class AttackSimple implements IAttackBehaviour{
    @Override
    public void attack(Monster monster)
    {
        int accuracy = 100-monster.getDodge();
        if((int)(Math.random()*100)>accuracy)
        {
            System.out.println(monster.getName() + " avoided the Simple Attack!");
            System.out.println(monster.getName() + "'s hp equals " + monster.getHp() + "\n");
        }
        else
        {
            monster.setHp(monster.getHp()-(int)(20*(100 - monster.getProtection())/100));
            System.out.println(monster.getName() + " was hit by the Simple Attack! It lost " + (int)(20*(100 - monster.getProtection())/100) +  "hp");
            System.out.println(monster.getName() + "'s hp equals " + monster.getHp() + "\n");
        }
    }
}
