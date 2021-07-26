package Digital_Clock;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;
import javax.swing.JLabel;

public class Digitalclock extends JFrame{
	private JLabel heading;
	
	private JLabel clockLabel;
	private Font font=new Font("",Font.BOLD,35);
	Digitalclock()
	{
		super.setTitle("My Clock");
		super.setSize(400,400);
		super.setLocation(550,200);
		this.createGUI();
		super.setVisible(true);
	}
	
	public void createGUI()
	{
		heading=new JLabel("My Clock");
		clockLabel=new JLabel("Clock");
		heading.setFont(font);
		clockLabel.setFont(font);
		this.setLayout(new GridLayout(2,1));
		this.startclock();
		this.add(heading);
		this.add(clockLabel);
	}
	public void startclock()
	{
		Timer timer=new Timer(1000,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				//String dateTime=new Date().toString();
				String dateTime= new Date().toLocaleString();
				clockLabel.setText(dateTime);
			}
		});
		timer.start();
	}

}
