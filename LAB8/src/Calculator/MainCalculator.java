package Calculator;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.JOptionPane;

import org.eclipse.core.internal.databinding.conversion.NumberToIntegerConverter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.wb.swt.SWTResourceManager;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

public class MainCalculator {

	protected Shell shlCalcu;
	public double result;
	public String tempStr = "";
	public String tempStr2 = "";
	public String oparation;
	public String Stroparation;
	public boolean StateOp = false ;
	public String answer;
	public double var1 = 0 , var2 = 0;
	public String tempAnswer ;
	public Double tempRadians ;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainCalculator window = new MainCalculator();
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
		shlCalcu.open();
		shlCalcu.layout();
		while (!shlCalcu.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	
	protected void createContents() {
		shlCalcu = new Shell();
		shlCalcu.setText("Calculator");
		shlCalcu.setSize(557, 368);
		shlCalcu.setTouchEnabled(true);
		shlCalcu.setModified(true);
		shlCalcu.setImage(SWTResourceManager.getImage("C:\\Users\\tEErawat\\OneDrive\\เดสก์ท็อป\\OOP\\1200px-Circle-icons-calculator.svg.png"));
		shlCalcu.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shlCalcu.setLayout(null);
		Composite panalMain = new Composite(shlCalcu, SWT.NONE);
		panalMain.setBounds(0, 0, 550, 337);
		panalMain.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		panalMain.setLayout(null);
		
		Label lblShowText = new Label(panalMain, SWT.NONE);
		lblShowText.setAlignment(SWT.RIGHT);
		lblShowText.setFont(SWTResourceManager.getFont("Unispace", 20, SWT.BOLD));
		lblShowText.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblShowText.setBounds(10, 10, 528, 76);
		
		
		Label lblText1 = new Label(panalMain, SWT.NONE);
		lblText1.setBounds(10, 347, 55, 15);
		lblText1.setText("");
		
		Label lblText2 = new Label(panalMain, SWT.NONE);
		lblText2.setBounds(83, 347, 55, 15);
		lblText2.setText("");
		
		// button 0
		Button btnNum0 = new Button(panalMain, SWT.NONE);
		btnNum0.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnNum0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( tempStr != "" ) {
					if( StateOp == false ) {
						tempStr += btnNum0.getText();
						lblShowText.setText(tempStr);
						lblText1.setText(tempStr);
					}else {
						tempStr += btnNum0.getText();
						tempStr2 = tempStr2 + btnNum0.getText();
						lblShowText.setText(tempStr2);
						lblText2.setText(tempStr);
					}//end else
				} /*end if*/ 
			}//end method 
		});
		btnNum0.setText("0");
		btnNum0.setBounds(10, 272, 195, 54);
		
		// button 1
		Button btnNum1 = new Button(panalMain, SWT.NONE);
		btnNum1.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnNum1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( StateOp == false ) {
					tempStr += btnNum1.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum1.getText();
					tempStr2 = tempStr2 + btnNum1.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}//end else
			}//end method 
		});
		btnNum1.setText("1");
		btnNum1.setBounds(10, 212, 61, 54);
		
		// button 2
		Button btnNum2 = new Button(panalMain, SWT.NONE);
		btnNum2.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnNum2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText();
				if( StateOp == false ) {
					tempStr += btnNum2.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum2.getText();
					tempStr2 = tempStr2 + btnNum2.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}//end else
			}//end method 
		});
		btnNum2.setText("2");
		btnNum2.setBounds(77, 212, 61, 54);
				
		// button 3
		Button btnNum3 = new Button(panalMain, SWT.NONE);
		btnNum3.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnNum3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( StateOp == false ) {
					tempStr += btnNum3.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum3.getText();
					tempStr2 = tempStr2 + btnNum3.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}//end else
			}//end method 
		});
		btnNum3.setText("3");
		btnNum3.setBounds(144, 212, 61, 54);
				
		// button 4
		Button btnNum4 = new Button(panalMain, SWT.NONE);
		btnNum4.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnNum4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText();
				if( StateOp == false ) {
					tempStr += btnNum4.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum4.getText();
					tempStr2 = tempStr2 + btnNum4.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}//end else
			}//end method 
		});
		btnNum4.setText("4");
		btnNum4.setBounds(10, 152, 61, 54);
		
		// button 5
		Button btnNum5 = new Button(panalMain, SWT.NONE);
		btnNum5.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnNum5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText();
				if( StateOp == false ) {
					tempStr += btnNum5.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum5.getText();
					tempStr2 = tempStr2 + btnNum5.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}//end else
			}//end method 
		});
		btnNum5.setText("5");
		btnNum5.setBounds(77, 152, 61, 54);
		
		// button 6
		Button btnNum6 = new Button(panalMain, SWT.NONE);
		btnNum6.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnNum6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( StateOp == false ) {
					tempStr += btnNum6.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum6.getText();
					tempStr2 = tempStr2 + btnNum6.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}//end else
			}//end method 
		});
		btnNum6.setText("6");
		btnNum6.setBounds(144, 152, 61, 54);
		
		// button 7 
		Button btnNum7 = new Button(panalMain, SWT.NONE);
		btnNum7.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnNum7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText();
				if( StateOp == false ) {
					tempStr += btnNum7.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum7.getText();
					tempStr2 = tempStr2 + btnNum7.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}//end else
			}//end method 
		});
		btnNum7.setBounds(10, 92, 61, 54);
		btnNum7.setText("7");
		
		// button 8
		Button btnNum8 = new Button(panalMain, SWT.NONE);
		btnNum8.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnNum8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( StateOp == false ) {
					tempStr += btnNum8.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				}else {
					tempStr += btnNum8.getText();
					tempStr2 = tempStr2 + btnNum8.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}//end else
			}//end method 
		});
		btnNum8.setText("8");
		btnNum8.setBounds(77, 92, 61, 54);
		
		// button 9
		Button btnNum9 = new Button(panalMain, SWT.NONE);
		btnNum9.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnNum9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String str = lblShowText.getText(); 
				if( StateOp == false ) {
					tempStr += btnNum9.getText();
					lblShowText.setText(tempStr);
					lblText1.setText(tempStr);
				} else {
					tempStr += btnNum9.getText();
					tempStr2 = tempStr2 + btnNum9.getText();
					lblShowText.setText(tempStr2);
					lblText2.setText(tempStr);
				}// end else 
			}//end method 
		});
		btnNum9.setText("9");
		btnNum9.setBounds(144, 92, 61, 54);
		
		// button +
		Button btnPlus = new Button(panalMain, SWT.NONE);
		btnPlus.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnPlus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="+";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr+oparation;
						Stroparation = tempStr2 + btnPlus.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnPlus.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} // end else 
				} //end if
			}
		});
		btnPlus.setText("+");
		btnPlus.setBounds(211, 92, 61, 54);
		
		// button -
		Button btnMinus = new Button(panalMain, SWT.NONE);
		btnMinus.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnMinus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="-";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr + oparation;
						Stroparation = tempStr2 + btnMinus.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnMinus.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					}// end else
				} /*end if */else {
					tempStr = btnMinus.getText();
					lblShowText.setText(tempStr);
				}//end else 
			}//end method 
		});
		btnMinus.setText("-");
		btnMinus.setBounds(278, 92, 61, 54);
		
		// button *
		Button btnMultiply = new Button(panalMain, SWT.NONE);
		btnMultiply.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnMultiply.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="*";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr+oparation;
						Stroparation = tempStr2 + btnMultiply.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnMultiply.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					}//end else
				} //end if
			}//end method
		});
		btnMultiply.setText("*");
		btnMultiply.setBounds(211, 152, 61, 54);
		
		// button /
		Button btnDivide = new Button(panalMain, SWT.NONE);
		btnDivide.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnDivide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="/";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr+oparation;
						Stroparation = tempStr2 + btnDivide.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					}/* end if */ else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnDivide.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} // end else 
				}// end if
			}//end method 
		});
		btnDivide.setText("/");
		btnDivide.setBounds(278, 152, 61, 54);
		
		// button =
		Button btnTotal = new Button(panalMain, SWT.CENTER);
		btnTotal.setFont(SWTResourceManager.getFont("Unispace", 78, SWT.BOLD));
		btnTotal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( answer == null ) {
					if( oparation == "+" ) {
						result = Double.parseDouble(lblText1.getText()) + Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( lblText1.getText() + " + " + lblText2.getText() + " = " +  "\n" + answer );
					} else if( oparation == "-" ) {
						result = Double.parseDouble(lblText1.getText()) - Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( lblText1.getText() + " - " + lblText2.getText() + " = " +  "\n" + answer );
					} else if( oparation == "*" ) {
						result = Double.parseDouble(lblText1.getText()) * Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( lblText1.getText() + " * " + lblText2.getText() + " = " +  "\n" + answer );
					} else if( oparation == "/" ) {
						result = Double.parseDouble(lblText1.getText()) / Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( lblText1.getText() + " / " + lblText2.getText() + " = " +  "\n" + answer );
					} else if( oparation == "Min" ) {
						result = Math.min(Double.parseDouble(lblText1.getText()) , Double.parseDouble(lblText2.getText()) );
						answer = String.format("%.2f", result);
						lblShowText.setText( lblText1.getText() + " Min " + lblText2.getText() + " = " +  "\n" + answer );
					} else if( oparation == "Max" ) {
						result = Math.max(Double.parseDouble(lblText1.getText()) , Double.parseDouble(lblText2.getText()) );
						answer = String.format("%.2f", result);
						lblShowText.setText( lblText1.getText() + " Min " + lblText2.getText() + " = " +  "\n" + answer );
					} else if( oparation == "sqrt" ) {
						result = Math.sqrt(Double.parseDouble( lblText1.getText() ));
						answer = String.format("%.2f", result);
						lblShowText.setText( answer );
						tempStr = "0" ;
					} else if( oparation == "abs" ) {
						result = Math.abs(Double.parseDouble( lblText1.getText() ));
						answer = String.format("%.2f", result);
						lblShowText.setText( tempStr2 + " = " + "\n" + answer );
						tempStr = "0" ;
					} else if( oparation == "sin" ) {
						result = Math.sin( Double.parseDouble(lblText1.getText()) );
						answer = String.format("%.4f", result);
						lblShowText.setText( tempStr2 + " = " + "\n" +  answer );
						tempStr = "0" ;
					} else if( oparation == "cos" ) {
						result = Math.cos( Double.parseDouble(lblText1.getText()) );
						answer = String.format("%.4f", result);
						lblShowText.setText( tempStr2 + " = " + "\n" +  answer );
						tempStr = "0" ;
					} else if( oparation == "tan" ) {
						result = Math.tan( Double.parseDouble(lblText1.getText()) );
						answer = String.format("%.4f", result);
						lblShowText.setText( tempStr2 + " = " + "\n" +  answer );
						tempStr = "0" ;
					}//end else if 
				}else {
					if( oparation == "+" ) {
						tempAnswer = answer;
						result = Double.parseDouble(answer) + Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( tempAnswer + " + " + lblText2.getText() + " = " +  "\n" + answer );
					}else if( oparation == "-" ) {
						tempAnswer = answer;
						result = Double.parseDouble(answer) - Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( tempAnswer + " - " + lblText2.getText() + " = " +  "\n" + answer );
					}else if( oparation == "*" ) {
						tempAnswer = answer;
						result = Double.parseDouble(answer) * Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( tempAnswer + " * " + lblText2.getText() + " = " +  "\n" + answer );
					}else if( oparation == "/" ) {
						tempAnswer = answer;
						result = Double.parseDouble(answer) / Double.parseDouble(lblText2.getText()) ;
						answer = String.format("%.2f", result);
						lblShowText.setText( tempAnswer + " / " + lblText2.getText() + " = " +  "\n" + answer );
					}else if( oparation == "Min" ) {
						tempAnswer = answer;
						result = Math.min( Double.parseDouble(answer) , Double.parseDouble(lblText2.getText()) );
						answer = String.format("%.2f", result);
						lblShowText.setText( tempAnswer + " Min " + lblText2.getText() + " = " +  "\n" + answer );
					}else if( oparation == "Max" ) {
						tempAnswer = answer;
						result = Math.max( Double.parseDouble(answer) , Double.parseDouble(lblText2.getText()) );
						answer = String.format("%.2f", result);
						lblShowText.setText( tempAnswer + " Max " + lblText2.getText() + " = " +  "\n" + answer );
					}else if( oparation == "sqrt" ) {
						tempAnswer = answer;
						result = Math.sqrt( Double.parseDouble( answer ) );
						answer = String.format("%.2f", result);
						lblShowText.setText( answer );
						tempStr = "0" ;
					}else if( oparation == "abs" ) {
						tempAnswer = answer;
						result = Math.abs( Double.parseDouble( answer ) );
						answer = String.format("%.2f", result);
						lblShowText.setText( tempStr2 + " = " + "\n" + answer );
						tempStr = "0" ;
					}else if( oparation == "sin" ) {
						tempAnswer = answer;
						result = Math.sin( Double.parseDouble( answer ) );
						answer = String.format("%.4f", result);
						lblShowText.setText( tempStr2 + " = " + "\n" +  answer );
						tempStr = "0" ;
					}else if( oparation == "cos" ) {
						tempAnswer = answer;
						result = Math.cos( Double.parseDouble( answer ) );
						answer = String.format("%.4f", result);
						lblShowText.setText( tempStr2 + " = " + "\n" +  answer );
						tempStr = "0" ;
					}else if( oparation == "tan" ) {
						tempAnswer = answer;
						result = Math.tan( Double.parseDouble( answer ) );
						answer = String.format("%.4f", result);
						lblShowText.setText( tempStr2 + " = " + "\n" +  answer );
						tempStr = "0" ;
					}//end else if 
				}// end else 
				//lblText1.setText("");
				lblText2.setText("");
				StateOp = false;
			}// end method 
		});
		btnTotal.setText("=");
		btnTotal.setBounds(345, 212, 193, 114);
		btnTotal.setBackground( new Color(240, 128, 128) );
		Button btnMin = new Button(panalMain, SWT.NONE);
		btnMin.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnMin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="Min";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr+oparation;
						Stroparation = tempStr2 + btnMin.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnMin.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					}// end else 
				} //end if
			}// end method 
		});
		btnMin.setBounds(211, 212, 128, 54);
		btnMin.setText("Min");
		
		Button btnMax = new Button(panalMain, SWT.NONE);
		btnMax.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnMax.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="Max";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr+oparation;
						Stroparation = tempStr2 + btnMin.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					} else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnMin.getText();
						tempStr = "";
						lblShowText.setText(tempStr2);
					}// end else 
				} //end if
			}// end method 
		});
		btnMax.setText("Max");
		btnMax.setBounds(211, 272, 128, 54);
		
		Button btnabs = new Button(panalMain, SWT.NONE);
		btnabs.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnabs.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="abs";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr + oparation;
						Stroparation = tempStr2 + btnabs.getText();
						tempStr = "";
						lblShowText.setText( tempStr2 );
					} else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnabs.getText();
						tempStr = "";
						lblShowText.setText( tempStr2 );
					}//end else
				} //end if
			}// end method
		});
		btnabs.setText("abs");
		btnabs.setBounds(345, 152, 61, 54);
		
		Button btnSqrt = new Button(panalMain, SWT.NONE);
		btnSqrt.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnSqrt.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="sqrt";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = tempStr + oparation;
						Stroparation = tempStr2 + btnSqrt.getText();
						tempStr = "";
						lblShowText.setText( tempStr2 );
					} else {
						tempStr2 = answer + oparation;
						Stroparation = answer + btnSqrt.getText();
						tempStr = "";
						lblShowText.setText( tempStr2 );
					}//end else
				} //end if
			}// end method
		});
		btnSqrt.setText("Sqrt");
		btnSqrt.setBounds(345, 92, 61, 54);
		
		Button btnSin = new Button(panalMain, SWT.NONE);
		btnSin.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnSin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="sin";
					StateOp = true;
					if( answer == null ) {
						tempStr2 = oparation + "(" + tempStr +")" ;
						Stroparation = tempStr2 + btnSin.getText();
						tempStr = "";
						lblShowText.setText( tempStr2 );
					} else {
						tempStr2 = oparation + "(" + answer +")" ;
						Stroparation = answer + btnSin.getText();
						tempStr = "";
						lblShowText.setText( tempStr2 );
					}//end else
				} //end if
			}// end method
		});
		btnSin.setText("sin");
		btnSin.setBounds(412, 92, 61, 54);
		
		Button btnTan = new Button(panalMain, SWT.NONE);
		btnTan.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnTan.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="tan";
					StateOp = true;
					if( answer == null ) {
						tempStr2 =  oparation + "(" + tempStr +")" ;
						Stroparation = tempStr2 + btnTan.getText();
						tempStr = "";
						lblShowText.setText( tempStr2 );
					} else {
						tempStr2 = oparation + "(" + answer +")" ;
						Stroparation = answer + btnTan.getText();
						tempStr = "";
						lblShowText.setText( tempStr2 );
					}//end else
				} //end if
			}// end method
		});
		btnTan.setText("tan");
		btnTan.setBounds(412, 152, 128, 54);
		
		Button btnCos = new Button(panalMain, SWT.NONE);
		btnCos.setFont(SWTResourceManager.getFont("Unispace", 11, SWT.BOLD));
		btnCos.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if( tempStr != "" ) {
					oparation="cos";
					StateOp = true;
					if( answer == null ) {
						tempStr2 =  oparation + "(" + tempStr +")" ;
						Stroparation = tempStr2 + btnCos.getText();
						tempStr = "";
						lblShowText.setText( tempStr2 );
					} else {
						tempStr2 = oparation + "(" + answer +")" ;
						Stroparation = answer + btnCos.getText();
						tempStr = "";
						lblShowText.setText( tempStr2 );
					}//end else
				} //end if
			}// end method
		});
		btnCos.setText("cos");
		btnCos.setBounds(479, 92, 61, 54);
	}

	private Color RGB(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
}
