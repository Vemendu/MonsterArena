public class ArmorChainmail implements IGearBehaviour{
    @Override
    public void equip(Monster monster)
    {
        monster.setDodge(monster.getDodge()+15);
        monster.setProtection(monster.getProtection()+10);
        monster.setBonusDamage(monster.getBonusDamage()-3);
        monster.setAccuracy(monster.getAccuracy()-5);
    }
}
