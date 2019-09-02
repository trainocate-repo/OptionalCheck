import java.util.Optional;

public class Sample {

	public static void main(String[] args) {
		String str = null;

//		System.out.println(str.length());
		Optional<String> strOpt = Optional.ofNullable(str);

//		System.out.println(strOpt.get().length());//実行時エラーになってしまう

		if(strOpt.isPresent()) {
			String message = strOpt.get();
			System.out.println(message);
		}
//
		strOpt.ifPresent(v -> System.out.println(v.length()));//java8 ラムダとOptionalはセットが想定されている
	
//		String changedStr = strOpt.map(v -> v.length() + "文字です").orElse("0文字です");
//		System.out.println(changedStr);

	}
}
