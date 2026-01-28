package arrays;

public class LongestDiagonal {
	public static int areaOfMaxDiagonal(int[][] dimensions) {
		int maxDiagonal =0;
		int maxArea = 0;
		for(int [] rect : dimensions) {
			int l = rect [0];
			int w = rect[1];
			int diagonal = l*l  + w*w;
			int area = l * w;
			if (diagonal > maxDiagonal) {
				maxDiagonal = diagonal ;
				maxArea = area;
			}else if(maxDiagonal == diagonal) {
				maxArea = Math.max(area, maxArea);
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areaOfMaxDiagonal(new int[][] {{9,3},{8,6}}));

	}

}
