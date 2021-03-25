package ex03_generic;

public class Box <T>{

	// private T[] items = new T[10]; => 오류; 
	// ↓
	// => 먼저 시작>> Box<String> box = new Box<>(); // 정보를 미리 알 수 없어서 오류.
	// compile time [ private T[] items ] → run time [ Box<String> box = new Box<>() ] 순서이기 때문에.



	// field
	private T[] items;
	private int idx;

	// constructor
	public Box(int itemCount) {
		// items = new T[itemCount]; 
		// ==> 코드 작성 시점에는 T의 구체적인 종류(타입)를 알 수 없어서, 메모리 할당이 불가능하다.
		
		items = (T[])(new Object[itemCount]);  // Object 배열 생성 뒤에는 캐스팅을 해 줘야 한다. : (T[])
	}

	
	// method : addItem()
	public void addItem(T item) {
		if (idx == items.length ) {
			System.out.println("Full");
			return;
		}
		items[idx++] = item;
	}


	// method : toString() : Override
	@Override
	public String toString() {
		
		String result = "";
		
		for (T item : items) {
			if (item != null) {
				result += item.toString();  // item.toString() => Fruit의 toString() 의미
			}
		}
		return result;
	}
		
	
		
	
	
	
	
}
