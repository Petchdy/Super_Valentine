package com.company;

public class Dancer extends Super_Valentine implements Dance{
    private String sideJob;
    private int sideSalary;

    public Dancer(String name, int age, int position,String sideJob,int sideSalary) {
        super(name, age, position);
        this.sideJob = sideJob;
        this.sideSalary = sideSalary;
    }

    @Override
    public void dancing() {
        System.out.println("Ma Ma Ma Ork Ma Ten");
    }

    @Override
    public void printInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Position : " + getPosition());
        System.out.println("sideJob : " + sideJob);
        System.out.println("sideSalary : " + sideSalary);
    }

    @Override
    public void singName(){
        System.out.print(getName() + " Ka " + getName() + " Ka " + getName() + " Ka ");
        System.out.println(" Nue Chue " + getName());
    }

    public double bonus(){
        return sideSalary*6*0.5;//ในโจทย์พี่เขียนว่าให้คูณ12แต่๕ูรแล้วกันเขียนในต.ย.เพ็ชรเลยเปลี่ยนเป็น6มันจะได้พอดีไม่แน่ใจว่าผิดตรงไหน
    }

    public String getSideJob(){
        return sideJob;
    }

    public int getSideSalary(){
        return sideSalary;
    }
}
