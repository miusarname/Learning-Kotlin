fun main() {
   
    var diasSemana:List<String> = listOf( "Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
     
    println(diasSemana.size)
    
    println(diasSemana[3])
    
    println(diasSemana.first())
    println(diasSemana.last())


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    var diasSemana:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles")
    //diasSemana.add("Lunes")
    //println(diasSemana)
    //diasSemana.add("Martes")
    //println(diasSemana)
    //diasSemana.add("Miercoles")
    //println(diasSemana)
    
    var resultado =diasSemana.filter{ it[0] == 'M'  }
    println(resultado)
    
    val diasVacio:MutableList<String> = mutableListOf()
    println(diasSemana)
    println(diasVacio)
    
    diasSemana.forEach{ 
    	diasVacio.add(it + ":")
    }
    
    println(diasSemana)
    println(diasVacio)
}