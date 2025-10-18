package champions;

import java.util.ArrayList;

public class ChampionList {
	private ArrayList<Champion> championList = new ArrayList<Champion>();
    //νεο πεδιο
	private String author; // author field 
	
	public void setAuthor (String author) {
		this.author=author;
	}
	
	public String getAuthor() {
        return author;
    }

	
	public void addChampion(Champion c) {
		championList.add(c);
	}
	
	public void printAll() {
		//νεο print author
		System.out.println("Author: " + author);
		
		System.out.println("Champion's List:");
		for (Champion c : championList) {
			System.out.println(c);
		}
	}
}
