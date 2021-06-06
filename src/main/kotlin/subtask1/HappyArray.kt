package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var mutableList = sadArray.toMutableList()
        do {
            var sadArrayisHappy = false
            for (x in 1 .. mutableList.size-2) {
                if (mutableList[x] > mutableList[x - 1] + mutableList[x + 1]) {
                    mutableList.removeAt(x)
                    sadArrayisHappy = true
                    break
                }
            }
        } while (sadArrayisHappy)
        return mutableList.toIntArray()}
}
