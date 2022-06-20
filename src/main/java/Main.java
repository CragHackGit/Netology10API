public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.surname = "Жернояров";
        post.name = "Дмитрий";
        post.patronymic = "Евгеньевич";
        post.phone = "+7(960)-848-71-88";
        post.passport = "4444 № 44444444";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 25;
        post.birthday.month = 12;
        post.birthday.year = 1988;
    }
}
