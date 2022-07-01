
package exceptions;


/*@author Fredy Leonel*/

public class OperationException extends Exception {

    public OperationException(String string) {
	  super(string);
    }

    public OperationException(String string, Throwable thrwbl) {
	  super(string, thrwbl);
    }

}
