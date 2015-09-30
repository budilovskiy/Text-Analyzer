package org.stepic.textanalyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer {

	protected abstract String[] getKeywords();

	protected abstract Label getLabel();

	@Override
	public Label processText(String text) {
		for (String keyword : getKeywords()) {
			if (text.contains(keyword)) {
				return getLabel();
			}
		}
		return Label.OK;
	}
	
	public Label checkLabels(TextAnalyzer[] analyzers, String text) {
		for (TextAnalyzer analyzer : analyzers) {
			if (analyzer.processText(text) != Label.OK) {
				return analyzer.processText(text);
			}
		}
	    return Label.OK;
	}

}
