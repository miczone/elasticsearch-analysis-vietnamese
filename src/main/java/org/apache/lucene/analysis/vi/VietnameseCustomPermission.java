package org.apache.lucene.analysis.vi;

import java.security.BasicPermission;
import com.coccoc.Tokenizer.TokenizeOption;

public class VietnameseCustomPermission extends BasicPermission {
    public VietnameseCustomPermission(String name) {
        super(name);
    }

    public VietnameseCustomPermission(TokenizeOption option) {
        super(option.toString());
    }

    public VietnameseCustomPermission(String name, String actions) {
        super(name, actions);
    }
}
