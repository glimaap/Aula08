
public class Login {

	public static void main(String[] args) {
		
		String emailDigitado =  "admin@fiap.com.br";
		String senhaDigitada =  "123456";
		String tokenDigitado = "beatriz";
		
		boolean loginOK =  validarLogin(emailDigitado, senhaDigitada, tokenDigitado);
		
		System.out.println(loginOK);
	}
	
	
	
	
	public static boolean validarLogin(String email, String senha, String token) {
		boolean retorno = false;
		
		if (email.equals("admin@fiap.com.br") && senha.equals("123456") && token.equals("beatriz") ){
			retorno = true;
			
		}
		
		return retorno;
	} 
	/*
	//modificadorAcesso palavraChave tipoRetorno nomeFuncao(parametros) {
	processo
	retorno
	}
	*/ 

	
	//p1=email, p2=token, p3=senha
	public static boolean validar(String p1, String p2, String p3) {
		return true;
	}
	

}