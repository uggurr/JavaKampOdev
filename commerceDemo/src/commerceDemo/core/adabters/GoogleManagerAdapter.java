package commerceDemo.core.adabters;

import commerceDemo.core.abstracts.GoogleService;
import commerceDemo.google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void registerToSystem() {
		GoogleManager googleManager = new GoogleManager();
		googleManager.register();
		
	}

}
