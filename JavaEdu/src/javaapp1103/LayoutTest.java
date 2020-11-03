package javaapp1103;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutTest extends Frame {
	Label lbl;
	public LayoutTest() {
		Panel panel = new Panel(); //FlowLayout으로 설정
//		panel.setLayout(new BorderLayout());
//		panel.setLayout(new GridLayout(1,2));
//		panel.setLayout(null);
		
		
		Button btn1 = new Button("BTN1");
//		panel.add("Center", btn1);
//		btn1.setBounds(50, 50, 100, 100);
		panel.add(btn1);
		
		lbl = new Label("Display");
		panel.add(lbl);
		
//		anonymous 클래스 안에서는 지역변수 사용을 못함
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText("BTN1 Click");
			}
			
		});
		
		
//		Button btn2 = new Button("BTN1");
//		panel.add("East", btn2);
//		panel.add(btn2);
		
		
//		Button btn3 = new Button("BTN3");
//		panel.add("West", btn3);
//		panel.add(btn3);
		
//		패널을 프레임에 추가
		add(panel);
		
		setTitle("레이아웃 연습");
		setBounds(100, 200, 300, 300);
		setVisible(true);
	}
}
