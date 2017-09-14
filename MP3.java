public class MP3 extends Item {

	private String singer;
	private int uantity;
	public MP3(String title, String geshou, int uantity,int playingTime, String comment) {
		super(title,playingTime,false,comment);

		this.singer = geshou;
		this.uantity=uantity;

	}


	public void print() {
		System.out.println("类型：MP3");
		super.print();
		System.out.println("歌曲数量："+uantity);
		System.out.println("歌手名："+singer);
	
	}
	public static void main(String[] args) {
	       MP3 mp3=new MP3("夏天的风", "Fish leong", 5,20, "......");
	       mp3.print();
		}

}
