package kyrs;

//импорт библиотек
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.applet.*;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;

import javax.swing.*;

public class Window extends JFrame {
	
	private JLabel text = new JLabel("Какойто текст бла бла бла Косарев А.В.");
      
public Window() {
super("Calculator");
this.setBounds(600,300,520,400);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container panel = this.getContentPane();
panel.add(text);
}
private void jButton6ActionPerformed(java.awt.event.ActionEvent evt8) {                                         
	Window forms =new Window();//открытие калькулятора
	forms.setVisible(true); 
	setVisible(false);
	} 


public static void main(String[] args) {
	Window app = new Window();
app.setVisible(true);
}



}