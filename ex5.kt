fun main() {
  print("Nota 1: ")
  val grade1 = readLine()!!.toFloat()

  print("Nota 2: ")
  val grade2 = readLine()!!.toFloat()

  val average = (grade1 + grade2) / 2

  println("Média: ${String.format("%.2f", average)}")
}