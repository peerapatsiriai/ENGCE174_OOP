import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class form2 {

    // The top-level container for the form
	protected Shell shell;
	private Text text_display;
	public int round = 1;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form2 window2 = new form2();
			window2.open();
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
		createContents();
		
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
	protected void createContents() {
		// Create the shell for the form
		shell = new Shell();
		
		// Set the size and text of the form
		shell.setSize(255, 255);
		shell.setText("SWT Application");
		
		// Create a button
		Button btnNext = new Button(shell, SWT.NONE);
		
		// Add a selection listener to the button
		btnNext.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// Get the value from the input field
				String value = text_display.getText();
				// Check value is number
				if (value.matches("[0-9]+")) {
					int number = Integer.parseInt(value);
					// Set the value of the button
			        System.out.print("Close Form2\n");
					// Close Form2
					shell.close();	
			        // Open Form 1
					form1 nextForm = new form1();
					nextForm.number = number;
					nextForm.round = 2;
			        nextForm.open();
				} else {
				    // Value is not a number
				}
			}
		});
		
		// Set the position and text of the button
		btnNext.setBounds(60, 121, 117, 30);
		btnNext.setText("Enter");
		text_display = new Text(shell, SWT.BORDER);
		text_display.setBounds(60, 74, 117, 26);
	}

	public void getValue(String value) {
		// TODO Auto-generated method stub
		System.out.print(value + "\n");
	}

	
}
