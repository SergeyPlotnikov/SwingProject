package ua.plotnikov;

import java.util.HashMap;

import javax.swing.JTextField;

public class HarvardTemplates extends Tamplate
{

	protected HarvardTemplates(int selectedTamplate)
	{
		super(selectedTamplate);

	}

	@Override
	protected void addElenents(int index, HashMap<String, JTextField> hashMap)
	{

		switch (index)
		{
		case 0:
		{
			addTextField(fieldPanel, "year", "Imprint date: ", hashMap);
			addTextField(fieldPanel, "title", "Title: ", hashMap);
			addTextField(fieldPanel, "information",
					"Information about the re-release:", hashMap);
			addTextField(fieldPanel, "number", "Number of publications: ",
					hashMap);
			addTextField(fieldPanel, "chapter", "Chapter:", hashMap);
			addTextField(fieldPanel, "publishing", "Publishing:", hashMap);
			addTextField(fieldPanel, "city", "City edition: ", hashMap);
			addTextField(fieldPanel, "amount", "Number of pages: ", hashMap);
			break;

		}
		case 1:
		{
			addTextField(fieldPanel, "year", "Imprint date: ", hashMap);
			addTextField(fieldPanel, "articcleTitle", "Article title: ",
					hashMap);
			addTextField(fieldPanel, "bookTitle", "Book title:", hashMap);
			addTextField(fieldPanel, "publishing", "Publishing:", hashMap);
			addTextField(fieldPanel, "city", "City edition: ", hashMap);
			addTextField(fieldPanel, "location",
					"Location of the article (page): ", hashMap);
			break;
		}
		case 2:
		{
			addTextField(fieldPanel, "year", "Imprint date: ", hashMap);
			addTextField(fieldPanel, "articcleTitle", "Article title: ",
					hashMap);
			addTextField(fieldPanel, "magazineTitle", "Magazine title:",
					hashMap);
			addTextField(fieldPanel, "publishing", "Publishing:", hashMap);
			addTextField(fieldPanel, "issueNumber", "Issue number: ", hashMap);
			addTextField(fieldPanel, "location",
					"Location of the article (page): ", hashMap);
			break;
		}
		case 3:
		{
			addTextField(fieldPanel, "year", "Imprint date: ", hashMap);
			addTextField(fieldPanel, "title", "Title: ", hashMap);
			addTextField(fieldPanel, "URL", "URL:", hashMap);
			break;
		}
		}
	}

	
	protected void resultShow(int index, HashMap<String, JTextField> map)
	{
		// TODO Auto-generated method stub
		
	}

}
