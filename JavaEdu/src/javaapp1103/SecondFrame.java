package javaapp1103;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;

public class SecondFrame extends Frame {
//	생성자
	public SecondFrame() {
//		패널 생성
		Panel p = new Panel();
		
		final Label lbl = new Label("BRAND");
		Thread th = new Thread() {
			boolean flag=true;
			public void run() {
				while(true) {
					if(flag == false) {
						lbl.setBackground(Color.yellow);
						lbl.setText("SKATE");
					} else {
						lbl.setBackground(Color.GREEN);
						lbl.setText("BRAND");
					}
					flag = !flag;
					try {
						Thread.sleep(1000);
					} catch (Exception e) {}
				}
			}
		};
				
		th.start();
		p.add(lbl);
		
//		선택목록 삽입
		Choice choice = new Choice();
		choice.add("nike");
		choice.add("vans");
		choice.add("adidas");
		choice.add("DC");
		
//		패널에 추가
		p.add(choice);
		
//		List list = new List();
//		다중 선택 가능
		List list = new List(4, true);
		list.add("WATCH");
		list.add("TV");
		list.add("iPhone");
		list.add("MacBook");
		list.add("iMac");
		list.add("iPod");
		
		p.add(list);
		
		FileDialog fd = 
			new FileDialog(this, "file", 
					FileDialog.LOAD);
		fd.setVisible(true);
		System.out.printf("%s\n", fd.getFile());
		
		
		
//		패널을 프레임에 추가
		add(p);
		
//		기본 옵션 설정
		setTitle("AWT Programming");
		setBounds(200, 200, 400, 400);
		setVisible(true);
		
	}
}
