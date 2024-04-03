package br.com.fiap.softsales.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TipoMovimentacaoValidator implements ConstraintValidator<TipoMovimentacao, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.equals("RECEITA") || value.equals("DESPESA");
    }

}