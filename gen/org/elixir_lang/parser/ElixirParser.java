// This is a generated file. Not intended for manual editing.
package org.elixir_lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.elixir_lang.psi.ElixirTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class ElixirParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ACCESS_EXPRESSION) {
      r = accessExpression(b, 0);
    }
    else if (t == ADDITION_INFIX_OPERATOR) {
      r = additionInfixOperator(b, 0);
    }
    else if (t == ADJACENT_EXPRESSION) {
      r = adjacentExpression(b, 0);
    }
    else if (t == ALIAS) {
      r = alias(b, 0);
    }
    else if (t == AND_INFIX_OPERATOR) {
      r = andInfixOperator(b, 0);
    }
    else if (t == ANONYMOUS_FUNCTION) {
      r = anonymousFunction(b, 0);
    }
    else if (t == ARROW_INFIX_OPERATOR) {
      r = arrowInfixOperator(b, 0);
    }
    else if (t == ASSOCIATIONS) {
      r = associations(b, 0);
    }
    else if (t == ASSOCIATIONS_BASE) {
      r = associationsBase(b, 0);
    }
    else if (t == AT_NUMERIC_OPERATION) {
      r = atNumericOperation(b, 0);
    }
    else if (t == AT_PREFIX_OPERATOR) {
      r = atPrefixOperator(b, 0);
    }
    else if (t == ATOM) {
      r = atom(b, 0);
    }
    else if (t == ATOM_KEYWORD) {
      r = atomKeyword(b, 0);
    }
    else if (t == BINARY_DIGITS) {
      r = binaryDigits(b, 0);
    }
    else if (t == BINARY_WHOLE_NUMBER) {
      r = binaryWholeNumber(b, 0);
    }
    else if (t == BIT_STRING) {
      r = bitString(b, 0);
    }
    else if (t == BLOCK_IDENTIFIER) {
      r = blockIdentifier(b, 0);
    }
    else if (t == BLOCK_ITEM) {
      r = blockItem(b, 0);
    }
    else if (t == BLOCK_LIST) {
      r = blockList(b, 0);
    }
    else if (t == BRACKET_ARGUMENTS) {
      r = bracketArguments(b, 0);
    }
    else if (t == CAPTURE_NUMERIC_OPERATION) {
      r = captureNumericOperation(b, 0);
    }
    else if (t == CAPTURE_PREFIX_OPERATOR) {
      r = capturePrefixOperator(b, 0);
    }
    else if (t == CHAR_LIST_HEREDOC) {
      r = charListHeredoc(b, 0);
    }
    else if (t == CHAR_LIST_HEREDOC_LINE) {
      r = charListHeredocLine(b, 0);
    }
    else if (t == CHAR_LIST_LINE) {
      r = charListLine(b, 0);
    }
    else if (t == CHAR_TOKEN) {
      r = charToken(b, 0);
    }
    else if (t == COMPARISON_INFIX_OPERATOR) {
      r = comparisonInfixOperator(b, 0);
    }
    else if (t == CONTAINER_ASSOCIATION_OPERATION) {
      r = containerAssociationOperation(b, 0);
    }
    else if (t == DECIMAL_DIGITS) {
      r = decimalDigits(b, 0);
    }
    else if (t == DECIMAL_FLOAT) {
      r = decimalFloat(b, 0);
    }
    else if (t == DECIMAL_FLOAT_EXPONENT) {
      r = decimalFloatExponent(b, 0);
    }
    else if (t == DECIMAL_FLOAT_EXPONENT_SIGN) {
      r = decimalFloatExponentSign(b, 0);
    }
    else if (t == DECIMAL_FLOAT_FRACTIONAL) {
      r = decimalFloatFractional(b, 0);
    }
    else if (t == DECIMAL_FLOAT_INTEGRAL) {
      r = decimalFloatIntegral(b, 0);
    }
    else if (t == DECIMAL_WHOLE_NUMBER) {
      r = decimalWholeNumber(b, 0);
    }
    else if (t == DO_BLOCK) {
      r = doBlock(b, 0);
    }
    else if (t == DOT_INFIX_OPERATOR) {
      r = dotInfixOperator(b, 0);
    }
    else if (t == EMPTY_PARENTHESES) {
      r = emptyParentheses(b, 0);
    }
    else if (t == ENCLOSED_HEXADECIMAL_ESCAPE_SEQUENCE) {
      r = enclosedHexadecimalEscapeSequence(b, 0);
    }
    else if (t == END_OF_EXPRESSION) {
      r = endOfExpression(b, 0);
    }
    else if (t == ESCAPED_CHARACTER) {
      r = escapedCharacter(b, 0);
    }
    else if (t == ESCAPED_EOL) {
      r = escapedEOL(b, 0);
    }
    else if (t == HAT_INFIX_OPERATOR) {
      r = hatInfixOperator(b, 0);
    }
    else if (t == HEREDOC_LINE_PREFIX) {
      r = heredocLinePrefix(b, 0);
    }
    else if (t == HEREDOC_PREFIX) {
      r = heredocPrefix(b, 0);
    }
    else if (t == HEXADECIMAL_DIGITS) {
      r = hexadecimalDigits(b, 0);
    }
    else if (t == HEXADECIMAL_ESCAPE_PREFIX) {
      r = hexadecimalEscapePrefix(b, 0);
    }
    else if (t == HEXADECIMAL_WHOLE_NUMBER) {
      r = hexadecimalWholeNumber(b, 0);
    }
    else if (t == IN_INFIX_OPERATOR) {
      r = inInfixOperator(b, 0);
    }
    else if (t == IN_MATCH_INFIX_OPERATOR) {
      r = inMatchInfixOperator(b, 0);
    }
    else if (t == INTERPOLATED_CHAR_LIST_BODY) {
      r = interpolatedCharListBody(b, 0);
    }
    else if (t == INTERPOLATED_CHAR_LIST_HEREDOC_LINE) {
      r = interpolatedCharListHeredocLine(b, 0);
    }
    else if (t == INTERPOLATED_CHAR_LIST_SIGIL_HEREDOC) {
      r = interpolatedCharListSigilHeredoc(b, 0);
    }
    else if (t == INTERPOLATED_CHAR_LIST_SIGIL_LINE) {
      r = interpolatedCharListSigilLine(b, 0);
    }
    else if (t == INTERPOLATED_REGEX_BODY) {
      r = interpolatedRegexBody(b, 0);
    }
    else if (t == INTERPOLATED_REGEX_HEREDOC) {
      r = interpolatedRegexHeredoc(b, 0);
    }
    else if (t == INTERPOLATED_REGEX_HEREDOC_LINE) {
      r = interpolatedRegexHeredocLine(b, 0);
    }
    else if (t == INTERPOLATED_REGEX_LINE) {
      r = interpolatedRegexLine(b, 0);
    }
    else if (t == INTERPOLATED_SIGIL_BODY) {
      r = interpolatedSigilBody(b, 0);
    }
    else if (t == INTERPOLATED_SIGIL_HEREDOC) {
      r = interpolatedSigilHeredoc(b, 0);
    }
    else if (t == INTERPOLATED_SIGIL_HEREDOC_LINE) {
      r = interpolatedSigilHeredocLine(b, 0);
    }
    else if (t == INTERPOLATED_SIGIL_LINE) {
      r = interpolatedSigilLine(b, 0);
    }
    else if (t == INTERPOLATED_STRING_BODY) {
      r = interpolatedStringBody(b, 0);
    }
    else if (t == INTERPOLATED_STRING_HEREDOC_LINE) {
      r = interpolatedStringHeredocLine(b, 0);
    }
    else if (t == INTERPOLATED_STRING_SIGIL_HEREDOC) {
      r = interpolatedStringSigilHeredoc(b, 0);
    }
    else if (t == INTERPOLATED_STRING_SIGIL_LINE) {
      r = interpolatedStringSigilLine(b, 0);
    }
    else if (t == INTERPOLATED_WORDS_BODY) {
      r = interpolatedWordsBody(b, 0);
    }
    else if (t == INTERPOLATED_WORDS_HEREDOC) {
      r = interpolatedWordsHeredoc(b, 0);
    }
    else if (t == INTERPOLATED_WORDS_HEREDOC_LINE) {
      r = interpolatedWordsHeredocLine(b, 0);
    }
    else if (t == INTERPOLATED_WORDS_LINE) {
      r = interpolatedWordsLine(b, 0);
    }
    else if (t == INTERPOLATION) {
      r = interpolation(b, 0);
    }
    else if (t == KEYWORD_KEY) {
      r = keywordKey(b, 0);
    }
    else if (t == KEYWORD_PAIR) {
      r = keywordPair(b, 0);
    }
    else if (t == KEYWORDS) {
      r = keywords(b, 0);
    }
    else if (t == LIST) {
      r = list(b, 0);
    }
    else if (t == LITERAL_CHAR_LIST_BODY) {
      r = literalCharListBody(b, 0);
    }
    else if (t == LITERAL_CHAR_LIST_HEREDOC_LINE) {
      r = literalCharListHeredocLine(b, 0);
    }
    else if (t == LITERAL_CHAR_LIST_SIGIL_HEREDOC) {
      r = literalCharListSigilHeredoc(b, 0);
    }
    else if (t == LITERAL_CHAR_LIST_SIGIL_LINE) {
      r = literalCharListSigilLine(b, 0);
    }
    else if (t == LITERAL_REGEX_BODY) {
      r = literalRegexBody(b, 0);
    }
    else if (t == LITERAL_REGEX_HEREDOC) {
      r = literalRegexHeredoc(b, 0);
    }
    else if (t == LITERAL_REGEX_HEREDOC_LINE) {
      r = literalRegexHeredocLine(b, 0);
    }
    else if (t == LITERAL_REGEX_LINE) {
      r = literalRegexLine(b, 0);
    }
    else if (t == LITERAL_SIGIL_BODY) {
      r = literalSigilBody(b, 0);
    }
    else if (t == LITERAL_SIGIL_HEREDOC) {
      r = literalSigilHeredoc(b, 0);
    }
    else if (t == LITERAL_SIGIL_HEREDOC_LINE) {
      r = literalSigilHeredocLine(b, 0);
    }
    else if (t == LITERAL_SIGIL_LINE) {
      r = literalSigilLine(b, 0);
    }
    else if (t == LITERAL_STRING_BODY) {
      r = literalStringBody(b, 0);
    }
    else if (t == LITERAL_STRING_HEREDOC_LINE) {
      r = literalStringHeredocLine(b, 0);
    }
    else if (t == LITERAL_STRING_SIGIL_HEREDOC) {
      r = literalStringSigilHeredoc(b, 0);
    }
    else if (t == LITERAL_STRING_SIGIL_LINE) {
      r = literalStringSigilLine(b, 0);
    }
    else if (t == LITERAL_WORDS_BODY) {
      r = literalWordsBody(b, 0);
    }
    else if (t == LITERAL_WORDS_HEREDOC) {
      r = literalWordsHeredoc(b, 0);
    }
    else if (t == LITERAL_WORDS_HEREDOC_LINE) {
      r = literalWordsHeredocLine(b, 0);
    }
    else if (t == LITERAL_WORDS_LINE) {
      r = literalWordsLine(b, 0);
    }
    else if (t == MAP_ARGUMENTS) {
      r = mapArguments(b, 0);
    }
    else if (t == MAP_CONSTRUCTION_ARGUMENTS) {
      r = mapConstructionArguments(b, 0);
    }
    else if (t == MAP_OPERATION) {
      r = mapOperation(b, 0);
    }
    else if (t == MAP_PREFIX_OPERATOR) {
      r = mapPrefixOperator(b, 0);
    }
    else if (t == MAP_UPDATE_ARGUMENTS) {
      r = mapUpdateArguments(b, 0);
    }
    else if (t == MATCH_INFIX_OPERATOR) {
      r = matchInfixOperator(b, 0);
    }
    else if (t == MATCHED_ADDITION_OPERATION) {
      r = matchedExpression(b, 0, 13);
    }
    else if (t == MATCHED_AND_OPERATION) {
      r = matchedExpression(b, 0, 7);
    }
    else if (t == MATCHED_ARROW_OPERATION) {
      r = matchedExpression(b, 0, 10);
    }
    else if (t == MATCHED_AT_NON_NUMERIC_OPERATION) {
      r = matchedAtNonNumericOperation(b, 0);
    }
    else if (t == MATCHED_AT_UNQUALIFIED_BRACKET_OPERATION) {
      r = matchedAtUnqualifiedBracketOperation(b, 0);
    }
    else if (t == MATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL) {
      r = matchedAtUnqualifiedNoParenthesesCall(b, 0);
    }
    else if (t == MATCHED_BRACKET_OPERATION) {
      r = matchedExpression(b, 0, 21);
    }
    else if (t == MATCHED_CAPTURE_NON_NUMERIC_OPERATION) {
      r = matchedCaptureNonNumericOperation(b, 0);
    }
    else if (t == MATCHED_COMPARISON_OPERATION) {
      r = matchedExpression(b, 0, 8);
    }
    else if (t == MATCHED_DOT_CALL) {
      r = matchedExpression(b, 0, 17);
    }
    else if (t == MATCHED_EXPRESSION) {
      r = matchedExpression(b, 0, -1);
    }
    else if (t == MATCHED_HAT_OPERATION) {
      r = matchedExpression(b, 0, 15);
    }
    else if (t == MATCHED_IN_MATCH_OPERATION) {
      r = matchedExpression(b, 0, 0);
    }
    else if (t == MATCHED_IN_OPERATION) {
      r = matchedExpression(b, 0, 11);
    }
    else if (t == MATCHED_MATCH_OPERATION) {
      r = matchedExpression(b, 0, 5);
    }
    else if (t == MATCHED_MULTIPLICATION_OPERATION) {
      r = matchedExpression(b, 0, 14);
    }
    else if (t == MATCHED_OR_OPERATION) {
      r = matchedExpression(b, 0, 6);
    }
    else if (t == MATCHED_PARENTHESES_ARGUMENTS) {
      r = matchedParenthesesArguments(b, 0);
    }
    else if (t == MATCHED_PIPE_OPERATION) {
      r = matchedExpression(b, 0, 4);
    }
    else if (t == MATCHED_QUALIFIED_ALIAS) {
      r = matchedExpression(b, 0, 22);
    }
    else if (t == MATCHED_QUALIFIED_BRACKET_OPERATION) {
      r = matchedExpression(b, 0, 23);
    }
    else if (t == MATCHED_QUALIFIED_NO_ARGUMENTS_CALL) {
      r = matchedExpression(b, 0, 25);
    }
    else if (t == MATCHED_QUALIFIED_NO_PARENTHESES_CALL) {
      r = matchedExpression(b, 0, 18);
    }
    else if (t == MATCHED_QUALIFIED_PARENTHESES_CALL) {
      r = matchedExpression(b, 0, 24);
    }
    else if (t == MATCHED_RELATIONAL_OPERATION) {
      r = matchedExpression(b, 0, 9);
    }
    else if (t == MATCHED_TWO_OPERATION) {
      r = matchedExpression(b, 0, 12);
    }
    else if (t == MATCHED_TYPE_OPERATION) {
      r = matchedExpression(b, 0, 3);
    }
    else if (t == MATCHED_UNARY_NON_NUMERIC_OPERATION) {
      r = matchedUnaryNonNumericOperation(b, 0);
    }
    else if (t == MATCHED_UNQUALIFIED_BRACKET_OPERATION) {
      r = matchedUnqualifiedBracketOperation(b, 0);
    }
    else if (t == MATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL) {
      r = matchedUnqualifiedNoArgumentsCall(b, 0);
    }
    else if (t == MATCHED_UNQUALIFIED_NO_PARENTHESES_CALL) {
      r = matchedUnqualifiedNoParenthesesCall(b, 0);
    }
    else if (t == MATCHED_UNQUALIFIED_PARENTHESES_CALL) {
      r = matchedUnqualifiedParenthesesCall(b, 0);
    }
    else if (t == MATCHED_WHEN_OPERATION) {
      r = matchedExpression(b, 0, 2);
    }
    else if (t == MULTIPLICATION_INFIX_OPERATOR) {
      r = multiplicationInfixOperator(b, 0);
    }
    else if (t == NO_PARENTHESES_ARGUMENTS) {
      r = noParenthesesArguments(b, 0);
    }
    else if (t == NO_PARENTHESES_EXPRESSION) {
      r = noParenthesesExpression(b, 0);
    }
    else if (t == NO_PARENTHESES_FIRST_POSITIONAL) {
      r = noParenthesesFirstPositional(b, 0);
    }
    else if (t == NO_PARENTHESES_KEYWORD_PAIR) {
      r = noParenthesesKeywordPair(b, 0);
    }
    else if (t == NO_PARENTHESES_KEYWORDS) {
      r = noParenthesesKeywords(b, 0);
    }
    else if (t == NO_PARENTHESES_MANY_ARGUMENTS) {
      r = noParenthesesManyArguments(b, 0);
    }
    else if (t == NO_PARENTHESES_MANY_ARGUMENTS_UNQUALIFIED_IDENTIFIER) {
      r = noParenthesesManyArgumentsUnqualifiedIdentifier(b, 0);
    }
    else if (t == NO_PARENTHESES_MANY_POSITIONAL_AND_MAYBE_KEYWORDS_ARGUMENTS) {
      r = noParenthesesManyPositionalAndMaybeKeywordsArguments(b, 0);
    }
    else if (t == NO_PARENTHESES_MANY_STRICT_NO_PARENTHESES_EXPRESSION) {
      r = noParenthesesManyStrictNoParenthesesExpression(b, 0);
    }
    else if (t == NO_PARENTHESES_ONE_ARGUMENT) {
      r = noParenthesesOneArgument(b, 0);
    }
    else if (t == NO_PARENTHESES_ONE_POSITIONAL_AND_KEYWORDS_ARGUMENTS) {
      r = noParenthesesOnePositionalAndKeywordsArguments(b, 0);
    }
    else if (t == NO_PARENTHESES_STRICT) {
      r = noParenthesesStrict(b, 0);
    }
    else if (t == OCTAL_DIGITS) {
      r = octalDigits(b, 0);
    }
    else if (t == OCTAL_WHOLE_NUMBER) {
      r = octalWholeNumber(b, 0);
    }
    else if (t == OPEN_HEXADECIMAL_ESCAPE_SEQUENCE) {
      r = openHexadecimalEscapeSequence(b, 0);
    }
    else if (t == OR_INFIX_OPERATOR) {
      r = orInfixOperator(b, 0);
    }
    else if (t == PARENTHESES_ARGUMENTS) {
      r = parenthesesArguments(b, 0);
    }
    else if (t == PARENTHETICAL_STAB) {
      r = parentheticalStab(b, 0);
    }
    else if (t == PIPE_INFIX_OPERATOR) {
      r = pipeInfixOperator(b, 0);
    }
    else if (t == QUOTE_CHAR_LIST_BODY) {
      r = quoteCharListBody(b, 0);
    }
    else if (t == QUOTE_HEXADECIMAL_ESCAPE_SEQUENCE) {
      r = quoteHexadecimalEscapeSequence(b, 0);
    }
    else if (t == QUOTE_STRING_BODY) {
      r = quoteStringBody(b, 0);
    }
    else if (t == RELATIONAL_INFIX_OPERATOR) {
      r = relationalInfixOperator(b, 0);
    }
    else if (t == RELATIVE_IDENTIFIER) {
      r = relativeIdentifier(b, 0);
    }
    else if (t == SIGIL_HEXADECIMAL_ESCAPE_SEQUENCE) {
      r = sigilHexadecimalEscapeSequence(b, 0);
    }
    else if (t == SIGIL_MODIFIERS) {
      r = sigilModifiers(b, 0);
    }
    else if (t == STAB) {
      r = stab(b, 0);
    }
    else if (t == STAB_BODY) {
      r = stabBody(b, 0);
    }
    else if (t == STAB_INFIX_OPERATOR) {
      r = stabInfixOperator(b, 0);
    }
    else if (t == STAB_NO_PARENTHESES_SIGNATURE) {
      r = stabNoParenthesesSignature(b, 0);
    }
    else if (t == STAB_OPERATION) {
      r = stabOperation(b, 0);
    }
    else if (t == STAB_PARENTHESES_SIGNATURE) {
      r = stabParenthesesSignature(b, 0);
    }
    else if (t == STRING_HEREDOC) {
      r = stringHeredoc(b, 0);
    }
    else if (t == STRING_HEREDOC_LINE) {
      r = stringHeredocLine(b, 0);
    }
    else if (t == STRING_LINE) {
      r = stringLine(b, 0);
    }
    else if (t == STRUCT_OPERATION) {
      r = structOperation(b, 0);
    }
    else if (t == TUPLE) {
      r = tuple(b, 0);
    }
    else if (t == TWO_INFIX_OPERATOR) {
      r = twoInfixOperator(b, 0);
    }
    else if (t == TYPE_INFIX_OPERATOR) {
      r = typeInfixOperator(b, 0);
    }
    else if (t == UNARY_NUMERIC_OPERATION) {
      r = unaryNumericOperation(b, 0);
    }
    else if (t == UNARY_PREFIX_OPERATOR) {
      r = unaryPrefixOperator(b, 0);
    }
    else if (t == UNKNOWN_BASE_DIGITS) {
      r = unknownBaseDigits(b, 0);
    }
    else if (t == UNKNOWN_BASE_WHOLE_NUMBER) {
      r = unknownBaseWholeNumber(b, 0);
    }
    else if (t == UNMATCHED_ADDITION_OPERATION) {
      r = unmatchedExpression(b, 0, 13);
    }
    else if (t == UNMATCHED_AND_OPERATION) {
      r = unmatchedExpression(b, 0, 7);
    }
    else if (t == UNMATCHED_ARROW_OPERATION) {
      r = unmatchedExpression(b, 0, 10);
    }
    else if (t == UNMATCHED_AT_NON_NUMERIC_OPERATION) {
      r = unmatchedAtNonNumericOperation(b, 0);
    }
    else if (t == UNMATCHED_AT_UNQUALIFIED_BRACKET_OPERATION) {
      r = unmatchedAtUnqualifiedBracketOperation(b, 0);
    }
    else if (t == UNMATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL) {
      r = unmatchedAtUnqualifiedNoParenthesesCall(b, 0);
    }
    else if (t == UNMATCHED_BRACKET_OPERATION) {
      r = unmatchedExpression(b, 0, 21);
    }
    else if (t == UNMATCHED_CAPTURE_NON_NUMERIC_OPERATION) {
      r = unmatchedCaptureNonNumericOperation(b, 0);
    }
    else if (t == UNMATCHED_COMPARISON_OPERATION) {
      r = unmatchedExpression(b, 0, 8);
    }
    else if (t == UNMATCHED_DOT_CALL) {
      r = unmatchedExpression(b, 0, 17);
    }
    else if (t == UNMATCHED_EXPRESSION) {
      r = unmatchedExpression(b, 0, -1);
    }
    else if (t == UNMATCHED_HAT_OPERATION) {
      r = unmatchedExpression(b, 0, 15);
    }
    else if (t == UNMATCHED_IN_MATCH_OPERATION) {
      r = unmatchedExpression(b, 0, 0);
    }
    else if (t == UNMATCHED_IN_OPERATION) {
      r = unmatchedExpression(b, 0, 11);
    }
    else if (t == UNMATCHED_MATCH_OPERATION) {
      r = unmatchedExpression(b, 0, 5);
    }
    else if (t == UNMATCHED_MULTIPLICATION_OPERATION) {
      r = unmatchedExpression(b, 0, 14);
    }
    else if (t == UNMATCHED_OR_OPERATION) {
      r = unmatchedExpression(b, 0, 6);
    }
    else if (t == UNMATCHED_PIPE_OPERATION) {
      r = unmatchedExpression(b, 0, 4);
    }
    else if (t == UNMATCHED_QUALIFIED_ALIAS) {
      r = unmatchedExpression(b, 0, 22);
    }
    else if (t == UNMATCHED_QUALIFIED_BRACKET_OPERATION) {
      r = unmatchedExpression(b, 0, 23);
    }
    else if (t == UNMATCHED_QUALIFIED_NO_ARGUMENTS_CALL) {
      r = unmatchedExpression(b, 0, 25);
    }
    else if (t == UNMATCHED_QUALIFIED_NO_PARENTHESES_CALL) {
      r = unmatchedExpression(b, 0, 18);
    }
    else if (t == UNMATCHED_QUALIFIED_PARENTHESES_CALL) {
      r = unmatchedExpression(b, 0, 24);
    }
    else if (t == UNMATCHED_RELATIONAL_OPERATION) {
      r = unmatchedExpression(b, 0, 9);
    }
    else if (t == UNMATCHED_TWO_OPERATION) {
      r = unmatchedExpression(b, 0, 12);
    }
    else if (t == UNMATCHED_TYPE_OPERATION) {
      r = unmatchedExpression(b, 0, 3);
    }
    else if (t == UNMATCHED_UNARY_NON_NUMERIC_OPERATION) {
      r = unmatchedUnaryNonNumericOperation(b, 0);
    }
    else if (t == UNMATCHED_UNQUALIFIED_BRACKET_OPERATION) {
      r = unmatchedUnqualifiedBracketOperation(b, 0);
    }
    else if (t == UNMATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL) {
      r = unmatchedUnqualifiedNoArgumentsCall(b, 0);
    }
    else if (t == UNMATCHED_UNQUALIFIED_NO_PARENTHESES_CALL) {
      r = unmatchedUnqualifiedNoParenthesesCall(b, 0);
    }
    else if (t == UNMATCHED_UNQUALIFIED_PARENTHESES_CALL) {
      r = unmatchedUnqualifiedParenthesesCall(b, 0);
    }
    else if (t == UNMATCHED_WHEN_OPERATION) {
      r = unmatchedExpression(b, 0, 2);
    }
    else if (t == UNQUALIFIED_NO_PARENTHESES_MANY_ARGUMENTS_CALL) {
      r = unqualifiedNoParenthesesManyArgumentsCall(b, 0);
    }
    else if (t == VARIABLE) {
      r = variable(b, 0);
    }
    else if (t == WHEN_INFIX_OPERATOR) {
      r = whenInfixOperator(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return elixirFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(MATCHED_ADDITION_OPERATION, MATCHED_AND_OPERATION, MATCHED_ARROW_OPERATION, MATCHED_AT_NON_NUMERIC_OPERATION,
      MATCHED_AT_UNQUALIFIED_BRACKET_OPERATION, MATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL, MATCHED_BRACKET_OPERATION, MATCHED_CAPTURE_NON_NUMERIC_OPERATION,
      MATCHED_COMPARISON_OPERATION, MATCHED_DOT_CALL, MATCHED_EXPRESSION, MATCHED_HAT_OPERATION,
      MATCHED_IN_MATCH_OPERATION, MATCHED_IN_OPERATION, MATCHED_MATCH_OPERATION, MATCHED_MULTIPLICATION_OPERATION,
      MATCHED_OR_OPERATION, MATCHED_PIPE_OPERATION, MATCHED_QUALIFIED_ALIAS, MATCHED_QUALIFIED_BRACKET_OPERATION,
      MATCHED_QUALIFIED_NO_ARGUMENTS_CALL, MATCHED_QUALIFIED_NO_PARENTHESES_CALL, MATCHED_QUALIFIED_PARENTHESES_CALL, MATCHED_RELATIONAL_OPERATION,
      MATCHED_TWO_OPERATION, MATCHED_TYPE_OPERATION, MATCHED_UNARY_NON_NUMERIC_OPERATION, MATCHED_UNQUALIFIED_BRACKET_OPERATION,
      MATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL, MATCHED_UNQUALIFIED_NO_PARENTHESES_CALL, MATCHED_UNQUALIFIED_PARENTHESES_CALL, MATCHED_WHEN_OPERATION),
    create_token_set_(UNMATCHED_ADDITION_OPERATION, UNMATCHED_AND_OPERATION, UNMATCHED_ARROW_OPERATION, UNMATCHED_AT_NON_NUMERIC_OPERATION,
      UNMATCHED_AT_UNQUALIFIED_BRACKET_OPERATION, UNMATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL, UNMATCHED_BRACKET_OPERATION, UNMATCHED_CAPTURE_NON_NUMERIC_OPERATION,
      UNMATCHED_COMPARISON_OPERATION, UNMATCHED_DOT_CALL, UNMATCHED_EXPRESSION, UNMATCHED_HAT_OPERATION,
      UNMATCHED_IN_MATCH_OPERATION, UNMATCHED_IN_OPERATION, UNMATCHED_MATCH_OPERATION, UNMATCHED_MULTIPLICATION_OPERATION,
      UNMATCHED_OR_OPERATION, UNMATCHED_PIPE_OPERATION, UNMATCHED_QUALIFIED_ALIAS, UNMATCHED_QUALIFIED_BRACKET_OPERATION,
      UNMATCHED_QUALIFIED_NO_ARGUMENTS_CALL, UNMATCHED_QUALIFIED_NO_PARENTHESES_CALL, UNMATCHED_QUALIFIED_PARENTHESES_CALL, UNMATCHED_RELATIONAL_OPERATION,
      UNMATCHED_TWO_OPERATION, UNMATCHED_TYPE_OPERATION, UNMATCHED_UNARY_NON_NUMERIC_OPERATION, UNMATCHED_UNQUALIFIED_BRACKET_OPERATION,
      UNMATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL, UNMATCHED_UNQUALIFIED_NO_PARENTHESES_CALL, UNMATCHED_UNQUALIFIED_PARENTHESES_CALL, UNMATCHED_WHEN_OPERATION),
  };

  /* ********************************************************** */
  // atNumericOperation |
  //                      captureNumericOperation |
  //                      unaryNumericOperation |
  //                      anonymousFunction |
  //                      parentheticalStab |
  //                      numeric |
  //                      list |
  //                      map |
  //                      tuple |
  //                      bitString |
  //                      stringLine !KEYWORD_PAIR_COLON |
  //                      stringHeredoc |
  //                      charListLine !KEYWORD_PAIR_COLON |
  //                      charListHeredoc |
  //                      interpolatedCharListSigilLine |
  //                      interpolatedCharListSigilHeredoc |
  //                      interpolatedRegexHeredoc |
  //                      interpolatedSigilHeredoc |
  //                      interpolatedStringSigilHeredoc |
  //                      interpolatedWordsHeredoc |
  //                      interpolatedWordsLine |
  //                      interpolatedRegexLine |
  //                      interpolatedSigilLine |
  //                      interpolatedStringSigilLine |
  //                      literalCharListSigilLine |
  //                      literalCharListSigilHeredoc |
  //                      literalRegexHeredoc |
  //                      literalSigilHeredoc |
  //                      literalStringSigilHeredoc |
  //                      literalWordsHeredoc |
  //                      literalRegexLine |
  //                      literalSigilLine |
  //                      literalStringSigilLine |
  //                      literalWordsLine |
  //                      atomKeyword |
  //                      atom |
  //                      alias
  public static boolean accessExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<access expression>");
    r = atNumericOperation(b, l + 1);
    if (!r) r = captureNumericOperation(b, l + 1);
    if (!r) r = unaryNumericOperation(b, l + 1);
    if (!r) r = anonymousFunction(b, l + 1);
    if (!r) r = parentheticalStab(b, l + 1);
    if (!r) r = numeric(b, l + 1);
    if (!r) r = list(b, l + 1);
    if (!r) r = map(b, l + 1);
    if (!r) r = tuple(b, l + 1);
    if (!r) r = bitString(b, l + 1);
    if (!r) r = accessExpression_10(b, l + 1);
    if (!r) r = stringHeredoc(b, l + 1);
    if (!r) r = accessExpression_12(b, l + 1);
    if (!r) r = charListHeredoc(b, l + 1);
    if (!r) r = interpolatedCharListSigilLine(b, l + 1);
    if (!r) r = interpolatedCharListSigilHeredoc(b, l + 1);
    if (!r) r = interpolatedRegexHeredoc(b, l + 1);
    if (!r) r = interpolatedSigilHeredoc(b, l + 1);
    if (!r) r = interpolatedStringSigilHeredoc(b, l + 1);
    if (!r) r = interpolatedWordsHeredoc(b, l + 1);
    if (!r) r = interpolatedWordsLine(b, l + 1);
    if (!r) r = interpolatedRegexLine(b, l + 1);
    if (!r) r = interpolatedSigilLine(b, l + 1);
    if (!r) r = interpolatedStringSigilLine(b, l + 1);
    if (!r) r = literalCharListSigilLine(b, l + 1);
    if (!r) r = literalCharListSigilHeredoc(b, l + 1);
    if (!r) r = literalRegexHeredoc(b, l + 1);
    if (!r) r = literalSigilHeredoc(b, l + 1);
    if (!r) r = literalStringSigilHeredoc(b, l + 1);
    if (!r) r = literalWordsHeredoc(b, l + 1);
    if (!r) r = literalRegexLine(b, l + 1);
    if (!r) r = literalSigilLine(b, l + 1);
    if (!r) r = literalStringSigilLine(b, l + 1);
    if (!r) r = literalWordsLine(b, l + 1);
    if (!r) r = atomKeyword(b, l + 1);
    if (!r) r = atom(b, l + 1);
    if (!r) r = alias(b, l + 1);
    exit_section_(b, l, m, ACCESS_EXPRESSION, r, false, null);
    return r;
  }

  // stringLine !KEYWORD_PAIR_COLON
  private static boolean accessExpression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessExpression_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringLine(b, l + 1);
    r = r && accessExpression_10_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !KEYWORD_PAIR_COLON
  private static boolean accessExpression_10_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessExpression_10_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, KEYWORD_PAIR_COLON);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // charListLine !KEYWORD_PAIR_COLON
  private static boolean accessExpression_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessExpression_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = charListLine(b, l + 1);
    r = r && accessExpression_12_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !KEYWORD_PAIR_COLON
  private static boolean accessExpression_12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessExpression_12_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, KEYWORD_PAIR_COLON);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (SIGNIFICANT_WHITE_SPACE DUAL_OPERATOR (SIGNIFICANT_WHITE_SPACE | &EOL) |
  //                            DUAL_OPERATOR) EOL*
  public static boolean additionInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additionInfixOperator")) return false;
    if (!nextTokenIs(b, "<+, ->", DUAL_OPERATOR, SIGNIFICANT_WHITE_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<+, ->");
    r = additionInfixOperator_0(b, l + 1);
    r = r && additionInfixOperator_1(b, l + 1);
    exit_section_(b, l, m, ADDITION_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // SIGNIFICANT_WHITE_SPACE DUAL_OPERATOR (SIGNIFICANT_WHITE_SPACE | &EOL) |
  //                            DUAL_OPERATOR
  private static boolean additionInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additionInfixOperator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additionInfixOperator_0_0(b, l + 1);
    if (!r) r = consumeToken(b, DUAL_OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGNIFICANT_WHITE_SPACE DUAL_OPERATOR (SIGNIFICANT_WHITE_SPACE | &EOL)
  private static boolean additionInfixOperator_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additionInfixOperator_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SIGNIFICANT_WHITE_SPACE, DUAL_OPERATOR);
    r = r && additionInfixOperator_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGNIFICANT_WHITE_SPACE | &EOL
  private static boolean additionInfixOperator_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additionInfixOperator_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIGNIFICANT_WHITE_SPACE);
    if (!r) r = additionInfixOperator_0_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &EOL
  private static boolean additionInfixOperator_0_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additionInfixOperator_0_0_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_, null);
    r = consumeToken(b, EOL);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // EOL*
  private static boolean additionInfixOperator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additionInfixOperator_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "additionInfixOperator_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // SIGNIFICANT_WHITE_SPACE? DUAL_OPERATOR (
  //                            // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_tokenizer.erl#L610
  //                            "/" | ">" | DUAL_OPERATOR | STRUCT_OPERATOR |
  //                            // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_tokenizer.erl#L609
  //                            OPENING_BIT | OPENING_BRACKET | OPENING_CURLY | OPENING_PARENTHESIS |
  //                            // white spaces
  //                            EOL | SIGNIFICANT_WHITE_SPACE
  //                          )
  //                          |
  //                          DUAL_OPERATOR
  static boolean additionTail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additionTail")) return false;
    if (!nextTokenIs(b, "", DUAL_OPERATOR, SIGNIFICANT_WHITE_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additionTail_0(b, l + 1);
    if (!r) r = consumeToken(b, DUAL_OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGNIFICANT_WHITE_SPACE? DUAL_OPERATOR (
  //                            // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_tokenizer.erl#L610
  //                            "/" | ">" | DUAL_OPERATOR | STRUCT_OPERATOR |
  //                            // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_tokenizer.erl#L609
  //                            OPENING_BIT | OPENING_BRACKET | OPENING_CURLY | OPENING_PARENTHESIS |
  //                            // white spaces
  //                            EOL | SIGNIFICANT_WHITE_SPACE
  //                          )
  private static boolean additionTail_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additionTail_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additionTail_0_0(b, l + 1);
    r = r && consumeToken(b, DUAL_OPERATOR);
    r = r && additionTail_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGNIFICANT_WHITE_SPACE?
  private static boolean additionTail_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additionTail_0_0")) return false;
    consumeToken(b, SIGNIFICANT_WHITE_SPACE);
    return true;
  }

  // "/" | ">" | DUAL_OPERATOR | STRUCT_OPERATOR |
  //                            // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_tokenizer.erl#L609
  //                            OPENING_BIT | OPENING_BRACKET | OPENING_CURLY | OPENING_PARENTHESIS |
  //                            // white spaces
  //                            EOL | SIGNIFICANT_WHITE_SPACE
  private static boolean additionTail_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additionTail_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, DUAL_OPERATOR);
    if (!r) r = consumeToken(b, STRUCT_OPERATOR);
    if (!r) r = consumeToken(b, OPENING_BIT);
    if (!r) r = consumeToken(b, OPENING_BRACKET);
    if (!r) r = consumeToken(b, OPENING_CURLY);
    if (!r) r = consumeToken(b, OPENING_PARENTHESIS);
    if (!r) r = consumeToken(b, EOL);
    if (!r) r = consumeToken(b, SIGNIFICANT_WHITE_SPACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean adjacentExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adjacentExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<adjacent expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, ADJACENT_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ALIAS_TOKEN !KEYWORD_PAIR_COLON
  public static boolean alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias")) return false;
    if (!nextTokenIs(b, ALIAS_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALIAS_TOKEN);
    r = r && alias_1(b, l + 1);
    exit_section_(b, m, ALIAS, r);
    return r;
  }

  // !KEYWORD_PAIR_COLON
  private static boolean alias_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, KEYWORD_PAIR_COLON);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EOL* AND_OPERATOR EOL*
  public static boolean andInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andInfixOperator")) return false;
    if (!nextTokenIs(b, "<&&, &&&, and>", AND_OPERATOR, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<&&, &&&, and>");
    r = andInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, AND_OPERATOR);
    r = r && andInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, AND_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean andInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "andInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean andInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "andInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // FN endOfExpression?
  //                       stab endOfExpression?
  //                       END
  public static boolean anonymousFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymousFunction")) return false;
    if (!nextTokenIs(b, FN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FN);
    r = r && anonymousFunction_1(b, l + 1);
    r = r && stab(b, l + 1);
    r = r && anonymousFunction_3(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, m, ANONYMOUS_FUNCTION, r);
    return r;
  }

  // endOfExpression?
  private static boolean anonymousFunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymousFunction_1")) return false;
    endOfExpression(b, l + 1);
    return true;
  }

  // endOfExpression?
  private static boolean anonymousFunction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymousFunction_3")) return false;
    endOfExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // EOL* ARROW_OPERATOR EOL*
  public static boolean arrowInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowInfixOperator")) return false;
    if (!nextTokenIs(b, "<<~, |>, ~>, <<<, <<~, <|>, <~>, >>>, ~>>>", ARROW_OPERATOR, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<<~, |>, ~>, <<<, <<~, <|>, <~>, >>>, ~>>>");
    r = arrowInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, ARROW_OPERATOR);
    r = r && arrowInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, ARROW_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean arrowInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "arrowInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean arrowInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "arrowInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EOL* ASSOCIATION_OPERATOR EOL*
  static boolean associationInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associationInfixOperator")) return false;
    if (!nextTokenIs(b, "", ASSOCIATION_OPERATOR, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = associationInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, ASSOCIATION_OPERATOR);
    r = r && associationInfixOperator_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean associationInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associationInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "associationInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean associationInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associationInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "associationInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // associationsBase infixComma?
  public static boolean associations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<associations>");
    r = associationsBase(b, l + 1);
    r = r && associations_1(b, l + 1);
    exit_section_(b, l, m, ASSOCIATIONS, r, false, null);
    return r;
  }

  // infixComma?
  private static boolean associations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associations_1")) return false;
    infixComma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // associationsExpression (infixComma associationsExpression)*
  public static boolean associationsBase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associationsBase")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<associations base>");
    r = associationsExpression(b, l + 1);
    r = r && associationsBase_1(b, l + 1);
    exit_section_(b, l, m, ASSOCIATIONS_BASE, r, false, null);
    return r;
  }

  // (infixComma associationsExpression)*
  private static boolean associationsBase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associationsBase_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!associationsBase_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "associationsBase_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // infixComma associationsExpression
  private static boolean associationsBase_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associationsBase_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixComma(b, l + 1);
    r = r && associationsExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // containerAssociationOperation | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L505
  //                                    mapExpression
  static boolean associationsExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "associationsExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = containerAssociationOperation(b, l + 1);
    if (!r) r = mapExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // atPrefixOperator maxExpression
  public static boolean atMaxExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atMaxExpression")) return false;
    if (!nextTokenIs(b, AT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = atPrefixOperator(b, l + 1);
    r = r && maxExpression(b, l + 1);
    exit_section_(b, m, MATCHED_AT_NON_NUMERIC_OPERATION, r);
    return r;
  }

  /* ********************************************************** */
  // atPrefixOperator numeric
  public static boolean atNumericOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atNumericOperation")) return false;
    if (!nextTokenIs(b, AT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = atPrefixOperator(b, l + 1);
    r = r && numeric(b, l + 1);
    exit_section_(b, m, AT_NUMERIC_OPERATION, r);
    return r;
  }

  /* ********************************************************** */
  // AT_OPERATOR EOL*
  public static boolean atPrefixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atPrefixOperator")) return false;
    if (!nextTokenIs(b, AT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT_OPERATOR);
    r = r && atPrefixOperator_1(b, l + 1);
    exit_section_(b, m, AT_PREFIX_OPERATOR, r);
    return r;
  }

  // EOL*
  private static boolean atPrefixOperator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atPrefixOperator_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "atPrefixOperator_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // COLON (ATOM_FRAGMENT | quote)
  public static boolean atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && atom_1(b, l + 1);
    exit_section_(b, m, ATOM, r);
    return r;
  }

  // ATOM_FRAGMENT | quote
  private static boolean atom_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATOM_FRAGMENT);
    if (!r) r = quote(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FALSE | NIL | TRUE
  public static boolean atomKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atomKeyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<false, nil, true>");
    r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, TRUE);
    exit_section_(b, l, m, ATOM_KEYWORD, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INVALID_BINARY_DIGITS | VALID_BINARY_DIGITS
  public static boolean binaryDigits(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryDigits")) return false;
    if (!nextTokenIs(b, "<binary digits>", INVALID_BINARY_DIGITS, VALID_BINARY_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<binary digits>");
    r = consumeToken(b, INVALID_BINARY_DIGITS);
    if (!r) r = consumeToken(b, VALID_BINARY_DIGITS);
    exit_section_(b, l, m, BINARY_DIGITS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BASE_WHOLE_NUMBER_PREFIX (BINARY_WHOLE_NUMBER_BASE | OBSOLETE_BINARY_WHOLE_NUMBER_BASE) binaryDigits+
  public static boolean binaryWholeNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryWholeNumber")) return false;
    if (!nextTokenIs(b, BASE_WHOLE_NUMBER_PREFIX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, BASE_WHOLE_NUMBER_PREFIX);
    r = r && binaryWholeNumber_1(b, l + 1);
    p = r; // pin = 2
    r = r && binaryWholeNumber_2(b, l + 1);
    exit_section_(b, l, m, BINARY_WHOLE_NUMBER, r, p, null);
    return r || p;
  }

  // BINARY_WHOLE_NUMBER_BASE | OBSOLETE_BINARY_WHOLE_NUMBER_BASE
  private static boolean binaryWholeNumber_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryWholeNumber_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BINARY_WHOLE_NUMBER_BASE);
    if (!r) r = consumeToken(b, OBSOLETE_BINARY_WHOLE_NUMBER_BASE);
    exit_section_(b, m, null, r);
    return r;
  }

  // binaryDigits+
  private static boolean binaryWholeNumber_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binaryWholeNumber_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binaryDigits(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!binaryDigits(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "binaryWholeNumber_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPENING_BIT EOL*
  //               (containerArguments EOL*)?
  //               CLOSING_BIT
  public static boolean bitString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitString")) return false;
    if (!nextTokenIs(b, OPENING_BIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_BIT);
    r = r && bitString_1(b, l + 1);
    r = r && bitString_2(b, l + 1);
    r = r && consumeToken(b, CLOSING_BIT);
    exit_section_(b, m, BIT_STRING, r);
    return r;
  }

  // EOL*
  private static boolean bitString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitString_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "bitString_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (containerArguments EOL*)?
  private static boolean bitString_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitString_2")) return false;
    bitString_2_0(b, l + 1);
    return true;
  }

  // containerArguments EOL*
  private static boolean bitString_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitString_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = containerArguments(b, l + 1);
    r = r && bitString_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean bitString_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitString_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "bitString_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // AFTER | CATCH | ELSE | RESCUE
  public static boolean blockIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<block identifier>");
    r = consumeToken(b, AFTER);
    if (!r) r = consumeToken(b, CATCH);
    if (!r) r = consumeToken(b, ELSE);
    if (!r) r = consumeToken(b, RESCUE);
    exit_section_(b, l, m, BLOCK_IDENTIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // blockIdentifier endOfExpression? // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L290-L291
  //               (stab endOfExpression?)?
  public static boolean blockItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<block item>");
    r = blockIdentifier(b, l + 1);
    r = r && blockItem_1(b, l + 1);
    r = r && blockItem_2(b, l + 1);
    exit_section_(b, l, m, BLOCK_ITEM, r, false, null);
    return r;
  }

  // endOfExpression?
  private static boolean blockItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockItem_1")) return false;
    endOfExpression(b, l + 1);
    return true;
  }

  // (stab endOfExpression?)?
  private static boolean blockItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockItem_2")) return false;
    blockItem_2_0(b, l + 1);
    return true;
  }

  // stab endOfExpression?
  private static boolean blockItem_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockItem_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stab(b, l + 1);
    r = r && blockItem_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // endOfExpression?
  private static boolean blockItem_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockItem_2_0_1")) return false;
    endOfExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // blockItem+
  public static boolean blockList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<block list>");
    r = blockItem(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!blockItem(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "blockList", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, BLOCK_LIST, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPENING_BRACKET EOL*
  //                      (
  //                       keywords |
  //                       containerExpression infixComma?
  //                      )
  //                      CLOSING_BRACKET
  public static boolean bracketArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketArguments")) return false;
    if (!nextTokenIs(b, OPENING_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_BRACKET);
    r = r && bracketArguments_1(b, l + 1);
    r = r && bracketArguments_2(b, l + 1);
    r = r && consumeToken(b, CLOSING_BRACKET);
    exit_section_(b, m, BRACKET_ARGUMENTS, r);
    return r;
  }

  // EOL*
  private static boolean bracketArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketArguments_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "bracketArguments_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // keywords |
  //                       containerExpression infixComma?
  private static boolean bracketArguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketArguments_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keywords(b, l + 1);
    if (!r) r = bracketArguments_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // containerExpression infixComma?
  private static boolean bracketArguments_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketArguments_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = containerExpression(b, l + 1);
    r = r && bracketArguments_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // infixComma?
  private static boolean bracketArguments_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketArguments_2_1_1")) return false;
    infixComma(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // capturePrefixOperator numeric
  public static boolean captureNumericOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "captureNumericOperation")) return false;
    if (!nextTokenIs(b, CAPTURE_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = capturePrefixOperator(b, l + 1);
    r = r && numeric(b, l + 1);
    exit_section_(b, m, CAPTURE_NUMERIC_OPERATION, r);
    return r;
  }

  /* ********************************************************** */
  // CAPTURE_OPERATOR EOL*
  public static boolean capturePrefixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capturePrefixOperator")) return false;
    if (!nextTokenIs(b, CAPTURE_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CAPTURE_OPERATOR);
    r = r && capturePrefixOperator_1(b, l + 1);
    exit_section_(b, m, CAPTURE_PREFIX_OPERATOR, r);
    return r;
  }

  // EOL*
  private static boolean capturePrefixOperator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "capturePrefixOperator_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "capturePrefixOperator_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // CHAR_LIST_HEREDOC_PROMOTER EOL
  //                     charListHeredocLine*
  //                     heredocPrefix CHAR_LIST_HEREDOC_TERMINATOR
  public static boolean charListHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charListHeredoc")) return false;
    if (!nextTokenIs(b, CHAR_LIST_HEREDOC_PROMOTER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 1, CHAR_LIST_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 1
    r = r && report_error_(b, charListHeredoc_2(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && consumeToken(b, CHAR_LIST_HEREDOC_TERMINATOR) && r;
    exit_section_(b, l, m, CHAR_LIST_HEREDOC, r, p, null);
    return r || p;
  }

  // charListHeredocLine*
  private static boolean charListHeredoc_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charListHeredoc_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!charListHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "charListHeredoc_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // heredocLinePrefix quoteCharListBody EOL
  public static boolean charListHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charListHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<char list heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && quoteCharListBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, CHAR_LIST_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CHAR_LIST_PROMOTER quoteCharListBody CHAR_LIST_TERMINATOR
  public static boolean charListLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charListLine")) return false;
    if (!nextTokenIs(b, CHAR_LIST_PROMOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHAR_LIST_PROMOTER);
    r = r && quoteCharListBody(b, l + 1);
    r = r && consumeToken(b, CHAR_LIST_TERMINATOR);
    exit_section_(b, m, CHAR_LIST_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // CHAR_TOKENIZER (CHAR_LIST_FRAGMENT | quoteEscapeSequence)
  public static boolean charToken(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charToken")) return false;
    if (!nextTokenIs(b, CHAR_TOKENIZER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHAR_TOKENIZER);
    r = r && charToken_1(b, l + 1);
    exit_section_(b, m, CHAR_TOKEN, r);
    return r;
  }

  // CHAR_LIST_FRAGMENT | quoteEscapeSequence
  private static boolean charToken_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charToken_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHAR_LIST_FRAGMENT);
    if (!r) r = quoteEscapeSequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EOL* COMPARISON_OPERATOR EOL*
  public static boolean comparisonInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonInfixOperator")) return false;
    if (!nextTokenIs(b, "<!=, ==, =~, !==, ===>", COMPARISON_OPERATOR, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<!=, ==, =~, !==, ===>");
    r = comparisonInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, COMPARISON_OPERATOR);
    r = r && comparisonInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, COMPARISON_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean comparisonInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "comparisonInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean comparisonInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "comparisonInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // containerArgumentsBase (infixComma keywords | infixComma)?
  static boolean containerArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "containerArguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = containerArgumentsBase(b, l + 1);
    r = r && containerArguments_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (infixComma keywords | infixComma)?
  private static boolean containerArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "containerArguments_1")) return false;
    containerArguments_1_0(b, l + 1);
    return true;
  }

  // infixComma keywords | infixComma
  private static boolean containerArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "containerArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = containerArguments_1_0_0(b, l + 1);
    if (!r) r = infixComma(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // infixComma keywords
  private static boolean containerArguments_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "containerArguments_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixComma(b, l + 1);
    r = r && keywords(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // containerExpression (infixComma containerExpression)*
  static boolean containerArgumentsBase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "containerArgumentsBase")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = containerExpression(b, l + 1);
    r = r && containerArgumentsBase_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (infixComma containerExpression)*
  private static boolean containerArgumentsBase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "containerArgumentsBase_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!containerArgumentsBase_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "containerArgumentsBase_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // infixComma containerExpression
  private static boolean containerArgumentsBase_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "containerArgumentsBase_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixComma(b, l + 1);
    r = r && containerExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // containerExpression associationInfixOperator containerExpression
  public static boolean containerAssociationOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "containerAssociationOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<container association operation>");
    r = containerExpression(b, l + 1);
    r = r && associationInfixOperator(b, l + 1);
    r = r && containerExpression(b, l + 1);
    exit_section_(b, l, m, CONTAINER_ASSOCIATION_OPERATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // emptyParentheses |
  //                                 unmatchedExpression
  static boolean containerExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "containerExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = emptyParentheses(b, l + 1);
    if (!r) r = unmatchedExpression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INVALID_DECIMAL_DIGITS | VALID_DECIMAL_DIGITS
  public static boolean decimalDigits(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalDigits")) return false;
    if (!nextTokenIs(b, "<decimal digits>", INVALID_DECIMAL_DIGITS, VALID_DECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<decimal digits>");
    r = consumeToken(b, INVALID_DECIMAL_DIGITS);
    if (!r) r = consumeToken(b, VALID_DECIMAL_DIGITS);
    exit_section_(b, l, m, DECIMAL_DIGITS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // decimalFloatIntegral DECIMAL_MARK decimalFloatFractional (EXPONENT_MARK decimalFloatExponent)?
  public static boolean decimalFloat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloat")) return false;
    if (!nextTokenIs(b, "<decimal float>", INVALID_DECIMAL_DIGITS, VALID_DECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<decimal float>");
    r = decimalFloatIntegral(b, l + 1);
    r = r && consumeToken(b, DECIMAL_MARK);
    r = r && decimalFloatFractional(b, l + 1);
    r = r && decimalFloat_3(b, l + 1);
    exit_section_(b, l, m, DECIMAL_FLOAT, r, false, null);
    return r;
  }

  // (EXPONENT_MARK decimalFloatExponent)?
  private static boolean decimalFloat_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloat_3")) return false;
    decimalFloat_3_0(b, l + 1);
    return true;
  }

  // EXPONENT_MARK decimalFloatExponent
  private static boolean decimalFloat_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloat_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPONENT_MARK);
    r = r && decimalFloatExponent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decimalFloatExponentSign decimalWholeNumber
  public static boolean decimalFloatExponent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloatExponent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<decimal float exponent>");
    r = decimalFloatExponentSign(b, l + 1);
    r = r && decimalWholeNumber(b, l + 1);
    exit_section_(b, l, m, DECIMAL_FLOAT_EXPONENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DUAL_OPERATOR?
  public static boolean decimalFloatExponentSign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloatExponentSign")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<decimal float exponent sign>");
    consumeToken(b, DUAL_OPERATOR);
    exit_section_(b, l, m, DECIMAL_FLOAT_EXPONENT_SIGN, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // decimalWholeNumber
  public static boolean decimalFloatFractional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloatFractional")) return false;
    if (!nextTokenIs(b, "<decimal float fractional>", INVALID_DECIMAL_DIGITS, VALID_DECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<decimal float fractional>");
    r = decimalWholeNumber(b, l + 1);
    exit_section_(b, l, m, DECIMAL_FLOAT_FRACTIONAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // decimalWholeNumber
  public static boolean decimalFloatIntegral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalFloatIntegral")) return false;
    if (!nextTokenIs(b, "<decimal float integral>", INVALID_DECIMAL_DIGITS, VALID_DECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<decimal float integral>");
    r = decimalWholeNumber(b, l + 1);
    exit_section_(b, l, m, DECIMAL_FLOAT_INTEGRAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // decimalDigits (DECIMAL_SEPARATOR? decimalDigits)*
  public static boolean decimalWholeNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalWholeNumber")) return false;
    if (!nextTokenIs(b, "<decimal whole number>", INVALID_DECIMAL_DIGITS, VALID_DECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<decimal whole number>");
    r = decimalDigits(b, l + 1);
    r = r && decimalWholeNumber_1(b, l + 1);
    exit_section_(b, l, m, DECIMAL_WHOLE_NUMBER, r, false, null);
    return r;
  }

  // (DECIMAL_SEPARATOR? decimalDigits)*
  private static boolean decimalWholeNumber_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalWholeNumber_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!decimalWholeNumber_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decimalWholeNumber_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DECIMAL_SEPARATOR? decimalDigits
  private static boolean decimalWholeNumber_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalWholeNumber_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimalWholeNumber_1_0_0(b, l + 1);
    r = r && decimalDigits(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DECIMAL_SEPARATOR?
  private static boolean decimalWholeNumber_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimalWholeNumber_1_0_0")) return false;
    consumeToken(b, DECIMAL_SEPARATOR);
    return true;
  }

  /* ********************************************************** */
  // DO endOfExpression?
  //             stab? endOfExpression? // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L273
  //             blockList? endOfExpression? // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L274
  //             END
  public static boolean doBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, DO);
    p = r; // pin = DO
    r = r && report_error_(b, doBlock_1(b, l + 1));
    r = p && report_error_(b, doBlock_2(b, l + 1)) && r;
    r = p && report_error_(b, doBlock_3(b, l + 1)) && r;
    r = p && report_error_(b, doBlock_4(b, l + 1)) && r;
    r = p && report_error_(b, doBlock_5(b, l + 1)) && r;
    r = p && consumeToken(b, END) && r;
    exit_section_(b, l, m, DO_BLOCK, r, p, null);
    return r || p;
  }

  // endOfExpression?
  private static boolean doBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock_1")) return false;
    endOfExpression(b, l + 1);
    return true;
  }

  // stab?
  private static boolean doBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock_2")) return false;
    stab(b, l + 1);
    return true;
  }

  // endOfExpression?
  private static boolean doBlock_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock_3")) return false;
    endOfExpression(b, l + 1);
    return true;
  }

  // blockList?
  private static boolean doBlock_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock_4")) return false;
    blockList(b, l + 1);
    return true;
  }

  // endOfExpression?
  private static boolean doBlock_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock_5")) return false;
    endOfExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // EOL* DOT_OPERATOR EOL*
  public static boolean dotInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotInfixOperator")) return false;
    if (!nextTokenIs(b, "<.>", DOT_OPERATOR, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<.>");
    r = dotInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, DOT_OPERATOR);
    r = r && dotInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, DOT_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean dotInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "dotInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean dotInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "dotInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // endOfExpression? (expressionList endOfExpression?)?
  static boolean elixirFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elixirFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = elixirFile_0(b, l + 1);
    r = r && elixirFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // endOfExpression?
  private static boolean elixirFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elixirFile_0")) return false;
    endOfExpression(b, l + 1);
    return true;
  }

  // (expressionList endOfExpression?)?
  private static boolean elixirFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elixirFile_1")) return false;
    elixirFile_1_0(b, l + 1);
    return true;
  }

  // expressionList endOfExpression?
  private static boolean elixirFile_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elixirFile_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionList(b, l + 1);
    r = r && elixirFile_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // endOfExpression?
  private static boolean elixirFile_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elixirFile_1_0_1")) return false;
    endOfExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OPENING_PARENTHESIS EOL* CLOSING_PARENTHESIS
  public static boolean emptyParentheses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "emptyParentheses")) return false;
    if (!nextTokenIs(b, OPENING_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_PARENTHESIS);
    r = r && emptyParentheses_1(b, l + 1);
    r = r && consumeToken(b, CLOSING_PARENTHESIS);
    exit_section_(b, m, EMPTY_PARENTHESES, r);
    return r;
  }

  // EOL*
  private static boolean emptyParentheses_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "emptyParentheses_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "emptyParentheses_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // OPENING_CURLY VALID_HEXADECIMAL_DIGITS CLOSING_CURLY
  public static boolean enclosedHexadecimalEscapeSequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enclosedHexadecimalEscapeSequence")) return false;
    if (!nextTokenIs(b, OPENING_CURLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 1, OPENING_CURLY, VALID_HEXADECIMAL_DIGITS, CLOSING_CURLY);
    p = r; // pin = 1
    exit_section_(b, l, m, ENCLOSED_HEXADECIMAL_ESCAPE_SEQUENCE, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // infixSemicolon | EOL+
  public static boolean endOfExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endOfExpression")) return false;
    if (!nextTokenIs(b, "<end of expression>", EOL, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<end of expression>");
    r = infixSemicolon(b, l + 1);
    if (!r) r = endOfExpression_1(b, l + 1);
    exit_section_(b, l, m, END_OF_EXPRESSION, r, false, null);
    return r;
  }

  // EOL+
  private static boolean endOfExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endOfExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "endOfExpression_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ESCAPE ESCAPED_CHARACTER_TOKEN
  public static boolean escapedCharacter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escapedCharacter")) return false;
    if (!nextTokenIs(b, ESCAPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 1, ESCAPE, ESCAPED_CHARACTER_TOKEN);
    p = r; // pin = 1
    exit_section_(b, l, m, ESCAPED_CHARACTER, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ESCAPE EOL
  public static boolean escapedEOL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escapedEOL")) return false;
    if (!nextTokenIs(b, ESCAPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ESCAPE, EOL);
    exit_section_(b, m, ESCAPED_EOL, r);
    return r;
  }

  /* ********************************************************** */
  // emptyParentheses |
  //                        unmatchedExpression |
  //                        unqualifiedNoParenthesesManyArgumentsCall
  static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = emptyParentheses(b, l + 1);
    if (!r) r = unmatchedExpression(b, l + 1, -1);
    if (!r) r = unqualifiedNoParenthesesManyArgumentsCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression (endOfExpression expression | adjacentExpression)*
  static boolean expressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && expressionList_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (endOfExpression expression | adjacentExpression)*
  private static boolean expressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressionList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // endOfExpression expression | adjacentExpression
  private static boolean expressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionList_1_0_0(b, l + 1);
    if (!r) r = adjacentExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // endOfExpression expression
  private static boolean expressionList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfExpression(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EOL* HAT_OPERATOR EOL*
  public static boolean hatInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hatInfixOperator")) return false;
    if (!nextTokenIs(b, "<^^^>", EOL, HAT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<^^^>");
    r = hatInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, HAT_OPERATOR);
    r = r && hatInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, HAT_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean hatInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hatInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "hatInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean hatInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hatInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "hatInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // HEREDOC_LINE_WHITE_SPACE_TOKEN?
  public static boolean heredocLinePrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "heredocLinePrefix")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<heredoc line prefix>");
    consumeToken(b, HEREDOC_LINE_WHITE_SPACE_TOKEN);
    exit_section_(b, l, m, HEREDOC_LINE_PREFIX, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // HEREDOC_PREFIX_WHITE_SPACE?
  public static boolean heredocPrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "heredocPrefix")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<heredoc prefix>");
    consumeToken(b, HEREDOC_PREFIX_WHITE_SPACE);
    exit_section_(b, l, m, HEREDOC_PREFIX, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // INVALID_HEXADECIMAL_DIGITS | VALID_HEXADECIMAL_DIGITS
  public static boolean hexadecimalDigits(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimalDigits")) return false;
    if (!nextTokenIs(b, "<hexadecimal digits>", INVALID_HEXADECIMAL_DIGITS, VALID_HEXADECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<hexadecimal digits>");
    r = consumeToken(b, INVALID_HEXADECIMAL_DIGITS);
    if (!r) r = consumeToken(b, VALID_HEXADECIMAL_DIGITS);
    exit_section_(b, l, m, HEXADECIMAL_DIGITS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ESCAPE HEXADECIMAL_WHOLE_NUMBER_BASE
  public static boolean hexadecimalEscapePrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimalEscapePrefix")) return false;
    if (!nextTokenIs(b, ESCAPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ESCAPE, HEXADECIMAL_WHOLE_NUMBER_BASE);
    exit_section_(b, m, HEXADECIMAL_ESCAPE_PREFIX, r);
    return r;
  }

  /* ********************************************************** */
  // BASE_WHOLE_NUMBER_PREFIX (HEXADECIMAL_WHOLE_NUMBER_BASE | OBSOLETE_HEXADECIMAL_WHOLE_NUMBER_BASE) hexadecimalDigits+
  public static boolean hexadecimalWholeNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimalWholeNumber")) return false;
    if (!nextTokenIs(b, BASE_WHOLE_NUMBER_PREFIX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, BASE_WHOLE_NUMBER_PREFIX);
    r = r && hexadecimalWholeNumber_1(b, l + 1);
    p = r; // pin = 2
    r = r && hexadecimalWholeNumber_2(b, l + 1);
    exit_section_(b, l, m, HEXADECIMAL_WHOLE_NUMBER, r, p, null);
    return r || p;
  }

  // HEXADECIMAL_WHOLE_NUMBER_BASE | OBSOLETE_HEXADECIMAL_WHOLE_NUMBER_BASE
  private static boolean hexadecimalWholeNumber_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimalWholeNumber_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEXADECIMAL_WHOLE_NUMBER_BASE);
    if (!r) r = consumeToken(b, OBSOLETE_HEXADECIMAL_WHOLE_NUMBER_BASE);
    exit_section_(b, m, null, r);
    return r;
  }

  // hexadecimalDigits+
  private static boolean hexadecimalWholeNumber_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimalWholeNumber_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hexadecimalDigits(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!hexadecimalDigits(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "hexadecimalWholeNumber_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EOL* IN_OPERATOR EOL*
  public static boolean inInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inInfixOperator")) return false;
    if (!nextTokenIs(b, "<in>", EOL, IN_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<in>");
    r = inInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, IN_OPERATOR);
    r = r && inInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, IN_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean inInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "inInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean inInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "inInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EOL* IN_MATCH_OPERATOR EOL*
  public static boolean inMatchInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inMatchInfixOperator")) return false;
    if (!nextTokenIs(b, "<<-, \\\\>", EOL, IN_MATCH_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<<-, \\\\>");
    r = inMatchInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, IN_MATCH_OPERATOR);
    r = r && inMatchInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, IN_MATCH_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean inMatchInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inMatchInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "inMatchInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean inMatchInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inMatchInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "inMatchInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // COMMA EOL*
  static boolean infixComma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixComma")) return false;
    if (!nextTokenIs(b, COMMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && infixComma_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean infixComma_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixComma_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "infixComma_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EOL* SEMICOLON EOL*
  static boolean infixSemicolon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixSemicolon")) return false;
    if (!nextTokenIs(b, "", EOL, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixSemicolon_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && infixSemicolon_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean infixSemicolon_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixSemicolon_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "infixSemicolon_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean infixSemicolon_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixSemicolon_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "infixSemicolon_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // (interpolation | CHAR_LIST_FRAGMENT | sigilEscapeSequence)*
  public static boolean interpolatedCharListBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedCharListBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<interpolated char list body>");
    int c = current_position_(b);
    while (true) {
      if (!interpolatedCharListBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedCharListBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, INTERPOLATED_CHAR_LIST_BODY, true, false, null);
    return true;
  }

  // interpolation | CHAR_LIST_FRAGMENT | sigilEscapeSequence
  private static boolean interpolatedCharListBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedCharListBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, CHAR_LIST_FRAGMENT);
    if (!r) r = sigilEscapeSequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // heredocLinePrefix interpolatedCharListBody EOL
  public static boolean interpolatedCharListHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedCharListHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interpolated char list heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && interpolatedCharListBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, INTERPOLATED_CHAR_LIST_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_CHAR_LIST_SIGIL_NAME CHAR_LIST_SIGIL_HEREDOC_PROMOTER EOL
  //                                      interpolatedCharListHeredocLine*
  //                                      heredocPrefix CHAR_LIST_SIGIL_HEREDOC_TERMINATOR sigilModifiers
  public static boolean interpolatedCharListSigilHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedCharListSigilHeredoc")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 3, TILDE, INTERPOLATING_CHAR_LIST_SIGIL_NAME, CHAR_LIST_SIGIL_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 3
    r = r && report_error_(b, interpolatedCharListSigilHeredoc_4(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, CHAR_LIST_SIGIL_HEREDOC_TERMINATOR)) && r;
    r = p && sigilModifiers(b, l + 1) && r;
    exit_section_(b, l, m, INTERPOLATED_CHAR_LIST_SIGIL_HEREDOC, r, p, null);
    return r || p;
  }

  // interpolatedCharListHeredocLine*
  private static boolean interpolatedCharListSigilHeredoc_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedCharListSigilHeredoc_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interpolatedCharListHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedCharListSigilHeredoc_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_CHAR_LIST_SIGIL_NAME CHAR_LIST_SIGIL_PROMOTER interpolatedCharListBody CHAR_LIST_SIGIL_TERMINATOR sigilModifiers
  public static boolean interpolatedCharListSigilLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedCharListSigilLine")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_CHAR_LIST_SIGIL_NAME, CHAR_LIST_SIGIL_PROMOTER);
    r = r && interpolatedCharListBody(b, l + 1);
    r = r && consumeToken(b, CHAR_LIST_SIGIL_TERMINATOR);
    r = r && sigilModifiers(b, l + 1);
    exit_section_(b, m, INTERPOLATED_CHAR_LIST_SIGIL_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // (interpolation | REGEX_FRAGMENT | sigilEscapeSequence)*
  public static boolean interpolatedRegexBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedRegexBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<interpolated regex body>");
    int c = current_position_(b);
    while (true) {
      if (!interpolatedRegexBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedRegexBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, INTERPOLATED_REGEX_BODY, true, false, null);
    return true;
  }

  // interpolation | REGEX_FRAGMENT | sigilEscapeSequence
  private static boolean interpolatedRegexBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedRegexBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, REGEX_FRAGMENT);
    if (!r) r = sigilEscapeSequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_REGEX_SIGIL_NAME REGEX_HEREDOC_PROMOTER EOL
  //                              interpolatedRegexHeredocLine*
  //                              heredocPrefix REGEX_HEREDOC_TERMINATOR sigilModifiers
  public static boolean interpolatedRegexHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedRegexHeredoc")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 3, TILDE, INTERPOLATING_REGEX_SIGIL_NAME, REGEX_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 3
    r = r && report_error_(b, interpolatedRegexHeredoc_4(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, REGEX_HEREDOC_TERMINATOR)) && r;
    r = p && sigilModifiers(b, l + 1) && r;
    exit_section_(b, l, m, INTERPOLATED_REGEX_HEREDOC, r, p, null);
    return r || p;
  }

  // interpolatedRegexHeredocLine*
  private static boolean interpolatedRegexHeredoc_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedRegexHeredoc_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interpolatedRegexHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedRegexHeredoc_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // heredocLinePrefix interpolatedRegexBody EOL
  public static boolean interpolatedRegexHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedRegexHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interpolated regex heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && interpolatedRegexBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, INTERPOLATED_REGEX_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_REGEX_SIGIL_NAME REGEX_PROMOTER interpolatedRegexBody REGEX_TERMINATOR sigilModifiers
  public static boolean interpolatedRegexLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedRegexLine")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_REGEX_SIGIL_NAME, REGEX_PROMOTER);
    r = r && interpolatedRegexBody(b, l + 1);
    r = r && consumeToken(b, REGEX_TERMINATOR);
    r = r && sigilModifiers(b, l + 1);
    exit_section_(b, m, INTERPOLATED_REGEX_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // (interpolation | SIGIL_FRAGMENT | sigilEscapeSequence)*
  public static boolean interpolatedSigilBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedSigilBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<interpolated sigil body>");
    int c = current_position_(b);
    while (true) {
      if (!interpolatedSigilBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedSigilBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, INTERPOLATED_SIGIL_BODY, true, false, null);
    return true;
  }

  // interpolation | SIGIL_FRAGMENT | sigilEscapeSequence
  private static boolean interpolatedSigilBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedSigilBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, SIGIL_FRAGMENT);
    if (!r) r = sigilEscapeSequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_SIGIL_NAME SIGIL_HEREDOC_PROMOTER EOL
  //                              interpolatedSigilHeredocLine*
  //                              heredocPrefix SIGIL_HEREDOC_TERMINATOR sigilModifiers
  public static boolean interpolatedSigilHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedSigilHeredoc")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 3, TILDE, INTERPOLATING_SIGIL_NAME, SIGIL_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 3
    r = r && report_error_(b, interpolatedSigilHeredoc_4(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, SIGIL_HEREDOC_TERMINATOR)) && r;
    r = p && sigilModifiers(b, l + 1) && r;
    exit_section_(b, l, m, INTERPOLATED_SIGIL_HEREDOC, r, p, null);
    return r || p;
  }

  // interpolatedSigilHeredocLine*
  private static boolean interpolatedSigilHeredoc_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedSigilHeredoc_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interpolatedSigilHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedSigilHeredoc_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // heredocLinePrefix interpolatedSigilBody EOL
  public static boolean interpolatedSigilHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedSigilHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interpolated sigil heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && interpolatedSigilBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, INTERPOLATED_SIGIL_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_SIGIL_NAME SIGIL_PROMOTER interpolatedSigilBody SIGIL_TERMINATOR sigilModifiers
  public static boolean interpolatedSigilLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedSigilLine")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_SIGIL_NAME, SIGIL_PROMOTER);
    r = r && interpolatedSigilBody(b, l + 1);
    r = r && consumeToken(b, SIGIL_TERMINATOR);
    r = r && sigilModifiers(b, l + 1);
    exit_section_(b, m, INTERPOLATED_SIGIL_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // (interpolation | STRING_FRAGMENT | sigilEscapeSequence)*
  public static boolean interpolatedStringBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedStringBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<interpolated string body>");
    int c = current_position_(b);
    while (true) {
      if (!interpolatedStringBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedStringBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, INTERPOLATED_STRING_BODY, true, false, null);
    return true;
  }

  // interpolation | STRING_FRAGMENT | sigilEscapeSequence
  private static boolean interpolatedStringBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedStringBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, STRING_FRAGMENT);
    if (!r) r = sigilEscapeSequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // heredocLinePrefix interpolatedStringBody EOL
  public static boolean interpolatedStringHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedStringHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interpolated string heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && interpolatedStringBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, INTERPOLATED_STRING_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_STRING_SIGIL_NAME STRING_SIGIL_HEREDOC_PROMOTER EOL
  //                                    interpolatedStringHeredocLine*
  //                                    heredocPrefix STRING_SIGIL_HEREDOC_TERMINATOR sigilModifiers
  public static boolean interpolatedStringSigilHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedStringSigilHeredoc")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 3, TILDE, INTERPOLATING_STRING_SIGIL_NAME, STRING_SIGIL_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 3
    r = r && report_error_(b, interpolatedStringSigilHeredoc_4(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, STRING_SIGIL_HEREDOC_TERMINATOR)) && r;
    r = p && sigilModifiers(b, l + 1) && r;
    exit_section_(b, l, m, INTERPOLATED_STRING_SIGIL_HEREDOC, r, p, null);
    return r || p;
  }

  // interpolatedStringHeredocLine*
  private static boolean interpolatedStringSigilHeredoc_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedStringSigilHeredoc_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interpolatedStringHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedStringSigilHeredoc_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_STRING_SIGIL_NAME STRING_SIGIL_PROMOTER interpolatedStringBody STRING_SIGIL_TERMINATOR sigilModifiers
  public static boolean interpolatedStringSigilLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedStringSigilLine")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_STRING_SIGIL_NAME, STRING_SIGIL_PROMOTER);
    r = r && interpolatedStringBody(b, l + 1);
    r = r && consumeToken(b, STRING_SIGIL_TERMINATOR);
    r = r && sigilModifiers(b, l + 1);
    exit_section_(b, m, INTERPOLATED_STRING_SIGIL_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // (interpolation | WORDS_FRAGMENT | sigilEscapeSequence)*
  public static boolean interpolatedWordsBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedWordsBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<interpolated words body>");
    int c = current_position_(b);
    while (true) {
      if (!interpolatedWordsBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedWordsBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, INTERPOLATED_WORDS_BODY, true, false, null);
    return true;
  }

  // interpolation | WORDS_FRAGMENT | sigilEscapeSequence
  private static boolean interpolatedWordsBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedWordsBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, WORDS_FRAGMENT);
    if (!r) r = sigilEscapeSequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_WORDS_SIGIL_NAME WORDS_HEREDOC_PROMOTER EOL
  //                              interpolatedWordsHeredocLine*
  //                              heredocPrefix WORDS_HEREDOC_TERMINATOR sigilModifiers
  public static boolean interpolatedWordsHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedWordsHeredoc")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 3, TILDE, INTERPOLATING_WORDS_SIGIL_NAME, WORDS_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 3
    r = r && report_error_(b, interpolatedWordsHeredoc_4(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, WORDS_HEREDOC_TERMINATOR)) && r;
    r = p && sigilModifiers(b, l + 1) && r;
    exit_section_(b, l, m, INTERPOLATED_WORDS_HEREDOC, r, p, null);
    return r || p;
  }

  // interpolatedWordsHeredocLine*
  private static boolean interpolatedWordsHeredoc_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedWordsHeredoc_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interpolatedWordsHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interpolatedWordsHeredoc_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // heredocLinePrefix interpolatedWordsBody EOL
  public static boolean interpolatedWordsHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedWordsHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interpolated words heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && interpolatedWordsBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, INTERPOLATED_WORDS_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TILDE INTERPOLATING_WORDS_SIGIL_NAME WORDS_PROMOTER interpolatedWordsBody WORDS_TERMINATOR sigilModifiers
  public static boolean interpolatedWordsLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolatedWordsLine")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, INTERPOLATING_WORDS_SIGIL_NAME, WORDS_PROMOTER);
    r = r && interpolatedWordsBody(b, l + 1);
    r = r && consumeToken(b, WORDS_TERMINATOR);
    r = r && sigilModifiers(b, l + 1);
    exit_section_(b, m, INTERPOLATED_WORDS_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // INTERPOLATION_START elixirFile INTERPOLATION_END
  public static boolean interpolation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interpolation")) return false;
    if (!nextTokenIs(b, INTERPOLATION_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INTERPOLATION_START);
    r = r && elixirFile(b, l + 1);
    r = r && consumeToken(b, INTERPOLATION_END);
    exit_section_(b, m, INTERPOLATION, r);
    return r;
  }

  /* ********************************************************** */
  // AFTER |
  //                ALIAS_TOKEN |
  //                AND_OPERATOR |
  //                ARROW_OPERATOR |
  //                ASSOCIATION_OPERATOR |
  //                AT_OPERATOR |
  //                BIT_STRING_OPERATOR |
  //                CAPTURE_OPERATOR |
  //                CATCH |
  //                COMPARISON_OPERATOR |
  //                DO |
  //                DUAL_OPERATOR |
  //                ELSE |
  //                HAT_OPERATOR |
  //                IDENTIFIER |
  //                IN_MATCH_OPERATOR |
  //                IN_OPERATOR |
  //                MAP_OPERATOR |
  //                MATCH_OPERATOR |
  //                MULTIPLICATION_OPERATOR |
  //                OR_OPERATOR |
  //                PIPE_OPERATOR |
  //                RESCUE |
  //                RELATIONAL_OPERATOR |
  //                STAB_OPERATOR |
  //                STRUCT_OPERATOR |
  //                TUPLE_OPERATOR |
  //                TWO_OPERATOR |
  //                UNARY_OPERATOR |
  //                WHEN_OPERATOR |
  //                quote
  public static boolean keywordKey(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywordKey")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<keyword key>");
    r = consumeToken(b, AFTER);
    if (!r) r = consumeToken(b, ALIAS_TOKEN);
    if (!r) r = consumeToken(b, AND_OPERATOR);
    if (!r) r = consumeToken(b, ARROW_OPERATOR);
    if (!r) r = consumeToken(b, ASSOCIATION_OPERATOR);
    if (!r) r = consumeToken(b, AT_OPERATOR);
    if (!r) r = consumeToken(b, BIT_STRING_OPERATOR);
    if (!r) r = consumeToken(b, CAPTURE_OPERATOR);
    if (!r) r = consumeToken(b, CATCH);
    if (!r) r = consumeToken(b, COMPARISON_OPERATOR);
    if (!r) r = consumeToken(b, DO);
    if (!r) r = consumeToken(b, DUAL_OPERATOR);
    if (!r) r = consumeToken(b, ELSE);
    if (!r) r = consumeToken(b, HAT_OPERATOR);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, IN_MATCH_OPERATOR);
    if (!r) r = consumeToken(b, IN_OPERATOR);
    if (!r) r = consumeToken(b, MAP_OPERATOR);
    if (!r) r = consumeToken(b, MATCH_OPERATOR);
    if (!r) r = consumeToken(b, MULTIPLICATION_OPERATOR);
    if (!r) r = consumeToken(b, OR_OPERATOR);
    if (!r) r = consumeToken(b, PIPE_OPERATOR);
    if (!r) r = consumeToken(b, RESCUE);
    if (!r) r = consumeToken(b, RELATIONAL_OPERATOR);
    if (!r) r = consumeToken(b, STAB_OPERATOR);
    if (!r) r = consumeToken(b, STRUCT_OPERATOR);
    if (!r) r = consumeToken(b, TUPLE_OPERATOR);
    if (!r) r = consumeToken(b, TWO_OPERATOR);
    if (!r) r = consumeToken(b, UNARY_OPERATOR);
    if (!r) r = consumeToken(b, WHEN_OPERATOR);
    if (!r) r = quote(b, l + 1);
    exit_section_(b, l, m, KEYWORD_KEY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // keywordKey KEYWORD_PAIR_COLON EOL*
  static boolean keywordKeyColonEOL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywordKeyColonEOL")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keywordKey(b, l + 1);
    r = r && consumeToken(b, KEYWORD_PAIR_COLON);
    r = r && keywordKeyColonEOL_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean keywordKeyColonEOL_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywordKeyColonEOL_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "keywordKeyColonEOL_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // keywordKeyColonEOL containerExpression
  public static boolean keywordPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywordPair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<keyword pair>");
    r = keywordKeyColonEOL(b, l + 1);
    r = r && containerExpression(b, l + 1);
    exit_section_(b, l, m, KEYWORD_PAIR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // keywordPair (infixComma keywordPair)* COMMA?
  public static boolean keywords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywords")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<keywords>");
    r = keywordPair(b, l + 1);
    r = r && keywords_1(b, l + 1);
    r = r && keywords_2(b, l + 1);
    exit_section_(b, l, m, KEYWORDS, r, false, null);
    return r;
  }

  // (infixComma keywordPair)*
  private static boolean keywords_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywords_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!keywords_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "keywords_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // infixComma keywordPair
  private static boolean keywords_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywords_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixComma(b, l + 1);
    r = r && keywordPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean keywords_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keywords_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // OPENING_BRACKET EOL*
  //          listArguments? EOL*
  //          CLOSING_BRACKET
  public static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    if (!nextTokenIs(b, OPENING_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_BRACKET);
    r = r && list_1(b, l + 1);
    r = r && list_2(b, l + 1);
    r = r && list_3(b, l + 1);
    r = r && consumeToken(b, CLOSING_BRACKET);
    exit_section_(b, m, LIST, r);
    return r;
  }

  // EOL*
  private static boolean list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // listArguments?
  private static boolean list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_2")) return false;
    listArguments(b, l + 1);
    return true;
  }

  // EOL*
  private static boolean list_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "list_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // keywords |
  //                           containerArguments
  static boolean listArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listArguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keywords(b, l + 1);
    if (!r) r = containerArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CHAR_LIST_FRAGMENT*
  public static boolean literalCharListBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalCharListBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<literal char list body>");
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, CHAR_LIST_FRAGMENT)) break;
      if (!empty_element_parsed_guard_(b, "literalCharListBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, LITERAL_CHAR_LIST_BODY, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // heredocLinePrefix literalCharListBody EOL
  public static boolean literalCharListHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalCharListHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal char list heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && literalCharListBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, LITERAL_CHAR_LIST_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TILDE LITERAL_CHAR_LIST_SIGIL_NAME CHAR_LIST_SIGIL_HEREDOC_PROMOTER EOL
  //                                 literalCharListHeredocLine*
  //                                 heredocPrefix CHAR_LIST_SIGIL_HEREDOC_TERMINATOR sigilModifiers
  public static boolean literalCharListSigilHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalCharListSigilHeredoc")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 3, TILDE, LITERAL_CHAR_LIST_SIGIL_NAME, CHAR_LIST_SIGIL_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 3
    r = r && report_error_(b, literalCharListSigilHeredoc_4(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, CHAR_LIST_SIGIL_HEREDOC_TERMINATOR)) && r;
    r = p && sigilModifiers(b, l + 1) && r;
    exit_section_(b, l, m, LITERAL_CHAR_LIST_SIGIL_HEREDOC, r, p, null);
    return r || p;
  }

  // literalCharListHeredocLine*
  private static boolean literalCharListSigilHeredoc_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalCharListSigilHeredoc_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!literalCharListHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literalCharListSigilHeredoc_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_CHAR_LIST_SIGIL_NAME CHAR_LIST_SIGIL_PROMOTER literalCharListBody CHAR_LIST_SIGIL_TERMINATOR sigilModifiers
  public static boolean literalCharListSigilLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalCharListSigilLine")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_CHAR_LIST_SIGIL_NAME, CHAR_LIST_SIGIL_PROMOTER);
    r = r && literalCharListBody(b, l + 1);
    r = r && consumeToken(b, CHAR_LIST_SIGIL_TERMINATOR);
    r = r && sigilModifiers(b, l + 1);
    exit_section_(b, m, LITERAL_CHAR_LIST_SIGIL_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // REGEX_FRAGMENT*
  public static boolean literalRegexBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalRegexBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<literal regex body>");
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, REGEX_FRAGMENT)) break;
      if (!empty_element_parsed_guard_(b, "literalRegexBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, LITERAL_REGEX_BODY, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_REGEX_SIGIL_NAME REGEX_HEREDOC_PROMOTER EOL
  //                         literalRegexHeredocLine*
  //                         heredocPrefix REGEX_HEREDOC_TERMINATOR sigilModifiers
  public static boolean literalRegexHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalRegexHeredoc")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 3, TILDE, LITERAL_REGEX_SIGIL_NAME, REGEX_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 3
    r = r && report_error_(b, literalRegexHeredoc_4(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, REGEX_HEREDOC_TERMINATOR)) && r;
    r = p && sigilModifiers(b, l + 1) && r;
    exit_section_(b, l, m, LITERAL_REGEX_HEREDOC, r, p, null);
    return r || p;
  }

  // literalRegexHeredocLine*
  private static boolean literalRegexHeredoc_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalRegexHeredoc_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!literalRegexHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literalRegexHeredoc_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // heredocLinePrefix literalRegexBody EOL
  public static boolean literalRegexHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalRegexHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal regex heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && literalRegexBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, LITERAL_REGEX_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TILDE LITERAL_REGEX_SIGIL_NAME REGEX_PROMOTER literalRegexBody REGEX_TERMINATOR sigilModifiers
  public static boolean literalRegexLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalRegexLine")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_REGEX_SIGIL_NAME, REGEX_PROMOTER);
    r = r && literalRegexBody(b, l + 1);
    r = r && consumeToken(b, REGEX_TERMINATOR);
    r = r && sigilModifiers(b, l + 1);
    exit_section_(b, m, LITERAL_REGEX_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // SIGIL_FRAGMENT*
  public static boolean literalSigilBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalSigilBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<literal sigil body>");
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_FRAGMENT)) break;
      if (!empty_element_parsed_guard_(b, "literalSigilBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, LITERAL_SIGIL_BODY, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_SIGIL_NAME SIGIL_HEREDOC_PROMOTER EOL
  //                         literalSigilHeredocLine*
  //                         heredocPrefix SIGIL_HEREDOC_TERMINATOR sigilModifiers
  public static boolean literalSigilHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalSigilHeredoc")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 3, TILDE, LITERAL_SIGIL_NAME, SIGIL_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 3
    r = r && report_error_(b, literalSigilHeredoc_4(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, SIGIL_HEREDOC_TERMINATOR)) && r;
    r = p && sigilModifiers(b, l + 1) && r;
    exit_section_(b, l, m, LITERAL_SIGIL_HEREDOC, r, p, null);
    return r || p;
  }

  // literalSigilHeredocLine*
  private static boolean literalSigilHeredoc_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalSigilHeredoc_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!literalSigilHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literalSigilHeredoc_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // heredocLinePrefix literalSigilBody EOL
  public static boolean literalSigilHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalSigilHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal sigil heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && literalSigilBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, LITERAL_SIGIL_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TILDE LITERAL_SIGIL_NAME SIGIL_PROMOTER literalSigilBody SIGIL_TERMINATOR sigilModifiers
  public static boolean literalSigilLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalSigilLine")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_SIGIL_NAME, SIGIL_PROMOTER);
    r = r && literalSigilBody(b, l + 1);
    r = r && consumeToken(b, SIGIL_TERMINATOR);
    r = r && sigilModifiers(b, l + 1);
    exit_section_(b, m, LITERAL_SIGIL_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_FRAGMENT*
  public static boolean literalStringBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalStringBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<literal string body>");
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STRING_FRAGMENT)) break;
      if (!empty_element_parsed_guard_(b, "literalStringBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, LITERAL_STRING_BODY, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // heredocLinePrefix literalStringBody EOL
  public static boolean literalStringHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalStringHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal string heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && literalStringBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, LITERAL_STRING_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TILDE LITERAL_STRING_SIGIL_NAME STRING_SIGIL_HEREDOC_PROMOTER EOL
  //                               literalStringHeredocLine*
  //                               heredocPrefix STRING_SIGIL_HEREDOC_TERMINATOR sigilModifiers
  public static boolean literalStringSigilHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalStringSigilHeredoc")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 3, TILDE, LITERAL_STRING_SIGIL_NAME, STRING_SIGIL_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 3
    r = r && report_error_(b, literalStringSigilHeredoc_4(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, STRING_SIGIL_HEREDOC_TERMINATOR)) && r;
    r = p && sigilModifiers(b, l + 1) && r;
    exit_section_(b, l, m, LITERAL_STRING_SIGIL_HEREDOC, r, p, null);
    return r || p;
  }

  // literalStringHeredocLine*
  private static boolean literalStringSigilHeredoc_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalStringSigilHeredoc_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!literalStringHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literalStringSigilHeredoc_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_STRING_SIGIL_NAME STRING_SIGIL_PROMOTER literalStringBody STRING_SIGIL_TERMINATOR sigilModifiers
  public static boolean literalStringSigilLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalStringSigilLine")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_STRING_SIGIL_NAME, STRING_SIGIL_PROMOTER);
    r = r && literalStringBody(b, l + 1);
    r = r && consumeToken(b, STRING_SIGIL_TERMINATOR);
    r = r && sigilModifiers(b, l + 1);
    exit_section_(b, m, LITERAL_STRING_SIGIL_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // WORDS_FRAGMENT*
  public static boolean literalWordsBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalWordsBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<literal words body>");
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, WORDS_FRAGMENT)) break;
      if (!empty_element_parsed_guard_(b, "literalWordsBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, LITERAL_WORDS_BODY, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // TILDE LITERAL_WORDS_SIGIL_NAME WORDS_HEREDOC_PROMOTER EOL
  //                         literalWordsHeredocLine*
  //                         heredocPrefix WORDS_HEREDOC_TERMINATOR sigilModifiers
  public static boolean literalWordsHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalWordsHeredoc")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 3, TILDE, LITERAL_WORDS_SIGIL_NAME, WORDS_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 3
    r = r && report_error_(b, literalWordsHeredoc_4(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, WORDS_HEREDOC_TERMINATOR)) && r;
    r = p && sigilModifiers(b, l + 1) && r;
    exit_section_(b, l, m, LITERAL_WORDS_HEREDOC, r, p, null);
    return r || p;
  }

  // literalWordsHeredocLine*
  private static boolean literalWordsHeredoc_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalWordsHeredoc_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!literalWordsHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literalWordsHeredoc_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // heredocLinePrefix literalWordsBody EOL
  public static boolean literalWordsHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalWordsHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<literal words heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && literalWordsBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, LITERAL_WORDS_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TILDE LITERAL_WORDS_SIGIL_NAME WORDS_PROMOTER literalWordsBody WORDS_TERMINATOR sigilModifiers
  public static boolean literalWordsLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalWordsLine")) return false;
    if (!nextTokenIs(b, TILDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TILDE, LITERAL_WORDS_SIGIL_NAME, WORDS_PROMOTER);
    r = r && literalWordsBody(b, l + 1);
    r = r && consumeToken(b, WORDS_TERMINATOR);
    r = r && sigilModifiers(b, l + 1);
    exit_section_(b, m, LITERAL_WORDS_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // mapOperation |
  //                 structOperation
  static boolean map(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "map")) return false;
    if (!nextTokenIs(b, STRUCT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mapOperation(b, l + 1);
    if (!r) r = structOperation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPENING_CURLY EOL*
  //                  (
  //                   // Must be before mapConstructionArguments, so that PIPE_OPERATOR is used for updates and not matchedExpression.
  //                   mapUpdateArguments |
  //                   mapConstructionArguments
  //                  )? EOL*
  //                  CLOSING_CURLY
  public static boolean mapArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapArguments")) return false;
    if (!nextTokenIs(b, OPENING_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_CURLY);
    r = r && mapArguments_1(b, l + 1);
    r = r && mapArguments_2(b, l + 1);
    r = r && mapArguments_3(b, l + 1);
    r = r && consumeToken(b, CLOSING_CURLY);
    exit_section_(b, m, MAP_ARGUMENTS, r);
    return r;
  }

  // EOL*
  private static boolean mapArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapArguments_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "mapArguments_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (
  //                   // Must be before mapConstructionArguments, so that PIPE_OPERATOR is used for updates and not matchedExpression.
  //                   mapUpdateArguments |
  //                   mapConstructionArguments
  //                  )?
  private static boolean mapArguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapArguments_2")) return false;
    mapArguments_2_0(b, l + 1);
    return true;
  }

  // mapUpdateArguments |
  //                   mapConstructionArguments
  private static boolean mapArguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapArguments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mapUpdateArguments(b, l + 1);
    if (!r) r = mapConstructionArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean mapArguments_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapArguments_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "mapArguments_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // mapTailArguments
  public static boolean mapConstructionArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapConstructionArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<map construction arguments>");
    r = mapTailArguments(b, l + 1);
    exit_section_(b, l, m, MAP_CONSTRUCTION_ARGUMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // maxExpression | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L498-L499
  //                           atMaxExpression
  static boolean mapExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = maxExpression(b, l + 1);
    if (!r) r = atMaxExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // mapPrefixOperator mapArguments
  public static boolean mapOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapOperation")) return false;
    if (!nextTokenIs(b, STRUCT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mapPrefixOperator(b, l + 1);
    r = r && mapArguments(b, l + 1);
    exit_section_(b, m, MAP_OPERATION, r);
    return r;
  }

  /* ********************************************************** */
  // STRUCT_OPERATOR EOL*
  public static boolean mapPrefixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapPrefixOperator")) return false;
    if (!nextTokenIs(b, STRUCT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRUCT_OPERATOR);
    r = r && mapPrefixOperator_1(b, l + 1);
    exit_section_(b, m, MAP_PREFIX_OPERATOR, r);
    return r;
  }

  // EOL*
  private static boolean mapPrefixOperator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapPrefixOperator_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "mapPrefixOperator_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // keywords | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L524
  //                              associationsBase infixComma keywords | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L526
  //                              associations
  static boolean mapTailArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapTailArguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keywords(b, l + 1);
    if (!r) r = mapTailArguments_1(b, l + 1);
    if (!r) r = associations(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // associationsBase infixComma keywords
  private static boolean mapTailArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapTailArguments_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = associationsBase(b, l + 1);
    r = r && infixComma(b, l + 1);
    r = r && keywords(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // matchedMatchOperation pipeInfixOperator mapTailArguments
  public static boolean mapUpdateArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mapUpdateArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<map update arguments>");
    r = matchedExpression(b, l + 1, 5);
    r = r && pipeInfixOperator(b, l + 1);
    r = r && mapTailArguments(b, l + 1);
    exit_section_(b, l, m, MAP_UPDATE_ARGUMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EOL* MATCH_OPERATOR EOL*
  public static boolean matchInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchInfixOperator")) return false;
    if (!nextTokenIs(b, "<=>", EOL, MATCH_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<=>");
    r = matchInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, MATCH_OPERATOR);
    r = r && matchInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, MATCH_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean matchInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean matchInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "matchInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // CALL parenthesesArguments parenthesesArguments? | // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L254-255
  // /*
  //  * Dot (Anonymous function) Call Operation
  //  *
  //  * @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L403
  //  */
  public static boolean matchedParenthesesArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedParenthesesArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<matched parentheses arguments>");
    r = matchedParenthesesArguments_0(b, l + 1);
    if (!r) r = consumeToken(b, MATCHEDPARENTHESESARGUMENTS_1_0);
    exit_section_(b, l, m, MATCHED_PARENTHESES_ARGUMENTS, r, false, null);
    return r;
  }

  // CALL parenthesesArguments parenthesesArguments?
  private static boolean matchedParenthesesArguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedParenthesesArguments_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CALL);
    r = r && parenthesesArguments(b, l + 1);
    r = r && matchedParenthesesArguments_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // parenthesesArguments?
  private static boolean matchedParenthesesArguments_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedParenthesesArguments_0_2")) return false;
    parenthesesArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // dotInfixOperator parenthesesArguments parenthesesArguments?
  public static boolean maxDotCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxDotCall")) return false;
    if (!nextTokenIs(b, "<max dot call>", DOT_OPERATOR, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<max dot call>");
    r = dotInfixOperator(b, l + 1);
    r = r && parenthesesArguments(b, l + 1);
    r = r && maxDotCall_2(b, l + 1);
    exit_section_(b, l, m, MATCHED_DOT_CALL, r, false, null);
    return r;
  }

  // parenthesesArguments?
  private static boolean maxDotCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxDotCall_2")) return false;
    parenthesesArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // matchedBracketOperation maxDotCall |
  //                           /* matchedQualifiedBracketOperation because it is in the Pratt-parsing table for
  //                              matchedExpression will match matchedQualifiedBracketOperation or anything after it in
  //                              matchedExpression.  matchedQualifiedBracketOperation is used because it is the next rule
  //                              after matchedQualifiedAliasOperation. maxQualifiedAlias needs to be `left` and `+` to
  //                              emulate the POSTFIX behavior for matchedQualifiedAliasOperation.
  //                              matchedQualifiedAliasOperation cannot be used because the Pratt-parsing table will allow
  //                              matchedQualifiedAliasOperation to match it or any lower rule. */
  //                           matchedQualifiedBracketOperation maxQualifiedAlias+ | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L231
  //                           /* matchedQualifiedNoArgumentsCall because it is first rule after
  //                             matchedQualifiedParenthesesCall */
  //                           matchedQualifiedNoArgumentsCall maxQualifiedParenthesesCall | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L231
  //                           /* matchedAtUnqualifiedBracketOperation and all rules thrugh accessExpression are necessary
  //                              because all those rules are ATOM or PREFIX so they won't also match lower rules */
  //                           (
  //                            matchedAtUnqualifiedBracketOperation |
  //                            matchedAtNonNumericOperation |
  //                            matchedUnqualifiedParenthesesCall |
  //                            matchedUnqualifiedBracketOperation |
  //                            variable |
  //                            accessExpression
  //                           ) maxQualifiedNoArgumentsCall | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L499
  //                           matchedUnqualifiedParenthesesCall | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L231
  //                           variable | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L499
  //                           atom | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L226-L228
  //                           alias
  static boolean maxExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = maxExpression_0(b, l + 1);
    if (!r) r = maxExpression_1(b, l + 1);
    if (!r) r = maxExpression_2(b, l + 1);
    if (!r) r = maxExpression_3(b, l + 1);
    if (!r) r = matchedUnqualifiedParenthesesCall(b, l + 1);
    if (!r) r = variable(b, l + 1);
    if (!r) r = atom(b, l + 1);
    if (!r) r = alias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // matchedBracketOperation maxDotCall
  private static boolean maxExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpression(b, l + 1, 21);
    r = r && maxDotCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // matchedQualifiedBracketOperation maxQualifiedAlias+
  private static boolean maxExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpression(b, l + 1, 23);
    r = r && maxExpression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // maxQualifiedAlias+
  private static boolean maxExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxExpression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = maxQualifiedAlias(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!maxQualifiedAlias(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "maxExpression_1_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // matchedQualifiedNoArgumentsCall maxQualifiedParenthesesCall
  private static boolean maxExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedExpression(b, l + 1, 25);
    r = r && maxQualifiedParenthesesCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //                            matchedAtUnqualifiedBracketOperation |
  //                            matchedAtNonNumericOperation |
  //                            matchedUnqualifiedParenthesesCall |
  //                            matchedUnqualifiedBracketOperation |
  //                            variable |
  //                            accessExpression
  //                           ) maxQualifiedNoArgumentsCall
  private static boolean maxExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = maxExpression_3_0(b, l + 1);
    r = r && maxQualifiedNoArgumentsCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // matchedAtUnqualifiedBracketOperation |
  //                            matchedAtNonNumericOperation |
  //                            matchedUnqualifiedParenthesesCall |
  //                            matchedUnqualifiedBracketOperation |
  //                            variable |
  //                            accessExpression
  private static boolean maxExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchedAtUnqualifiedBracketOperation(b, l + 1);
    if (!r) r = matchedAtNonNumericOperation(b, l + 1);
    if (!r) r = matchedUnqualifiedParenthesesCall(b, l + 1);
    if (!r) r = matchedUnqualifiedBracketOperation(b, l + 1);
    if (!r) r = variable(b, l + 1);
    if (!r) r = accessExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // dotInfixOperator alias
  public static boolean maxQualifiedAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxQualifiedAlias")) return false;
    if (!nextTokenIs(b, "<max qualified alias>", DOT_OPERATOR, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<max qualified alias>");
    r = dotInfixOperator(b, l + 1);
    r = r && alias(b, l + 1);
    exit_section_(b, l, m, MATCHED_QUALIFIED_ALIAS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // dotInfixOperator relativeIdentifier !CALL
  public static boolean maxQualifiedNoArgumentsCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxQualifiedNoArgumentsCall")) return false;
    if (!nextTokenIs(b, "<max qualified no arguments call>", DOT_OPERATOR, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<max qualified no arguments call>");
    r = dotInfixOperator(b, l + 1);
    r = r && relativeIdentifier(b, l + 1);
    r = r && maxQualifiedNoArgumentsCall_2(b, l + 1);
    exit_section_(b, l, m, MATCHED_QUALIFIED_NO_ARGUMENTS_CALL, r, false, null);
    return r;
  }

  // !CALL
  private static boolean maxQualifiedNoArgumentsCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxQualifiedNoArgumentsCall_2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, CALL);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // dotInfixOperator relativeIdentifier matchedParenthesesArguments
  public static boolean maxQualifiedParenthesesCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "maxQualifiedParenthesesCall")) return false;
    if (!nextTokenIs(b, "<max qualified parentheses call>", DOT_OPERATOR, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, "<max qualified parentheses call>");
    r = dotInfixOperator(b, l + 1);
    r = r && relativeIdentifier(b, l + 1);
    r = r && matchedParenthesesArguments(b, l + 1);
    exit_section_(b, l, m, MATCHED_QUALIFIED_PARENTHESES_CALL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EOL* MULTIPLICATION_OPERATOR EOL*
  public static boolean multiplicationInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicationInfixOperator")) return false;
    if (!nextTokenIs(b, "<*, />", EOL, MULTIPLICATION_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<*, />");
    r = multiplicationInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, MULTIPLICATION_OPERATOR);
    r = r && multiplicationInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, MULTIPLICATION_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean multiplicationInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicationInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "multiplicationInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean multiplicationInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicationInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "multiplicationInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // noParenthesesOneArgument |
  //                            noParenthesesManyArguments
  public static boolean noParenthesesArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses arguments>");
    r = noParenthesesOneArgument(b, l + 1);
    if (!r) r = noParenthesesManyArguments(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_ARGUMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !additionTail matchedExpression (infixComma noParenthesesExpression)+
  static boolean noParenthesesCommaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesCommaExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesCommaExpression_0(b, l + 1);
    r = r && matchedExpression(b, l + 1, -1);
    r = r && noParenthesesCommaExpression_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !additionTail
  private static boolean noParenthesesCommaExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesCommaExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !additionTail(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // (infixComma noParenthesesExpression)+
  private static boolean noParenthesesCommaExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesCommaExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesCommaExpression_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!noParenthesesCommaExpression_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesCommaExpression_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // infixComma noParenthesesExpression
  private static boolean noParenthesesCommaExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesCommaExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixComma(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // emptyParentheses |
  //                             /* Must be before matchedExpression because noParenthesesExpression is
  //                                `matchedExpressionDotIdentifier callArgumentsNoParenthesesManyStrict` which is longer
  //                                than `matchedExpressionDotIdentifier` in matchedExpression. */
  //                             /* This will be marked as an error by
  //                                {@link org.elixir_lang.inspection.NoParenthesesManyStrict} */
  //                             noParenthesesManyStrictNoParenthesesExpression |
  //                             matchedExpression
  public static boolean noParenthesesExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses expression>");
    r = emptyParentheses(b, l + 1);
    if (!r) r = noParenthesesManyStrictNoParenthesesExpression(b, l + 1);
    if (!r) r = matchedExpression(b, l + 1, -1);
    exit_section_(b, l, m, NO_PARENTHESES_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // matchedExpression
  public static boolean noParenthesesFirstPositional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesFirstPositional")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses first positional>");
    r = matchedExpression(b, l + 1, -1);
    exit_section_(b, l, m, NO_PARENTHESES_FIRST_POSITIONAL, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // keywordKeyColonEOL noParenthesesExpression
  public static boolean noParenthesesKeywordPair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesKeywordPair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses keyword pair>");
    r = keywordKeyColonEOL(b, l + 1);
    r = r && noParenthesesExpression(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_KEYWORD_PAIR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // noParenthesesKeywordPair (infixComma noParenthesesKeywordPair)*
  public static boolean noParenthesesKeywords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesKeywords")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses keywords>");
    r = noParenthesesKeywordPair(b, l + 1);
    r = r && noParenthesesKeywords_1(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_KEYWORDS, r, false, null);
    return r;
  }

  // (infixComma noParenthesesKeywordPair)*
  private static boolean noParenthesesKeywords_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesKeywords_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!noParenthesesKeywords_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "noParenthesesKeywords_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // infixComma noParenthesesKeywordPair
  private static boolean noParenthesesKeywords_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesKeywords_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixComma(b, l + 1);
    r = r && noParenthesesKeywordPair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // noParenthesesOnePositionalAndKeywordsArguments |
  //                                noParenthesesManyPositionalAndMaybeKeywordsArguments
  public static boolean noParenthesesManyArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesManyArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses many arguments>");
    r = noParenthesesOnePositionalAndKeywordsArguments(b, l + 1);
    if (!r) r = noParenthesesManyPositionalAndMaybeKeywordsArguments(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_MANY_ARGUMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // noParenthesesManyArguments |
  //                                              noParenthesesStrict
  static boolean noParenthesesManyArgumentsStrict(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesManyArgumentsStrict")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesManyArguments(b, l + 1);
    if (!r) r = noParenthesesStrict(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER !KEYWORD_PAIR_COLON
  public static boolean noParenthesesManyArgumentsUnqualifiedIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesManyArgumentsUnqualifiedIdentifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && noParenthesesManyArgumentsUnqualifiedIdentifier_1(b, l + 1);
    exit_section_(b, m, NO_PARENTHESES_MANY_ARGUMENTS_UNQUALIFIED_IDENTIFIER, r);
    return r;
  }

  // !KEYWORD_PAIR_COLON
  private static boolean noParenthesesManyArgumentsUnqualifiedIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesManyArgumentsUnqualifiedIdentifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, KEYWORD_PAIR_COLON);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // noParenthesesCommaExpression (infixComma noParenthesesKeywords)?
  public static boolean noParenthesesManyPositionalAndMaybeKeywordsArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesManyPositionalAndMaybeKeywordsArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses many positional and maybe keywords arguments>");
    r = noParenthesesCommaExpression(b, l + 1);
    r = r && noParenthesesManyPositionalAndMaybeKeywordsArguments_1(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_MANY_POSITIONAL_AND_MAYBE_KEYWORDS_ARGUMENTS, r, false, null);
    return r;
  }

  // (infixComma noParenthesesKeywords)?
  private static boolean noParenthesesManyPositionalAndMaybeKeywordsArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesManyPositionalAndMaybeKeywordsArguments_1")) return false;
    noParenthesesManyPositionalAndMaybeKeywordsArguments_1_0(b, l + 1);
    return true;
  }

  // infixComma noParenthesesKeywords
  private static boolean noParenthesesManyPositionalAndMaybeKeywordsArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesManyPositionalAndMaybeKeywordsArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixComma(b, l + 1);
    r = r && noParenthesesKeywords(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unqualifiedNoParenthesesManyArgumentsCall
  public static boolean noParenthesesManyStrictNoParenthesesExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesManyStrictNoParenthesesExpression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unqualifiedNoParenthesesManyArgumentsCall(b, l + 1);
    exit_section_(b, m, NO_PARENTHESES_MANY_STRICT_NO_PARENTHESES_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // noParenthesesKeywords | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L417
  //                              unqualifiedNoParenthesesManyArgumentsCall | // @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L419
  //                              /* This should NOT be in matchedExpression as it's not in matched_expr, but in no_parens_expr,
  //                                 but having a rule that starts with matchedExpression is only legal in a rule that extends
  //                                 matchedExpression.
  //                                 @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L124-L125 */
  //                              noParenthesesManyArgumentsStrict |
  //                              /* MUST be after noParenthesesManyArgumentsStrict so that matchedExpression's inbuilt error handling doesn't match with error.
  //                                 NOTE this is used in both unmatchedExpression and matchedExpression.  Using
  //                                 matchedExpression here ensures the `do` block is only consumed by the left-most
  //                                 unmatchedExpression call and not any of the middle matchedExpression calls.
  //                                 @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_parser.yrl#L418
  //                                 @see https://github.com/elixir-lang/elixir/blob/de39bbaca277002797e52ffbde617ace06233a2b/lib/elixir/src/elixir_tokenizer.erl#L609-L610 */
  //                              !additionTail matchedExpression
  public static boolean noParenthesesOneArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesOneArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses one argument>");
    r = noParenthesesKeywords(b, l + 1);
    if (!r) r = unqualifiedNoParenthesesManyArgumentsCall(b, l + 1);
    if (!r) r = noParenthesesManyArgumentsStrict(b, l + 1);
    if (!r) r = noParenthesesOneArgument_3(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_ONE_ARGUMENT, r, false, null);
    return r;
  }

  // !additionTail matchedExpression
  private static boolean noParenthesesOneArgument_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesOneArgument_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesOneArgument_3_0(b, l + 1);
    r = r && matchedExpression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !additionTail
  private static boolean noParenthesesOneArgument_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesOneArgument_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !additionTail(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // noParenthesesFirstPositional infixComma noParenthesesKeywords
  public static boolean noParenthesesOnePositionalAndKeywordsArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesOnePositionalAndKeywordsArguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<no parentheses one positional and keywords arguments>");
    r = noParenthesesFirstPositional(b, l + 1);
    r = r && infixComma(b, l + 1);
    r = r && noParenthesesKeywords(b, l + 1);
    exit_section_(b, l, m, NO_PARENTHESES_ONE_POSITIONAL_AND_KEYWORDS_ARGUMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // emptyParentheses |
  //                         OPENING_PARENTHESIS (
  //                                              noParenthesesKeywords |
  //                                              noParenthesesManyArguments
  //                                             ) CLOSING_PARENTHESIS
  public static boolean noParenthesesStrict(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesStrict")) return false;
    if (!nextTokenIs(b, OPENING_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = emptyParentheses(b, l + 1);
    if (!r) r = noParenthesesStrict_1(b, l + 1);
    exit_section_(b, m, NO_PARENTHESES_STRICT, r);
    return r;
  }

  // OPENING_PARENTHESIS (
  //                                              noParenthesesKeywords |
  //                                              noParenthesesManyArguments
  //                                             ) CLOSING_PARENTHESIS
  private static boolean noParenthesesStrict_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesStrict_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_PARENTHESIS);
    r = r && noParenthesesStrict_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSING_PARENTHESIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // noParenthesesKeywords |
  //                                              noParenthesesManyArguments
  private static boolean noParenthesesStrict_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "noParenthesesStrict_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesKeywords(b, l + 1);
    if (!r) r = noParenthesesManyArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // charToken |
  //                     binaryWholeNumber |
  //                     // decimalFloat starts with decimalWholeNumber, so decimalFloat needs to be first
  //                     decimalFloat |
  //                     decimalWholeNumber |
  //                     hexadecimalWholeNumber |
  //                     octalWholeNumber |
  //                     unknownBaseWholeNumber
  static boolean numeric(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = charToken(b, l + 1);
    if (!r) r = binaryWholeNumber(b, l + 1);
    if (!r) r = decimalFloat(b, l + 1);
    if (!r) r = decimalWholeNumber(b, l + 1);
    if (!r) r = hexadecimalWholeNumber(b, l + 1);
    if (!r) r = octalWholeNumber(b, l + 1);
    if (!r) r = unknownBaseWholeNumber(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INVALID_OCTAL_DIGITS | VALID_OCTAL_DIGITS
  public static boolean octalDigits(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octalDigits")) return false;
    if (!nextTokenIs(b, "<octal digits>", INVALID_OCTAL_DIGITS, VALID_OCTAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<octal digits>");
    r = consumeToken(b, INVALID_OCTAL_DIGITS);
    if (!r) r = consumeToken(b, VALID_OCTAL_DIGITS);
    exit_section_(b, l, m, OCTAL_DIGITS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BASE_WHOLE_NUMBER_PREFIX OCTAL_WHOLE_NUMBER_BASE octalDigits+
  public static boolean octalWholeNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octalWholeNumber")) return false;
    if (!nextTokenIs(b, BASE_WHOLE_NUMBER_PREFIX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 2, BASE_WHOLE_NUMBER_PREFIX, OCTAL_WHOLE_NUMBER_BASE);
    p = r; // pin = 2
    r = r && octalWholeNumber_2(b, l + 1);
    exit_section_(b, l, m, OCTAL_WHOLE_NUMBER, r, p, null);
    return r || p;
  }

  // octalDigits+
  private static boolean octalWholeNumber_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "octalWholeNumber_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = octalDigits(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!octalDigits(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "octalWholeNumber_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VALID_HEXADECIMAL_DIGITS
  public static boolean openHexadecimalEscapeSequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "openHexadecimalEscapeSequence")) return false;
    if (!nextTokenIs(b, VALID_HEXADECIMAL_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALID_HEXADECIMAL_DIGITS);
    exit_section_(b, m, OPEN_HEXADECIMAL_ESCAPE_SEQUENCE, r);
    return r;
  }

  /* ********************************************************** */
  // EOL* OR_OPERATOR EOL*
  public static boolean orInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orInfixOperator")) return false;
    if (!nextTokenIs(b, "<||, |||, or>", EOL, OR_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<||, |||, or>");
    r = orInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, OR_OPERATOR);
    r = r && orInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, OR_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean orInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "orInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean orInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "orInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // OPENING_PARENTHESIS EOL*
  //                          (
  //                           unqualifiedNoParenthesesManyArgumentsCall | // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L485
  //                           keywords | // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L486
  //                           parenthesesPositionalArguments (infixComma keywords)?)? EOL* // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L487-L488
  //                          CLOSING_PARENTHESIS
  public static boolean parenthesesArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesesArguments")) return false;
    if (!nextTokenIs(b, OPENING_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_PARENTHESIS);
    r = r && parenthesesArguments_1(b, l + 1);
    r = r && parenthesesArguments_2(b, l + 1);
    r = r && parenthesesArguments_3(b, l + 1);
    r = r && consumeToken(b, CLOSING_PARENTHESIS);
    exit_section_(b, m, PARENTHESES_ARGUMENTS, r);
    return r;
  }

  // EOL*
  private static boolean parenthesesArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesesArguments_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "parenthesesArguments_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (
  //                           unqualifiedNoParenthesesManyArgumentsCall | // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L485
  //                           keywords | // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L486
  //                           parenthesesPositionalArguments (infixComma keywords)?)?
  private static boolean parenthesesArguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesesArguments_2")) return false;
    parenthesesArguments_2_0(b, l + 1);
    return true;
  }

  // unqualifiedNoParenthesesManyArgumentsCall | // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L485
  //                           keywords | // @see https://github.com/elixir-lang/elixir/blob/39b6789a8625071e149f0a7347ca7a2111f7c8f2/lib/elixir/src/elixir_parser.yrl#L486
  //                           parenthesesPositionalArguments (infixComma keywords)?
  private static boolean parenthesesArguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesesArguments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unqualifiedNoParenthesesManyArgumentsCall(b, l + 1);
    if (!r) r = keywords(b, l + 1);
    if (!r) r = parenthesesArguments_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // parenthesesPositionalArguments (infixComma keywords)?
  private static boolean parenthesesArguments_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesesArguments_2_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parenthesesPositionalArguments(b, l + 1);
    r = r && parenthesesArguments_2_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (infixComma keywords)?
  private static boolean parenthesesArguments_2_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesesArguments_2_0_2_1")) return false;
    parenthesesArguments_2_0_2_1_0(b, l + 1);
    return true;
  }

  // infixComma keywords
  private static boolean parenthesesArguments_2_0_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesesArguments_2_0_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = infixComma(b, l + 1);
    r = r && keywords(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean parenthesesArguments_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesesArguments_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "parenthesesArguments_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // containerArgumentsBase
  static boolean parenthesesPositionalArguments(PsiBuilder b, int l) {
    return containerArgumentsBase(b, l + 1);
  }

  /* ********************************************************** */
  // OPENING_PARENTHESIS EOL*
  //                       (infixSemicolon? stab infixSemicolon? | infixSemicolon)
  //                       EOL* CLOSING_PARENTHESIS
  public static boolean parentheticalStab(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentheticalStab")) return false;
    if (!nextTokenIs(b, OPENING_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_PARENTHESIS);
    r = r && parentheticalStab_1(b, l + 1);
    r = r && parentheticalStab_2(b, l + 1);
    r = r && parentheticalStab_3(b, l + 1);
    r = r && consumeToken(b, CLOSING_PARENTHESIS);
    exit_section_(b, m, PARENTHETICAL_STAB, r);
    return r;
  }

  // EOL*
  private static boolean parentheticalStab_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentheticalStab_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "parentheticalStab_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // infixSemicolon? stab infixSemicolon? | infixSemicolon
  private static boolean parentheticalStab_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentheticalStab_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parentheticalStab_2_0(b, l + 1);
    if (!r) r = infixSemicolon(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // infixSemicolon? stab infixSemicolon?
  private static boolean parentheticalStab_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentheticalStab_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parentheticalStab_2_0_0(b, l + 1);
    r = r && stab(b, l + 1);
    r = r && parentheticalStab_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // infixSemicolon?
  private static boolean parentheticalStab_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentheticalStab_2_0_0")) return false;
    infixSemicolon(b, l + 1);
    return true;
  }

  // infixSemicolon?
  private static boolean parentheticalStab_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentheticalStab_2_0_2")) return false;
    infixSemicolon(b, l + 1);
    return true;
  }

  // EOL*
  private static boolean parentheticalStab_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parentheticalStab_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "parentheticalStab_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EOL* PIPE_OPERATOR EOL*
  public static boolean pipeInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipeInfixOperator")) return false;
    if (!nextTokenIs(b, "<|>", EOL, PIPE_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<|>");
    r = pipeInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, PIPE_OPERATOR);
    r = r && pipeInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, PIPE_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean pipeInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipeInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "pipeInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean pipeInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipeInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "pipeInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // charListLine | stringLine
  static boolean quote(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quote")) return false;
    if (!nextTokenIs(b, "", CHAR_LIST_PROMOTER, STRING_PROMOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = charListLine(b, l + 1);
    if (!r) r = stringLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (interpolation | CHAR_LIST_FRAGMENT | quoteEscapeSequence)*
  public static boolean quoteCharListBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quoteCharListBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<quote char list body>");
    int c = current_position_(b);
    while (true) {
      if (!quoteCharListBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "quoteCharListBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, QUOTE_CHAR_LIST_BODY, true, false, null);
    return true;
  }

  // interpolation | CHAR_LIST_FRAGMENT | quoteEscapeSequence
  private static boolean quoteCharListBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quoteCharListBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, CHAR_LIST_FRAGMENT);
    if (!r) r = quoteEscapeSequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // quoteHexadecimalEscapeSequence |
  //                                 escapedEOL |
  //                                 /* Must be last so that ESCAPE ('\') can be pinned in escapedCharacter without excluding
  //                                    ("\x") in hexadecimalEscapeSequence  */
  //                                 escapedCharacter
  static boolean quoteEscapeSequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quoteEscapeSequence")) return false;
    if (!nextTokenIs(b, ESCAPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = quoteHexadecimalEscapeSequence(b, l + 1);
    if (!r) r = escapedEOL(b, l + 1);
    if (!r) r = escapedCharacter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // hexadecimalEscapePrefix (openHexadecimalEscapeSequence | enclosedHexadecimalEscapeSequence)
  public static boolean quoteHexadecimalEscapeSequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quoteHexadecimalEscapeSequence")) return false;
    if (!nextTokenIs(b, ESCAPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = hexadecimalEscapePrefix(b, l + 1);
    p = r; // pin = 1
    r = r && quoteHexadecimalEscapeSequence_1(b, l + 1);
    exit_section_(b, l, m, QUOTE_HEXADECIMAL_ESCAPE_SEQUENCE, r, p, null);
    return r || p;
  }

  // openHexadecimalEscapeSequence | enclosedHexadecimalEscapeSequence
  private static boolean quoteHexadecimalEscapeSequence_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quoteHexadecimalEscapeSequence_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = openHexadecimalEscapeSequence(b, l + 1);
    if (!r) r = enclosedHexadecimalEscapeSequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (interpolation | STRING_FRAGMENT | quoteEscapeSequence)*
  public static boolean quoteStringBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quoteStringBody")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<quote string body>");
    int c = current_position_(b);
    while (true) {
      if (!quoteStringBody_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "quoteStringBody", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, QUOTE_STRING_BODY, true, false, null);
    return true;
  }

  // interpolation | STRING_FRAGMENT | quoteEscapeSequence
  private static boolean quoteStringBody_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quoteStringBody_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interpolation(b, l + 1);
    if (!r) r = consumeToken(b, STRING_FRAGMENT);
    if (!r) r = quoteEscapeSequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EOL* RELATIONAL_OPERATOR EOL*
  public static boolean relationalInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalInfixOperator")) return false;
    if (!nextTokenIs(b, "<<, >, <=, >=>", EOL, RELATIONAL_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<<, >, <=, >=>");
    r = relationalInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, RELATIONAL_OPERATOR);
    r = r && relationalInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, RELATIONAL_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean relationalInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "relationalInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean relationalInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relationalInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "relationalInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER |
  //                        AFTER |
  //                        AND_OPERATOR |
  //                        ARROW_OPERATOR |
  //                        // NOT ASSOCIATION_OPERATOR
  //                        AT_OPERATOR |
  //                        // NOT BIT_STRING_OPERATOR because it is a special form
  //                        CAPTURE_OPERATOR |
  //                        CATCH |
  //                        COMPARISON_OPERATOR |
  //                        DO |
  //                        DUAL_OPERATOR SIGNIFICANT_WHITE_SPACE? |
  //                        ELSE |
  //                        END |
  //                        HAT_OPERATOR |
  //                        IN_MATCH_OPERATOR |
  //                        IN_OPERATOR |
  //                        // NOT MAP_OPERATOR because it is a special form
  //                        MATCH_OPERATOR |
  //                        MULTIPLICATION_OPERATOR |
  //                        OR_OPERATOR |
  //                        PIPE_OPERATOR |
  //                        RELATIONAL_OPERATOR |
  //                        RESCUE |
  //                        STAB_OPERATOR |
  //                        STRUCT_OPERATOR |
  //                        // NOT TUPLE_OPERATOR because it is a special form
  //                        TWO_OPERATOR |
  //                        UNARY_OPERATOR |
  //                        WHEN_OPERATOR |
  //                        atomKeyword |
  //                        charListLine |
  //                        stringLine
  public static boolean relativeIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relativeIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<relative identifier>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, AFTER);
    if (!r) r = consumeToken(b, AND_OPERATOR);
    if (!r) r = consumeToken(b, ARROW_OPERATOR);
    if (!r) r = consumeToken(b, AT_OPERATOR);
    if (!r) r = consumeToken(b, CAPTURE_OPERATOR);
    if (!r) r = consumeToken(b, CATCH);
    if (!r) r = consumeToken(b, COMPARISON_OPERATOR);
    if (!r) r = consumeToken(b, DO);
    if (!r) r = relativeIdentifier_9(b, l + 1);
    if (!r) r = consumeToken(b, ELSE);
    if (!r) r = consumeToken(b, END);
    if (!r) r = consumeToken(b, HAT_OPERATOR);
    if (!r) r = consumeToken(b, IN_MATCH_OPERATOR);
    if (!r) r = consumeToken(b, IN_OPERATOR);
    if (!r) r = consumeToken(b, MATCH_OPERATOR);
    if (!r) r = consumeToken(b, MULTIPLICATION_OPERATOR);
    if (!r) r = consumeToken(b, OR_OPERATOR);
    if (!r) r = consumeToken(b, PIPE_OPERATOR);
    if (!r) r = consumeToken(b, RELATIONAL_OPERATOR);
    if (!r) r = consumeToken(b, RESCUE);
    if (!r) r = consumeToken(b, STAB_OPERATOR);
    if (!r) r = consumeToken(b, STRUCT_OPERATOR);
    if (!r) r = consumeToken(b, TWO_OPERATOR);
    if (!r) r = consumeToken(b, UNARY_OPERATOR);
    if (!r) r = consumeToken(b, WHEN_OPERATOR);
    if (!r) r = atomKeyword(b, l + 1);
    if (!r) r = charListLine(b, l + 1);
    if (!r) r = stringLine(b, l + 1);
    exit_section_(b, l, m, RELATIVE_IDENTIFIER, r, false, null);
    return r;
  }

  // DUAL_OPERATOR SIGNIFICANT_WHITE_SPACE?
  private static boolean relativeIdentifier_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relativeIdentifier_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DUAL_OPERATOR);
    r = r && relativeIdentifier_9_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGNIFICANT_WHITE_SPACE?
  private static boolean relativeIdentifier_9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relativeIdentifier_9_1")) return false;
    consumeToken(b, SIGNIFICANT_WHITE_SPACE);
    return true;
  }

  /* ********************************************************** */
  // sigilHexadecimalEscapeSequence |
  //                                 hexadecimalEscapePrefix |
  //                                 escapedEOL |
  //                                 /* Must be last so that ESCAPE ('\') can be pinned in escapedCharacter without excluding
  //                                    ("\x") in hexadecimalEscapeSequence  */
  //                                 escapedCharacter
  static boolean sigilEscapeSequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sigilEscapeSequence")) return false;
    if (!nextTokenIs(b, ESCAPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sigilHexadecimalEscapeSequence(b, l + 1);
    if (!r) r = hexadecimalEscapePrefix(b, l + 1);
    if (!r) r = escapedEOL(b, l + 1);
    if (!r) r = escapedCharacter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // hexadecimalEscapePrefix (openHexadecimalEscapeSequence | enclosedHexadecimalEscapeSequence)
  public static boolean sigilHexadecimalEscapeSequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sigilHexadecimalEscapeSequence")) return false;
    if (!nextTokenIs(b, ESCAPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hexadecimalEscapePrefix(b, l + 1);
    r = r && sigilHexadecimalEscapeSequence_1(b, l + 1);
    exit_section_(b, m, SIGIL_HEXADECIMAL_ESCAPE_SEQUENCE, r);
    return r;
  }

  // openHexadecimalEscapeSequence | enclosedHexadecimalEscapeSequence
  private static boolean sigilHexadecimalEscapeSequence_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sigilHexadecimalEscapeSequence_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = openHexadecimalEscapeSequence(b, l + 1);
    if (!r) r = enclosedHexadecimalEscapeSequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SIGIL_MODIFIER*
  public static boolean sigilModifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sigilModifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<sigil modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, SIGIL_MODIFIER)) break;
      if (!empty_element_parsed_guard_(b, "sigilModifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, SIGIL_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // stabOperation (endOfExpression stabOperation)* |
  //          stabBody
  public static boolean stab(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stab")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<stab>");
    r = stab_0(b, l + 1);
    if (!r) r = stabBody(b, l + 1);
    exit_section_(b, l, m, STAB, r, false, null);
    return r;
  }

  // stabOperation (endOfExpression stabOperation)*
  private static boolean stab_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stab_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stabOperation(b, l + 1);
    r = r && stab_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (endOfExpression stabOperation)*
  private static boolean stab_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stab_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stab_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stab_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // endOfExpression stabOperation
  private static boolean stab_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stab_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfExpression(b, l + 1);
    r = r && stabOperation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // stabBodyExpression (endOfExpression stabBodyExpression)*
  public static boolean stabBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<stab body>");
    r = stabBodyExpression(b, l + 1);
    r = r && stabBody_1(b, l + 1);
    exit_section_(b, l, m, STAB_BODY, r, false, null);
    return r;
  }

  // (endOfExpression stabBodyExpression)*
  private static boolean stabBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stabBody_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stabBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // endOfExpression stabBodyExpression
  private static boolean stabBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabBody_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfExpression(b, l + 1);
    r = r && stabBodyExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !stabOperationPrefix expression
  static boolean stabBodyExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabBodyExpression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stabBodyExpression_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !stabOperationPrefix
  private static boolean stabBodyExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabBodyExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !stabOperationPrefix(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EOL* STAB_OPERATOR EOL*
  public static boolean stabInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabInfixOperator")) return false;
    if (!nextTokenIs(b, "<->>", EOL, STAB_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<->>");
    r = stabInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, STAB_OPERATOR);
    r = r && stabInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, STAB_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean stabInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "stabInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean stabInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "stabInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // noParenthesesArguments
  public static boolean stabNoParenthesesSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabNoParenthesesSignature")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<stab no parentheses signature>");
    r = noParenthesesArguments(b, l + 1);
    exit_section_(b, l, m, STAB_NO_PARENTHESES_SIGNATURE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // stabOperationPrefix stabBody?
  public static boolean stabOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<stab operation>");
    r = stabOperationPrefix(b, l + 1);
    r = r && stabOperation_1(b, l + 1);
    exit_section_(b, l, m, STAB_OPERATION, r, false, null);
    return r;
  }

  // stabBody?
  private static boolean stabOperation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabOperation_1")) return false;
    stabBody(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // stabParenthesesSignature stabInfixOperator |
  //                                 stabNoParenthesesSignature stabInfixOperator |
  //                                 stabInfixOperator
  static boolean stabOperationPrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabOperationPrefix")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stabOperationPrefix_0(b, l + 1);
    if (!r) r = stabOperationPrefix_1(b, l + 1);
    if (!r) r = stabInfixOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // stabParenthesesSignature stabInfixOperator
  private static boolean stabOperationPrefix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabOperationPrefix_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stabParenthesesSignature(b, l + 1);
    r = r && stabInfixOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // stabNoParenthesesSignature stabInfixOperator
  private static boolean stabOperationPrefix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabOperationPrefix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stabNoParenthesesSignature(b, l + 1);
    r = r && stabInfixOperator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parenthesesArguments (whenInfixOperator expression)?
  public static boolean stabParenthesesSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabParenthesesSignature")) return false;
    if (!nextTokenIs(b, OPENING_PARENTHESIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parenthesesArguments(b, l + 1);
    r = r && stabParenthesesSignature_1(b, l + 1);
    exit_section_(b, m, STAB_PARENTHESES_SIGNATURE, r);
    return r;
  }

  // (whenInfixOperator expression)?
  private static boolean stabParenthesesSignature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabParenthesesSignature_1")) return false;
    stabParenthesesSignature_1_0(b, l + 1);
    return true;
  }

  // whenInfixOperator expression
  private static boolean stabParenthesesSignature_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stabParenthesesSignature_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenInfixOperator(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_HEREDOC_PROMOTER EOL
  //                   stringHeredocLine*
  //                   heredocPrefix STRING_HEREDOC_TERMINATOR
  public static boolean stringHeredoc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringHeredoc")) return false;
    if (!nextTokenIs(b, STRING_HEREDOC_PROMOTER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 1, STRING_HEREDOC_PROMOTER, EOL);
    p = r; // pin = 1
    r = r && report_error_(b, stringHeredoc_2(b, l + 1));
    r = p && report_error_(b, heredocPrefix(b, l + 1)) && r;
    r = p && consumeToken(b, STRING_HEREDOC_TERMINATOR) && r;
    exit_section_(b, l, m, STRING_HEREDOC, r, p, null);
    return r || p;
  }

  // stringHeredocLine*
  private static boolean stringHeredoc_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringHeredoc_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stringHeredocLine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "stringHeredoc_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // heredocLinePrefix quoteStringBody EOL
  public static boolean stringHeredocLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringHeredocLine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<string heredoc line>");
    r = heredocLinePrefix(b, l + 1);
    r = r && quoteStringBody(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, STRING_HEREDOC_LINE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_PROMOTER quoteStringBody STRING_TERMINATOR
  public static boolean stringLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringLine")) return false;
    if (!nextTokenIs(b, STRING_PROMOTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_PROMOTER);
    r = r && quoteStringBody(b, l + 1);
    r = r && consumeToken(b, STRING_TERMINATOR);
    exit_section_(b, m, STRING_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // mapPrefixOperator mapExpression EOL* mapArguments
  public static boolean structOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structOperation")) return false;
    if (!nextTokenIs(b, STRUCT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mapPrefixOperator(b, l + 1);
    r = r && mapExpression(b, l + 1);
    r = r && structOperation_2(b, l + 1);
    r = r && mapArguments(b, l + 1);
    exit_section_(b, m, STRUCT_OPERATION, r);
    return r;
  }

  // EOL*
  private static boolean structOperation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structOperation_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "structOperation_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // OPENING_CURLY EOL*
  //           containerArguments? EOL*
  //           CLOSING_CURLY
  public static boolean tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple")) return false;
    if (!nextTokenIs(b, OPENING_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPENING_CURLY);
    r = r && tuple_1(b, l + 1);
    r = r && tuple_2(b, l + 1);
    r = r && tuple_3(b, l + 1);
    r = r && consumeToken(b, CLOSING_CURLY);
    exit_section_(b, m, TUPLE, r);
    return r;
  }

  // EOL*
  private static boolean tuple_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "tuple_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // containerArguments?
  private static boolean tuple_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_2")) return false;
    containerArguments(b, l + 1);
    return true;
  }

  // EOL*
  private static boolean tuple_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "tuple_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EOL* TWO_OPERATOR EOL*
  public static boolean twoInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "twoInfixOperator")) return false;
    if (!nextTokenIs(b, "<++, --, .., <>>", EOL, TWO_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<++, --, .., <>>");
    r = twoInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, TWO_OPERATOR);
    r = r && twoInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, TWO_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean twoInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "twoInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "twoInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean twoInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "twoInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "twoInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EOL* TYPE_OPERATOR EOL*
  public static boolean typeInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeInfixOperator")) return false;
    if (!nextTokenIs(b, "<::>", EOL, TYPE_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<::>");
    r = typeInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, TYPE_OPERATOR);
    r = r && typeInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, TYPE_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean typeInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "typeInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean typeInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "typeInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // unaryPrefixOperator numeric
  public static boolean unaryNumericOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryNumericOperation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unary numeric operation>");
    r = unaryPrefixOperator(b, l + 1);
    r = r && numeric(b, l + 1);
    exit_section_(b, l, m, UNARY_NUMERIC_OPERATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (SIGNIFICANT_WHITE_SPACE? DUAL_OPERATOR | UNARY_OPERATOR) EOL*
  public static boolean unaryPrefixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryPrefixOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<+, -, !, ^, not, ~~~>");
    r = unaryPrefixOperator_0(b, l + 1);
    r = r && unaryPrefixOperator_1(b, l + 1);
    exit_section_(b, l, m, UNARY_PREFIX_OPERATOR, r, false, null);
    return r;
  }

  // SIGNIFICANT_WHITE_SPACE? DUAL_OPERATOR | UNARY_OPERATOR
  private static boolean unaryPrefixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryPrefixOperator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryPrefixOperator_0_0(b, l + 1);
    if (!r) r = consumeToken(b, UNARY_OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGNIFICANT_WHITE_SPACE? DUAL_OPERATOR
  private static boolean unaryPrefixOperator_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryPrefixOperator_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryPrefixOperator_0_0_0(b, l + 1);
    r = r && consumeToken(b, DUAL_OPERATOR);
    exit_section_(b, m, null, r);
    return r;
  }

  // SIGNIFICANT_WHITE_SPACE?
  private static boolean unaryPrefixOperator_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryPrefixOperator_0_0_0")) return false;
    consumeToken(b, SIGNIFICANT_WHITE_SPACE);
    return true;
  }

  // EOL*
  private static boolean unaryPrefixOperator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryPrefixOperator_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "unaryPrefixOperator_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // INVALID_UNKNOWN_BASE_DIGITS
  public static boolean unknownBaseDigits(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknownBaseDigits")) return false;
    if (!nextTokenIs(b, INVALID_UNKNOWN_BASE_DIGITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID_UNKNOWN_BASE_DIGITS);
    exit_section_(b, m, UNKNOWN_BASE_DIGITS, r);
    return r;
  }

  /* ********************************************************** */
  // BASE_WHOLE_NUMBER_PREFIX UNKNOWN_WHOLE_NUMBER_BASE unknownBaseDigits+
  public static boolean unknownBaseWholeNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknownBaseWholeNumber")) return false;
    if (!nextTokenIs(b, BASE_WHOLE_NUMBER_PREFIX)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokens(b, 2, BASE_WHOLE_NUMBER_PREFIX, UNKNOWN_WHOLE_NUMBER_BASE);
    p = r; // pin = 2
    r = r && unknownBaseWholeNumber_2(b, l + 1);
    exit_section_(b, l, m, UNKNOWN_BASE_WHOLE_NUMBER, r, p, null);
    return r || p;
  }

  // unknownBaseDigits+
  private static boolean unknownBaseWholeNumber_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unknownBaseWholeNumber_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unknownBaseDigits(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!unknownBaseDigits(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unknownBaseWholeNumber_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // noParenthesesManyArgumentsUnqualifiedIdentifier
  //                                               noParenthesesManyArgumentsStrict
  public static boolean unqualifiedNoParenthesesManyArgumentsCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unqualifiedNoParenthesesManyArgumentsCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = noParenthesesManyArgumentsUnqualifiedIdentifier(b, l + 1);
    r = r && noParenthesesManyArgumentsStrict(b, l + 1);
    exit_section_(b, m, UNQUALIFIED_NO_PARENTHESES_MANY_ARGUMENTS_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER !KEYWORD_PAIR_COLON
  public static boolean variable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && variable_1(b, l + 1);
    exit_section_(b, m, VARIABLE, r);
    return r;
  }

  // !KEYWORD_PAIR_COLON
  private static boolean variable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, KEYWORD_PAIR_COLON);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // EOL* WHEN_OPERATOR EOL*
  public static boolean whenInfixOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenInfixOperator")) return false;
    if (!nextTokenIs(b, "<when>", EOL, WHEN_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<when>");
    r = whenInfixOperator_0(b, l + 1);
    r = r && consumeToken(b, WHEN_OPERATOR);
    r = r && whenInfixOperator_2(b, l + 1);
    exit_section_(b, l, m, WHEN_INFIX_OPERATOR, r, false, null);
    return r;
  }

  // EOL*
  private static boolean whenInfixOperator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenInfixOperator_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "whenInfixOperator_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL*
  private static boolean whenInfixOperator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whenInfixOperator_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "whenInfixOperator_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // Expression root: matchedExpression
  // Operator priority table:
  // 0: PREFIX(matchedCaptureNonNumericOperation)
  // 1: BINARY(matchedInMatchOperation)
  // 2: POSTFIX(matchedWhenNoParenthesesKeywordsOperation)
  // 3: BINARY(matchedWhenOperation)
  // 4: BINARY(matchedTypeOperation)
  // 5: BINARY(matchedPipeOperation)
  // 6: BINARY(matchedMatchOperation)
  // 7: BINARY(matchedOrOperation)
  // 8: BINARY(matchedAndOperation)
  // 9: BINARY(matchedComparisonOperation)
  // 10: BINARY(matchedRelationalOperation)
  // 11: BINARY(matchedArrowOperation)
  // 12: BINARY(matchedInOperation)
  // 13: BINARY(matchedTwoOperation)
  // 14: BINARY(matchedAdditionOperation)
  // 15: BINARY(matchedMultiplicationOperation)
  // 16: BINARY(matchedHatOperation)
  // 17: PREFIX(matchedUnaryNonNumericOperation)
  // 18: POSTFIX(matchedDotCall)
  // 19: POSTFIX(matchedQualifiedNoParenthesesCall)
  // 20: ATOM(matchedAtUnqualifiedNoParenthesesCall)
  // 21: ATOM(matchedUnqualifiedNoParenthesesCall)
  // 22: POSTFIX(matchedBracketOperation)
  // 23: POSTFIX(matchedQualifiedAlias)
  // 24: POSTFIX(matchedQualifiedBracketOperation)
  // 25: POSTFIX(matchedQualifiedParenthesesCall)
  // 26: POSTFIX(matchedQualifiedNoArgumentsCall)
  // 27: ATOM(matchedAtUnqualifiedBracketOperation)
  // 28: PREFIX(matchedAtNonNumericOperation)
  // 29: ATOM(matchedUnqualifiedParenthesesCall)
  // 30: ATOM(matchedUnqualifiedBracketOperation)
  // 31: ATOM(matchedUnqualifiedNoArgumentsCall)
  // 32: ATOM(matchedAccessExpression)
  public static boolean matchedExpression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "matchedExpression")) return false;
    addVariant(b, "<matched expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<matched expression>");
    r = matchedCaptureNonNumericOperation(b, l + 1);
    if (!r) r = matchedUnaryNonNumericOperation(b, l + 1);
    if (!r) r = matchedAtUnqualifiedNoParenthesesCall(b, l + 1);
    if (!r) r = matchedUnqualifiedNoParenthesesCall(b, l + 1);
    if (!r) r = matchedAtUnqualifiedBracketOperation(b, l + 1);
    if (!r) r = matchedAtNonNumericOperation(b, l + 1);
    if (!r) r = matchedUnqualifiedParenthesesCall(b, l + 1);
    if (!r) r = matchedUnqualifiedBracketOperation(b, l + 1);
    if (!r) r = matchedUnqualifiedNoArgumentsCall(b, l + 1);
    if (!r) r = matchedAccessExpression(b, l + 1);
    p = r;
    r = r && matchedExpression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean matchedExpression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "matchedExpression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && inMatchInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 1);
        exit_section_(b, l, m, MATCHED_IN_MATCH_OPERATION, r, true, null);
      }
      else if (g < 2 && matchedWhenNoParenthesesKeywordsOperation_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MATCHED_WHEN_OPERATION, r, true, null);
      }
      else if (g < 3 && whenInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 2);
        exit_section_(b, l, m, MATCHED_WHEN_OPERATION, r, true, null);
      }
      else if (g < 4 && typeInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 3);
        exit_section_(b, l, m, MATCHED_TYPE_OPERATION, r, true, null);
      }
      else if (g < 5 && pipeInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 4);
        exit_section_(b, l, m, MATCHED_PIPE_OPERATION, r, true, null);
      }
      else if (g < 6 && matchInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 5);
        exit_section_(b, l, m, MATCHED_MATCH_OPERATION, r, true, null);
      }
      else if (g < 7 && orInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 7);
        exit_section_(b, l, m, MATCHED_OR_OPERATION, r, true, null);
      }
      else if (g < 8 && andInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 8);
        exit_section_(b, l, m, MATCHED_AND_OPERATION, r, true, null);
      }
      else if (g < 9 && comparisonInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 9);
        exit_section_(b, l, m, MATCHED_COMPARISON_OPERATION, r, true, null);
      }
      else if (g < 10 && relationalInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 10);
        exit_section_(b, l, m, MATCHED_RELATIONAL_OPERATION, r, true, null);
      }
      else if (g < 11 && arrowInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 11);
        exit_section_(b, l, m, MATCHED_ARROW_OPERATION, r, true, null);
      }
      else if (g < 12 && inInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 12);
        exit_section_(b, l, m, MATCHED_IN_OPERATION, r, true, null);
      }
      else if (g < 13 && twoInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 12);
        exit_section_(b, l, m, MATCHED_TWO_OPERATION, r, true, null);
      }
      else if (g < 14 && additionInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 14);
        exit_section_(b, l, m, MATCHED_ADDITION_OPERATION, r, true, null);
      }
      else if (g < 15 && multiplicationInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 15);
        exit_section_(b, l, m, MATCHED_MULTIPLICATION_OPERATION, r, true, null);
      }
      else if (g < 16 && hatInfixOperator(b, l + 1)) {
        r = matchedExpression(b, l, 16);
        exit_section_(b, l, m, MATCHED_HAT_OPERATION, r, true, null);
      }
      else if (g < 18 && matchedDotCall_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MATCHED_DOT_CALL, r, true, null);
      }
      else if (g < 19 && matchedQualifiedNoParenthesesCall_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MATCHED_QUALIFIED_NO_PARENTHESES_CALL, r, true, null);
      }
      else if (g < 22 && bracketArguments(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MATCHED_BRACKET_OPERATION, r, true, null);
      }
      else if (g < 23 && matchedQualifiedAlias_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MATCHED_QUALIFIED_ALIAS, r, true, null);
      }
      else if (g < 24 && matchedQualifiedBracketOperation_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MATCHED_QUALIFIED_BRACKET_OPERATION, r, true, null);
      }
      else if (g < 25 && matchedQualifiedParenthesesCall_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MATCHED_QUALIFIED_PARENTHESES_CALL, r, true, null);
      }
      else if (g < 26 && matchedQualifiedNoArgumentsCall_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, MATCHED_QUALIFIED_NO_ARGUMENTS_CALL, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean matchedCaptureNonNumericOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedCaptureNonNumericOperation")) return false;
    if (!nextTokenIsFast(b, CAPTURE_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = matchedCaptureNonNumericOperation_0(b, l + 1);
    p = r;
    r = p && matchedExpression(b, l, 0);
    exit_section_(b, l, m, MATCHED_CAPTURE_NON_NUMERIC_OPERATION, r, p, null);
    return r || p;
  }

  // capturePrefixOperator !numeric
  private static boolean matchedCaptureNonNumericOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedCaptureNonNumericOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = capturePrefixOperator(b, l + 1);
    r = r && matchedCaptureNonNumericOperation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !numeric
  private static boolean matchedCaptureNonNumericOperation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedCaptureNonNumericOperation_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !numeric(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // whenInfixOperator noParenthesesKeywords
  private static boolean matchedWhenNoParenthesesKeywordsOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedWhenNoParenthesesKeywordsOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenInfixOperator(b, l + 1);
    r = r && noParenthesesKeywords(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean matchedUnaryNonNumericOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedUnaryNonNumericOperation")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = matchedUnaryNonNumericOperation_0(b, l + 1);
    p = r;
    r = p && matchedExpression(b, l, 17);
    exit_section_(b, l, m, MATCHED_UNARY_NON_NUMERIC_OPERATION, r, p, null);
    return r || p;
  }

  // unaryPrefixOperator !numeric
  private static boolean matchedUnaryNonNumericOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedUnaryNonNumericOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryPrefixOperator(b, l + 1);
    r = r && matchedUnaryNonNumericOperation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !numeric
  private static boolean matchedUnaryNonNumericOperation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedUnaryNonNumericOperation_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !numeric(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // dotInfixOperator parenthesesArguments parenthesesArguments?
  private static boolean matchedDotCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedDotCall_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && parenthesesArguments(b, l + 1);
    r = r && matchedDotCall_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // parenthesesArguments?
  private static boolean matchedDotCall_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedDotCall_0_2")) return false;
    parenthesesArguments(b, l + 1);
    return true;
  }

  // dotInfixOperator relativeIdentifier noParenthesesOneArgument
  private static boolean matchedQualifiedNoParenthesesCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedQualifiedNoParenthesesCall_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && relativeIdentifier(b, l + 1);
    r = r && noParenthesesOneArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // atPrefixOperator IDENTIFIER noParenthesesOneArgument
  public static boolean matchedAtUnqualifiedNoParenthesesCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedAtUnqualifiedNoParenthesesCall")) return false;
    if (!nextTokenIsFast(b, AT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = atPrefixOperator(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && noParenthesesOneArgument(b, l + 1);
    exit_section_(b, m, MATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL, r);
    return r;
  }

  // IDENTIFIER noParenthesesOneArgument
  public static boolean matchedUnqualifiedNoParenthesesCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedUnqualifiedNoParenthesesCall")) return false;
    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    r = r && noParenthesesOneArgument(b, l + 1);
    exit_section_(b, m, MATCHED_UNQUALIFIED_NO_PARENTHESES_CALL, r);
    return r;
  }

  // dotInfixOperator alias
  private static boolean matchedQualifiedAlias_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedQualifiedAlias_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && alias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dotInfixOperator relativeIdentifier CALL bracketArguments
  private static boolean matchedQualifiedBracketOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedQualifiedBracketOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && relativeIdentifier(b, l + 1);
    r = r && consumeToken(b, CALL);
    r = r && bracketArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dotInfixOperator relativeIdentifier matchedParenthesesArguments
  private static boolean matchedQualifiedParenthesesCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedQualifiedParenthesesCall_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && relativeIdentifier(b, l + 1);
    r = r && matchedParenthesesArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dotInfixOperator relativeIdentifier !CALL
  private static boolean matchedQualifiedNoArgumentsCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedQualifiedNoArgumentsCall_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && relativeIdentifier(b, l + 1);
    r = r && matchedQualifiedNoArgumentsCall_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !CALL
  private static boolean matchedQualifiedNoArgumentsCall_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedQualifiedNoArgumentsCall_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeTokenSmart(b, CALL);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // atPrefixOperator IDENTIFIER CALL bracketArguments
  public static boolean matchedAtUnqualifiedBracketOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedAtUnqualifiedBracketOperation")) return false;
    if (!nextTokenIsFast(b, AT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = atPrefixOperator(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, CALL);
    r = r && bracketArguments(b, l + 1);
    exit_section_(b, m, MATCHED_AT_UNQUALIFIED_BRACKET_OPERATION, r);
    return r;
  }

  public static boolean matchedAtNonNumericOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedAtNonNumericOperation")) return false;
    if (!nextTokenIsFast(b, AT_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = matchedAtNonNumericOperation_0(b, l + 1);
    p = r;
    r = p && matchedExpression(b, l, 28);
    exit_section_(b, l, m, MATCHED_AT_NON_NUMERIC_OPERATION, r, p, null);
    return r || p;
  }

  // atPrefixOperator !numeric
  private static boolean matchedAtNonNumericOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedAtNonNumericOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = atPrefixOperator(b, l + 1);
    r = r && matchedAtNonNumericOperation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !numeric
  private static boolean matchedAtNonNumericOperation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedAtNonNumericOperation_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !numeric(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // IDENTIFIER matchedParenthesesArguments
  public static boolean matchedUnqualifiedParenthesesCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedUnqualifiedParenthesesCall")) return false;
    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    r = r && matchedParenthesesArguments(b, l + 1);
    exit_section_(b, m, MATCHED_UNQUALIFIED_PARENTHESES_CALL, r);
    return r;
  }

  // IDENTIFIER CALL bracketArguments
  public static boolean matchedUnqualifiedBracketOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedUnqualifiedBracketOperation")) return false;
    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, CALL);
    r = r && bracketArguments(b, l + 1);
    exit_section_(b, m, MATCHED_UNQUALIFIED_BRACKET_OPERATION, r);
    return r;
  }

  // IDENTIFIER !KEYWORD_PAIR_COLON
  public static boolean matchedUnqualifiedNoArgumentsCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedUnqualifiedNoArgumentsCall")) return false;
    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    r = r && matchedUnqualifiedNoArgumentsCall_1(b, l + 1);
    exit_section_(b, m, MATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL, r);
    return r;
  }

  // !KEYWORD_PAIR_COLON
  private static boolean matchedUnqualifiedNoArgumentsCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedUnqualifiedNoArgumentsCall_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeTokenSmart(b, KEYWORD_PAIR_COLON);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // accessExpression
  public static boolean matchedAccessExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchedAccessExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<matched access expression>");
    r = accessExpression(b, l + 1);
    exit_section_(b, l, m, ACCESS_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: unmatchedExpression
  // Operator priority table:
  // 0: PREFIX(unmatchedCaptureNonNumericOperation)
  // 1: BINARY(unmatchedInMatchOperation)
  // 2: POSTFIX(unmatchedWhenNoParenthesesKeywordsOperation)
  // 3: BINARY(unmatchedWhenOperation)
  // 4: BINARY(unmatchedTypeOperation)
  // 5: BINARY(unmatchedPipeOperation)
  // 6: BINARY(unmatchedMatchOperation)
  // 7: BINARY(unmatchedOrOperation)
  // 8: BINARY(unmatchedAndOperation)
  // 9: BINARY(unmatchedComparisonOperation)
  // 10: BINARY(unmatchedRelationalOperation)
  // 11: BINARY(unmatchedArrowOperation)
  // 12: BINARY(unmatchedInOperation)
  // 13: BINARY(unmatchedTwoOperation)
  // 14: BINARY(unmatchedAdditionOperation)
  // 15: BINARY(unmatchedMultiplicationOperation)
  // 16: BINARY(unmatchedHatOperation)
  // 17: PREFIX(unmatchedUnaryNonNumericOperation)
  // 18: POSTFIX(unmatchedDotCall)
  // 19: POSTFIX(unmatchedQualifiedNoParenthesesCall)
  // 20: ATOM(unmatchedAtUnqualifiedNoParenthesesCall)
  // 21: ATOM(unmatchedUnqualifiedNoParenthesesCall)
  // 22: POSTFIX(unmatchedBracketOperation)
  // 23: POSTFIX(unmatchedQualifiedAlias)
  // 24: POSTFIX(unmatchedQualifiedBracketOperation)
  // 25: POSTFIX(unmatchedQualifiedParenthesesCall)
  // 26: POSTFIX(unmatchedQualifiedNoArgumentsCall)
  // 27: ATOM(unmatchedAtUnqualifiedBracketOperation)
  // 28: PREFIX(unmatchedAtNonNumericOperation)
  // 29: ATOM(unmatchedUnqualifiedParenthesesCall)
  // 30: ATOM(unmatchedUnqualifiedBracketOperation)
  // 31: ATOM(unmatchedUnqualifiedNoArgumentsCall)
  // 32: ATOM(unmatchedAccessExpression)
  public static boolean unmatchedExpression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "unmatchedExpression")) return false;
    addVariant(b, "<unmatched expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<unmatched expression>");
    r = unmatchedCaptureNonNumericOperation(b, l + 1);
    if (!r) r = unmatchedUnaryNonNumericOperation(b, l + 1);
    if (!r) r = unmatchedAtUnqualifiedNoParenthesesCall(b, l + 1);
    if (!r) r = unmatchedUnqualifiedNoParenthesesCall(b, l + 1);
    if (!r) r = unmatchedAtUnqualifiedBracketOperation(b, l + 1);
    if (!r) r = unmatchedAtNonNumericOperation(b, l + 1);
    if (!r) r = unmatchedUnqualifiedParenthesesCall(b, l + 1);
    if (!r) r = unmatchedUnqualifiedBracketOperation(b, l + 1);
    if (!r) r = unmatchedUnqualifiedNoArgumentsCall(b, l + 1);
    if (!r) r = unmatchedAccessExpression(b, l + 1);
    p = r;
    r = r && unmatchedExpression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean unmatchedExpression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "unmatchedExpression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && inMatchInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 1);
        exit_section_(b, l, m, UNMATCHED_IN_MATCH_OPERATION, r, true, null);
      }
      else if (g < 2 && unmatchedWhenNoParenthesesKeywordsOperation_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, UNMATCHED_WHEN_OPERATION, r, true, null);
      }
      else if (g < 3 && whenInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 2);
        exit_section_(b, l, m, UNMATCHED_WHEN_OPERATION, r, true, null);
      }
      else if (g < 4 && typeInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 3);
        exit_section_(b, l, m, UNMATCHED_TYPE_OPERATION, r, true, null);
      }
      else if (g < 5 && pipeInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 4);
        exit_section_(b, l, m, UNMATCHED_PIPE_OPERATION, r, true, null);
      }
      else if (g < 6 && matchInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 5);
        exit_section_(b, l, m, UNMATCHED_MATCH_OPERATION, r, true, null);
      }
      else if (g < 7 && orInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 7);
        exit_section_(b, l, m, UNMATCHED_OR_OPERATION, r, true, null);
      }
      else if (g < 8 && andInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 8);
        exit_section_(b, l, m, UNMATCHED_AND_OPERATION, r, true, null);
      }
      else if (g < 9 && comparisonInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 9);
        exit_section_(b, l, m, UNMATCHED_COMPARISON_OPERATION, r, true, null);
      }
      else if (g < 10 && relationalInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 10);
        exit_section_(b, l, m, UNMATCHED_RELATIONAL_OPERATION, r, true, null);
      }
      else if (g < 11 && arrowInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 11);
        exit_section_(b, l, m, UNMATCHED_ARROW_OPERATION, r, true, null);
      }
      else if (g < 12 && inInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 12);
        exit_section_(b, l, m, UNMATCHED_IN_OPERATION, r, true, null);
      }
      else if (g < 13 && twoInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 12);
        exit_section_(b, l, m, UNMATCHED_TWO_OPERATION, r, true, null);
      }
      else if (g < 14 && additionInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 14);
        exit_section_(b, l, m, UNMATCHED_ADDITION_OPERATION, r, true, null);
      }
      else if (g < 15 && multiplicationInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 15);
        exit_section_(b, l, m, UNMATCHED_MULTIPLICATION_OPERATION, r, true, null);
      }
      else if (g < 16 && hatInfixOperator(b, l + 1)) {
        r = unmatchedExpression(b, l, 16);
        exit_section_(b, l, m, UNMATCHED_HAT_OPERATION, r, true, null);
      }
      else if (g < 18 && unmatchedDotCall_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, UNMATCHED_DOT_CALL, r, true, null);
      }
      else if (g < 19 && unmatchedQualifiedNoParenthesesCall_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, UNMATCHED_QUALIFIED_NO_PARENTHESES_CALL, r, true, null);
      }
      else if (g < 22 && bracketArguments(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, UNMATCHED_BRACKET_OPERATION, r, true, null);
      }
      else if (g < 23 && unmatchedQualifiedAlias_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, UNMATCHED_QUALIFIED_ALIAS, r, true, null);
      }
      else if (g < 24 && unmatchedQualifiedBracketOperation_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, UNMATCHED_QUALIFIED_BRACKET_OPERATION, r, true, null);
      }
      else if (g < 25 && unmatchedQualifiedParenthesesCall_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, UNMATCHED_QUALIFIED_PARENTHESES_CALL, r, true, null);
      }
      else if (g < 26 && unmatchedQualifiedNoArgumentsCall_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, UNMATCHED_QUALIFIED_NO_ARGUMENTS_CALL, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean unmatchedCaptureNonNumericOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedCaptureNonNumericOperation")) return false;
    if (!nextTokenIsFast(b, CAPTURE_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unmatchedCaptureNonNumericOperation_0(b, l + 1);
    p = r;
    r = p && unmatchedExpression(b, l, 0);
    exit_section_(b, l, m, UNMATCHED_CAPTURE_NON_NUMERIC_OPERATION, r, p, null);
    return r || p;
  }

  // capturePrefixOperator !numeric
  private static boolean unmatchedCaptureNonNumericOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedCaptureNonNumericOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = capturePrefixOperator(b, l + 1);
    r = r && unmatchedCaptureNonNumericOperation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !numeric
  private static boolean unmatchedCaptureNonNumericOperation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedCaptureNonNumericOperation_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !numeric(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // whenInfixOperator noParenthesesKeywords
  private static boolean unmatchedWhenNoParenthesesKeywordsOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedWhenNoParenthesesKeywordsOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whenInfixOperator(b, l + 1);
    r = r && noParenthesesKeywords(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean unmatchedUnaryNonNumericOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnaryNonNumericOperation")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unmatchedUnaryNonNumericOperation_0(b, l + 1);
    p = r;
    r = p && unmatchedExpression(b, l, 17);
    exit_section_(b, l, m, UNMATCHED_UNARY_NON_NUMERIC_OPERATION, r, p, null);
    return r || p;
  }

  // unaryPrefixOperator !numeric
  private static boolean unmatchedUnaryNonNumericOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnaryNonNumericOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryPrefixOperator(b, l + 1);
    r = r && unmatchedUnaryNonNumericOperation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !numeric
  private static boolean unmatchedUnaryNonNumericOperation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnaryNonNumericOperation_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !numeric(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // dotInfixOperator parenthesesArguments parenthesesArguments? doBlock?
  private static boolean unmatchedDotCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedDotCall_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && parenthesesArguments(b, l + 1);
    r = r && unmatchedDotCall_0_2(b, l + 1);
    r = r && unmatchedDotCall_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // parenthesesArguments?
  private static boolean unmatchedDotCall_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedDotCall_0_2")) return false;
    parenthesesArguments(b, l + 1);
    return true;
  }

  // doBlock?
  private static boolean unmatchedDotCall_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedDotCall_0_3")) return false;
    doBlock(b, l + 1);
    return true;
  }

  // dotInfixOperator relativeIdentifier noParenthesesOneArgument doBlock?
  private static boolean unmatchedQualifiedNoParenthesesCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedQualifiedNoParenthesesCall_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && relativeIdentifier(b, l + 1);
    r = r && noParenthesesOneArgument(b, l + 1);
    r = r && unmatchedQualifiedNoParenthesesCall_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // doBlock?
  private static boolean unmatchedQualifiedNoParenthesesCall_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedQualifiedNoParenthesesCall_0_3")) return false;
    doBlock(b, l + 1);
    return true;
  }

  // atPrefixOperator IDENTIFIER noParenthesesOneArgument doBlock?
  public static boolean unmatchedAtUnqualifiedNoParenthesesCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedAtUnqualifiedNoParenthesesCall")) return false;
    if (!nextTokenIsFast(b, AT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = atPrefixOperator(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && noParenthesesOneArgument(b, l + 1);
    r = r && unmatchedAtUnqualifiedNoParenthesesCall_3(b, l + 1);
    exit_section_(b, m, UNMATCHED_AT_UNQUALIFIED_NO_PARENTHESES_CALL, r);
    return r;
  }

  // doBlock?
  private static boolean unmatchedAtUnqualifiedNoParenthesesCall_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedAtUnqualifiedNoParenthesesCall_3")) return false;
    doBlock(b, l + 1);
    return true;
  }

  // IDENTIFIER noParenthesesOneArgument doBlock?
  public static boolean unmatchedUnqualifiedNoParenthesesCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnqualifiedNoParenthesesCall")) return false;
    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    r = r && noParenthesesOneArgument(b, l + 1);
    r = r && unmatchedUnqualifiedNoParenthesesCall_2(b, l + 1);
    exit_section_(b, m, UNMATCHED_UNQUALIFIED_NO_PARENTHESES_CALL, r);
    return r;
  }

  // doBlock?
  private static boolean unmatchedUnqualifiedNoParenthesesCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnqualifiedNoParenthesesCall_2")) return false;
    doBlock(b, l + 1);
    return true;
  }

  // dotInfixOperator alias
  private static boolean unmatchedQualifiedAlias_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedQualifiedAlias_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && alias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dotInfixOperator relativeIdentifier CALL bracketArguments
  private static boolean unmatchedQualifiedBracketOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedQualifiedBracketOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && relativeIdentifier(b, l + 1);
    r = r && consumeToken(b, CALL);
    r = r && bracketArguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // dotInfixOperator relativeIdentifier matchedParenthesesArguments doBlock?
  private static boolean unmatchedQualifiedParenthesesCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedQualifiedParenthesesCall_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && relativeIdentifier(b, l + 1);
    r = r && matchedParenthesesArguments(b, l + 1);
    r = r && unmatchedQualifiedParenthesesCall_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // doBlock?
  private static boolean unmatchedQualifiedParenthesesCall_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedQualifiedParenthesesCall_0_3")) return false;
    doBlock(b, l + 1);
    return true;
  }

  // dotInfixOperator relativeIdentifier !CALL doBlock?
  private static boolean unmatchedQualifiedNoArgumentsCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedQualifiedNoArgumentsCall_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dotInfixOperator(b, l + 1);
    r = r && relativeIdentifier(b, l + 1);
    r = r && unmatchedQualifiedNoArgumentsCall_0_2(b, l + 1);
    r = r && unmatchedQualifiedNoArgumentsCall_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !CALL
  private static boolean unmatchedQualifiedNoArgumentsCall_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedQualifiedNoArgumentsCall_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeTokenSmart(b, CALL);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // doBlock?
  private static boolean unmatchedQualifiedNoArgumentsCall_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedQualifiedNoArgumentsCall_0_3")) return false;
    doBlock(b, l + 1);
    return true;
  }

  // atPrefixOperator IDENTIFIER CALL bracketArguments
  public static boolean unmatchedAtUnqualifiedBracketOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedAtUnqualifiedBracketOperation")) return false;
    if (!nextTokenIsFast(b, AT_OPERATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = atPrefixOperator(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, CALL);
    r = r && bracketArguments(b, l + 1);
    exit_section_(b, m, UNMATCHED_AT_UNQUALIFIED_BRACKET_OPERATION, r);
    return r;
  }

  public static boolean unmatchedAtNonNumericOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedAtNonNumericOperation")) return false;
    if (!nextTokenIsFast(b, AT_OPERATOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unmatchedAtNonNumericOperation_0(b, l + 1);
    p = r;
    r = p && unmatchedExpression(b, l, 28);
    exit_section_(b, l, m, UNMATCHED_AT_NON_NUMERIC_OPERATION, r, p, null);
    return r || p;
  }

  // atPrefixOperator !numeric
  private static boolean unmatchedAtNonNumericOperation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedAtNonNumericOperation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = atPrefixOperator(b, l + 1);
    r = r && unmatchedAtNonNumericOperation_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !numeric
  private static boolean unmatchedAtNonNumericOperation_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedAtNonNumericOperation_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !numeric(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // IDENTIFIER matchedParenthesesArguments doBlock?
  public static boolean unmatchedUnqualifiedParenthesesCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnqualifiedParenthesesCall")) return false;
    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    r = r && matchedParenthesesArguments(b, l + 1);
    r = r && unmatchedUnqualifiedParenthesesCall_2(b, l + 1);
    exit_section_(b, m, UNMATCHED_UNQUALIFIED_PARENTHESES_CALL, r);
    return r;
  }

  // doBlock?
  private static boolean unmatchedUnqualifiedParenthesesCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnqualifiedParenthesesCall_2")) return false;
    doBlock(b, l + 1);
    return true;
  }

  // IDENTIFIER CALL bracketArguments
  public static boolean unmatchedUnqualifiedBracketOperation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnqualifiedBracketOperation")) return false;
    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, CALL);
    r = r && bracketArguments(b, l + 1);
    exit_section_(b, m, UNMATCHED_UNQUALIFIED_BRACKET_OPERATION, r);
    return r;
  }

  // IDENTIFIER !KEYWORD_PAIR_COLON doBlock?
  public static boolean unmatchedUnqualifiedNoArgumentsCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnqualifiedNoArgumentsCall")) return false;
    if (!nextTokenIsFast(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IDENTIFIER);
    r = r && unmatchedUnqualifiedNoArgumentsCall_1(b, l + 1);
    r = r && unmatchedUnqualifiedNoArgumentsCall_2(b, l + 1);
    exit_section_(b, m, UNMATCHED_UNQUALIFIED_NO_ARGUMENTS_CALL, r);
    return r;
  }

  // !KEYWORD_PAIR_COLON
  private static boolean unmatchedUnqualifiedNoArgumentsCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnqualifiedNoArgumentsCall_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeTokenSmart(b, KEYWORD_PAIR_COLON);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // doBlock?
  private static boolean unmatchedUnqualifiedNoArgumentsCall_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedUnqualifiedNoArgumentsCall_2")) return false;
    doBlock(b, l + 1);
    return true;
  }

  // accessExpression
  public static boolean unmatchedAccessExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unmatchedAccessExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<unmatched access expression>");
    r = accessExpression(b, l + 1);
    exit_section_(b, l, m, ACCESS_EXPRESSION, r, false, null);
    return r;
  }

}
