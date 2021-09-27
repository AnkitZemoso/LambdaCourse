package com.ankit.lambdas;

public class LambdaScope extends SuperScope{

    private String member = "Grandpa";

    interface Family {
        String who(String member);
    }

    public void testMember(String member){
        System.out.println("Local Member : "+member);
        System.out.println("Family Member : "+this.member);
        System.out.println("Family Super Member : "+super.member);

        Family familyLambda = (familyMember) -> {
            System.out.println("Local lambda member: "+familyMember);
            System.out.println("Local lambda member: "+member);
            System.out.println("Local lambda this.member: "+this.member);
            System.out.println("Local lambda super.member: "+super.member);

            return familyMember;
        };
        familyLambda.who(member);
    }

    public static void main(String[] args) {
        new LambdaScope().testMember("Son");
    }
}
