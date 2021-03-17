package quiz07;

import java.util.Scanner;

public class Game {

	// 원래 필요한 문장
	// private Player[] players = new Plater[ playerCount ];
	
	// field : 배열로 지정
	private Player[] players;
	private Scanner sc = new Scanner(System.in);
	
	// constructor
	// 생성자에서 배열 완성!   [ playerCount = 배열의 길이 ] 
	public Game(int playerCount) {
		players = new Player[playerCount];
	}
	
	
	// method
	public void setPlayers() {
		String[] names = { "alice", "david", "brown", "emily", "james" };
		
		for(int i = 0 ; i < players.length ; i++) {
			
//			players[i].setName(name);  : Player의 생성자가 없을 때
			players[i] = new Player(names[(int)(Math.random() * names.length)]);
		}
	}
	
	public void play() {
		
		// 플레이어들의 게임 결과가 저장될 "int 타입의 배열"이 필요.
		int [] times = new int[players.length] ;
		for (int i = 0 ; i < players.length ; i ++) {
			times[i] = players[i].play();
		}
		// times 배열에서 10과 가장 가까운 값 찾기 
		// (10이랑 가깝다는 것은 : ) times[i] - 10의 절대값을 구한 뒤 그 중 가장 작은 값(최소값)을 구해라!
		// 절대값 : Math.abs(n) : n의 절대값
		int min = Math.abs(times[0] - 10);
		int winnerNo = 0;  // 초기화
		for (int i = 1; i < times.length; i++) {
			if ( min > Math.abs(times[i] - 10) ) {
				min = Math.abs(times[i] - 10);
				winnerNo = i;
			}
		}
		for (int i = 0 ; i < players.length ; i++) {
			System.out.println(players[i].getName() + "'s result : " + times[i] + "second");
		}
		
		System.out.println(players[winnerNo].getName() + "'s victory!");
		
		
	}
	
	
	
}
