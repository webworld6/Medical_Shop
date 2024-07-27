import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class frame6 implements ActionListener 
{
	JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
    frame6()
    {
	Frame f=new Frame("__Medical Shop Management__");
	c1=new JCheckBox("First Aid Kit : 100$ ");
	c2=new JCheckBox("Pasters       : 50$  ");
	c3=new JCheckBox("Cotton wool   : 30$  ");
	c4=new JCheckBox("Surgical Mask : 150$ ");
	c5=new JCheckBox("Stethoscope   : 900$ ");
	c6=new JCheckBox("Oxygen Mask   : 650$ ");
	c7=new JCheckBox("Eye Chart     : 100$ ");
	c8=new JCheckBox("Scales        : 450$ ");
	c9=new JCheckBox("Thermometer   : 250$ ");

	c1.setBounds(100, 50, 150, 20);
	c2.setBounds(100, 100, 150, 20); 
	c3.setBounds(100, 150, 150, 20); 
	c4.setBounds(100, 200, 150, 20); 
	c5.setBounds(100, 250, 150, 20); 
	c6.setBounds(100, 300, 150, 20); 
	c7.setBounds(100, 350, 150, 20);
	c8.setBounds(100, 400, 150, 20); 
	c9.setBounds(100, 450, 150, 20); 

	Button b = new Button("Submit"); 
	b.setBounds(200, 600, 250, 90); 
    f.setBackground(Color.WHITE);
    b.addActionListener(this); 
    
	f.add(c1);
	f.add(c2);
	f.add(c3);
	f.add(c4);
	f.add(c5);
	f.add(c6);
	f.add(c7);
	f.add(c8);
	f.add(c9);
	f.add(b);

	f.setSize(900,900);
	f.setVisible(true);
	f.setLayout(null);
}

	public void actionPerformed(ActionEvent e){
		float a=0;
		String m="";
		if(c1.isSelected())
		{
			a+=100;
			m="First Aid Kit : 100$\n";
		}
		if(c2.isSelected())
		{
			a+=50;
			m="Pasters : 50$ \n";
		}
		if(c3.isSelected())
		{
			a+=30;
			m="Cotton wool : 30$ \n";
		}
		if(c4.isSelected())
		{
			a+=150;
			m="Surgical Mask : 150$ \n";
		}
		if(c5.isSelected())
		{
			a+=900;
			m="Stethoscope : 900$\n";
		}
		if(c6.isSelected())
		{
			a+=650;
			m="Oxygen Mask : 650$\n";
		}
		if(c7.isSelected())
		{
			a+=100;
			m="Eye Chart : 100$\n";
		}
		if(c8.isSelected())
		{
			a+=450;
			m="Scales : 450$ \n";
		}
		if(c9.isSelected())
		{
			a+=250;
			m="Thermometer : 250$ \n";
		}
		m="-------------------------\n";
		JOptionPane.showMessageDialog( 
			null, m + "Total: " + a); 
	}

public static void main(String[] args) 
{
	frame6 f6=new frame6();
}

}