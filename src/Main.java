
public class Main {

	public static void main(String[] args) {
		
		int[][] a = new int[3][4]; //3 LINES 4 COLUMNS
		
		String[][][] data = new String[3][4][2]; //3D array (24 elements (3 * 4 * 2)
		System.out.println("length: " + data.length);
		
		//INITIALIZANG 2D array
		int[][] b = {
			{1, 2, 3},
			{4, 5, 6, 9},
			{7}
		};
		
		System.out.println("Length row 1: " + a[0].length);
		System.out.println("Length row 2: " + a[1].length);
		System.out.println("Length row 2: " + a[2].length);
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}
		
		System.out.println("===========");
		// first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: b) {
            // second for...each loop access each element inside the row
            for(int dt: innerArray) {
                System.out.println(dt);
            }
        }
        
        //INITIALIZING 3D array
        int[][][] test = {
    		{
    			{1, -2, 3},
    			{2, 3, 4}
    		},
    		{
    			{-4, -5, 6,9},
    			{1},
    			{2,3}
    		}
        };
        
		System.out.println("===========");
        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
            	System.out.println("=== another array ====");
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
		System.out.println("===========");
	}

}
