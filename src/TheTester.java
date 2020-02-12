import javax.swing.*;

public class TheTester {
	

	public static void main(String[] args) {
		//System.out.println("this is the tester file for the project..");
		
		//create a frame
		JFrame f = new JFrame();
		
		//create a button
		JButton b = new JButton("click");
		b.setBounds(130, 100, 100, 40);
		
		f.add(b);
		
		f.setSize(100, 100);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
