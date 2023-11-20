package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class HelloController {
    Calculator calc = new Calculator();

    @FXML
    private TextField inputField;

    @FXML
    protected void onButtonPlusClick(){

        calc.setOperator('+');

        String val = inputField.getText(); // val = "21"
        // convert val to d double

        double d = Double.parseDouble(val);

        calc.setOp1(d);

        inputField.setText("");

    }

    @FXML
    protected void onButtonMinusClick(){

        calc.setOperator('-');

        String val = inputField.getText();


        double d = Double.parseDouble(val);

        calc.setOp1(d);

        inputField.setText("");

    }

    @FXML
    protected void onButtonMultiplicationClick(){

        calc.setOperator('*');

        String val = inputField.getText();


        double d = Double.parseDouble(val);

        calc.setOp1(d);

        inputField.setText("");

    }

    @FXML
    protected void onButtonDivisionClick(){

        calc.setOperator('/');

        String val = inputField.getText();


        double d = Double.parseDouble(val);

        calc.setOp1(d);

        inputField.setText("");

    }

    @FXML
    protected void onButtonEqualClick(){

        String val = inputField.getText();
        double d = Double.parseDouble(val);

        calc.setOp2(d);

        try {
            calc.calculate();
            String result = String.valueOf(calc.getResult());
            inputField.setText(result);
        }
        catch (DivisionByZeroException ex){
            inputField.setText(ex.getMessage());
        }
    }

    @FXML
    protected void onButtonClearClick(){

        calc.setOp2(0);
    }

    @FXML
    protected void onButtonOneClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "1" );
    }

    @FXML
    protected void onButtonTwoClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "2" );
    }

    @FXML
    protected void onButtonThreeClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "3" );
    }

    @FXML
    protected void onButtonFourClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "4" );
    }

    @FXML
    protected void onButtonFiveClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "5" );
    }

    @FXML
    protected void onButtonSixClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "6" );
    }

    @FXML
    protected void onButtonSevenClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "7" );
    }

    @FXML
    protected void onButtonEightClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "8" );
    }

    @FXML
    protected void onButtonNineClick(){
        String val = inputField.getText();
        if(val.equals("0")) val="";
        inputField.setText( val + "9" );
    }

    @FXML
    protected void onButtonZeroClick(){
        String val = inputField.getText();
        if(!val.equals("0")) {
            inputField.setText(val + "0");
        }
    }



}