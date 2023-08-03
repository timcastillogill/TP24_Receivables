package timcastillogill.tp24.Receivables.IntegrationTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import timcastillogill.tp24.Receivables.models.SummaryStatistics;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	ObjectMapper objectMapper;
	private StubData stubData;

	@BeforeEach
	void setup() {
		stubData = new StubData();
	}

	@Test
	public void given_a_payload_the_receivables_received_will_be_stored() {
		mockMvc.perform(MockMvcRequestBuilders.post("/receivables")
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(stubData.getReceivableList())))
				.andExpect(status().isOk())
				.andReturn();

	}

	@Test
	public void given_a_payload_of_receivables_will_return_open_closed_values() {
		MvcResult summaryResult = mockMvc.perform(MockMvcRequestBuilders.get("/summary"))
				.andExpect(status().isOk())
				.andReturn();

		String summaryResponseJson = summaryResult.getResponse().getContentAsString();
		SummaryStatistics summaryStatistics = objectMapper.readValue(summaryResponseJson, SummaryStatistics.class);

		assertThat(summaryStatistics.getOpenInvoiceValue()).isEqualTo(0.0);
		assertThat(summaryStatistics.getClosedInvoiceValue()).isEqualTo(0.0);
	}
}
