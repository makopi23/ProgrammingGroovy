def a = "ABC"

assert "Hi ${a*2}" == "Hi ABCABC"
assert "Hi ${a}" == "Hi ABC"
assert "Hi $a" == "Hi ABC"

println "Hi ${a*2}"
println "Hi ${a}"
println "Hi $a"
