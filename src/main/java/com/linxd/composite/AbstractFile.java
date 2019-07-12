package com.linxd.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/12 22:24
 * Description: 定义文件类型
 */
public interface AbstractFile {
    void killVirus();
}
class File implements AbstractFile {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--查杀文件：" + name);
    }
}
class Folder implements AbstractFile {
    private String name;
    private List<AbstractFile> files = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void killVirus() {
        System.out.println("--查杀文件夹：" + name);
        for (AbstractFile file : files) {
            file.killVirus();
        }
    }
}
