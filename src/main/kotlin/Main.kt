import java.util.Scanner

val scanner = Scanner(System.`in`)
fun main() {
    println("""1-> Aylana diametri va radiusini topish
    2-> Avtomobillar orasidagi masofani topish
    3-> Radian topish
    4-> 3 xonali sonni ikkinchi va uchinchi sonlarini almashtirish
    5-> 3 xonali sonni ikkinchi va uchinchi sonlarini almashtirish(2-usul)
    6-> Sekunddan soat va minutga o'tkazish
    """.trimMargin())
    when(scanner.nextInt()){
        1->circleArea()
        2->cars()
        3->radian()
        4->converter()
        5->convert()
        6->second()
        else->main()
    }
    main()
}

fun circleArea() {
    println("Aylana yuzasini yozing")
    val s = scanner.nextFloat()
    var r = s / 3.14 / 2
    var d = s / 3.14
    println("Aylana diametri $d radiusi $r")
}

fun cars() {
    println("1-avtomobil tezligini yozing")
    var car1 = scanner.nextInt()
    println("2-avtomobil tezligini yozing")
    var car2 = scanner.nextInt()
    println("Ular orasidagi masofa")
    var s = scanner.nextInt()
    println("Vaqtni kiriting")
    val t = scanner.nextInt()

    car1 *= t
    car2 *= t
    s += car1 + car2
    println("$t soatdan keyin ularning orasidagi masofa $s")
}

fun radian() {
    println("Burchak darajasini kiriting")
    val angle = scanner.nextInt()
    val radian = angle * 3.14 / 180
    println("Radian $radian ga teng")
}

fun converter() {
    println("3 xonali son kiriting")
    val num = scanner.next()
    println("${num[0]}${num[2]}${num[1]}")
}

fun second() {
    println("Sekund kiriting")
    var sec = scanner.nextInt()
    val hour = sec / 3600
    val minute = sec % 3600 / 60
    sec = sec % 3600 % 60
    println("$hour soat $minute daqiqa $sec sekund")
}

fun convert() {
    val num = 123
    val a = num / 100
    val b = num / 10 - a * 10
    val c = num - a * 100 - b * 10
    println("$a$c$b")

}