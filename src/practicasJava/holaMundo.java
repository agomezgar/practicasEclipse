package practicasJava;
/**
 * 
 * 
 * @author antonio
 *Lo que viene a continuación es la clase principal
 *de mi primera práctica con Eclipse Mars
 */

public class holaMundo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * @deprecated Aviso de metodo obsoleto...
		 */
		
ver("Antonio","Pedro","Pablo","lola");
clasePrueba prueba1=new clasePrueba();
clasePrueba prueba2=new clasePrueba();
System.out.println(prueba1.variable);
System.out.println(prueba2.variable);
prueba1.cambiaVariable(2);
System.out.println(prueba1.variable);
System.out.println(prueba2.variable);
	}
	public static void ver(String... palabra){
		for (String a: palabra){
			System.out.println(a);
		}
	}
}
