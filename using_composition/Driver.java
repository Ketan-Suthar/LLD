package using_composition;

public class Driver {
    public static void main(String[] args) {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File naruto = new File("naruto");
        File onePiece = new File("one piece");
        File avengers = new File("Avengers");
        File batman = new File("Batman");
        Folder movie = new Folder("movie");
        Folder anime = new Folder("anime");
        movie.addFileSystem(avengers);
        movie.addFileSystem(batman);
        anime.addFileSystem(naruto);
        anime.addFileSystem(onePiece);
        Folder root = new Folder("root");

        root.addFileSystem(movie);
        root.addFileSystem(anime);
        root.addFileSystem(file1);
        root.addFileSystem(file2);

        root.ls();
    }
}
