// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ElixirCallArgumentsNoParenthesesMany extends PsiElement {

  @Nullable
  ElixirCallArgumentsNoParenthesesKeywords getCallArgumentsNoParenthesesKeywords();

  @NotNull
  List<ElixirExpression> getExpressionList();

  @NotNull
  List<ElixirNoParenthesesManyStrictNoParenthesesExpression> getNoParenthesesManyStrictNoParenthesesExpressionList();

}