package Giris.BoksMatch;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;


    double dodge;


    Fighter(String name, int damage, int health, int weight,double dodge ){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (this.dodge<=100 && this.dodge>=0){
            this.dodge=dodge;
        }



    }

    boolean isDodge(){
        double randomValue = Math.random()*100;
        return randomValue<=this.dodge;
    }
    int hit(Fighter foe){

        System.out.println(this.name + " => " + foe.name + " 'e " + this.damage + " hasar vurdu.");

        if (isDodge()){
            System.out.println(foe.name +" Hasar blokladi.");
            return foe.health;
        }if (foe.health-this.damage<0){
            return 0;
        }
        return foe.health -this.damage;
    }
}