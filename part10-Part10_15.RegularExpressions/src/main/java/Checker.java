

public class Checker {

    public boolean timeOfDay(String string){
        return string.matches("([01][01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
        // return string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");
    }

    public boolean allVowels(String string){
        return string.matches("[aeiou]*");
    }

    public boolean isDayOfWeek(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
}
