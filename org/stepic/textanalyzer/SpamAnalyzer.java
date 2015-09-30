package org.stepic.textanalyzer;

public class SpamAnalyzer extends KeywordAnalyzer {

	private String[] keywords;

	public SpamAnalyzer(String[] keywords) {
		this.keywords = keywords;
	}

	protected String[] getKeywords() {
		return keywords;
	}

	@Override
	protected Label getLabel() {
		return Label.SPAM;
	}
}
