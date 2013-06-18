package delta.manager.mvc.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import delta.manager.mvc.Model;
import delta.manager.mvc.model.TradeData;
import delta.manager.utils.BeanDispenser;

public class DeltaManagerView implements View<TradeData> {
	private JTextField counterpartyField = new JTextField();
	private JTextField notionalField = new JTextField();
	private JTextField underlyingField = new JTextField();
	private Model<TradeData> model;
	private JFrame frame;
	private List<ViewEventListener> listeners = new ArrayList<ViewEventListener>();
	
	@Override
	public void setupView() {
		frame = BeanDispenser.dispenseBean("delta/manager/mvc/view/beans.xml", "mainWindow", JFrame.class);
		setupSaveTradeButton();
		setupMainFormPanel();
		showMainWindow();
	}

	private void showMainWindow() {
		frame.setTitle("Delta Manager");
		frame.pack();
		frame.setVisible(true);
	}

	private void setupMainFormPanel() {
		JPanel panel = new JPanel(new GridLayout(3,2));
		panel.add(new JLabel("Counterparty"));
		panel.add(counterpartyField);
		
		panel.add(new JLabel("Notional"));
		panel.add(notionalField);
		
		panel.add(new JLabel("Underlying"));
		panel.add(underlyingField);
		frame.add(panel);
	}

	private void setupSaveTradeButton() {
		frame.add(new JButton("Add Trade"), BorderLayout.SOUTH);
	}

	@Override
	public void processUserGesture() {
	}

	@Override
	public void renderData() {
		TradeData data = model.fetchCurrentData();
		counterpartyField.setText(data.getCounterparty());
		notionalField.setText(String.valueOf(data.getNotional()));
		underlyingField.setText(data.getUnderlying());
		frame.repaint();
	}

	@Override
	public void setModel(Model<TradeData> model) {
		this.model = model;
	}

	@Override
	public void addViewEventListener(ViewEventListener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeViewEventListener(ViewEventListener listener) {
		listeners.remove(listener);
	}
}