package ua.plotnikov;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class RussianStyleMenu extends StyleMenu
{
	public RussianStyleMenu()
	{
		createMenu();
	}

	@Override
	protected void addComponents()
	{
		nextButton = new JButton("Далі");
		comboBox = new JComboBox<String>();
		comboBox.addItem("Книга(1 автор)");
		comboBox.addItem("Книга(2 автора)");
		comboBox.addItem("Книга(3 автора)");
		comboBox.addItem("Книга(более 3 авторов)");
		comboBox.addItem("Сборник 1 автора");
		comboBox.addItem("Сборники разных авторов");
		comboBox.addItem("Материалы конференций");
		comboBox.addItem("Электронный ресурс");
		nextButton.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int selectedIndex = comboBox.getSelectedIndex();
				styleFrame.setVisible(false);
				new RussianTamplates(selectedIndex);
			}
		});
	}
}