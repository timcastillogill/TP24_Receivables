package timcastillogill.tp24.Receivables.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PayloadEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String reference;
	private String currencyCode;
	private String issueDate;
	private double openingValue;
	private double paidValue;
	private String dueDate;
	private String closedDate;
	private boolean cancelled;
	private String debtorName;
	private String debtorReference;
	private String debtorAddress1;
	private String debtorAddress2;
	private String debtorTown;
	private String debtorState;
	private String debtorZip;
	private String debtorCountryCode;
	private String debtorRegistrationNumber;

	public PayloadEntity() {

	}
	public PayloadEntity(String reference, String currencyCode, String issueDate, double openingValue, double paidValue, String dueDate, String closedDate, boolean cancelled, String debtorName, String debtorReference, String debtorAddress1, String debtorAddress2, String debtorTown, String debtorState, String debtorZip, String debtorCountryCode, String debtorRegistrationNumber) {
		this.reference = reference;
		this.currencyCode = currencyCode;
		this.issueDate = issueDate;
		this.openingValue = openingValue;
		this.paidValue = paidValue;
		this.dueDate = dueDate;
		this.closedDate = closedDate;
		this.cancelled = cancelled;
		this.debtorName = debtorName;
		this.debtorReference = debtorReference;
		this.debtorAddress1 = debtorAddress1;
		this.debtorAddress2 = debtorAddress2;
		this.debtorTown = debtorTown;
		this.debtorState = debtorState;
		this.debtorZip = debtorZip;
		this.debtorCountryCode = debtorCountryCode;
		this.debtorRegistrationNumber = debtorRegistrationNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public double getOpeningValue() {
		return openingValue;
	}

	public void setOpeningValue(double openingValue) {
		this.openingValue = openingValue;
	}

	public double getPaidValue() {
		return paidValue;
	}

	public void setPaidValue(double paidValue) {
		this.paidValue = paidValue;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(String closedDate) {
		this.closedDate = closedDate;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public String getDebtorName() {
		return debtorName;
	}

	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}

	public String getDebtorReference() {
		return debtorReference;
	}

	public void setDebtorReference(String debtorReference) {
		this.debtorReference = debtorReference;
	}

	public String getDebtorAddress1() {
		return debtorAddress1;
	}

	public void setDebtorAddress1(String debtorAddress1) {
		this.debtorAddress1 = debtorAddress1;
	}

	public String getDebtorAddress2() {
		return debtorAddress2;
	}

	public void setDebtorAddress2(String debtorAddress2) {
		this.debtorAddress2 = debtorAddress2;
	}

	public String getDebtorTown() {
		return debtorTown;
	}

	public void setDebtorTown(String debtorTown) {
		this.debtorTown = debtorTown;
	}

	public String getDebtorState() {
		return debtorState;
	}

	public void setDebtorState(String debtorState) {
		this.debtorState = debtorState;
	}

	public String getDebtorZip() {
		return debtorZip;
	}

	public void setDebtorZip(String debtorZip) {
		this.debtorZip = debtorZip;
	}

	public String getDebtorCountryCode() {
		return debtorCountryCode;
	}

	public void setDebtorCountryCode(String debtorCountryCode) {
		this.debtorCountryCode = debtorCountryCode;
	}

	public String getDebtorRegistrationNumber() {
		return debtorRegistrationNumber;
	}

	public void setDebtorRegistrationNumber(String debtorRegistrationNumber) {
		this.debtorRegistrationNumber = debtorRegistrationNumber;
	}
}
