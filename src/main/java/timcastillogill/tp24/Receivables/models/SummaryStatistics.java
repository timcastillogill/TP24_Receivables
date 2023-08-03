package timcastillogill.tp24.Receivables.models;

public class SummaryStatistics {
	private double openInvoiceValue;
	private double closedInvoiceValue;

	public SummaryStatistics(double openInvoiceValue, double closedInvoiceValue) {
		this.openInvoiceValue = openInvoiceValue;
		this.closedInvoiceValue = closedInvoiceValue;
	}

	public double getOpenInvoiceValue() {
		return openInvoiceValue;
	}

	public void setOpenInvoiceValue(double openInvoiceValue) {
		this.openInvoiceValue = openInvoiceValue;
	}

	public double getClosedInvoiceValue() {
		return closedInvoiceValue;
	}

	public void setClosedInvoiceValue(double closedInvoiceValue) {
		this.closedInvoiceValue = closedInvoiceValue;
	}
}
