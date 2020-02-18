
import java.io.File
import java.io.InputStream
fun main (args:Array<String>){
    var inputstream:InputStream = File ("C:\\Program Files\\kotlinc/b_small.in").inputStream()
    var inputStream:InputStream = inputstream
    var inputString = inputStream.bufferedReader().use { it.readText() }
    var inputString_str = inputString.toString();
    var sep = inputString.split("\\s+".toRegex());

    var inputString_str_lines = inputString_str.lines()
    var line1 = inputString_str_lines[0].split("\\s+".toRegex());
    var line2 = inputString_str_lines[1].split("\\s+".toRegex());

    var max = line1[0].toInt()
    var types = line1[1].toInt()

    var counter = types - 1
    var valid = mutableListOf<String>()
    var sum = 0;
    while (counter>=0){
        var tent_counter = counter
        var tent_valid = mutableListOf<String>()
        var tent_sum = 0
        while (tent_counter>= 0) {
            if ((tent_sum + line2[tent_counter].toInt()) <= max){
                tent_sum += line2[tent_counter].toInt()
                tent_valid.add(tent_counter.toString())
            }
            tent_counter -= 1
        }

        if(tent_sum > sum){
            sum = tent_sum
            valid = tent_valid
        }
        counter -= 1
    }
    valid.reverse()
    var valid_str = valid.joinToString( " ")
    var output = "C:\\Program Files\\kotlinc/outputB.in"
    var myOutput =  File(output)
    myOutput.bufferedWriter().use { out->
        out.write(valid.size.toString() + "\n")
        out.write(valid_str)
    }

}















