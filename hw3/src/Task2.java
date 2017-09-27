public class Task2 {
    public static void main(String[] args) {
        String input = "Vivamus eget tristique magna, quis rutrum ante. Maecenas lobortis, metus ac ultrices scelerisque, metus neque placerat dui, convallis ultricies mi massa viverra lacus. Nam finibus volutpat risus quis sagittis. Morbi faucibus varius erat, quis tempus velit maximus vel. Proin consequat ullamcorper mollis. Nullam malesuada ipsum eu suscipit tincidunt. In eget arcu in mauris commodo ullamcorper. Nam commodo neque in tortor porta, quis gravida leo porttitor. Curabitur gravida consequat mauris, eget aliquet sapien elementum sed. Integer elementum turpis vel nisi porta, at scelerisque felis finibus. Nam consequat risus sed sagittis porttitor. Morbi sit amet lorem id dolor condimentum accumsan sit amet in nisi. Sed eget libero at ligula sodales lobortis. Phasellus eget egestas massa. Cras vitae augue eu justo suscipit efficitur.";
        String justWords = input.replaceAll("[,.]", "");
        String[] separateWords = justWords.split(" ");
        int minLength = separateWords[0].length();
        int maxLength = separateWords[0].length();
        StringBuilder shortest = new StringBuilder();
        StringBuilder longest = new StringBuilder();

        for (String word : separateWords) {
            if (word.length() < minLength) {
                minLength = word.length();
                shortest.setLength(0);
            }
            if (word.length() > maxLength) {
                maxLength = word.length();
                longest.setLength(0);
            }
            if (word.length() == minLength) {
                if (shortest.indexOf(word) == -1) {
                    shortest.append(word);
                    shortest.append(", ");
                }
            }
            if (word.length() == maxLength) {
                if (longest.indexOf(word) == -1) {
                    longest.append(word);
                    longest.append(", ");
                }
            }
        }
        System.out.println("set of shortest words: " + shortest.deleteCharAt(shortest.lastIndexOf(",")));
        System.out.println("set of longest words: " + longest.deleteCharAt(longest.lastIndexOf(",")));
    }
}
