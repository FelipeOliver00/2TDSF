package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Mantém a anotação até a execução do código
@Retention(RetentionPolicy.RUNTIME)
//Onde pode ser colocado a anotação (Field - atributo)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface Coluna {

	String nome();
	
	boolean obrigatorio() default false;
	
}