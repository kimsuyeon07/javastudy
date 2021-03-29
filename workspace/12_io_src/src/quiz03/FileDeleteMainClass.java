package quiz03;

import java.io.File;

public class FileDeleteMainClass {

	public static void main(String[] args) {

		// C:\\MyTemp 디렉터리를 삭제합니다.
		
		File dir = new File("C:\\MyTemp");
		
		if (dir.exists()) {
			File[] files = dir.listFiles();
			for ( File file : files) {
				if (file.isFile()) {
					System.out.println(file.getName() + "파일을 삭제합니다.");
				} else {
					System.out.println(dir.getName() + "디렉터리를 삭제합니다.");
				}
				file.delete();
			}
			dir.delete();
			System.out.println(dir.getName() + "디렉터리가 삭제되었습니다.");
		}  // MyTemp폴더 내부에 파일 존재하여 해당 폴더가 지워지지 않는다.
					
					
		
		
		
		
		
		
		
		
		
		
		
	}
}
