package delta.manager.main;

import delta.manager.mvc.MVC;
import delta.manager.mvc.model.TradeData;
import delta.manager.utils.BeanDispenser;

public class DeltaManagerMain {

	public static void main(String[] args) {
		MVC<TradeData> deltaManager = BeanDispenser.dispenseBean("delta.manager.main.beans.xml", "mvc", MVC<TradeData>.class)
		deltaManager.startMVC();
	}
}
	