package using_composition;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFileSystem {
    private final String name;
    private final List<IFileSystem> subFileSystems;

    public Folder(final String s) {
        name = s;
        subFileSystems = new ArrayList<>();
    }

    public void addFileSystem(final IFileSystem fileSystem) {
        subFileSystems.add(fileSystem);
    }

    @Override
    public void ls(final String parenPath) {
        for(final var fs: subFileSystems) {
            fs.ls(parenPath+"/"+name);
        }
    }

    @Override
    public void ls() {
        ls("");
    }
}
