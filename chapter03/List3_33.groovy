list = ['x']
def gs = "$list ${list[0]}"
//String gs = "$list ${list[0]}"
println gs
assert gs instanceof GString
assert gs == "[x] x"


list[0] = 'y'
println gs
assert gs == "[y] x"

