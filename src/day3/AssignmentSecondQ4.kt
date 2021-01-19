package day3

import java.util.*

object AssignmentSecondQ4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val apples = ArrayList<Int>()
        val sc = Scanner(System.`in`)
        var total = 0
        println("Enter the weights for apple =")
        var i = 0
        while (true) {
            val value = sc.nextInt()
            if (value == -1) {
                break
            }
            apples.add(value)
            total = total + apples[i]
            i++
        }
        Collections.sort(apples, Collections.reverseOrder())
        val ramShare = total * 0.5
        val shyamShare = total * 0.3
        val rahimShare = total * 0.2

        println()
        println("Ram")
        getShares(apples, ramShare)
        println()
        println("Shyam")
        getShares(apples, shyamShare)
        println()
        println("Rahim")
        getShares(apples, rahimShare)
    }

    fun getShares(apples: ArrayList<Int>, share: Double) {
        var sum = 0
        for (i in apples.indices) {
            if (apples[i] <= share) {
                sum = sum + apples[i]
                if (sum <= share) {
                    println(apples[i])
                    apples.remove(i)
                }
                if (sum > share) {
                    sum = sum - apples[i]
                }
            }
        }
    }
}