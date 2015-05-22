package ua.plotnikov;


import java.util.HashMap;

import javax.swing.JTextField;

public class RussianTamplates extends Tamplate
{

	protected RussianTamplates(int selectedTamplate)
	{
		super(selectedTamplate);
	}

	@Override
	protected void addElenents(int index, HashMap<String, JTextField> hashMap)
	{
		switch (index)
		{
		case 0:
		case 1:
		case 2:
		case 3:
		{
			addTextField(fieldPanel, "titleBook", "Название книги: ", hashMap);
			addTextField(fieldPanel, "translator", "Переводчик: ", hashMap);
			addTextField(fieldPanel, "language",
					"Язык оригинала(в род. падеже жен.р.):", hashMap);
			addTextField(fieldPanel, "note", "Заметка к книге", hashMap);
			addTextField(fieldPanel, "type", "Тип(монография и т.д.):", hashMap);
			addTextField(fieldPanel, "city", "Город: ", hashMap);
			addTextField(fieldPanel, "publishing", "Издательство:", hashMap);
			addTextField(fieldPanel, "year", "Год:", hashMap);
			addTextField(fieldPanel, "amount", "Количество страниц: ", hashMap);
			addTextField(fieldPanel, "ISBN", "ISBN: ", hashMap);
			break;
		}
		case 4:
		{
			addTextField(fieldPanel, "titleBook", "Название книги: ", hashMap);
			addTextField(fieldPanel, "translator", "Переводчик: ", hashMap);
			addTextField(fieldPanel, "language",
					"Язык оригинала(в род. падеже жен.р.):", hashMap);
			addTextField(fieldPanel, "type", "Тип(монография и т.д.):", hashMap);
			addTextField(fieldPanel, "city", "Город: ", hashMap);
			addTextField(fieldPanel, "publishing", "Издательство:", hashMap);
			addTextField(fieldPanel, "year", "Год:", hashMap);
			addTextField(fieldPanel, "amount", "Количество страниц: ", hashMap);
			addTextField(fieldPanel, "contents", "Содержание: ", hashMap);
			addTextField(fieldPanel, "ISBN", "ISBN: ", hashMap);
			break;
		}
		case 5:
		{
			addTextField(fieldPanel, "titleBook", "Название книги: ", hashMap);
			addTextField(fieldPanel, "translator", "Переводчик: ", hashMap);
			addTextField(fieldPanel, "language",
					"Язык оригинала(в род. падеже жен.р.):", hashMap);
			addTextField(fieldPanel, "type", "Тип(монография и т.д.):", hashMap);
			addTextField(fieldPanel, "city", "Город: ", hashMap);
			addTextField(fieldPanel, "publishing", "Издательство:", hashMap);
			addTextField(fieldPanel, "year", "Год:", hashMap);
			addTextField(fieldPanel, "amount", "Количество страниц: ", hashMap);
			addTextField(fieldPanel, "ISBN", "ISBN: ", hashMap);
			break;
		}
		case 6:
		{
			addTextField(fieldPanel, "titleBook", "Название: ", hashMap);
			addTextField(fieldPanel, "description", "Описание конференции: ",
					hashMap);
			addTextField(fieldPanel, "cityEvent", "Город проведения: ", hashMap);
			addTextField(fieldPanel, "dateEvent", "Дата проведения:", hashMap);
			addTextField(fieldPanel, "cityPrint", "Город, где печаталось: ",
					hashMap);
			addTextField(fieldPanel, "publishing", "Издательство:", hashMap);
			addTextField(fieldPanel, "year", "Год:", hashMap);
			addTextField(fieldPanel, "amount", "Количество страниц: ", hashMap);
			addTextField(fieldPanel, "ISBN", "ISBN: ", hashMap);
			break;
		}
		default:
		{
			break;
		}
		}

	}
	
	
	
	@Override
	protected void resultShow(int index,HashMap<String, JTextField> map)
	{/*
		if(map.get("titleBook").getText().equals(""))
		String titleBook = map.get("titleBook").getText();
		String translator = map.get("translator").getText();
		String language = map.get("language").getText();
		String note = map.get("note").getText();
		String type = map.get("type").getText();
		String city = map.get("city").getText();
		String publishing = map.get("publishing").getText();
		String year = map.get("year").getText();
		String amount = map.get("amount").getText();
		String ISBN = map.get("ISBN").getText();
		
		
		textArea.append(map.get("1").getText() + ": "
				+ map.get("2").getText() + ";[переклад з"
				+ map.get("3").getText() + " - "
				+ map.get("4").getText() + "].-"
				+ map.get("5").getText() + ":"
				+ map.get("6").getText() + ".-"
				+ map.get("7").getText() + "c." + "-C."
				+ map.get("8").getText() + "-"
				+ map.get("9").getText());
		*/

	}
}