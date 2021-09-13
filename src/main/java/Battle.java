public class Battle{
    int RoundNum = 1;
    String Name1;
    float Attack1;
    float Defense1;
    int Hp1;
    String Name2;
    float Attack2;
    float Defense2;
    int Hp2;
    public Battle(String name1, float attack1, float defence1, float hp1,String name2, float attack2, float defence2, float hp2){
        Name1=name1;
        Attack1=attack1;
        Defense1=defence1;
        Hp1=(int)hp1;
        Name2=name2;
        Attack2=attack2;
        Defense2=defence2;
        Hp2=(int)hp2;
    }
    public boolean isMonster1Dead(){

        if(Hp1<=0){
            return true;
        } else {
            return false;
        }
    }
    public boolean isMonster2Dead(){

        if(Hp2<=0){
            return true;
        } else {
            return false;
        }
    }
    public  String getMonster1Name(){
        return Name1;
    }
    public  String getMonster2Name(){
        return Name2;
    }
    public float getMonster1HP(){ return Hp1;}
    public float getMonster2HP(){ return Hp2;}
    
    public void simulateRound(){
        float DamageOn1 = (Attack2 - Defense1);
        float DamageOn2 = (Attack1 - Defense2);
        System.out.println("Round: "+RoundNum);
        System.out.println(Name1+" does "+(int)DamageOn2+" points of damage to " + Name2);
        Hp2 = Hp2-(int)DamageOn2;
        System.out.println(Name2+" does "+(int)DamageOn1+" points of damage to " + Name1);
        Hp1 = Hp1-(int)DamageOn1;
        System.out.println(Name1+": "+Hp1);
        System.out.println(Name2+": "+Hp2);
        RoundNum++;
        System.out.println("\t");
    }
}
