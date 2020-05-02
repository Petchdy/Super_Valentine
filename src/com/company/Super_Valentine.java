package com.company;

public abstract class Super_Valentine {
    private String name;
    private int age;
    private int position;

    public Super_Valentine(String name, int age, int position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void printInfo(){

    }

    public void singName(){

    }

    public void singing(int repeat,int verse){
        for (int i = 0;i<repeat;i++){
            if (verse==0){
                System.out.println("La La La");
            }
            else {
                System.out.println("Super Valentine");
            }
        }
    }
    public void singing(String name){
        System.out.println("Ma Gub "+name);
    }
    public void singing(String name1,String name2){
        System.out.println("Ma Gub "+name1+""+"Laew Gor Ma Gub"+""+name2);
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void  setAge(){
        this.age = age;
    }

    public String getPosition(){
        if (position==0){
            return "Center";
        }
        else {
            return "Dancer";
        }
    }
    public void setPosition(){
        this.position = position;
    }

}
