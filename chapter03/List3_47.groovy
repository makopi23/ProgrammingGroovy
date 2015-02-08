ServerSocket serversoc = new ServerSocket(8888)
while(true){
	serversoc.accept{ soc ->
		// socに対する処理。accept時にクロージャがコールアックされる。
	}
}