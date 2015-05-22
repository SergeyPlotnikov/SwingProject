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
		nextButton = new JButton("���");
		comboBox = new JComboBox<String>();
		comboBox.addItem("�����(1 �����)");
		comboBox.addItem("�����(2 ������)");
		comboBox.addItem("�����(3 ������)");
		comboBox.addItem("�����(����� 3 ������)");
		comboBox.addItem("������ 1 ������");
		comboBox.addItem("������ ����� ������");
		comboBox.addItem("�������� �����������");
		comboBox.addItem("����������� ������");
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