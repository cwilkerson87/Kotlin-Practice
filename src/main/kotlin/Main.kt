
fun main(){

    val vending = VendingMachine()

    var pressed = true
    val money = 70


    if(vending.isButtonPressed(pressed)){

        vending.balance(10,money)
        vending.getItem(1)
    }
}

class VendingMachine(){

    var change: Int = 0

    fun balance(itemCost:Int, personAmount:Int ) {

        if(personAmount > itemCost)
            change = personAmount - itemCost
        else
            println("You dont have enough money")

            println("You received $change cents back")
    }

    fun getItem(itemChoice: Int){
        val item = mapOf(1 to "Chips", 5 to "Candy", 10 to "Drink", 25 to "Milk")

        if(change > 0) {
            when (itemChoice) {
                1 -> println("Here is your ${item.getValue(1)}")
                5 -> println("Here is your ${item.getValue(5)}")
                10 -> println("Here is your ${item.getValue(10)}")
                25 -> println("Here is you ${item.getValue(25)}")
                else -> println("That's not a selection")
            }
            if (isDispense(true)) {
                println("You have your ${item.getValue(itemChoice)}")
            }
        }
    }

    fun isButtonPressed(pressed: Boolean):Boolean{
        return pressed
    }

    private fun isDispense(dispensed: Boolean):Boolean{
        return dispensed
    }

}



