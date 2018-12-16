package edu.alex.subfolder

class SomeKotlinClass(var dependency: SomeKotlinInterface) {
    val self = "kotlin"
    fun report(): String {
        return "${dependency.foo()} + $self"
    }

    fun report2(): String {
        return dependency.foo2(self)
    }
}