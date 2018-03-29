package com.lapots.breed.rule.generator.template.populator;

import com.lapots.breed.rule.domain.DataRule;
import com.lapots.breed.rule.generator.template.populator.api.AbstractPopulator;
import com.lapots.breed.rule.generator.template.populator.api.ITemplatePopulator;
import com.lapots.breed.rule.internal.ConfigurationHolder;

import java.util.Map;

/**
 * Populates package name in template.
 */
public class PackageNamePopulator extends AbstractPopulator {
    /**
     * Constructor.
     *
     * @param next next populator in chain
     */
    public PackageNamePopulator(ITemplatePopulator next) {
        super(next);
    }

    @Override
    protected Map<String, Object> internalPopulate(Map<String, Object> templateData, DataRule src) {
        templateData.put("package", ConfigurationHolder.findByKey("default_package"));
        return templateData;
    }
}
