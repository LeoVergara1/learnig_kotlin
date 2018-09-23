class Fruta(color:String, sabor:String, precio:Int){
    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0

    init {
        this.color = color
        this.sabor = sabor
        this.precio = precio
    }

    fun pudrirse(){
        println("La fruta se esta pudriendo")
    }
}

fun main(args: Array<String>) {

    var manzana = Fruta("Rojo", "Dulce", 2)

    manzana.pudrirse()
}
