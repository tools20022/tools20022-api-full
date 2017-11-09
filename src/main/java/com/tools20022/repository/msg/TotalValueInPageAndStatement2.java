/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Totals for the value of the holdings reported in the statement or page.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2#mmTotalHoldingsValueOfPage
 * TotalValueInPageAndStatement2.mmTotalHoldingsValueOfPage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2#mmTotalHoldingsValueOfStatement
 * TotalValueInPageAndStatement2.mmTotalHoldingsValueOfStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2#mmTotalBookValueOfStatement
 * TotalValueInPageAndStatement2.mmTotalBookValueOfStatement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV03.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#mmAlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV03.mmAlternateReportingCurrencyTotalAmounts
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV04.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04#mmAlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV04.mmAlternateReportingCurrencyTotalAmounts
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV05.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05#mmAlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV05.mmAlternateReportingCurrencyTotalAmounts
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV06.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06#mmAlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV06.mmAlternateReportingCurrencyTotalAmounts
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV07.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#mmAlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV07.mmAlternateReportingCurrencyTotalAmounts
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV08.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#mmAlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV08.mmAlternateReportingCurrencyTotalAmounts
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV09.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmAlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV09.mmAlternateReportingCurrencyTotalAmounts
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalValueInPageAndStatement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Totals for the value of the holdings reported in the statement or page."</li>
 * </ul>
 */
public class TotalValueInPageAndStatement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountAndDirection6 totalHoldingsValueOfPage;
	/**
	 * Total value of positions reported in this message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2
	 * TotalValueInPageAndStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlHldgsValOfPg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalHoldingsValueOfPage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total value of positions reported in this message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalHoldingsValueOfPage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalValueInPageAndStatement2.mmObject();
			isDerived = false;
			xmlTag = "TtlHldgsValOfPg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalHoldingsValueOfPage";
			definition = "Total value of positions reported in this message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};
	protected AmountAndDirection6 totalHoldingsValueOfStatement;
	/**
	 * Total value of positions reported in this statement (a statement may
	 * comprise one or more messages).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2
	 * TotalValueInPageAndStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlHldgsValOfStmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalHoldingsValueOfStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of positions reported in this statement (a statement may comprise one or more messages)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalHoldingsValueOfStatement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalValueInPageAndStatement2.mmObject();
			isDerived = false;
			xmlTag = "TtlHldgsValOfStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalHoldingsValueOfStatement";
			definition = "Total value of positions reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};
	protected AmountAndDirection6 totalBookValueOfStatement;
	/**
	 * Total book value of positions reported in this statement (a statement may
	 * comprise one or more messages).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2
	 * TotalValueInPageAndStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlBookValOfStmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBookValueOfStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total book value of positions reported in this statement (a statement may comprise one or more messages)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalBookValueOfStatement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalValueInPageAndStatement2.mmObject();
			isDerived = false;
			xmlTag = "TtlBookValOfStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValueOfStatement";
			definition = "Total book value of positions reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TotalValueInPageAndStatement2.mmTotalHoldingsValueOfPage, TotalValueInPageAndStatement2.mmTotalHoldingsValueOfStatement, TotalValueInPageAndStatement2.mmTotalBookValueOfStatement);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV03.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceAccountingReportV03.mmAlternateReportingCurrencyTotalAmounts,
						SecuritiesBalanceAccountingReportV04.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceAccountingReportV04.mmAlternateReportingCurrencyTotalAmounts,
						SecuritiesBalanceAccountingReportV05.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceAccountingReportV05.mmAlternateReportingCurrencyTotalAmounts,
						SecuritiesBalanceAccountingReportV06.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceAccountingReportV06.mmAlternateReportingCurrencyTotalAmounts,
						SecuritiesBalanceAccountingReportV07.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceAccountingReportV07.mmAlternateReportingCurrencyTotalAmounts,
						SecuritiesBalanceAccountingReportV08.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceAccountingReportV08.mmAlternateReportingCurrencyTotalAmounts,
						SecuritiesBalanceAccountingReportV09.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceAccountingReportV09.mmAlternateReportingCurrencyTotalAmounts);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalValueInPageAndStatement2";
				definition = "Totals for the value of the holdings reported in the statement or page.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection6 getTotalHoldingsValueOfPage() {
		return totalHoldingsValueOfPage;
	}

	public void setTotalHoldingsValueOfPage(com.tools20022.repository.msg.AmountAndDirection6 totalHoldingsValueOfPage) {
		this.totalHoldingsValueOfPage = totalHoldingsValueOfPage;
	}

	public AmountAndDirection6 getTotalHoldingsValueOfStatement() {
		return totalHoldingsValueOfStatement;
	}

	public void setTotalHoldingsValueOfStatement(com.tools20022.repository.msg.AmountAndDirection6 totalHoldingsValueOfStatement) {
		this.totalHoldingsValueOfStatement = totalHoldingsValueOfStatement;
	}

	public AmountAndDirection6 getTotalBookValueOfStatement() {
		return totalBookValueOfStatement;
	}

	public void setTotalBookValueOfStatement(com.tools20022.repository.msg.AmountAndDirection6 totalBookValueOfStatement) {
		this.totalBookValueOfStatement = totalBookValueOfStatement;
	}
}