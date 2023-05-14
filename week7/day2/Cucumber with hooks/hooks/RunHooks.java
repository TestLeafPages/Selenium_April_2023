package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class RunHooks {
	@Before
	public void beforeHook() {
		System.out.println("This works before the scenario");
	}

	@After
	public void afterHook() {
		System.out.println("This works after the scenario");
	}
}
