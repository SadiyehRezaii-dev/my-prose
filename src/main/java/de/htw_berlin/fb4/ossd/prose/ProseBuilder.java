

/* 
 * Copyright (c) 2025 Sadiyeh Rezaii
 *
 *  SPDX-License-Identifier: MIT
 */
package de.htw_berlin.fb4.ossd.prose;

import java.util.ArrayList;
import java.util.List;

public class ProseBuilder implements Prose {

    private final List<Sentence> sentences;

    public ProseBuilder(){
        sentences = new ArrayList<>();
    }
    public void register(Sentence sentence){
        sentences.add(sentence);
    }

    public String build(){
        StringBuilder builder = new StringBuilder();
        sentences.forEach(x -> {builder.append(x.get()); builder.append("\n");});
        return builder.toString();
    }

    @Override
    public String get() {
        return build();
    }
}
