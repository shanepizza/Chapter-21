import java.util.Scanner;import java.util.*;


public class Redone_GetCapitol {
  public static void main(String[] args) {
    Map<String, String> guessTheState = new HashMap<>();
  
    String[][] stateCapital = {
      {"Alabama", "Montgomery"},
      {"Alaska", "Juneau"},
      {"Arizona", "Phoenix"},
      {"Arkansas", "Little Rock"},
      {"California", "Sacramento"},
      {"Colorado", "Denver"},
      {"Connecticut", "Hartford"},
      {"Delaware", "Dover"},
      {"Florida", "Tallahassee"},
      {"Georgia", "Atlanta"},
      {"Hawaii", "Honolulu"},
      {"Idaho", "Boise"},
      {"Illinois", "Springfield"},
      {"Indiana", "Indianapolis"},
      {"Iowa", "Des Moines"},
      {"Kansas", "Topeka"},
      {"Kentucky", "Frankfort"},
      {"Louisiana", "Baton Rouge"},
      {"Maine", "Augusta"},
      {"Maryland", "Annapolis"},
      {"Massachusettes", "Boston"},
      {"Michigan", "Lansing"},
      {"Minnesota", "Saint Paul"},
      {"Mississippi", "Jackson"},
      {"Missouri", "Jefferson City"},
      {"Montana", "Helena"},
      {"Nebraska", "Lincoln"},
      {"Nevada", "Carson City"},
      {"New Hampshire", "Concord"},
      {"New Jersey", "Trenton"},
      {"New York", "Albany"},
      {"New Mexico", "Santa Fe"},
      {"North Carolina", "Raleigh"},
      {"North Dakota", "Bismarck"},
      {"Ohio", "Columbus"},
      {"Oklahoma", "Oklahoma City"},
      {"Oregon", "Salem"},
      {"Pennsylvania", "Harrisburg"},
      {"Rhode Island", "Providence"},
      {"South Carolina", "Columbia"},
      {"South Dakota", "Pierre"},
      {"Tennessee", "Nashville"},
      {"Texas", "Austin"},
      {"Utah", "Salt Lake City"},
      {"Vermont", "Montpelier"},
      {"Virginia", "Richmond"},
      {"Washington", "Olympia"},
      {"West Virginia", "Charleston"},
      {"Wisconsin", "Madison"},
      {"Wyoming", "Cheyenne"},
      {"Washington D.C.", "Hell"}
    };
    
    for(int x =0; x < 51; x++){
      guessTheState.put(stateCapital[x][0].toLowerCase(), stateCapital[x][1]);
    }

    Scanner input = new Scanner(System.in);
  //Rocky updated this part and I need to look at it so I understand what she did so I don't run into the problem again.
    String state = "";
    int easterEgg = 0;
    do{
      if(easterEgg == 4){
        System.out.println("What state does Washington D.C. belong to? \n");
      }
      
      System.out.print("What state capitol are you looking for? (Enter -1 to stop): ");
      state = input.nextLine().trim().toLowerCase();
      
      if(guessTheState.containsKey(state) == true ){
        boolean hell = false;
        if(state.equals("washington d.c.")){
          System.out.println("Washington D.C. is the Capitol of the state of Hell. \n");
          hell = true;
        }
          if(hell == false){
            System.out.println("The capitol for that state is: " + guessTheState.get(state) + "\n");
          }
      }else if(guessTheState.containsKey(state) == false && !state.equals("-1")){
        System.out.println("Sorry, that is not a state in the United States of America.\n");
      }else{
        System.out.print("End Program."); 
      }
      
      easterEgg++;
    }while(!state.equals("-1"));
    
    
    
  }
}
