/*Ciclos When*/
fun main(args: Array<String>) {
 val calificacion = 10
 var resena:String

 when(calificacion){

     1 -> resena = "No me gusto la comida, me causo malestar."
     2 -> resena = "No me gusto, pero la bebida si"
     3 -> {println("El cliente califico con 3 estrellas")
           resena = "Mediocre"}
     4 -> resena = "Me gusto pero puede mejorar."
     5,6,7 -> resena = "La mejor comida mexicana en mucho tiempo"
     in 8..10 -> resena = "El mejor rango"
     else -> resena = "Reseña mal escrita"

 }

    print(resena)

}