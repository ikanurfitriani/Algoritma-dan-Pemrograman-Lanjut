public class uts3 {
	public static void main(String[] args){
		int [][] nilai = {{0,1,2,3},{0,1,2}};
		for (int i =0; i < nilai[0].length; i++){
			for(int j = 0; j < nilai[1].length; j++){
				System.out.println("Perulangan [x=" +i+ ",y=" +j+ "]");
			}
		}
	}
}