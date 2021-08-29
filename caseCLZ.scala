import scala.io.StdIn._
import math.{pow, sqrt}
object caseCLZ extends App{

  case class Point(a:Int, b:Int){
    def x:Int=a
    def y:Int=b

    //move a point by a given distance dx and dy
    def move(dx:Int, dy:Int)=Point(this.x+dx, this.y+dy)
    //add(+) two points
    def +(that:Point)=Point(this.x + that.x, this.y + that.y)
    //return the distance between two points
    def distance(d: Point) : Double = { sqrt(pow(x-d.x, 2) + pow(y-d.y, 2))}
    //switch the x and y coordinates
    def invert(p:Point) = Point(p.y, p.x)

  }
  //get user choice
  println("Select your choice : \n\t\t 1 - Add two points \n\t\t 2 - Move a point by distance dx and dy \n\t\t 3 - Find the distance between two given points \n\t\t 4 - Switch the x and y coordinates")
  println("Enter your choice (number) : ")
  val choice = readInt()

  if(choice == 1){
    println("Enter the values of first point (x1, y1)")
    val x1 = readInt()
    val y1 = readInt()
    val p1 = Point(x1,y1)

    println("Enter the values of second point (x2, y2)")
    val x2 = readInt()
    val y2 = readInt()
    val p2 = Point(x2,y2)

    println("Sum of two points : ")
    print(p1+p2)
  }
  else if(choice == 2){
    println("Enter the values of point (x1, y1)")
    val x1 = readInt()
    val y1 = readInt()
    val p = Point(x1,y1)

    println("Enter the distance to move (dx, dy)")
    val dx = readInt()
    val dy = readInt()

    println("Point after moving the given distance : ")
    println(p.move(dx,dy))
  }
  else if(choice == 3){
    println("Enter the values of first point (x1, y1)")
    val x1 = readInt()
    val y1 = readInt()
    val p1 = Point(x1,y1)

    println("Enter the values of second point (x2, y2)")
    val x2 = readInt()
    val y2 = readInt()
    val p2 = Point(x2,y2)

    println("Distance between the points : ")
    print(p1.distance(p2))
  }
  else if(choice == 4){
    println("Enter the values of the point (x1, y1)")
    val x1 = readInt()
    val y1 = readInt()
    val p1 = Point(x1,y1)

    println("Inverted point : ")
    print(p1.invert(p1))
  }
  else{
    println(" Invalid input! ")
  }

}
