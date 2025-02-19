fun main() {
  val dolarQuotation = 6f;

  print("Saldo na carteira: ")
  val balance = readLine()!!.toFloat()

  println("Com R$${String.format("%.2f", balance)}, é possível comprar ${String.format("%.2f", balance / dolarQuotation)} dólares")
}