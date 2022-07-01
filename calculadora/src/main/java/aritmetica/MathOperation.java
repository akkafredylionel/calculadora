
package aritmetica;

import exceptions.OperationException;


public interface MathOperation {

    double suma(double num1, double num2);
    double resta(double num1, double num2);
    double mult(double num1, double num2);
    double div(double num1, double num2)throws OperationException;
    double percent(double num1);
    double invers(double num1);

}
