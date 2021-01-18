package day2

import java.util.*

internal object AssignmentFirstQ2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(2, 7, 4, -5, 11, 5, 20)
        val sc = Scanner(System.`in`)
        val num = sc.nextInt() //specified number
        for (i in arr.indices) {
            for (j in i + 1 until arr.size) {
                if (arr[i] + arr[j] == num) {
                    println("arr[i]" + "," + arr[j])
                }
            }
        }
    }
}