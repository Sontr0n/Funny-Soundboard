import javax.swing.*;
import java.awt.*;


public class appGUI {
	 JFrame mainFrame;
	 JPanel mainPanel;
	 JMenuBar menubar;
	 JMenu file;
	 JMenu edit;
	 JTable table;

	public appGUI() {
 		  mainFrame = new JFrame("Soundboard");
		  mainPanel = new JPanel();
		  menubar = new JMenuBar();
		  file = new JMenu("File");
		  edit = new JMenu("Edit");
		  table = new JTable(4, 0);

	}


	public  void init() {
		file.setSize(186, 126);
		edit.setSize(186, 126);
	        menubar.add(file);
		menubar.add(edit);
		
		mainFrame.setJMenuBar(menubar);
		
		
		
		mainPanel.add(table);
		mainFrame.add(mainPanel);
		
		mainFrame.setLocation(960, 480);
		mainFrame.setSize(2000, 1200);
		mainFrame.setVisible(true);
	
	}


}
