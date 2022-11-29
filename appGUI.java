import javax.swing.*;
import java.awt.*;
package soundboard;

public class appGUI {
	 JFrame mainFrame;
	 JPanel mainPanel;
	 JMenubar menubar;
	 JMenu file;
	 JMenu edit;
	 JTable table;

	public appGUI() {
 		  mainFrame = new JFrame("Soundboard Main Window");
		  mainPanel = new JPanel();
		  menubar = new JMenubar();
		  file = new JMenu("File");
		  edit = new JMenu("Edit");
		  table = new JTable(4, 0);

	}


	public  void init() {
		menubar.add(file);
		menubar.add(edit);
		mainPanel.add(menubar);
		mainPanel.add(table);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
	
	}


}

