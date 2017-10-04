package View;

import javax.swing.JPanel;

import Event.Command;
import Event.Notifier;
import Event.Observer;

public abstract class BaseView extends JPanel{
	
	public Notifier notifier = Notifier.controllerNotifier;
	public void notifyObserver(Command command, Object data) {
		notifier.notifyObserver(command.ordinal(), data);
	}
	public BaseView() {
		// TODO Auto-generated constructor stub
		setup();
	}
	protected abstract void setup();
}
