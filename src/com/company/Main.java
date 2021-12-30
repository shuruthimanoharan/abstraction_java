package com.company;

abstract class Bike
{

    abstract void speed();


}


    class Rx100 extends Bike
    {

        void speed()
        {
            System.out.println("speed is high");
        }
    }

    class Pulsar extends Bike {

        void speed() {
            System.out.println("speed is low");
        }
    }


    public class Main {

        public static void main(String args[]) {
            Bike bike1 = new Rx100();
            bike1.speed();
            Bike bike2 = new Pulsar();
            bike2.speed();
        }
    }
