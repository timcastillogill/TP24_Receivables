package timcastillogill.tp24.Receivables.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import timcastillogill.tp24.Receivables.ReceivablesDataGenerator;
import timcastillogill.tp24.Receivables.Repository.ReceivableRepository;
import timcastillogill.tp24.Receivables.models.Receivable;
import timcastillogill.tp24.Receivables.models.SummaryStatistics;

import java.util.List;

public class ReceivableController {
	private final ReceivablesDataGenerator dataGenerator;
	private final ReceivableRepository receivableRepository;

	public ReceivableController(ReceivablesDataGenerator dataGenerator, ReceivableRepository receivableRepository) {
		this.dataGenerator = dataGenerator;
		this.receivableRepository = receivableRepository;
	}

	@PostMapping("/receivables")
	public ResponseEntity<String> storeReceivables(@RequestBody List<Receivable> payload) {
		receivableRepository.saveAll(payload);

		return ResponseEntity.ok("Receivables data stored successfully");
	}

	@GetMapping("/summary")
	public ResponseEntity<SummaryStatistics> getSummaryStatistics() {
		SummaryStatistics summaryStatistics = this.dataGenerator.calculateSummaryStatistics();
		return ResponseEntity.ok(summaryStatistics);
	}
}
