package paypal.services;

import java.time.LocalDate;

import paypal.entities.Contract;
import paypal.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	
	public void processContract(Contract contract, int months) {
		contract.getList().add(new Installment(LocalDate.of(2018, 7, 25),206.04));
	}
}
