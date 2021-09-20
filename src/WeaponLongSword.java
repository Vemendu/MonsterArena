public class WeaponLongSword implements IWeaponBehaviour{
    @Override
    public void equip(Monster monster)
    {
        monster.setBonusDamage(monster.getBonusDamage()+15);
        monster.setDodge(monster.getDodge()-20);
        System.out.println(monster.getName() + " equipped Long Sword!\n");
    }
}
