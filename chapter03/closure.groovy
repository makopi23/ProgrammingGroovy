Closure clos1 = { println "Hello closure!" }
//println clos1.toString()
assert clos1 instanceof groovy.lang.Closure
clos1.call()
clos1()

Closure clos2 = {target -> println "Hello $target" }
clos2.call("Groovy")
