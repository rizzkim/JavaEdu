package javaapp1103;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FirstFrame extends Frame {
	public FirstFrame() {
		this.setTitle("첫번째 윈도우");
		this.setBounds(100, 100, 300, 300);
		this.setVisible(true);
		this.setBackground(Color.lightGray);
		
//		패널 생성
		Panel p = new Panel();
//		버튼 생성
		Button btn = new Button("OK");
//		버튼을 패널에 추가
		p.add(btn);
//		패널을 프레임에 추가
		this.add(p);
		
		Checkbox cb1 = new Checkbox("java");
		Checkbox cb2 = new Checkbox("Kotlin");
		p.add(cb1);
		p.add(cb2);
		
		CheckboxGroup gender = new CheckboxGroup();
		Checkbox btnM = new Checkbox("Male", gender, true);
		Checkbox btnF = new Checkbox("Female", gender, false);
		p.add(btnM);
		p.add(btnF);
		
	}
}
