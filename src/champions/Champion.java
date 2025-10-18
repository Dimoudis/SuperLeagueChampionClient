package champions;

public class Champion {
	
	private String name;
	private String year;
	private String url;
	
	//constructor 
	public Champion(String name, String year, String url) {
		this.name=name;
		this.year=year;
		this.url=url;	
	}
	
    //print
    @Override
    public String toString() {
        return "\tΟμάδα: " + name + ", Έτος: " + year + ", Εικόνα: " + url;
    }
	
}
