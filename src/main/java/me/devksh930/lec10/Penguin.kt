package me.devksh930.lec10

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flayable {

    private var wingCount: Int = 2


    override fun move() {
        println("펭귄이 이동합니다 꿱꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flayable>.act()
    }

    override fun fly() {
        TODO("Not yet implemented")
    }


}