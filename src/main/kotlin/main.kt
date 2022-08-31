fun main() {
    var n:Int

    for(h in 0..9) {
        for (t in 0..9) {
            for (o in 1..9) {
                n = h*100 + t*10 +o
                if (n == h*h*h + t*t*t + o*o*o)
                        println(n)

            }
        }
    }

}