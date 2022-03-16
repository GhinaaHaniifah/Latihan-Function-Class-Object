import kotlin.math.pow

fun main (args: Array<String>){
    val pangkat = {bil1: Int, bil2: Int -> bil1.toDouble().pow(bil2).toInt()}
    println("4 pangkat 3 = ${pangkat(4,3)}")
}