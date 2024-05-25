# Bend Language Sample [![JetBrains IntelliJ Platform SDK Docs](https://jb.gg/badges/docs.svg)][docs]
*Reference: [Custom Language Support Tutorial in IntelliJ SDK Docs][docs:custom_language_support_tutorial]*

## Quickstart

Defines a new language, _Bend language_ with support for syntax highlighting, annotations, code completion, and other features.

### Extension Points

| Name                                          | Implementation                                                                          | Extension Point Class               |
|-----------------------------------------------|-----------------------------------------------------------------------------------------|-------------------------------------|
| `com.intellij.fileType`                       | [BendFileType][file:BendFileType]                                                   | `LanguageFileType`                  |
| `com.intellij.lang.parserDefinition`          | [BendParserDefinition][file:BendParserDefinition]                                   | `ParserDefinition`                  |
| `com.intellij.lang.syntaxHighlighterFactory`  | [BendSyntaxHighlighterFactory][file:BendSyntaxHighlighterFactory]                   | `SyntaxHighlighterFactory`          |
| `com.intellij.colorSettingsPage`              | [BendColorSettingsPage][file:BendColorSettingsPage]                                 | `ColorSettingsPage`                 |
| `com.intellij.annotator`                      | [BendAnnotator][file:BendAnnotator]                                                 | `Annotator`                         |
| `com.intellij.codeInsight.lineMarkerProvider` | [BendLineMarkerProvider][file:BendLineMarkerProvider]                               | `RelatedItemLineMarkerProvider`     |
| `com.intellij.completion.contributor`         | [BendCompletionContributor][file:BendCompletionContributor]                         | `CompletionContributor`             |
| `com.intellij.psi.referenceContributor`       | [BendReferenceContributor][file:BendReferenceContributor]                           | `PsiReferenceContributor`           |
| `com.intellij.lang.refactoringSupport`        | [BendRefactoringSupportProvider][file:BendRefactoringSupportProvider]               | `RefactoringSupportProvider`        |
| `com.intellij.lang.findUsagesProvider`        | [BendFindUsagesProvider][file:BendFindUsagesProvider]                               | `FindUsagesProvider`                |
| `com.intellij.lang.foldingBuilder`            | [BendFoldingBuilder][file:BendFoldingBuilder]                                       | `FoldingBuilderEx`                  |
| `com.intellij.gotoSymbolContributor`          | [BendChooseByNameContributor][file:BendChooseByNameContributor]                     | `ChooseByNameContributor`           |
| `com.intellij.lang.psiStructureViewFactory`   | [BendStructureViewFactory][file:BendStructureViewFactory]                           | `PsiStructureViewFactory`           |
| `com.intellij.lang.formatter`                 | [BendFormattingModelBuilder][file:BendFormattingModelBuilder]                       | `FormattingModelBuilder`            |
| `com.intellij.codeStyleSettingsProvider`      | [BendCodeStyleSettingsProvider][file:BendCodeStyleSettingsProvider]                 | `CodeStyleSettingsProvider`         |
| `com.intellij.langCodeStyleSettingsProvider`  | [BendLanguageCodeStyleSettingsProvider][file:BendLanguageCodeStyleSettingsProvider] | `LanguageCodeStyleSettingsProvider` |
| `com.intellij.lang.commenter`                 | [BendCommenter][file:BendCommenter]                                                 | `Commenter`                         |

*Reference: [Plugin Extension Points in IntelliJ SDK Docs][docs:ep]*


[docs]: https://plugins.jetbrains.com/docs/intellij/
[docs:custom_language_support_tutorial]: https://plugins.jetbrains.com/docs/intellij/custom-language-support-tutorial.html
[docs:ep]: https://plugins.jetbrains.com/docs/intellij/plugin-extensions.html

[file:BendFileType]: ./src/main/java/org/intellij/sdk/language/BendFileType.java
[file:BendParserDefinition]: ./src/main/java/org/intellij/sdk/language/BendParserDefinition.java
[file:BendSyntaxHighlighterFactory]: ./src/main/java/org/intellij/sdk/language/BendSyntaxHighlighterFactory.java
[file:BendColorSettingsPage]: ./src/main/java/org/intellij/sdk/language/BendColorSettingsPage.java
[file:BendAnnotator]: ./src/main/java/org/intellij/sdk/language/BendAnnotator.java
[file:BendLineMarkerProvider]: ./src/main/java/org/intellij/sdk/language/BendLineMarkerProvider.java
[file:BendCompletionContributor]: ./src/main/java/org/intellij/sdk/language/BendCompletionContributor.java
[file:BendReferenceContributor]: ./src/main/java/org/intellij/sdk/language/BendReferenceContributor.java
[file:BendRefactoringSupportProvider]: ./src/main/java/org/intellij/sdk/language/BendRefactoringSupportProvider.java
[file:BendFindUsagesProvider]: ./src/main/java/org/intellij/sdk/language/BendFindUsagesProvider.java
[file:BendFoldingBuilder]: ./src/main/java/org/intellij/sdk/language/BendFoldingBuilder.java
[file:BendChooseByNameContributor]: ./src/main/java/org/intellij/sdk/language/BendChooseByNameContributor.java
[file:BendStructureViewFactory]: ./src/main/java/org/intellij/sdk/language/BendStructureViewFactory.java
[file:BendFormattingModelBuilder]: ./src/main/java/org/intellij/sdk/language/BendFormattingModelBuilder.java
[file:BendCodeStyleSettingsProvider]: ./src/main/java/org/intellij/sdk/language/BendCodeStyleSettingsProvider.java
[file:BendLanguageCodeStyleSettingsProvider]: ./src/main/java/org/intellij/sdk/language/BendLanguageCodeStyleSettingsProvider.java
[file:BendCommenter]: ./src/main/java/org/intellij/sdk/language/BendCommenter.java

