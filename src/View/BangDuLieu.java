package View;

import javax.swing.JTable;

import Event.Command;
import Event.Notifier;

public abstract class BangDuLieu<T> extends JTable{
	protected abstract void setInputData(T data);
	public Notifier notifier = Notifier.controllerNotifier;
	public void notifyObserver(Command command, Object data) {
		notifier.notifyObserver(command.ordinal(), data);
	}
}
