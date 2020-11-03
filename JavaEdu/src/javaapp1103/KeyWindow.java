package javaapp1103;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class KeyWindow extends Frame {
//	화면에 필요한 인스턴스들의 변수 선언
	Label lbl;
	
	public KeyWindow() {
		setLayout(null);
		
		lbl = new Label("@");
		lbl.setBounds(100, 100, 20, 20);
		add(lbl);
		
		setTitle("키이벤트");
		setBounds(300, 300, 400, 400);
		setVisible(true);
		
		this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				lbl.setBounds(e.getX(), e.getY(), 20, 20);
			}
			
		});
		
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.printf("x:%d y:%d\n", e.getX(), e.getY());
//				클릭한 곳으로 @가 이동
//				lbl.setBounds(e.getX(), e.getY(), 20, 20);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					int x = lbl.getLocation().x;
					int y = lbl.getLocation().y;
					lbl.setBounds(x, y+5, 20, 20);
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					int x = lbl.getLocation().x;
					int y = lbl.getLocation().y;
					lbl.setBounds(x, y-5, 20, 20);
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					int x = lbl.getLocation().x;
					int y = lbl.getLocation().y;
					lbl.setBounds(x-5, y, 20, 20);
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					int x = lbl.getLocation().x;
					int y = lbl.getLocation().y;
					lbl.setBounds(x+5, y, 20, 20);
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			
		});
	}
}
