package banking.primitive.core;


public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}
	/**
	  Method: getMe
	  Inputs: n/a
	  Returns: singleton - an AccountServerFactory object
	​
	  Description: gets (returns) an account server factory object.
	  If singleton is null, a new server factory is created.
	*/
	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	/**
	  Method: lookup
	  Inputs: n/a
	  Returns: a new ServerSolution object
	​
	  Description: looks up and returns a new account server.
	*/
	public AccountServer lookup() {
		return new ServerSolution();
	}
}
