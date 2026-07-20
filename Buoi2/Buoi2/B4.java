package Buoi2;

public class B4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a =1 ;
        long b =1;
        long c;
        System.out.println("Day 90 so fibo dau tien la:");
        for(int i=1;i<=45;i+=2){
            System.out.print(" "+a);
            c = a+b;
            a = b;
            b = c;
        }
        System.out.print("\n");
	}

}
