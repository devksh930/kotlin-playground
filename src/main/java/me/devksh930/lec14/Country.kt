package me.devksh930.lec14


fun handleCountry(country: Country) {
    when (country) {
        Country.AMERICA -> TODO()
        Country.KOREA -> TODO()
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US");
}