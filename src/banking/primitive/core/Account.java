package banking.primitive.core;

public abstract class Account implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    protected enum State {
        OPEN, CLOSED, OVERDRAWN
    };

    protected float balance = 0.0F;
    protected String name;

    protected Account(String n) {
        name = n;
        state = State.OPEN;
    }

    protected Account(String n, float b) {
        this(n); 
        balance = b;
    }

    /**
     * @return balance in the Account
     */
    public final float getBalance() {
        return balance;
    }
    
    /**
     * @return name of the Account
     */
    public final String getName() {
        return name;
    }
    
    /**
     * @return either "Checking" or "Savings"
     */
    public abstract String getType();


    /**
     * Adds money to an account. May not be done if the account is CLOSED
     * 
     * @param parameter
     *            amount is a deposit and must be > 0
     * @return true if the deposit was successful, false if not due to amount or
     *         invalid state
     */
    public abstract boolean deposit(float amount);

    /**
     * This is the main method which makes use of addNum method.
     * Returns a string with the account type, name, balance, and state (open or close)
     * @return String with the account type, name on the account, balance, and state
     */
      public String toString() {
          return "Account " + name + " has $" + balance + "and is " + getState()
                  + "\n";
      }
      
    /**
     * Takes money out of an account. If the balance falls below 0 then the
     * account is moved to an OVERDRAWN state
     * 
     * @param parameter
     *            amount is a withdrawal and must be > 0
     * @return true if the deposit was successful, false if not due to amount or
     *         invalid state
     */
    public abstract boolean withdraw(float amount);
    

    protected final State getState() {
        return state;
    }

    protected final void setState(State s) {
        state = s;
    }

    
    private State state;
}
