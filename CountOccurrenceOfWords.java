import java.util.*;

public class CountOccurrenceOfWords {
	public static void main(String[] args) {
	// Set text in a string
		String text = "Good morning. Have a good class. " +
			"Have a good visit. Have fun!";
			
	// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new TreeMap<>();
		ArrayList<WordOccurrence> list = new ArrayList<WordOccurrence>();

		String[] words = text.split("[\\s+\\p{P}]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			
		//We are using the prebuilt program even though it makes the program take longer and be less efficient. 
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				//Create object for word occurrence
					WordOccurrence stan = new WordOccurrence(key, 1);
					list.add(stan);
				}
				else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				//Create object for word occurrence
					WordOccurrence greg = new WordOccurrence(key, value);
					list.add(greg);
				}
			}
		}
	//This is where we make sure only one instance of the word shows up. 
		for(int x=0; x < list.size(); x++){
			//System.out.println("X = " + x);
			for(int y=x+1; y<list.size(); y++){
				//System.out.print("Y = " +y + ",\t");
				if(list.get(x).getWord().equals(list.get(y).getWord()) /*&& list.get(x).compareTo(list.get(y)) != 0*/){
					//System.out.println("The X and Y words at this point are Equal");
					if(list.get(x).compareTo(list.get(y)) == -1){
						list.remove(x);
					//There is probably an easier way to make it so all the numbers are checked after an index is removed. some if statment that checks to make sure X is more than 1, then, X = X-1. But this code was more simple and I am pressed for time. 
						x = 0;
						y = 0;
						//System.out.println("This is when the count for X is smaller than the count for Y");
					}else if(list.get(x).compareTo(list.get(y)) == 0){
					//This is only so the user knows what is going on if a problem happens.
						System.out.println("This happens when the counts are Equal");
						/*list.get(x).show();
						list.get(y).show();
						//System.out.println(list.get(x).getCount() + "\t" + list.get(y).getCount());*/
					}else{
					//This is here so the user knows what is happening if nothing else shows up on screen.
						System.out.println("This is what happens when X is greater than Y");
					}
				}
			}
		}//End of removing words.
		
		System.out.print("\n");
	//display list of WordOccurrence
		for(int x =0; x < list.size(); x++){
			Collections.sort(list);
			System.out.println(list.get(x).getWord() + "\t" + list.get(x).getCount());
		}
	// Display key and value for each entry
		//map.forEach((k, v) -> System.out.println(k + "\t" + v));
	}
}