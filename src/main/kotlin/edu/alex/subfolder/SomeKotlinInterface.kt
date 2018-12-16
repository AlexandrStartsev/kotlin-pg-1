package edu.alex.subfolder


interface SomeKotlinInterface {
    @edu.alex.PlatformName("foo")
    fun foo(): String

    @edu.alex.PlatformName("foo2")
    fun foo2(a: String): String
}