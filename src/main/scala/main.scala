object main extends App {
    def repeatedString(s: String, n: Long): Long = {
            println(s + ": " + n)
            val i = (n / s.length)
            val w = (n - i * s.length).toInt
//            println("iter = " + iter + " w = " + w)

            var acc = s.count(ch => ch == 'a') * i
//            println(acc)
//            println("acc = " + acc)

            for (i <- 0 to w - 1) {
                if (s.charAt(i) == 'a') acc += 1
            }

//            println("acc = " + acc)
            acc
    }

    println(repeatedString("aba", 10) == 7)
    println(repeatedString("a", 1000000000000L) == 1000000000000L)
    println(repeatedString("adsfdfkgmergdbdlgnenaANVSLDNGELWNDSKDVNSNdfgbndrkndlkbvndlfnbvldernlbvdnfbld", 16945000000L) == 1000000000L)
    println(repeatedString("ab", 123456789000000L) == (123456789000000L / 2))

}
