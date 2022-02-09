fun Media(n1: Float, n2: Float)
{
    var result : Float = (n1 + n2)/2

    if(result >= 9)
        println("A")
    else if(result >= 7.5)
        println("A")
    else if(result >= 6)
        println("A")
    else
        println("D")
}

fun main(args: Array<String>) {

    val pr_totais : Float = 50F
    var faltas : Float = 10F
    var n1 : Float = 8F
    var n2 : Float = 10F

    var faltas_por : Float = (pr_totais - faltas)/(pr_totais) * 100

    println(faltas_por)

    if(faltas_por >= 75)
    {
        Media(n1, n2)
    }
    else
    {
        println("FF")
    }
}