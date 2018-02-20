package thuy.androidplayground

import thuy.annotations.Fancy

@Fancy
data class Person(
    val id: String,
    val firstName: String,
    val lastName: String
)
