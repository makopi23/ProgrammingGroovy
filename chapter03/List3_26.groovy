assert 1
assert 10
//assert 0

Iterator iter = [1,2,3,4,5].iterator()
while(iter.hasNext()){
	def n = iter.next()
	if (n != 5){
		assert iter		// 最後の要素ではないIteratorは真
	}else{
		assert !iter	// 最後の要素のIteratorは偽
	}
}