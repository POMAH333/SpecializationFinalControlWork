package src;

import src.Repo.LocalRepository;
import src.Repo.Repository;
import src.View.ConsoleView;
import src.View.View;
import src.Controller.Controller;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            View view = new ConsoleView(scanner);
            Repository repository = new LocalRepository();
            Controller presenter = new Controller(view, repository);
            presenter.init();
        }
    }
}
