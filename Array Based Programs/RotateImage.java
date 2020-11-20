
import java.util.Arrays;

/*
 * Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.
You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Example
For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
the output should be

rotateImage(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]
 */
public class RotateImage {

	public static int[][] rotateImage(int[][] a) {
		int length = a.length;
		for(int i=0; i<length; i++){
			for(int j=i; j<length; j++){
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		for(int i=0; i<length; i++){
			for(int j=0; j<length/2; j++){
				int temp = a[i][j];
				a[i][j] = a[i][length -1 -j];
				a[i][length - 1 -j] = temp;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(rotateImage(new int[][] {{1, 2, 3},{4, 5, 6},{7, 8, 9}})));
	}

}
