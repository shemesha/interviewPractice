
public class TwoDimensionalArrayQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Original Array");
		for(int[] row: array){
			for(int col: row)
				System.out.print(col+" ");
			System.out.println();
		}
		
		int[][] rotatedArray=Question1.rotatedArray(array);
		System.out.println("Rotated Array");
		for(int[] row: rotatedArray){
			for(int col: row)
				System.out.print(col+" ");
			System.out.println();
		}
	}

}
class Question1
{
	//This question asks - Given an image represented by a N x N matrix,
	//where each pixel in the image is 4 bytes, write a method to rotate the Image by 90 degree?
	
	public static int[][] rotatedArray(int[][] orig){
		
		int[][] temp=new int[orig.length][orig.length];
		for(int x=0; x<temp.length; x++) {  //This loop starts with the initial rows
			for(int y=temp.length-1; y>=0; y--) //This loop starts at the number at the end of the row
				temp[x][temp.length-1-y]=orig[y][x];  
		}
		
		
		
		return temp;
	}
	
}