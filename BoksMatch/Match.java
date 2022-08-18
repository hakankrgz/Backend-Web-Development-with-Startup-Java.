package Giris.BoksMatch;

public class Match {

    Fighter f1 ;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1,Fighter f2, int maxWeight, int minWeight){
        this.f1= f1;
        this.f2=f2;
        this.maxWeight= maxWeight;
        this.minWeight = minWeight;
    }
    void run(){
        if (isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println("------Round------");
                int chance = Math.round((float) Math.random());
                if (chance==0){
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }

                }else if (chance==1){
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }

                }

                score();
            }
        }else {
            System.out.println("Sporcu Agırlıkları Uyusmuyor");
        }

    }
    boolean isCheck(){
        return this.f1.weight>=this.minWeight && this.f2.weight>=this.minWeight && this.f1.weight <= this.maxWeight &&this.f2.weight <= this.maxWeight;

    }
    boolean isWin(){
        if (this.f1.health==0){
            System.out.println("Macı kazanan : "+ this.f2.name);
            return true;
        }
        if (this.f2.health==0){
            System.out.println("Macı kazanan : "+ this.f1.name);
            return true;
        }
        return false;
    }

    void score(){
        System.out.println("----------");
        System.out.println(this.f1.name+" Kalan Can: "+ this.f1.health);
        System.out.println(this.f2.name+" Kalan Can: "+ this.f2.health);
    }

}
