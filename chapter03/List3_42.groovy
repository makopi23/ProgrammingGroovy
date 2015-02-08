int foo(){
	def x = 0
	3.times {
		x++
	}
	x
}

println foo()
assert foo() == 3