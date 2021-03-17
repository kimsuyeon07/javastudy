package quiz08;


public class Singer {

	// field
	private String name;
	private Song[] songs;
	private int idx;
	
	
	// constructor
	public Singer(String name, int songCount) {
		this.name = name;
		songs = new Song[songCount];
	}
	
	
	// method
	public void addSong(Song song) {
		if (idx < songs.length) {
			songs[idx++] = song;  
		} else { System.out.println("더 이상 노래를 추가할 수 없습니다."); }
		
		// addSong을 할 때마다 idx를 더해주겠다. (최대 songCount 숫자만큼 더할 수 있다.)
		// addSong() 호출마다 idx가 증가하므로, idx는 추가된 노래의 개수를 의미!
			
	}
			
			
			
		
		
	// info method
	public void info() {
		
		// 가수명, 노래목록
		System.out.println("아티스트 : " + name);
		System.out.println("==== 노래목록 ====");
		
		// 1. 출력방식 (둘 다 사용할 수 있다.)
//		for (int i = 0 ; i < songs.length ; i++) {
//			if(songs[i] != null) {
//				songs[i].info();
//			}
			// null.info();  ==> NullPointException
//		}
		// 2. 출력방식
		for(int i  = 0; i < idx; i++) {
			songs[i].info();
		}
				
	}
}
