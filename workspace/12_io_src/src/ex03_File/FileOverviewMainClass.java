package ex03_File;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
   	File 클래스 _함께 사용하기 위한 스트림
   	1. 파일을 조작하는 클래스입니다.
   	2. 파일 생성, 삭제, 파일명, 파일크기, 수정날짜 등의 확인이 가능합니다.
 */

public class FileOverviewMainClass {

	public static void main(String[] args) {

		// 폴더 : 디렉터리 조작
		File dir = new File("C:\\MyTemp"); // 경로 구분     :   ( \\ ) == ( File.separator )
//		File dir = new File("C:" + File.separator + "MyTemp");  // Linux와 Windows 호환용
		// My Temp : 임시 폴더라는 의미
		// windows => \\   |  Linux(리눅스) => \  (git.bash >> 리눅스기반으로 만들어졌다.) // File.separator => 구분자
		
		System.out.println(dir.exists());  // 존재하는 경로이면 true 반환, 아니라면 false 반환
		
		if (dir.exists() == false) { // if ( !dir.exists() : Not연산자 ) {
			dir.mkdirs();  // dir 디렉터리를 생성합니다.
			System.out.println("My Temp 디렉터리가 생성되었습니다.");
		} 
//		if (dir.exists() == true) { // if ( dir.exists() ) { ** 주석 코드가 더 좋습니다.
//			dir.delete();  // dir 디렉터리를 삭제합니다.
//			System.out.println("My Temp 디렉터리가 삭제되었습니다.");
//		}
		
		
		
		
		
		// 파일 조작 : 3가지 모두 동일한 결과를 출력한다.
		File file = new File ("C:\\MyTemp\\MyFile.txt");
		
//		File file = new File("C:\\MyTemp", "MyFile.txt");
		// File file = new File(parent : 폴더, child : 파일);
		
//		File file = new File(dir, "MyFile.txt");  
		// (먼저 선언 후 : 폴더 경로) =>  File dir = new File("C:\\MyTemp");
		
		System.out.println(file.exists()); // dir 폴더에 파일이 있는지?

		try {
			if (file.exists() == false) {  // if ( !file.exists() ) {
				file.createNewFile();  // 내용이 없는 파일을 생성합니다. 
			}                          // => 출력스트림으로 만들 수 있습니다. (해당 코드는 굳이 사용하지 않아도 됩니다.)
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		System.out.println(file.getAbsolutePath()); // C:\MyTemp\MyFile.txt
		System.out.println(file.getPath());         // C:\MyTemp\MyFile.txt
		System.out.println(file.getParent());       // C:\MyTemp
		System.out.println(file.getName());         // MyFile.txt
		System.out.println(file.length());          // 0
		System.out.println( new Date(file.lastModified()) );    // 1616978472783  :  TimeSteamp 값  
		                                                        // => 2021-03-29 로변환       ↓   
		                                                        //  import java.sql.Date;
                                                                // new Date(file.lastModified())	
		// 파일을 만든 시간으로 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm"); 
		System.out.println( sdf.format( new Date(file.lastModified()) ) ); 
		
		
		
		// 리뷰 개념으로 사용
		// 디텍터리 내의 모든 디렉터리와 파일 목록 출력하기
		File javaDir = new File("C:\\Program Files\\Java\\jdk1.8.0_202");
		File[] files = javaDir.listFiles();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (File f : files) {
			System.out.print( sdf2.format (new Date(f.lastModified())) + " " );
			if (f.isDirectory()) {
				System.out.print("<DIR>  " + "    ");
			} else {
				System.out.print("       " +  new DecimalFormat("#,##0").format( f.length()) );
			}
			System.out.println("  " + f.getName());
		}

		
		
		
		
		
		
	}
}
