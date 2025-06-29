/*
 * Copyright (c) 2025 Sadiyeh Rezaii
 *
 * SPDX-License-Identifier: MIT
 */


package de.htw_berlin.fb4.ossd.prose.example;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        Sentence s1 = () -> "Haste mal ne Mark?";

        ProseBuilder builder = new ProseBuilder();
        builder.register(s1);
        builder.register(new ExampleSentence());
        String result = builder.get();
        System.out.println( result);
    }
}
