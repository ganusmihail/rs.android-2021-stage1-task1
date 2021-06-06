package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var payment = 0
        for (i in 0 until bill.size) {
            if (i != k) payment += bill[i] }
        if (payment/2 ==b) {
            return "bon appetit" }
        else { return (b-payment/2).toString()}
    }

}
