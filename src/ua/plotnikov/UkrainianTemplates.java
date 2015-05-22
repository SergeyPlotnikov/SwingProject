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
			addTextField(fieldPanel, "titleBook", "����� ��������: ", hashMap);
			addTextField(fieldPanel, "translator", "����������: ", hashMap);
			addTextField(fieldPanel, "language",
					"���� �������� (� ���. ������ �.�.):", hashMap);
			addTextField(fieldPanel, "note", "������� �� ��������: ", hashMap);
			addTextField(fieldPanel, "type", "���(���������� � �.�.):", hashMap);
			addTextField(fieldPanel, "city", "̳���: ", hashMap);
			addTextField(fieldPanel, "publishing", "�����������:", hashMap);
			addTextField(fieldPanel, "year", "г�:", hashMap);
			addTextField(fieldPanel, "amount", "ʳ������ �������: ", hashMap);
			addTextField(fieldPanel, "ISBN", "ISBN: ", hashMap);
			break;
		}
		case 4:
		{
			addTextField(fieldPanel, "titleBook", "����� ��������: ", hashMap);
			addTextField(fieldPanel, "translator", "����������: ", hashMap);
			addTextField(fieldPanel, "language",
					"���� �������� (� ���. ������ �.�.):", hashMap);
			addTextField(fieldPanel, "type", "���(���������� � �.�.):", hashMap);
			addTextField(fieldPanel, "city", "̳���: ", hashMap);
			addTextField(fieldPanel, "publishing", "�����������:", hashMap);
			addTextField(fieldPanel, "year", "г�:", hashMap);
			addTextField(fieldPanel, "amount", "ʳ������ �������: ", hashMap);
			addTextField(fieldPanel, "contents", "����: ", hashMap);
			addTextField(fieldPanel, "ISBN", "ISBN: ", hashMap);
			break;
		}
		case 5:
		{
			addTextField(fieldPanel, "titleBook", "����� ��������: ", hashMap);
			addTextField(fieldPanel, "translator", "����������: ", hashMap);
			addTextField(fieldPanel, "language",
					"���� �������� (� ���. ������ �.�.):", hashMap);
			addTextField(fieldPanel, "type", "���(���������� � �.�.):", hashMap);
			addTextField(fieldPanel, "city", "̳���: ", hashMap);
			addTextField(fieldPanel, "publishing", "�����������:", hashMap);
			addTextField(fieldPanel, "year", "г�:", hashMap);
			addTextField(fieldPanel, "amount", "ʳ������ �������: ", hashMap);
			addTextField(fieldPanel, "ISBN", "ISBN: ", hashMap);
			break;
		}
		case 6:
		{
			addTextField(fieldPanel, "titleBook", "�����: ", hashMap);
			addTextField(fieldPanel, "description", "���� �����������: ",
					hashMap);
			addTextField(fieldPanel, "cityEvent", "̳��� ����������: ", hashMap);
			addTextField(fieldPanel, "dateEvent", "���� ����������:", hashMap);
			addTextField(fieldPanel, "cityPrint", "̳���, �� �����������: ",
					hashMap);
			addTextField(fieldPanel, "publishing", "�����������:", hashMap);
			addTextField(fieldPanel, "year", "г�:", hashMap);
			addTextField(fieldPanel, "amount", "ʳ������ �������: ", hashMap);
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
