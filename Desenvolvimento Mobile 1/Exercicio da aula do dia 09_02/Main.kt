fun main(args: Array<String>) {

    val Numeros_pares = mutableListOf<Int>()

    for (i in 0 .. 100)
    {
        if(i%2 == 0)
        {
            Numeros_pares.add(i)
        }
    }
    println(Numeros_pares)
}