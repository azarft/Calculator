package com.example.demo;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Calculator {
    private double op1;
    private double op2;
    private char operator;
    private String result;

    public void calculate(){
        if(this.operator == '+') {
            this.result = String.valueOf(this.op1 + this.op2);
        }
        if(this.operator == '-') {
            this.result = String.valueOf(this.op1 - this.op2);
        }
        if(this.operator == '*') {
            this.result = String.valueOf(this.op1 * this.op2);
        }
        if (this.operator == '/') {
            try {
                if (this.op2 == 0) {
                    throw new DivisionByZeroException("Cannot divide by zero.");
                }
                this.result = String.valueOf(this.op1 / this.op2);
            } catch (DivisionByZeroException ex) {
                this.result = ex.getMessage();
            }
        }
    }

    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public String getResult() {
        return result;
    }

}
