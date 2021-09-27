package com.ankit.lambdas;

public class CreatingLambdas {

    interface Greeting{
        public String sayhello(String g);
    }

    public void testGreeting(String a,Greeting g){
        String result = g.sayhello(a);
        System.out.println("Result: "+result);
    }

    public static void main(String[] args) {
        new CreatingLambdas().testGreeting("Ankit",(String s) -> "Hello, "+s);
        new CreatingLambdas().testGreeting("",(String s) -> !s.isEmpty()? "Hello, "+s :"Are you missing Something");
    }
}
