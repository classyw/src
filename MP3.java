public class MP3 extends Item {

	private String singer;
	private int uantity;
	public MP3(String title, String geshou, int uantity,int playingTime, String comment) {
		super(title,playingTime,false,comment);

		this.singer = geshou;
		this.uantity=uantity;

	}


	public void print() {
		System.out.println("���ͣ�MP3");
		super.print();
		System.out.println("����������"+uantity);
		System.out.println("��������"+singer);
	
	}
	public static void main(String[] args) {
	       MP3 mp3=new MP3("����ķ�", "Fish leong", 5,20, "......");
	       mp3.print();
		}

}
