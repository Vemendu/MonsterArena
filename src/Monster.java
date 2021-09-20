public abstract class Monster {

    //fields
    private String name;
    private int hp;
    private int protection; //reduces attack's damage in percent proportion
    private int dodge; //increases a chance of evading an incoming attack
    IAttackBehaviour attack1Behaviour;
    IAttackBehaviour attack2Behaviour;

    //constructors
    public Monster(IAttackBehaviour attack1Behaviour, IAttackBehaviour attack2Behaviour)
    {
        this.attack1Behaviour = attack1Behaviour;
        this.attack2Behaviour = attack2Behaviour;
    }

    public Monster()
    {

    }

    //methods
    public abstract void checkMonster();
    public void fight(Monster monster) throws InterruptedException
    {
        System.out.println("The fight between "+ this.getName() +" and " + monster.getName() + " is starting!\n");
        Thread.sleep(2000);

        if((int)(Math.random()*2)==1)
        {
            System.out.println(this.getName()+" moves first!\n");
            Thread.sleep(2000);

            while(this.hp>0 && monster.hp>0)
            {
                if((int)(Math.random()*2)==1)
                    this.attack2Behaviour.attack(monster);
                else
                    this.attack1Behaviour.attack(monster);
                Thread.sleep(2000);

                if(monster.getHp()<=0)
                {
                    System.out.println(monster.getName()+" was slain! The winner is "+this.getName()+"\n" +
                            "The remaining hp is = " + this.getHp());
                    break;
                }

                if((int)(Math.random()*2)==1)
                    monster.attack2Behaviour.attack(this);
                else
                    monster.attack1Behaviour.attack(this);
                Thread.sleep(2000);

                if(this.getHp()<=0)
                {
                    System.out.println(this.getName()+" was slain! The winner is "+monster.getName()+"\n" +
                            "The remaining hp is = " + monster.getHp());
                    break;
                }
            }
        }
        else{
            System.out.println(monster.getName()+" moves first!\n");
            Thread.sleep(2000);
            while(this.hp>0 && monster.hp>0)
            {
                if((int)(Math.random()*2)==1)
                    monster.attack2Behaviour.attack(this);
                else
                    monster.attack1Behaviour.attack(this);
                Thread.sleep(2000);
                if(this.getHp()<=0)
                {
                    System.out.println(this.getName()+" was slain! The winner is "+monster.getName()+"\n" +
                            "The remaining hp is = " + monster.getHp());
                    break;
                }
                if((int)(Math.random()*2)==1)
                    this.attack2Behaviour.attack(monster);
                else
                    this.attack1Behaviour.attack(monster);
                Thread.sleep(2000);
                if(monster.getHp()<=0)
                {
                    System.out.println(monster.getName()+" was slain! The winner is "+this.getName()+"\n" +
                            "The remaining hp is = " + this.getHp());
                    break;
                }
            }
        }
    }

    //getters and setters
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getHp()
    {
        return hp;
    }
    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getProtection()
    {
        return protection;
    }
    public void setProtection(int protection)
    {
        this.protection = protection;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
}
