package View;


import Event.Command;

public class PanelThemSuaXoaH extends PanelThemSuaXoa{
	
	public PanelThemSuaXoaH() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void handleEventThem() {
		// TODO Auto-generated method stub
		notifyObserver(Command.RThemYC,null);
	}

	@Override
	protected void handleEventSua() {
		// TODO Auto-generated method stub
		notifyObserver(Command.RSuaYC, null);

	}

	@Override
	protected void handleEventXoa() {
		// TODO Auto-generated method stub
		notifyObserver(Command.RXoaYC, null);
	}
}
