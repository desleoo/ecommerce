package it.unirc.pwm.confermaRegistrazione.validator;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/*
 * Il validator, per essere utilizzabile nella validazione xml, deve essere
 * dichiarato nel file validators.xml presente in /src
 */
public class CognomeStrenghtValidator extends FieldValidatorSupport {
static Pattern numeri = Pattern.compile("[0-9]");

	
	@Override
	public void validate(Object arg0) throws ValidationException {
		
		String cognome = (String) this.getFieldValue(this.getFieldName(), arg0);
		System.out.println("-- "+cognome);
		
		Boolean cognomeContieneNumeri = numeri.matcher(cognome).find();
		
		if(cognomeContieneNumeri){
			addFieldError(getFieldName(), arg0);
		}
	}

}
