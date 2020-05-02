package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Center Jane = new Center("Jane",18,0,3.65,"Science");
        Dancer Nun = new Dancer("Nun",26,1,"Taxi Driver",15000);
        Dancer Bow = new Dancer("Bow",31,1,"MC",25000);
        if(Jane.honor()==1){
            System.out.println("The honor number 1");
        }else if(Jane.honor()==2) {
            System.out.println("The honor number 2");
        }
        else{
            System.out.println("Normal Student");
        }
        System.out.println("Nun Bonus : "+Nun.bonus());
        System.out.println("Bow Bonus : "+Bow.bonus());
    }
}
