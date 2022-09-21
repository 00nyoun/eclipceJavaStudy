package java_study.co.kr.joongbu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

class TextEditor extends JFrame{
	JTextArea ta;
	JMenuBar mb;
	JMenu menu;
	JMenuItem miNew,miOpen,miSave,miExit;
	public TextEditor() {
		super("텍스트 편집기");//super:부모 접근지정자, super():부모의 생성자 호출
		ta=new JTextArea();
		mb=new JMenuBar();
		menu=new JMenu("파일");
		miNew=new JMenuItem("새로 만들기");
		miOpen=new JMenuItem("열기");
		miSave=new JMenuItem("저장");
		miExit=new JMenuItem("끝내기");
		menu.add(miNew);
		menu.add(miOpen);
		menu.add(miSave);
		menu.add(miExit);
		mb.add(menu);
		//this.add(mb);
		this.setJMenuBar(mb);
		this.add(ta);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		miOpen.addActionListener((e)->{
			JFileChooser fileChooser=new JFileChooser();
			int option=fileChooser.showOpenDialog(this);
			if(option==JFileChooser.APPROVE_OPTION) {
				File  file = fileChooser.getSelectedFile();
				try {
					Scanner sc =new Scanner(file);
					while(sc.hasNext()) {
						String line=sc.nextLine(); //
						System.out.println(line);
					}
				} catch (FileNotFoundException e2) {
					e2.printStackTrace();
				}
				
			}
			
		});
	}
}


public class L24TextEditorApp {

	public static void main(String[] args) {
		TextEditor editor=new TextEditor();
		editor.setBounds(100, 100, 400, 400);
		editor.setVisible(true);
	}

}
