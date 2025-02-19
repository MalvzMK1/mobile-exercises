fun defineHashMap(): HashMap<String, (distanceInMeters: Float) -> Float> {
  val hashMap = hashMapOf<String, (Float) -> Float>(
    "km" to { it / 1000 },
    "cm" to { it * 100 },
    "mm" to { it * 10000 }
  )

  return hashMap
}

fun main() {
  val distanceConversorHashMap = defineHashMap()
  
  print("Distância em metros: ")
  val distanceInMeters = readLine()!!.toFloat()

  for ((key, func) in distanceConversorHashMap)
    println("Distância em ${key}: ${func(distanceInMeters)}${key}")
}