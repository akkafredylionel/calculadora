
package aritmetica;

import exceptions.OperationException;

public class MathOperationImpl implements MathOperation {

    @Override
    public double suma(double num1, double num2) {
	 return num1+num2;
    }

    @Override
    public double resta(double num1, double num2) {
	  return num1-num2;
    }

    @Override
    public double mult(double num1, double num2) {
	  return num1*num2;                                                                                                               
    }

    @Override
    public double div(double num1, double num2) throws OperationException{
	  
	 if(num2 ==0) throw new OperationException("Error");

	 return num1/num2;
    }

    @Override
    public double percent(double num1) {
	  return num1/100;
    }
	  
    @Override
    public double invers(double num1) {
	  return -(num1);
    }

 }

    

