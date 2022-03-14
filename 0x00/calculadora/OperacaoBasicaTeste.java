public class OperacaoBasicaTeste {

    public static boolean testar_soma() {
	if (OperacaoBasica.somar(5, 3) == 8) {
	    return true;
	}
	return false;
    }

    public static boolean testar_subtracao() {
	if (OperacaoBasica.subtrair(5, 3) == 2) {
	    return true;
	}
	return false;
    }

    public static boolean testar_multiplicacao() {
	if (OperacaoBasica.multiplicar(5, 3) == 15) {
	    return true;
	}
	return false;
    }

    public static boolean testar_divisao() {
	if (OperacaoBasica.dividir(9, 3) == 3) {
	    return true;
	}
	return false;
    }

// Outra versão
//    public static boolean testar_soma() {
//	return OperacaoBasica.somar(5, 3) == 8 ? true : false;
//    }
//
//    public static boolean testar_subtracao() {
//	return OperacaoBasica.subtrair(5, 3) == 2 ? true : false;
//    }
//
//    public static boolean testar_multiplicacao() {
//	return OperacaoBasica.multiplicar(5, 3) == 15 ? true : false;
//    }
//
//    public static boolean testar_divisao() {
//	return OperacaoBasica.dividir(9, 3) == 3 ? true : false;
//    }
}
