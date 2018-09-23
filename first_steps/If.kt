/*Estructuras de Control : If Else
 * IntroducciÃ³n Operadores aritmÃ©ticos, de comparaciÃ³n y lÃ³gicos */
fun main(args: Array<String>) {
	var a1 = 2
    var b1 = 9

    if (a1 > b1) println("Mas grade") else println("Menos")
    var a = 123
    var b = 11
    var c = 5
    var numeroMayor:Int

   numeroMayor = if(a>b && a>c) a else if(b>a && b>c) b else c

   println("El numero mayor de todas mis variables es: $numeroMayor")
}