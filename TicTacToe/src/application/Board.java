package application;

public class Board {
	private String[] boardArray = new String[9];

	public Board() {
		newBoard();
	}
	
	private void newBoard() {
		boardArray = new String[]{"", "", "", "", "", "", "", "", ""};
	}
	
	public String accessBoard(int position) {
		return boardArray[position];
	}
	
	public void setBoard(String player, int position) {
		boardArray[position] = player;
	}
	
	public int checkVictory() {
		for (int i = 0; i < 9; i = i + 3) {
			if (boardArray[i] == "X") {
				if ((boardArray[i+1] == "X") && (boardArray[i+2] == "X")) {
					return 1;
				}
			}
			if (boardArray[i] == "O") {
				if ((boardArray[i+1] == "O") && (boardArray[i+2] == "O")) {
					return 2;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			if (boardArray[i] == "X") {
				if ((boardArray[i+3] == "X") && (boardArray[i+6] == "X")) {
					return 1;
				}
			}
			if (boardArray[i] == "O") {
				if ((boardArray[i+3] == "O") && (boardArray[i+6] == "O")) {
					return 2;
				}
			}
		}
		if ((boardArray[0] == "X") && (boardArray[4] == "X") && (boardArray[8] == "X")) {
			return 1;
		}
		if ((boardArray[0] == "O") && (boardArray[4] == "O") && (boardArray[8] == "O")) {
			return 1;
		}
		if ((boardArray[2] == "X") && (boardArray[4] == "X") && (boardArray[6] == "X")) {
			return 1;
		}
		if ((boardArray[2] == "O") && (boardArray[4] == "O") && (boardArray[6] == "O")) {
			return 1;
		}
		return 0;
	}
}
