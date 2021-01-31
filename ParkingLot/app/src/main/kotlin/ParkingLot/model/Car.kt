package ParkingLot.model


data class Car(val regN: String, val color: String) {
    override fun toString() = "$regN $color"
}