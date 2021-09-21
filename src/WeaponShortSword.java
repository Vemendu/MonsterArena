public class WeaponShortSword implements IGearBehaviour{
    @Override
    public void equip(Monster monster)
    {
        monster.setBonusDamage(monster.getBonusDamage()+7);
        monster.setDodge(monster.getDodge()+7);
        System.out.println(monster.getName() + " equipped Short Sword!\n");

    }
}
