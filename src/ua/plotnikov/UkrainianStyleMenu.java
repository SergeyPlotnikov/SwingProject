package ua.plotnikov;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class UkrainianStyleMenu extends StyleMenu
{
	public UkrainianStyleMenu()
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
		comboBox.addItem("Книга(більше 3 авторів)");
		comboBox.addItem("Збірник 1 автора");
		comboBox.addItem("Збірник різних авторів");
		comboBox.addItem("Матеріали конференцій");
		comboBox.addItem("Електронний ресурс");
		nextButton.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int selectedIndex = comboBox.getSelectedIndex();
				styleFrame.setVisible(false);
				new UkrainianTemplates(selectedIndex);
			}
		});
	}
}