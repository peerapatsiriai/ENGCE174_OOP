package test;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class FirstGUI {

	protected Shell shell;
	private Text text_display;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FirstGUI window = new FirstGUI();
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
		
		text_display = new Text(shell, SWT.BORDER);
		text_display.setBounds(109, 37, 184, 78);
		
		Button btnWrite = new Button(shell, SWT.NONE);
		btnWrite.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        try {
		        	String currentDir = System.getProperty("user.dir");
		            File file = new File(currentDir + "/src/test/Text.txt");
		            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		            String text = text_display.getText();
		            bw.write(text);
		            bw.close();
		            System.out.println("Text written to file");
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		btnWrite.setBounds(109, 150, 90, 30);
		btnWrite.setText("Write");
		
		Button btnRead = new Button(shell, SWT.NONE);
		btnRead.addSelectionListener(new SelectionAdapter() {
		    @Override
		    public void widgetSelected(SelectionEvent e) {
		        try {
		        	String currentDir = System.getProperty("user.dir");
		            File file = new File(currentDir + "/src/test/Text.txt");
		            BufferedReader br = new BufferedReader(new FileReader(file));
		            StringBuilder sb = new StringBuilder();
		            String line = br.readLine();
		            while (line != null) {
		                sb.append(line);
		                sb.append(System.lineSeparator());
		                line = br.readLine();
		            }
		            String fileText = sb.toString();
		            text_display.setText(fileText);
		            br.close();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		btnRead.setBounds(203, 150, 90, 30);
		btnRead.setText("Read");

	}
}
