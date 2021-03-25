package quiz03;

public class Singer {

	// field
	private String name;
	private Song song; // private Song[ ] songs; 
	
	// constructor
	public Singer(String name) {
		this.name = name;
	}
	
	// info method
	public void info() {
		System.out.print("김동률 ");
		song.info();
		
	}
	
	
	// 필수 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Song getSong() {
		return song;
	}
	// setSong method *이것을 사용하는 것.
	public void setSong(Song song) {
		this.song = song;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
