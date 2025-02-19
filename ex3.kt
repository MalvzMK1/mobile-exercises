fun main() {
  print("Salário: ")
  val salary = readLine()?.toFloat()

  print("Nome: ")
  val name = readLine()

  println("O(A) funcionário(a) ${name} tem um salário de R$${String.format("%.2f", salary)} em junho")
}