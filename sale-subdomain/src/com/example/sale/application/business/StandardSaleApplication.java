package com.example.sale.application.business;

import com.example.sale.application.SaleApplication;
import com.example.sale.infrastructure.SaleEventPublisher;
import com.example.sale.repository.SaleRepository;

public class StandardSaleApplication extends SaleApplication {

	private SaleRepository saleRepository;
	private SaleEventPublisher eventPublisher;

	public StandardSaleApplication(SaleRepository saleRepository, SaleEventPublisher eventPublisher) {
		this.saleRepository = saleRepository;
		this.eventPublisher = eventPublisher;
	}
}
