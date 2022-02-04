package com.example.sale.application.business;

import com.example.sale.application.SaleApplication;
import com.example.sale.application.business.events.AddedSaleEvent;
import com.example.sale.domain.Sale;
import com.example.sale.infrastructure.SaleEventPublisher;
import com.example.sale.repository.SaleRepository;

public class StandardSaleApplication implements SaleApplication {

	private SaleRepository saleRepository;
	private SaleEventPublisher eventPublisher;

	public StandardSaleApplication(SaleRepository saleRepository, SaleEventPublisher eventPublisher) {
		this.saleRepository = saleRepository;
		this.eventPublisher = eventPublisher;
	}

	@Override
	public Sale add(Sale sale) {
		Sale addedSale = saleRepository.add(sale);
		var businessEvent = new AddedSaleEvent(addedSale);
		eventPublisher.publishEvent(businessEvent);
		return addedSale;
	}
}
