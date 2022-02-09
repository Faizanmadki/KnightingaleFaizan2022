package day3;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(;;) {
//		System.out.println("infinite loop..");
//	}
	
	for(int i=0;i<10;i++) {
		System.out.println(i);
	}
	
	//NESTED
	
	for(int i=0;i<10;i++) {
		for(int j=0;j<10;j++) {
			System.out.print(j+"  ");
		}
		System.out.println();
	}

	}

}
