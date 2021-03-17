package quiz03;

public class Song {

	
	// field

	private String title;
	private double playTime; // 3분50초 => 3.50
	
	// constructor
	public Song(String title, double playTime) {
		this.title = title;
		this.playTime = playTime;
	}
	
	// method
	public void info() {
		System.out.println("("+ title +", "+ playTime +")");
	}
	
	
	
	
	// 필수 메서드
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPlayTime() {
		return playTime;
	}
	
	public void setPlayTime(double playTime) {
		this.playTime = playTime;
	}
	
	
	
}
