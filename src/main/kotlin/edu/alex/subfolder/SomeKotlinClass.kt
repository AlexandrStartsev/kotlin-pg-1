package edu.alex.subfolder

class SomeKotlinClass(var caller: String) {
    val self = "kotlin"
    fun sum(): String {
        return "$caller + $self"
    }
}