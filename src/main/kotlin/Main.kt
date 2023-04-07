fun main() {
    val regCustomer = true
    val amount = 11000

    println("Сумма к оплате ${total(amount, regCustomer)}")
}

fun total(amount: Int, regCustomer: Boolean):Int {
    val disc1amount = 1000
    val disc2amount = 10000
    val discount1 = 100
    val discount2P = 0.05
    val discountRegP = 0.01
    var discAmount = amount
    if (amount > disc2amount) {
        discAmount = (amount*(1 - discount2P)).toInt()
    } else if (amount > disc1amount){
        discAmount = amount - discount1
    }

    return if (regCustomer) {(discAmount*(1 - discountRegP)).toInt()} else {discAmount}
}