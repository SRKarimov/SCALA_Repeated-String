def repeatedString(s: String, n: Long): Long = {

    if (s == "a") n else {
        println(s + ": " + n)
        val iter: Int = (n / s.length).toInt
        val w: Int = (n - iter * s.length).toInt
        println("iter = " + iter + " w = " + w)

        var acc: Int = 0
        for (_ <- 0 to iter - 1) {
            acc += s.count(ch => ch == 'a')
            println(acc)
        }
        println("acc = " + acc)

        for (i <- 0 to w - 1) {
            if (s.charAt(i) == 'a') acc += 1
        }
        println("acc = " + acc)
        acc
    }
}

println(repeatedString("aba", 10) == 7)
println(repeatedString("a", 1000000000000L) == 1000000000000L)
println(repeatedString("adsfdfkgmergdbdlgnenaANVSLDNGELWNDSKDVNSNdfgbndrkndlkbvndlfnbvldernlbvdnfbld", 16945000000L) == 1000000000L)
