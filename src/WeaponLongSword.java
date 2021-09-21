public class WeaponLongSword implements IGearBehaviour{
    @Override
    public void equip(Monster monster)
    {
        monster.setBonusDamage(monster.getBonusDamage()+15);
        monster.setDodge(monster.getDodge()-20);
        monster.setAccuracy(monster.getAccuracy()-10);
        System.out.println(monster.getName() + " equipped Long Sword!\n");
    }
}
