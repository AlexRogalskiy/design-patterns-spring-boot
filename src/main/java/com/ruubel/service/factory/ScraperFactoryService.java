package com.ruubel.service.factory;

import com.ruubel.service.strategy.BankScraperStrategy;
import com.ruubel.service.strategy.SebScraper;
import com.ruubel.service.strategy.SwedbankScraper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by indrek.ruubel on 03/07/2016.
 */
@Service
public class ScraperFactoryService {

	private List<BankScraperStrategy> strategies;

	public ScraperFactoryService() {
		strategies = createStrategies();
	}

	private List<BankScraperStrategy> createStrategies() {
		return new ArrayList<BankScraperStrategy>() {{
			add(new SebScraper());
			add(new SwedbankScraper());
		}};
	}

	public List<BankScraperStrategy> getStrategies() {
		return strategies;
	}

}
