package delta.manager.mvc.model;

import java.util.List;

import delta.manager.dao.TradeDataDAO;
import delta.manager.mvc.Model;

public class DeltaManagerModel implements Model<TradeData> {
	
	private int currentRecord = 0;
	private List<TradeData> tradeDataList;
	
	@Override
	public void initialize() {
		TradeDataDAO dao = new TradeDataDAO();
		tradeDataList = dao.list();
	}

	@Override
	public TradeData fetchCurrentData() {
		return tradeDataList.get(currentRecord);
	}
	
	@Override
	public void saveData(TradeData t) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void deleteData(TradeData t) {
		throw new UnsupportedOperationException();
	}
}