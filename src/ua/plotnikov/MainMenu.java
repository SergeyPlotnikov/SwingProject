package ua.plotnikov;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu
{
	private JButton nextButton;
	private JLabel textLabel;
	private JComboBox<String> comboBox;
	private JFrame mainFrame;
	private JPanel mainPanel;
	public static final int DEFAULT_SIZE = 14;

	public MainMenu()
	{
		mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(300, 200);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);

		mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());

		textLabel = new JLabel("Виберіть, будь-ласка, стиль: ");
		textLabel.setFont(new Font("TimesRoman", Font.BOLD, DEFAULT_SIZE));
		mainPanel.add(textLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(10, 30, 1, 30), 0, 0));

		comboBox = new JComboBox<String>();
		comboBox.addItem("Русский стиль");
		comboBox.addItem("Український стиль");
		comboBox.addItem("Harvard style");
		comboBox.addItem("APA");
		mainPanel.add(comboBox, new GridBagConstraints(0, 1, 1, 1, 1, 1,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(10, 30, 10, 30), 0, 0));
		nextButton = new JButton("Далі");
		mainPanel.add(nextButton, new GridBagConstraints(0, 2, 1, 1, 1, 1,
				GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
				new Insets(5, 160, 10, 30), 0, 0));

		mainFrame.add(mainPanel, BorderLayout.CENTER);
		nextButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				int selectedIndex = comboBox.getSelectedIndex();
				switch (selectedIndex)
				{
				case 0:
				{
					mainFrame.setVisible(false);
					new RussianStyleMenu();
					break;
				}
				case 1:
				{
					mainFrame.setVisible(false);
					new UkrainianStyleMenu();
					break;
				}
				case 2:
				{
					mainFrame.setVisible(false);
					new HarvardStyleMenu();
					break;
				}
				default:
				{
					mainFrame.setVisible(false);
					new APAStyleMenu();
					break;
				}
				}
			}
		});
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}