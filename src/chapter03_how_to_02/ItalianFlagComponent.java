package chapter03_how_to_02;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class ItalianFlagComponent extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		ItalianFlag flag = new ItalianFlag(100, 100, 90);
		flag.draw(g2);
	}
}