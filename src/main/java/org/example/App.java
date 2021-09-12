package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        //storing values and assigning variables
        System.out.println("Enter a noun: ");
        String noun = scnr.nextLine();

        System.out.println("Enter a verb: ");
        String verb = scnr.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = scnr.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = scnr.nextLine();

        String sentence;
        sentence = String.format("Do you %s your %s %s %s? That's Hilarious!", verb, adjective, noun, adverb);
        //verb, adjective, noun, adverb
        System.out.println(sentence.toString());

        //"Do you " + verb + " your " + adjective + noun + adverb + "? That's Hilarious!"
        //problem above, adding space through concatenation not achievable through method. revise earlier exercise
    }
}
