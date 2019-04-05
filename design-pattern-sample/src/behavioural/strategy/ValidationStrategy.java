package behavioural.strategy;

public interface ValidationStrategy {

	<T extends UserInput> boolean validate(T input);
	ValidationType getValidationType();

}
