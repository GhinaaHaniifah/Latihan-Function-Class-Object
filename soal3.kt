class Barang(val nama: String, var harga: Int, var jumlah: Int, var diskon: Double){
    fun tampil(){
        println("Nama Barang: $nama")
        println("Harga: Rp.$harga")
        println("Jumlah: $jumlah")
        println("Diskon: ${diskon.toInt()}%")
    }
    fun hitungTotal(){
        var total = jumlah * (harga - ((diskon/100)*harga))
        println("Total Harga: Rp.${total.toInt()}")
        println(" ")
    }
}

fun main(args: Array<String>){
    val brg = Barang ("Detergent", 23000, 3, 25.0)
    val brg2 = Barang ("Sprite", 15000, 2, 10.0)
    brg.tampil()
    brg.hitungTotal()
    brg2.tampil()
    brg2.hitungTotal()
}