println (1..10).grep{ it % 2 == 0 }	// (1)
println ((1..10).grep{ it % 2 == 0 })	// (2)
assert (1..10).grep{ it % 2 == 0 } == [2, 4, 6, 8, 10]	// (3)

println (1..10).collect{ it*2 } // (4)
println ((1..10).collect{ it*2 })	// (5)
assert (1..10).collect{ it*2 } == [2,4,6,8,10,12,14,16,18,20]	// (6)
