package variables;

public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Dominic
    Date: 07/09/2021
     */

    private final String name1 = "Dominic";
    private final String name2 = "Cissy";
    private final String adjective1 = "jumpy";
    private final String adjective2 = "billowy";
    private final String adjective3 = "educational";
    private final String noun1 = "supermarket";
    private final String noun2 = "girl";
    private final String noun3 = "tea";
    private final String noun4 = "county";
    private final String noun5 = "membership";
    private final String noun6 = "manufacturer";
    private final String verb1 = "like";
    private final String place1 = "Edinburgh";
    private final int number = 10;


    //The template for the story
    String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' " +
            "Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" " +
            "to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". " +
            "Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped " +
            ""+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", " +
            "in a world where "+noun6+"s ruled the world.";

    public static void main(String[] args) {
        MadLibs madLibs = new MadLibs();
        System.out.println(madLibs.story);
    }
}
