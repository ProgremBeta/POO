PROBLEMAS EN GENERAL
}
	Error: no se ha encontrado o cargado la clase principal "Nombre De La Clase"

	un problema que tuve fue con los paquetes para que me mostrar los cambios que hacia despues de varias compiladas o cambios en el codigo me salia que no se podia abrir el archivo o documento problema 	

	    java.lang.ClassNotFoundException y el nombre de la clase.

	esto me sucedia por varias razones, por tener errores en el codigo que no lo permitia compilar y ejecutar, para guardar los cambios en el archivo ".class" que se crea en el build (no se muestra en el repositorio ya que esta en un .gitignore) a mi por lo menos lo que me ayudaba a solucionar este problema era borrando el nombre del paquete o comentandolo y descomentandolo.

	    package Taller
	    //package Taller
	    package Taller 

	Primero se muestra como esta el package inicialmente y en la siguiente linea le agrege // para comentarla y en la siguiente linea lo deje como estaba estaba inicialmente. ademas lo compilan y ejecutan a medida que vayan ir haciendo los pasos.
}

{
	error: non-static variable numero1 cannot be referenced from a static context

	mientras trataba de hacer entrada de datos por teclado me aparecia o decias que no detectaba la entrada de datos desde la clase "main".  Yo tenia las variables a las que queria tomar el valor como tipo "int" y no seguia saliendo el error.
	la solucion que encontre o lo que yo hice fue el agregarle un static a las variables para poder usarlas o detectarlas en cualquier parte del codigo

		int numero1;

	asi estaba al inicio, y la clase principal la tenia declarada de la siguiente forma

		public static void main(String[] args)

	al tenerla declarada de esta forma el static por alguna razon no me dejaba llamar esta variable al metodo principal y con agregarle static a la variable que queria usar me funcionaba

		static int numero1;

		public static void main(String[] args)

	de esta forma la variable la podia usar en cualquier parte del programa

	este problema me estaba sucediendo en el archivo Calculadora.java, la pueden encontrar en este repositorio
}