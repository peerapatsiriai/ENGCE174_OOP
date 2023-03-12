import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class Lab13 {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Lab13 window = new Lab13();
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
		shell.setSize(513, 436);
		shell.setText("SWT Application");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(10, 10, 474, 61);
		
		Label lblThreadA = new Label(shell, SWT.NONE);
		lblThreadA.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblThreadA.setBounds(10, 77, 115, 50);
		lblThreadA.setText("Thread : A ");
		
		Label lblThreadB = new Label(shell, SWT.NONE);
		lblThreadB.setText("Thread : B");
		lblThreadB.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblThreadB.setBounds(10, 139, 115, 50);
		
		Label lblThreadC = new Label(shell, SWT.NONE);
		lblThreadC.setText("Thread : C ");
		lblThreadC.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblThreadC.setBounds(10, 209, 115, 50);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(10, 282, 474, 43);
		btnNewButton.setText("Start All Thread");
		
		Button btnStopeAllThread = new Button(shell, SWT.NONE);
		btnStopeAllThread.setText("Stope All Thread");
		btnStopeAllThread.setBounds(10, 336, 474, 43);
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(131, 77, 75, 50);
		btnNewButton_1.setText("Start");
		
		Button btnNewButton_1_1 = new Button(shell, SWT.NONE);
		btnNewButton_1_1.setText("Stope");
		btnNewButton_1_1.setBounds(240, 77, 75, 50);
		
		Button btnNewButton_1_2 = new Button(shell, SWT.NONE);
		btnNewButton_1_2.setText("Start");
		btnNewButton_1_2.setBounds(131, 139, 75, 50);
		
		Button btnNewButton_1_2_1 = new Button(shell, SWT.NONE);
		btnNewButton_1_2_1.setText("Start");
		btnNewButton_1_2_1.setBounds(131, 209, 75, 50);
		
		Button btnNewButton_1_1_1 = new Button(shell, SWT.NONE);
		btnNewButton_1_1_1.setText("Stope");
		btnNewButton_1_1_1.setBounds(240, 139, 75, 50);
		
		Button btnNewButton_1_1_2 = new Button(shell, SWT.NONE);
		btnNewButton_1_1_2.setText("Stope");
		btnNewButton_1_1_2.setBounds(240, 209, 75, 50);

	}
}
