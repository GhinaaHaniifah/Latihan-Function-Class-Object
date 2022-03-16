import kotlin.math.sqrt

fun jarak (x1: Int, y1: Int, x2: Int, y2: Int): Double
{
    val hasil = sqrt (((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)).toDouble())

    return hasil
}

fun main (args : Array<String>){
    println ("Jarak antara t1(2,3) dan t2(8,7): ${jarak(2,3,8,7)}")
    println ("Jarak antara t1(5,3) dan t2(-8,-4):  ${jarak(5,3,-8,-4)}")
}