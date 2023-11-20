package com.example.demo;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Calculator {
    private double op1;
    private double op2;
    private char operator;
    private double result;

    public void calculate() throws DivisionByZeroException {
        if(this.operator == '+') {
            this.result = this.op1 + this.op2;
        }
        if(this.operator == '-') {
            this.result = this.op1 - this.op2;
        }
        if(this.operator == '*') {
            this.result = this.op1 * this.op2;
        }
        if (this.operator == '/') {
            if (this.op2 == 0) {
                throw new DivisionByZeroException("Cannot divide by zero.");
            }
            this.result = this.op1 / this.op2;
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

    public double getResult() {
        return result;
    }

}
