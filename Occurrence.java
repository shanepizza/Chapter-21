class WordOccurrence implements Comparable<WordOccurrence> {
	
	String word;
	int count;
	
	WordOccurrence(String w, int c){
		word = w;
		count = c;
	}
	
	public int compareTo(WordOccurrence o1){
		if(this.count < o1.count){
			return -1;
		}else if(this.count == o1.count){
			return 0;
		}else{
			return 1;
		}
	}//end compareTo()
	
	public String getWord(){
		return word;
	}
	public  int getCount(){
		return count;
	}
	public void setWord(String w){
		word = w;
	}
	public void setCount(int c){
		count = c;
	}
	public void show(){
		System.out.print(this.word + "\t" + this.count);
	}
	
}