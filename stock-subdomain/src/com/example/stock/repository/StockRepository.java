package com.example.stock.repository;

import com.example.stock.domain.Stock;
import com.example.stock.domain.StockKeepingUnit;

public interface StockRepository {

	boolean existByStockKeepingUnit(StockKeepingUnit sku);

	Stock add(Stock stock);

	Stock update(Stock stock);

}
