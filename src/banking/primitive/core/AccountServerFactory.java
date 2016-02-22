package banking.primitive.core;


public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}
	/**
	  Method: getMe()
	  Inputs: n/a
	  Returns: singleton - an AccountServerFactory object
	​
	  Description: Returns the singleton AccountServerFactory;
	  if there is no such thing, a new one is created in its
	  place. 
	*/
	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}
	/**
	  Method: lookup()
	  Inputs: n/a
	  Returns: an account server
	​
	  Description: Looks up and searches for an account server.
	*/
	public AccountServer lookup() {
		return new ServerSolution();
	}
}
