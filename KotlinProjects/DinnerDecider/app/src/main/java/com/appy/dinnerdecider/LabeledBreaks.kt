package com.appy.dinnerdecider

class LabeledBreaks {

    fun labelBreaks() {

        // kotlin gives additional controll over loops that is LabeledBreaks
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (i > 10) break@loop   // a break qualified by label jumps to the execution point
                                         // right after the loop marked with that label
            }
        }
    }

}