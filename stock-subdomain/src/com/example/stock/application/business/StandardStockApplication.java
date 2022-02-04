package com.example.stock.application.business;

import com.example.stock.infrastructure.EventPublisher;
import com.example.stock.application.StockApplication;
import com.example.stock.application.business.events.StockAddedEvent;
import com.example.stock.application.business.events.StockUpdatedEvent;
import com.example.stock.application.business.exception.ExistingStockException;
import com.example.stock.application.business.exception.StockNotFoundException;
import com.example.stock.domain.Stock;
import com.example.stock.repository.StockRepository;

public class StandardStockApplication implements StockApplication {

	private StockRepository stockRepository;
	private EventPublisher eventPublisher;

	public StandardStockApplication(StockRepository stockRepository, EventPublisher eventPublisher) {
		this.stockRepository = stockRepository;
		this.eventPublisher = eventPublisher;
	}

	@Override
	public Stock addStock(Stock stock) {
		var stockKeepingUnit = stock.getSku();
		if (stockRepository.existByStockKeepingUnit(stockKeepingUnit))
			throw new ExistingStockException("Stock already exist", stockKeepingUnit.getValue());
		Stock addedStock = stockRepository.add(stock);
		var businessEvent = new StockAddedEvent(addedStock);
		eventPublisher.publishEvent(businessEvent);
		return addedStock;
	}

	@Override
	public Stock updateStock(Stock stock) {
		var stockKeepingUnit = stock.getSku();
		if (!stockRepository.existByStockKeepingUnit(stockKeepingUnit))
			throw new StockNotFoundException("Stock does not exist!", stockKeepingUnit.getValue());
		Stock updatedStock = stockRepository.update(stock);
		var businessEvent = new StockUpdatedEvent(updatedStock);
		eventPublisher.publishEvent(businessEvent);
		return updatedStock;
	}

}
