package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Controller {


    @FXML
    private VBox spaceOne;

    @FXML
    private Label textOne;

    @FXML
    private VBox spaceTwo;

    @FXML
    private Label textTwo;

    @FXML
    private VBox spaceThree;

    @FXML
    private Label textThree;

    @FXML
    private VBox spaceFour;

    @FXML
    private Label textFour;

    @FXML
    private VBox spaceFive;

    @FXML
    private Label textFive;

    @FXML
    private VBox spaceSix;

    @FXML
    private Label textSix;

    @FXML
    private VBox spaceSeven;

    @FXML
    private Label textSeven;

    @FXML
    private VBox spaceEight;

    @FXML
    private Label textEight;

    @FXML
    private VBox spaceNine;

    @FXML
    private Label textNine;
    
    @FXML
    private Label printError;
    
    @FXML
    private VBox xTurnDisplay;
    
    @FXML
    private VBox oTurnDisplay;
    
    private String playerActive;
    
    private Board activeBoard;
    
    private int victoryStatus;
    
    public Controller() {
    	Board newBoard = new Board();
    	activeBoard = newBoard;
    	playerActive = "X";
    	victoryStatus = 0;
    }
    
    private void updateScreen() {
    	textOne.setText(activeBoard.accessBoard(0));
    	textTwo.setText(activeBoard.accessBoard(1));
    	textThree.setText(activeBoard.accessBoard(2));
    	textFour.setText(activeBoard.accessBoard(3));
    	textFive.setText(activeBoard.accessBoard(4));
    	textSix.setText(activeBoard.accessBoard(5));
    	textSeven.setText(activeBoard.accessBoard(6));
    	textEight.setText(activeBoard.accessBoard(7));
    	textNine.setText(activeBoard.accessBoard(8));
    	if (victoryStatus == 1) {
    		textOne.setText("Player X WINS!");
        	textTwo.setText("Player X WINS!");
        	textThree.setText("Player X WINS!");
        	textFour.setText("Player X WINS!");
        	textFive.setText("Player X WINS!");
        	textSix.setText("Player X WINS!");
        	textSeven.setText("Player X WINS!");
        	textEight.setText("Player X WINS!");
        	textNine.setText("Player X WINS!");
        	xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    	}
    	if (victoryStatus == 2) {
    		textOne.setText("Player O WINS!");
        	textTwo.setText("Player O WINS!");
        	textThree.setText("Player O WINS!");
        	textFour.setText("Player O WINS!");
        	textFive.setText("Player O WINS!");
        	textSix.setText("Player O WINS!");
        	textSeven.setText("Player O WINS!");
        	textEight.setText("Player O WINS!");
        	textNine.setText("Player O WINS!");
        	xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    	}
    }

    @FXML
    void spaceOne(MouseEvent event) {
    	printError.setText("");
	    if ((textOne.getText().equals("X")) || (textOne.getText().equals("O"))) {
	    	printError.setText("You trying to cheat?");
	    	return;
	   	} else {
	   		textOne.setText(playerActive);
	   		activeBoard.setBoard(playerActive, 0);
	    }
    	updateScreen();
    	victoryStatus = activeBoard.checkVictory();
    	if (playerActive.equals("X")) {
    		playerActive = "O";
    		xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	} else {
    		playerActive = "X";
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		xTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	}
    	updateScreen();
    }

    @FXML
    void spaceTwo(MouseEvent event) {
    	printError.setText("");
	    if ((textTwo.getText().equals("X")) || (textTwo.getText().equals("O"))) {
	    	printError.setText("You trying to cheat?");
	    	return;
	    } else {
	    	textTwo.setText(playerActive);
	    	activeBoard.setBoard(playerActive, 1);
	    }
    	updateScreen();
    	victoryStatus = activeBoard.checkVictory();
    	if (playerActive.equals("X")) {
    		playerActive = "O";
    		xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	} else {
    		playerActive = "X";
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		xTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	}
    	updateScreen();
    }
    
    @FXML
    void spaceThree(MouseEvent event) {
    	printError.setText("");
	    if ((textThree.getText().equals("X")) || (textThree.getText().equals("O"))) {
	    	printError.setText("You trying to cheat?");
	    	return;
	    } else {
	    	textThree.setText(playerActive);
	    	activeBoard.setBoard(playerActive, 2);
	    }
    	updateScreen();
    	victoryStatus = activeBoard.checkVictory();
    	if (playerActive.equals("X")) {
    		playerActive = "O";
    		xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	} else {
    		playerActive = "X";
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		xTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	}
    	updateScreen();
    }

    @FXML
    void spaceFour(MouseEvent event) {
    	printError.setText("");
	    if ((textFour.getText().equals("X")) || (textFour.getText().equals("O"))) {
	    	printError.setText("You trying to cheat?");
	    	return;
	    } else {
	   		textFour.setText(playerActive);
	   		activeBoard.setBoard(playerActive, 3);
	   	}
    	updateScreen();
    	victoryStatus = activeBoard.checkVictory();
    	if (playerActive.equals("X")) {
    		playerActive = "O";
    		xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	} else {
    		playerActive = "X";
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		xTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	}
    	updateScreen();
    }

    @FXML
    void spaceFive(MouseEvent event) {
    	printError.setText("");
	    if ((textFive.getText().equals("X")) || (textFive.getText().equals("O"))) {
	    	printError.setText("You trying to cheat?");
	    	return;
	   	} else {
	   		textFive.setText(playerActive);
	   		activeBoard.setBoard(playerActive, 4);
	    }
    	updateScreen();
    	victoryStatus = activeBoard.checkVictory();
    	if (playerActive.equals("X")) {
    		playerActive = "O";
    		xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	} else {
    		playerActive = "X";
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		xTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	}
    	updateScreen();
    }

    @FXML
    void spaceSix(MouseEvent event) {
    	printError.setText("");
	    if ((textSix.getText().equals("X")) || (textSix.getText().equals("O"))) {
	    	printError.setText("You trying to cheat?");
	    	return;
	    } else {
	    	textSix.setText(playerActive);
	    	activeBoard.setBoard(playerActive, 5);
	    }
    	updateScreen();
    	victoryStatus = activeBoard.checkVictory();
    	if (playerActive.equals("X")) {
    		playerActive = "O";
    		xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	} else {
    		playerActive = "X";
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		xTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	}
    	updateScreen();
    }

    @FXML
    void spaceSeven(MouseEvent event) {
    	printError.setText("");
	    if ((textSeven.getText().equals("X")) || (textSeven.getText().equals("O"))) {
	    	printError.setText("You trying to cheat?");
	    	return;
	    } else {
	   		textSeven.setText(playerActive);
	   		activeBoard.setBoard(playerActive, 6);
	   	}
    	updateScreen();
    	victoryStatus = activeBoard.checkVictory();
    	if (playerActive.equals("X")) {
    		playerActive = "O";
    		xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	} else {
    		playerActive = "X";
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		xTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	}
    	updateScreen();
    }

    @FXML
    void spaceEight(MouseEvent event) {
    	printError.setText("");
	    if ((textEight.getText().equals("X")) || (textEight.getText().equals("O"))) {
	    	printError.setText("You trying to cheat?");
	    	return;
	    } else {
	    	textEight.setText(playerActive);
	    	activeBoard.setBoard(playerActive, 7);
	    }
    	updateScreen();
    	victoryStatus = activeBoard.checkVictory();
    	if (playerActive.equals("X")) {
    		playerActive = "O";
    		xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	} else {
    		playerActive = "X";
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		xTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	}
    	updateScreen();
    }

    @FXML
    void spaceNine(MouseEvent event) {
    	printError.setText("");
	    if ((textNine.getText().equals("X")) || (textNine.getText().equals("O"))) {
	    	printError.setText("You trying to cheat?");
	    	return;
	    } else {
	    	textNine.setText(playerActive);
	    	activeBoard.setBoard(playerActive, 8);
	    }
    	updateScreen();
    	victoryStatus = activeBoard.checkVictory();
    	if (playerActive.equals("X")) {
    		playerActive = "O";
    		xTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		oTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	} else {
    		playerActive = "X";
    		oTurnDisplay.setStyle("-fx-background-color: #ff4500");
    		xTurnDisplay.setStyle("-fx-background-color: #90ee90");
    	}
    	updateScreen();
    }
}
