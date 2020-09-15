package java;


import javax.swing.*;  // for GUI stuff
import java.awt.*; // for the GUI stuff

import java.awt.event.*; // for the event handling

import java.util.*; // for reading from a file
import java.io.*; // for writing to a file


public class Notepad extends JFrame implements ActionListener {

	 //	TextArea
	private TextArea text_area = new TextArea("", 0, 0, TextArea.SCROLLBARS_BOTH); 
	// Menubar Items
	private MenuBar menu_bar = new MenuBar();
	private Menu file = new Menu();
	// File Menu Items
	private MenuItem openFile = new MenuItem();
	private MenuItem saveFile = new MenuItem();
	private MenuItem closeFile = new MenuItem();
	// Edit Menu Items
	private Menu Edit = new Menu();
	private MenuItem cut = new MenuItem();
	private MenuItem copy = new MenuItem();
	private MenuItem paste = new MenuItem();

	public Notepad() {
		//Initializing Menu Items
		this.setSize(600,800);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
		this.setTitle("Untitled");
		this.setFont(new Font("Century Gothic", Font.BOLD, 12));
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(text_area);
		
		// Adding Menu bar to the GUI
		this.setMenuBar(menu_bar);
		
		// Adding File Menu
		this.menu_bar.add(file);
		this.file.setLabel("File");
		
		// Adding Edit Menu
		this.menu_bar.add(Edit);
		this.Edit.setLabel("Edit");
		
		// Adding Open Option to File Menu
		this.openFile.setLabel("Open");
		this.openFile.addActionListener(this);
		this.openFile.setShortcut(new MenuShortcut(KeyEvent.VK_O,false));
		this.file.add(this.openFile);
		
		//Save File Option to File Menu
		this.saveFile.setLabel("Save As");
		this.saveFile.addActionListener(this);
		this.saveFile.setShortcut(new MenuShortcut(KeyEvent.VK_S,false));
		this.file.add(this.saveFile);
		
		//Close File Option to File Menu
		this.closeFile.setLabel("Close");
		this.closeFile.addActionListener(this);
		this.closeFile.setShortcut(new MenuShortcut(KeyEvent.VK_Q,false));
		this.file.add(this.closeFile);
		
		//Cut Option to Edit Menu
		this.cut.setLabel("Cut");
		this.cut.addActionListener(this);
		this.cut.setShortcut(new MenuShortcut(KeyEvent.VK_X,false));
		this.Edit.add(this.cut);
		
		//Copy Option to Edit Menu
		this.copy.setLabel("Copy");
		this.copy.addActionListener(this);
		this.copy.setShortcut(new MenuShortcut(KeyEvent.VK_C,false));
		this.Edit.add(this.copy);
		
		//Paste Option to Edit Menu
		this.paste.setLabel("Paste");
		this.paste.addActionListener(this);
		this.paste.setShortcut(new MenuShortcut(KeyEvent.VK_V,false));
		this.Edit.add(this.paste);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Handling Close File
		if (e.getSource() == this.closeFile) {
			this.dispose();
		}
		// Handling Open File
		else if (e.getSource() == this.openFile) {
			JFileChooser open = new JFileChooser();
			int option = open.showOpenDialog(this);
			
			if (option == JFileChooser.APPROVE_OPTION) {
				this.text_area.setText("");
				try{
					Scanner sc = new Scanner(new FileReader(open.getSelectedFile().getPath()));
					while(sc.hasNext()) {
						this.text_area.append(sc.nextLine() +"\n");
						
					}
				}
				catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
			
		}
		// Handling Save As File
		else if (e.getSource() == this.saveFile) {
			JFileChooser save =  new JFileChooser();
			int option = save.showOpenDialog(this);
			
			if(option == JFileChooser.APPROVE_OPTION) {
				try {
					BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
					out.write(this.text_area.getText());
					
					out.close();
				}
				catch (Exception ex) {
					System.out.println(ex.getLocalizedMessage());
				}
			}
			
			
			/*
			 * { 
 		File myFile = new File("C:/Program Files/example/","Example.txt"); myFile.createNewFile(); 
 		BufferedWriter output = new BufferedWriter(new FileWriter(myFile)); 
 		output.write("Text you want to write"); output.close();
  		}
   			 *
   			 */
			
		}
		
		else if (e.getSource() == this.cut) {
			
		}
		else if (e.getSource() == this.copy) {
			
		}
		else if (e.getSource() == this.paste) {
			
		}
		
	}
	public static void main (String[] args) {
		Notepad app = new Notepad();
		app.setVisible(true);
	}
}


// Features to Add : 
/*
 * - Save and Save as Full support
 * - Fonts and Font Options
 * - Background Color
 * - Syntax Highlighting
 * - Find and Replace
 * - Line and Column Number
 */ 