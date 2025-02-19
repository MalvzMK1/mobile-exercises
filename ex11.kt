fun main() {
  print("Altura: ")
  val height = readLine()!!.toFloat()

  print("Largura: ")
  val width = readLine()!!.toFloat()

  if (height < 0f || width < 0f) {
    println("Tamanhos inválidos")

    return
  }

  val radius = height * width
  val necessaryPaintLiterForSquareMeters = 0.5f

  println("Vai ser necessário ${necessaryPaintLiterForSquareMeters * radius}L de tinta para pintar ${radius}m²")
}