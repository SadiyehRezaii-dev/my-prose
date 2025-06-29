/*
 * Copyright (c) 2025 Sadiyeh Rezaii
 *
 * SPDX-License-Identifier: MIT
 */

package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class ExampleSentence implements Sentence {
    @Override
    public String get() {
        return "Es steckt oft mehr Geist und Scharfsinn in einem Irrtum als in einer Entdeckung."; // (Joseph Joubert);
    }
}
