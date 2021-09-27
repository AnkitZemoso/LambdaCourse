package com.ankit.lambdas;

public class FunctionalInterfaceAnnotations {

    @FunctionalInterface
    interface Cruncher {
        int crunch(int i,int j);
    }

    public int cruncherService(int i,int j,Cruncher cruncher){
        return cruncher.crunch(i,j);
    }

    public static void main(String[] args) {
        FunctionalInterfaceAnnotations client=new FunctionalInterfaceAnnotations();

        int ans=client.cruncherService(3,4,(p,q) -> p*q);
        System.out.println("Answer: "+ans);

        ans=client.cruncherService(3,4,(p,q) -> p+q);
        System.out.println("Answer: "+ans);

        ans=client.cruncherService(3,4,(p,q) -> p-q);
        System.out.println("Answer: "+ans);

        ans=client.cruncherService(20,4,(p,q) -> p/q);
        System.out.println("Answer: "+ans);

    }
}
