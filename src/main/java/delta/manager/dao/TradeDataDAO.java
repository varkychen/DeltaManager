package delta.manager.dao;

import java.util.List;

import org.hibernate.Session;

import delta.manager.mvc.model.TradeData;

public class TradeDataDAO implements ReadOnlyDAO<TradeData> {

	@SuppressWarnings("unchecked")
	@Override
	public List<TradeData> list() {
		Session session = DatabaseManager.createSession();
		List<TradeData> data = session.createQuery("FROM TradeData").list();
		return data;
	}

	@Override
	public TradeData read(TradeData t) {
		return null;
	}
}