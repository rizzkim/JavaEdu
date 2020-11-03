package javaapp1103;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.ClosedDirectoryStreamException;

public class ButtonEventProcessing extends Frame {
	Button btn1, btn2;
	Label lbl;
	public ButtonEventProcessing () {
		
		Panel panel = new Panel();
		
		Button btn1 = new Button("Press");
		panel.add(btn1);
		
		Button btn2 = new Button("Exit");
		panel.add(btn2);
		
		lbl = new Label("             ");
		panel.add(lbl);
		
		add(panel);
				
		ActionListener routing = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn1) {
					lbl.setText("btn1 click");
				} else if (e.getSource() == btn2) {
					System.exit(0);
				}
			}
		};
		
		btn1.addActionListener(routing);
		btn2.addActionListener(routing);

		/*
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("HELLO");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		*/
		
		setTitle("버튼이벤트");
		setBounds(100, 100, 300, 300);
		setVisible(true);
	}
}
