
public class DVD extends Item {
//	private String title;
	private String director;
	
//	private int playingTime;
//	private boolean gotIt;
	private String comment ;

	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,false,comment);
//		this.title = title;
		this.director = director;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	public static void main(String[] args) {
       DVD dvd=new DVD("LYF", "YM",  20, "......");
       dvd.print();
	}

	public void print() {
		
		System.out.print("DVD:");
		super.print();
		System.out.print(director);
	}

}
