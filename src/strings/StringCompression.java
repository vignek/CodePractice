package strings;

public class StringCompression {

	public static void main(String[] args) {
		String input = "AAabeABBBBCC";
		input = input.toLowerCase();

		int count = 1;

		char last = input.charAt(0);

		StringBuilder output = new StringBuilder();

		for(int i = 1; i < input.length(); i++){
			if(input.charAt(i) == last){
				count++;
			}else{
				if(count > 0){
					output.append(""+last+count);
				}else{
					output.append(last);
				}
				count = 1;
				last = input.charAt(i);
			}
		}
		System.out.println(output.toString());

	}

}
