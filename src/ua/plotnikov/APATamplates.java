package ua.plotnikov;

import java.util.HashMap;

import javax.swing.JTextField;

public class APATamplates extends Tamplate
{

	protected APATamplates(int selectedTamplate)
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
			addTextField(fieldPanel, "title", "Book title: ", hashMap);
			addTextField(fieldPanel, "publishing", "Publishing:", hashMap);
			addTextField(fieldPanel, "city", "City edition: ", hashMap);
			break;
		}
		case 1:
		{
			addTextField(fieldPanel, "title", "Title: ", hashMap);
			addTextField(fieldPanel, "titleMagazine", "Name of the journal: ", hashMap);
			addTextField(fieldPanel, "issue", "Issue number:", hashMap);
			addTextField(fieldPanel, "page", "Page number: ", hashMap);
			break;
		}
		case 2:
		{
			addTextField(fieldPanel, "name", "Name of web page: ", hashMap);
			addTextField(fieldPanel, "date", "Year, day and month of issue: ", hashMap);
			addTextField(fieldPanel, "nameSite", "Name of the site.:", hashMap);
			addTextField(fieldPanel, "webPage", "Reference to web page of news: ", hashMap);
			break;
		}
		}
	}

	@Override
	protected void resultShow(int index, HashMap<String, JTextField> map)
	{
		// TODO Auto-generated method stub
		
	}

	

}
