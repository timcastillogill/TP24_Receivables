package timcastillogill.tp24.Receivables.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import timcastillogill.tp24.Receivables.models.Receivable;


public interface ReceivableRepository extends JpaRepository<Receivable, Long> {
}
