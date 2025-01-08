package com.example.project;

public class Main {
    public static void main(String[] args) {
        /*Fibonacci fib0 = new Fibonacci(5);
        Fibonacci fib1 = new Fibonacci(11);
        Fibonacci fib2 = new Fibonacci(20);
        Fibonacci[] fibonaccis = new Fibonacci[] {fib0, fib1, fib2};
        for(Fibonacci fib : fibonaccis){
            System.out.println(fib.getSequence().length);
        }*/
        HorseBarn barn1 = new HorseBarn(6);
        Horse Trigger = new Horse("Trigger", 1340);
        Horse Silver = new Horse("Silver",1210) ;
        Horse Lucy = new Horse("Lucy",1500);
        Horse Cotton = new Horse("Cotton", 1555);
        barn1.placeHorse(Trigger, 0);
        barn1.placeHorse(Silver, 1);
        barn1.placeHorse(Lucy, 4);
        barn1.placeHorse(Cotton, 5);
        barn1.consolidate();
        System.out.println(barn1.getStalls()[0].getName());
        System.out.println(barn1.getStalls()[1].getName());
        System.out.println(barn1.getStalls()[2].getName());
        System.out.println(barn1.getStalls()[3].getName());
    }
}
