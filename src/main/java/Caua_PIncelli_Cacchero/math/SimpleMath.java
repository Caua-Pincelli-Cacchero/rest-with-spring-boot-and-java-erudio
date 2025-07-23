package Caua_PIncelli_Cacchero.math;

import Caua_PIncelli_Cacchero.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }

    public Double mult(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double div(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }

    public Double avg(Double numberOne, Double numberTwo){
        return (numberOne + numberTwo) / 2;
    }

    public Double sqrt(Double number){
        return Math.sqrt(number);
    }

}
