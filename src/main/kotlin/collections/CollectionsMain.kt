package collections

import java.util.*

//List - Set the same
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3, -4, -8)
val sudoUsers: List<Int> = systemUsers

fun addSystemUser(userToAdd: Int) {
    systemUsers.add(userToAdd)
    println(systemUsers.javaClass)
    println(sudoUsers.javaClass)
}

fun showSudoUsersAndFilterNegative(): List<Int> {
     return sudoUsers.filter { x -> x > 0}
//    return sudoUsers.filter { it > 0 } //both are viable
}

fun showSudoUsersAndPerformMapOperation(): List<Int> {
    return sudoUsers.map { it * 2 }
}

//Map
const val EXTRA_POINTS = 15
val accountStatus: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 200, 3 to 300)
val accountReport: Map<Int, Int> = accountStatus

fun updateAccountStatus(accountId: Int) {
    if(accountStatus.containsKey(accountId)){
        println("Updating account status with id: $accountId")
        accountStatus[accountId] = accountStatus.getValue(accountId) + EXTRA_POINTS
    } else {
        println("Cannot find account with id: $accountId")
    }
}

fun reportAllAccountsStatus() {
    accountReport.forEach{ (k, v) -> println("$k: $v$")
    }
}

fun main() {
    addSystemUser(23)
    println("There are ${sudoUsers.size} sudo users")

    showSudoUsersAndFilterNegative().forEach{
        i -> println("Info for user $i")
    }

    println("============================")
    reportAllAccountsStatus()
    updateAccountStatus(1)
    updateAccountStatus(1)
    updateAccountStatus(2)
    reportAllAccountsStatus()

}