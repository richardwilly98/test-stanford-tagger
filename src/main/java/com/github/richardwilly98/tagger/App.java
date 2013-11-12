package com.github.richardwilly98.tagger;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     // Initialize the tagger
        
     // The sample string
        
        String sample = "This is a sample text";
        
        MaxentTagger tagger = new MaxentTagger(
         
        "models/wsj-0-18-left3words-distsim.tagger");
        
     // The tagged string
        
        String tagged = tagger.tagString(sample);
        
        // Output the result
         
        System.out.println(tagged);
        
        sample = "These are simple examples.";
        
        System.out.println(tagger.tagString(sample));
    }
}
