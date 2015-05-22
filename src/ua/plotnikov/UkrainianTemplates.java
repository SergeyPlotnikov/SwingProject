package ua.plotnikov;

import java.util.HashMap;

import javax.swing.JTextField;

public class UkrainianTemplates extends Tamplate
{

	protected UkrainianTemplates(int selectedTamplate)
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
			addTextField(fieldPanel, "titleBook", "Назва посібника: ", hashMap);
			addTextField(fieldPanel, "translator", "Перекладач: ", hashMap);
			addTextField(fieldPanel, "language",
					"Мова оригіналу (у род. відмінку ж.р.):", hashMap);
			addTextField(fieldPanel, "note", "Примітка до посібника: ", hashMap);
			addTextField(fieldPanel, "type", "Тип(монографія і т.д.):", hashMap);
			addTextField(fieldPanel, "city", "Місто: ", hashMap);
			addTextField(fieldPanel, "publishing", "Видавництво:", hashMap);
			addTextField(fieldPanel, "year", "Рік:", hashMap);
			addTextField(fieldPanel, "amount", "Кількість сторінок: ", hashMap);
			addTextField(fieldPanel, "ISBN", "ISBN: ", hashMap);
			break;
		}
		case 4:
		{
			addTextField(fieldPanel, "titleBook", "Назва посібника: ", hashMap);
			addTextField(fieldPanel, "translator", "Перекладач: ", hashMap);
			addTextField(fieldPanel, "language",
					"Мова оригіналу (у род. відмінку ж.р.):", hashMap);
			addTextField(fieldPanel, "type", "Тип(монографія і т.д.):", hashMap);
			addTextField(fieldPanel, "city", "Місто: ", hashMap);
			addTextField(fieldPanel, "publishing", "Видавництво:", hashMap);
			addTextField(fieldPanel, "year", "Рік:", hashMap);
			addTextField(fieldPanel, "amount", "Кількість сторінок: ", hashMap);
			addTextField(fieldPanel, "contents", "Зміст: ", hashMap);
			addTextField(fieldPanel, "ISBN", "ISBN: ", hashMap);
			break;
		}
		case 5:
		{
			addTextField(fieldPanel, "titleBook", "Назва посібника: ", hashMap);
			addTextField(fieldPanel, "translator", "Перекладач: ", hashMap);
			addTextField(fieldPanel, "language",
					"Мова оригіналу (у род. відмінку ж.р.):", hashMap);
			addTextField(fieldPanel, "type", "Тип(монографія і т.д.):", hashMap);
			addTextField(fieldPanel, "city", "Місто: ", hashMap);
			addTextField(fieldPanel, "publishing", "Видавництво:", hashMap);
			addTextField(fieldPanel, "year", "Рік:", hashMap);
			addTextField(fieldPanel, "amount", "Кількість сторінок: ", hashMap);
			addTextField(fieldPanel, "ISBN", "ISBN: ", hashMap);
			break;
		}
		case 6:
		{
			addTextField(fieldPanel, "titleBook", "Назва: ", hashMap);
			addTextField(fieldPanel, "description", "Опис конференції: ",
					hashMap);
			addTextField(fieldPanel, "cityEvent", "Місто проведення: ", hashMap);
			addTextField(fieldPanel, "dateEvent", "Дата проведення:", hashMap);
			addTextField(fieldPanel, "cityPrint", "Місто, де друкувалось: ",
					hashMap);
			addTextField(fieldPanel, "publishing", "Видавництво:", hashMap);
			addTextField(fieldPanel, "year", "Рік:", hashMap);
			addTextField(fieldPanel, "amount", "Кількість сторінок: ", hashMap);
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
	protected void resultShow(int index, HashMap<String, JTextField> map)
	{
		// TODO Auto-generated method stub
		
	}

}
