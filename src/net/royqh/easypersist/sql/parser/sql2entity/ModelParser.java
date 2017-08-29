package net.royqh.easypersist.sql.parser.sql2entity;

import com.intellij.openapi.vfs.VirtualFile;
import net.royqh.easypersist.sql.model.Model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Created by Roy on 2017/3/13.
 */
public abstract class ModelParser {
    public abstract Model parse(InputStream inputStream, Charset charset);
    public Model parse(VirtualFile sqlFile) {
        try {
            return parse(sqlFile.getInputStream(),sqlFile.getCharset());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
