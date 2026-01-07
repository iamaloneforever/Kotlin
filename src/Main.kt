fun main(args: Array<String>) {
    val success = Result.Success("Success")
    val error = Result.Error("FAILED")
    val progress = Result.Progress("Progress")
    getData(progress)
}

fun getData(result: Result){
    when (result){
        is Result.Success -> result.showMessage()
        is Result.Error -> result.showMessage()
        is Result.Progress -> result.showMessage()
    }
}

sealed class Result(val message : String){
    fun showMessage(){
        println("Result is $message")
    }
    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)
    class Progress(message: String) : Result(message)
}
