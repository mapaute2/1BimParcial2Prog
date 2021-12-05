/*Universidad Técnica Particular de Loja
Prueba Primer Bimestre Segundo Parcial
Nombre: María ALejandra Paute
Ciclo: 3ro "A"

Resolución del ejercicio

*/

def metodo(num: Int): Double = {

  def f(x:Double, num:Int): Double = x * x - num

  def Derivada_f(x: Double): Double = 2 * x

  var a = 1.00

  (1 to 7).foreach(k => a = a - f(a, num) / Derivada_f(a))

  a

}

metodo(10)


