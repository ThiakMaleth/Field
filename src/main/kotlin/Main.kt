/*
A person is moving to his village with a car moving at 20km/h, and he has many
alternative routes.
If he uses route1, he'll move a distance of 5000km
If he uses route2, he'll move a distance of 25000km
If he uses route3, he'll move a distance of 50000km
If he uses another, he'll move a distance of 10000km
Find the time it will take him to reach the village using the separate routes
-using an if statement
-using a when statement
*/

fun main(){

    println("Enter the route: ")
    val route = readln().toString()

    if(route == "route1"){
        println(5000/20)
    }
    else if(route == "route2"){
        println(25000/20)
    }
    else if(route == "route3"){
        println(50000/20)
    }
    else if(route == "route4"){
        println(10000/20)
    }
    else {
        println("Wrong route")
    }
}