package timcastillogill.tp24.Receivables.IntegrationTest;

import timcastillogill.tp24.Receivables.models.Receivable;

import java.util.ArrayList;
import java.util.List;

public class StubData {
	List<Receivable> receivableList;

		private Receivable receivable1 = new Receivable(
		"Amazon",
		"GBP",
		"23/01/2020",
		1234.56,
		1234.56,
		"23/02/2020",
		null,
		true,
		null,
		"asdfsadf",
		"5 Farringdon",
		"New Walk",
		"London",
		null,
		null,
		"UK",
		null
		);
		Receivable receivable2 = new Receivable(
		"Apple",
		"GBP",
		"23/01/2021",
		200.00,
		200/00,
		"23/02/2021",
		null,
		true,
		null,
		"asdfsadf",
		"5 Farringdon",
		"New Walk",
		"London",
		null,
		null,
		"UK",
		null
		);

	public StubData() {
		this.receivableList = new ArrayList<>();
		this.receivableList.add(receivable1);
		this.receivableList.add(receivable2);
	}

	public List<Receivable> getReceivableList() {
		return this.receivableList;
	}
}
