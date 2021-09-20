public class WeaponShortSword implements IWeaponBehaviour{
    @Override
    public void equip(Monster monster)
    {
        monster.setBonusDamage(monster.getBonusDamage()+5);
        monster.setDodge(monster.getDodge()+5);
        System.out.println(monster.getName() + " equipped Short Sword!\n");

    }
}
