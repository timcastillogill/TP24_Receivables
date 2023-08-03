package timcastillogill.tp24.Receivables;

import org.springframework.stereotype.Service;
import timcastillogill.tp24.Receivables.models.Receivable;
import timcastillogill.tp24.Receivables.models.SummaryStatistics;

import java.util.List;
@Service
public class ReceivablesDataGenerator {
	private final List<Receivable> receivables;
	private double openInvoiceValue;
	private double closedInvoiceValue;

	public ReceivablesDataGenerator() {
		this.receivables = null;
		this.openInvoiceValue = 0.0;
		this.closedInvoiceValue = 0.0;
	}

	public SummaryStatistics calculateSummaryStatistics() {

		for (Receivable recivable : receivables) {
			if (!recivable.isCancelled()) {
				if (recivable.getClosedDate() != null) {
					this.closedInvoiceValue += recivable.getPaidValue();
				}
				this.openInvoiceValue += recivable.getOpeningValue() - recivable.getPaidValue();
			}
		}
		SummaryStatistics summaryStatistics = new SummaryStatistics(this.openInvoiceValue, this.closedInvoiceValue);
//		summaryStatistics.setOpenInvoiceValue(this.openInvoiceValue);
//		summaryStatistics.setClosedInvoiceValue(this.closedInvoiceValue);
		return summaryStatistics;
	}
}
