package com.packtpub.mmj.restsample.resources;

import com.packtpub.mmj.restsample.model.Calculation;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/calculation")
public class CalculationController {

    private static final String PATTERN = "^-?+\\d+\\.?+\\d*$";

    @RequestMapping("/power")
    public Calculation pow(@RequestParam(value = "base") String b, @RequestParam(value = "exponent") String e)
    {
        List<String> input = new ArrayList();
        input.add(b);
        input.add(e);

        List<String> output = new ArrayList();

        String powerValue;

        if (b != null && e != null && b.matches(PATTERN) && e.matches(PATTERN))
        {
            powerValue = String.valueOf(Math.pow(Double.valueOf(b), Double.valueOf(e)));
        } else {
            powerValue = "Base or/and Exponent is/are not set to numeric value.";
        }
        output.add(powerValue);
        return new Calculation(input, output, "power");
    }

    @RequestMapping(value = "/sqrt/{value:.+}", method = GET)
    public Calculation sqrt(@PathVariable(value = "value") String aValue)
    {
        List<String> input = new ArrayList();
        input.add(aValue);
        List<String> output = new ArrayList();
        String sqrtValue;
        if (aValue != null && aValue.matches(PATTERN))
        {
            sqrtValue = String.valueOf(Math.sqrt(Double.valueOf(aValue)));
        } else {
            sqrtValue = "Input value is not set to numeric value.";
        }
        output.add(sqrtValue);
        return new Calculation(input, output, "sqrt");
    }

//    @RequestMapping(value = "/sqrt/{value:.+}", method = GET)
//    public Calculation sqrt(@PathVariable(value = "value") String aValue) {
//        List<String> input = new ArrayList();
//        input.add(aValue);
//        List<String> output = new ArrayList();
//        String sqrtValue;
//        if (aValue != null && aValue.matches(PATTERN)) {
//            sqrtValue = String.valueOf(Math.sqrt(Double.valueOf(aValue)));
//        } else {
//            sqrtValue = "Input value is not set to numeric value.";
//        }
//        output.add(sqrtValue);
//        return new Calculation(input, output, "sqrt");
//    }
}
