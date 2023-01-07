import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Label;

public class form1 {

    // The top-level container for the form
	protected Shell shell;
	public int round = 1;
	public int number;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtNewText;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form1 window1 = new form1();
			window1.open();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
	    // Create a display and a shell for the form
		Display display = Display.getDefault();
		createContents(number);
		
		// Open the form and start the event loop
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create the contents of the form.
	 */
	protected void createContents(int number) {
		String text_number = String.valueOf(number);
		// Create the shell for the form
		shell = new Shell();
		// Set the size and text of the form
		shell.setSize(969, 502);
		shell.setText("SWT Application");
			
		// Add a selection listener to the button
		Button btnNext = new Button(shell, SWT.NONE);
		btnNext.setText("Enter Factorial Number");
		btnNext.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        // Get the value from the input field
		        System.out.print("Close Form1\n");
		        // Close Form1
		        round++;
		        shell.close();
		        // Open Form2
		        form2 nextForm = new form2();
		        nextForm.open();
		    }
		});
		
		// แสดง Layout ที่แตกต่างกัน 	
		if(round == 1) {
			Button btnRun = new Button(shell, SWT.NONE);
			btnNext.setBounds(10, 109, 187, 30);
		} else {
			txtNewText = formToolkit.createText(shell, "New Text", SWT.NONE);
			txtNewText.setText("");
			txtNewText.setBounds(214, 80, 304, 28);
			
			Label label_number = formToolkit.createLabel(shell, text_number, SWT.NONE);
			label_number.setBounds(127, 83, 70, 20);
			
			Label label_result = formToolkit.createLabel(shell, "Result", SWT.NONE);
			label_result.setBounds(544, 83, 335, 30);
			
			
			Button btnRun = new Button(shell, SWT.NONE);
			btnRun.setBounds(36, 174, 102, 36);
			btnRun.setText("Run");
			btnRun.addSelectionListener(new SelectionAdapter() {
				int now_number = number;
				String number_stack = "";
				int countDown = number;
				int a[]=new int[number + 1];
				int result = 1;
				String number_result = "";
				String stack_text_number = "";
			    public void widgetSelected(SelectionEvent e) {
			    	String text_number = String.valueOf(now_number);
			    	if(now_number != 0) {
			    		number_stack += text_number + "|";
			    		a[now_number] = now_number;
				    	now_number--;
				    	text_number = String.valueOf(now_number);
				        txtNewText.setText(number_stack);
				        label_number.setText(text_number);
				        if(now_number == 0) {
				        	label_number.setText("0");
				        }
			    	} else {
			    		if(countDown > 0) {
			    			int i_number = a[countDown];
			    			text_number = String.valueOf(i_number);
			    			number_result += text_number;
			    			result *= i_number;
				    		//System.out.print(number_result + "|");
				    		label_result.setText(number_result + "=" + result);
				    		number_result += "x";
				    		countDown--;
				    		for(int i = countDown; i > 0; i--) {
				    			text_number = String.valueOf(a[i]);
				    			stack_text_number += text_number + "|";
				    		}
				    		txtNewText.setText(stack_text_number);
				    		stack_text_number = "";
			    		} else {
			    			label_number.setText("Finish");
			    			txtNewText.setText("Finish");
			    		}
			    	}	
			    }
			}
			);
			Label lblStack = formToolkit.createLabel(shell, "Stack", SWT.NONE);
			lblStack.setBounds(244, 10, 55, 20);	
		}
	}
}
