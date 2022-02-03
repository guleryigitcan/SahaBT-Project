package com.example.stock.application;

import com.example.stock.domain.Stock;

public interface StockApplication {

	Stock addStock(Stock stock);

	Stock updateStock(Stock stock);

}
