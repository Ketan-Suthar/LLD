package using_composition;

public class File implements IFileSystem {
    private final String name;

    public File(final String s) {
        name = s;
    }

    @Override
    public void ls(final String parentPath) {
        System.out.println(parentPath + "/" + name);
    }

    @Override
    public void ls() {
        ls("");
    }
}
