
class Dog {
	void cry(){
	    println "dog"
	}
}

class Cat {
	void cry(){
	    println "cat"
	}
}

void kick(obj){
	obj.cry()
}

//kick(new Dog())
//kick(new Cat())

static void main(args){
    kick(new Dog())
    kick(new Cat())
}