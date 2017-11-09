package org.rakam.client.builder.document;

/**
 * Created by prvoslav on 10/31/17.
 */
public class SlateConfiguration {

    private final Boolean generateTagDescription;
    private final Boolean generateIntroduction;


    public SlateConfiguration(Boolean generateTagDescription, Boolean generateIntroduction) {
        this.generateTagDescription = generateTagDescription;
        this.generateIntroduction = generateIntroduction;
    }

    public Boolean getGenerateTagDescription() {
        return generateTagDescription;
    }

    public Boolean getGenerateIntroduction() {
        return generateIntroduction;
    }
}
