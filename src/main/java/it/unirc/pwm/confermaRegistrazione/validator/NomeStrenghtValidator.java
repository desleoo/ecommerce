package it.unirc.pwm.confermaRegistrazione.validator;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class NomeStrenghtValidator extends FieldValidatorSupport {

	static Pattern numeri = Pattern.compile("[0-9]");

	
	@Override
	public void validate(Object arg0) throws ValidationException {
		
		String nome = (String) this.getFieldValue(this.getFieldName(), arg0);
		System.out.println("-- "+nome);
		
		Boolean nomeContieneNumeri = numeri.matcher(nome).find();
		
		if(nomeContieneNumeri){
			addFieldError(getFieldName(), arg0);
		}
	}

}
