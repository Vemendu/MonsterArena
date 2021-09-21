public class ArmorSteel implements IGearBehaviour{
    @Override
    public void equip(Monster monster)
    {
        monster.setDodge(monster.getDodge()-20);
        monster.setProtection(monster.getProtection()+25);
        monster.setBonusDamage(monster.getBonusDamage()-5);
        monster.setAccuracy(monster.getAccuracy()-15);
    }
}
