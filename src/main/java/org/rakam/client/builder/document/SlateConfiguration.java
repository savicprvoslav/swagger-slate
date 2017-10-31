package org.rakam.client.builder.document;

/**
 * Created by prvoslav on 10/31/17.
 */
public class SlateConfiguration {

    private final Boolean generateTagDescription;

    public SlateConfiguration(Boolean generateTagDescription) {
        this.generateTagDescription = generateTagDescription;
    }

    public Boolean getGenerateTagDescription() {
        return generateTagDescription;
    }
}
