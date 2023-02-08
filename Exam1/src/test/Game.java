package test;

import org.eclipse.swt.widgets.Display;
import java.lang.Math;
import java.util.ArrayList;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Decorations;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Game {

	protected Shell shell;
	private Text text_input;
	private int Max = 7;
	private int Round = 1;
	static ArrayList<String> ListGuessNumber = new ArrayList<String>();
	int Ans_Number = (int)(Math.random()*(100-1+1)+1);

	
	public static  String displayListNumber(String GussNumber) {
		String list = "";
		ListGuessNumber.add(GussNumber); 
		for (int i = 0; i < ListGuessNumber.size(); i++) {
		    list += " " +ListGuessNumber.get(i) + " |";
		}
		return list;
	}
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Game window = new Game();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lbllist = new Label(shell, SWT.NONE);
		lbllist.setText("Number Guessed:");
		lbllist.setBounds(35, 30, 603, 20);
		
		Label lblStatus = new Label(shell, SWT.NONE);
		lblStatus.setText("Enter Your Number");
		lblStatus.setBounds(35, 59, 183, 20);
		
		Label lblCanGuss = new Label(shell, SWT.NONE);
		lblCanGuss.setText(String.valueOf(Max)+" Time");
		lblCanGuss.setBounds(149, 97, 122, 20);
		
		System.out.println(Ans_Number);/////////////////////////
		
		Button btnGuessButton = new Button(shell, SWT.NONE);
		btnGuessButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String StringGuessNumber = text_input.getText();
				if(Round > Max) {
					lblStatus.setText("You Lose Aws is :" + Ans_Number);
					lblCanGuss.setText("0 Time");
					//lbllist.setText("Number Guessed:" + displayListNumber(StringGuessNumber));
					return;
				}
				if(StringGuessNumber != "" && Round <= Max) {
					int IntGuessNumber =  Integer.parseInt(StringGuessNumber);
					if(IntGuessNumber == Ans_Number) {
						lblStatus.setText("Congratulations You Win");
						lblCanGuss.setText(String.valueOf(Max - Round)+" Time");
						lbllist.setText("Number Guessed:" + displayListNumber(StringGuessNumber));
					} else if (IntGuessNumber > Ans_Number) {
						lblStatus.setText("More");
						lblCanGuss.setText(String.valueOf(Max - Round)+" Time");
						lbllist.setText("Number Guessed:" + displayListNumber(StringGuessNumber));
						Round++;
					} else if (IntGuessNumber < Ans_Number) {
						lblStatus.setText("Litter");
						lblCanGuss.setText(String.valueOf(Max - Round)+" Time");
						lbllist.setText("Number Guessed:" + displayListNumber(StringGuessNumber));
						Round++;
					}
				}else {
					lblStatus.setText("You Not Input");
				}
			}
		});
		btnGuessButton.setBounds(35, 143, 90, 30);
		btnGuessButton.setText("Guess");
		
		Button btnReset = new Button(shell, SWT.NONE);
		btnReset.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Ans_Number = (int)(Math.random()*(100-1+1)+1);
				Max = 7;
				Round = 1;
				lblCanGuss.setText(String.valueOf(Max)+" Time");
				lblStatus.setText("Enter Your Number");
				lbllist.setText("Number Guessed:");
				text_input.setText("");
				ListGuessNumber.clear();
				System.out.println(Ans_Number);
			}
		});
		btnReset.setBounds(145, 143, 90, 30);
		btnReset.setText("Reset");
		
		text_input = new Text(shell, SWT.BORDER);
		text_input.setBounds(35, 91, 78, 26);
		

	}
}
