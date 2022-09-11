package projects;

public class Project01 {
    public static void main(String[] args){
        // Task 1
        String name = "Filiz";
        System.out.println("My name is " + name + ".");

        //Task 2
        char nameCharacter1 = 'F';
        char nameCharacter2 = 'i';
        char nameCharacter3 = 'l';
        char nameCharacter4 = 'i';
        char nameCharacter5 = 'z';
        System.out.println("My first name is " + nameCharacter1 + nameCharacter2 +
                nameCharacter3 + nameCharacter4 + nameCharacter5 + ".");
        // Task
        String myFavMovie = "The Silence of the Lambs";
        String myFavSong = "Dünyadan Uzak";
        String myFavCity ="Istanbul";
        String myFavActivity = "swimming";
        String myFavSnack = "popcorn";
        System.out.println("\tI enjoy eating " + myFavSnack +"," + " while watching my " +
                "favorite movie " + "\n\""+ myFavMovie + "\"." + " I was fascinated by the " +
                "\nscenery in the beautiful city " + "\""+ myFavCity + "\"" +"."+ " I would" +
                "\nlisten to my favorite song " + "\""+  myFavSong +"\", during my visit to \n"
                + myFavCity+ ". "+"I also enjoy " + myFavActivity + "in the ocean.\n ");
        // Task 4
        int numStateIVisited = 7;
        int mySonAge = 12;
        int numCountryVisited = 5;

        System.out.println("\tI enjoy travelling to different states. Though out my life \nI " +
            "have visited "+ numStateIVisited +" states." + "I took my son Osman to California, " +
            "\nwhen he was "+ mySonAge + " years old." + "My goal is to visit as many countries " +
            "\nas possible." + " So far I have visited "+ numCountryVisited + " countries.\n");
        // Task 5

        boolean amIAtSchoolToday = false;
        System.out.println("Am I at school today \""+ amIAtSchoolToday + "\".");

        /* Task 6 -Create a boolean called isWeatherNiceToday
        -Assign true to this variable if it is above 60F today
        -Assign false to this variable if it is below or equal to 60F today
        -Print variable value with a proper message using println() method
        -EX/ Weather is nice today = isWeatherNiceToday
         */

        boolean isWeatherNiceToday = true;
        System.out.println("Weather is nice today \"" +isWeatherNiceToday + "\""+".");

        // NOT SURE
        int weather = 60;
        boolean w = (weather <=61);
        System.out.println("Weather is nice today \"" + w +"\".");
    }
}
