// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package org.intellij.sdk.language;

import com.intellij.application.options.CodeStyleAbstractConfigurable;
import com.intellij.application.options.CodeStyleAbstractPanel;
import com.intellij.application.options.TabbedLanguageCodeStylePanel;
import com.intellij.psi.codeStyle.CodeStyleConfigurable;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;
import org.jetbrains.annotations.NotNull;

final class BendCodeStyleSettingsProvider extends CodeStyleSettingsProvider {

  @Override
  public CustomCodeStyleSettings createCustomSettings(@NotNull CodeStyleSettings settings) {
    return new BendCodeStyleSettings(settings);
  }

  @Override
  public String getConfigurableDisplayName() {
    return "Bend";
  }

  @NotNull
  public CodeStyleConfigurable createConfigurable(@NotNull CodeStyleSettings settings,
                                                  @NotNull CodeStyleSettings modelSettings) {
    return new CodeStyleAbstractConfigurable(settings, modelSettings, this.getConfigurableDisplayName()) {
      @Override
      protected @NotNull CodeStyleAbstractPanel createPanel(@NotNull CodeStyleSettings settings) {
        return new BendCodeStyleMainPanel(getCurrentSettings(), settings);
      }
    };
  }

  private static class BendCodeStyleMainPanel extends TabbedLanguageCodeStylePanel {

    public BendCodeStyleMainPanel(CodeStyleSettings currentSettings, CodeStyleSettings settings) {
      super(BendLanguage.INSTANCE, currentSettings, settings);
    }

  }

}
