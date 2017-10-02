package Factory;

import Controller.BaseController;
import Event.Command;

public abstract class FactoryController {
	public BaseController takeConstroller(Command type) {
		BaseController baseConstrller;
		baseConstrller = createController(type);
		return baseConstrller;
	}
	
	protected abstract BaseController createController(Command type);
}
