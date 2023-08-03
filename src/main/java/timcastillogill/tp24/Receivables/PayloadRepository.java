package timcastillogill.tp24.Receivables;

import org.springframework.data.jpa.repository.JpaRepository;
import timcastillogill.tp24.Receivables.models.PayloadEntity;

public class PayloadRepository implements JpaRepository<PayloadEntity, Long> {
}
