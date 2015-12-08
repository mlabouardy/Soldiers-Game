package exception;

public class MaxWeaponException extends RuntimeException{

	public MaxWeaponException(){
		super("Max of weapons reached !");
	}
}
