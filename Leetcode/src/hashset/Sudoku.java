package hashset;

import java.util.HashSet;

public class Sudoku {
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character>[] rows = new HashSet[9];
		HashSet<Character>[]cols = new HashSet[9];
		HashSet<Character>[]boxes = new HashSet[9];
		
		for(int i = 0 ; i < 9 ;i++) {
			rows[i]=new HashSet<>();
			cols[i]=new HashSet<>();
			boxes[i]=new HashSet<>();
			
		}
		for(int r = 0 ; r<9;r++) {
			for(int c = 0 ;c<9;c++) {
				char num = board[r][c];
				if(num == '.') {
					continue;
				}
				int boxIndex = (r/3)*3+(c/3);
				if(rows[r].contains(num)||cols[c].contains(num)||boxes[boxIndex].contains(num))
					return false;
				rows[r].add(num);
				cols[c].add(num);
				boxes[r].add( num);
				}
			}
			return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sudoku solution = new Sudoku();
		char[][] board1 = {
	            {'5','3','.','.','7','.','.','.','.'},
	            {'6','.','.','1','9','5','.','.','.'},
	            {'.','9','8','.','.','.','.','6','.'},
	            {'8','.','.','.','6','.','.','.','3'},
	            {'4','.','.','8','.','3','.','.','1'},
	            {'7','.','.','.','2','.','.','.','6'},
	            {'.','6','.','.','.','.','2','8','.'},
	            {'.','.','.','4','1','9','.','.','5'},
	            {'.','.','.','.','8','.','.','7','9'}
	        };
		System.out.println(solution.isValidSudoku(board1));

	}

}
