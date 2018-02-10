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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement4#mmTotalHoldingsValueOfPage
 * TotalValueInPageAndStatement4.mmTotalHoldingsValueOfPage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement4#mmTotalHoldingsValueOfStatement
 * TotalValueInPageAndStatement4.mmTotalHoldingsValueOfStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement4#mmTotalBookValueOfStatement
 * TotalValueInPageAndStatement4.mmTotalBookValueOfStatement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReport002V09.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReport002V09#mmAlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReport002V09.
 * mmAlternateReportingCurrencyTotalAmounts}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalValueInPageAndStatement4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Totals for the value of the holdings reported in the statement or page."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalValueInPageAndStatement4", propOrder = {"totalHoldingsValueOfPage", "totalHoldingsValueOfStatement", "totalBookValueOfStatement"})
public class TotalValueInPageAndStatement4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlHldgsValOfPg")
	protected AmountAndDirection14 totalHoldingsValueOfPage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection14
	 * AmountAndDirection14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement4
	 * TotalValueInPageAndStatement4}</li>
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
	public static final MMMessageAssociationEnd mmTotalHoldingsValueOfPage = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement4.mmObject();
			isDerived = false;
			xmlTag = "TtlHldgsValOfPg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalHoldingsValueOfPage";
			definition = "Total value of positions reported in this message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection14.mmObject();
		}
	};
	@XmlElement(name = "TtlHldgsValOfStmt", required = true)
	protected AmountAndDirection14 totalHoldingsValueOfStatement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection14
	 * AmountAndDirection14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement4
	 * TotalValueInPageAndStatement4}</li>
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
	public static final MMMessageAssociationEnd mmTotalHoldingsValueOfStatement = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement4.mmObject();
			isDerived = false;
			xmlTag = "TtlHldgsValOfStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalHoldingsValueOfStatement";
			definition = "Total value of positions reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection14.mmObject();
		}
	};
	@XmlElement(name = "TtlBookValOfStmt")
	protected AmountAndDirection14 totalBookValueOfStatement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection14
	 * AmountAndDirection14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement4
	 * TotalValueInPageAndStatement4}</li>
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
	public static final MMMessageAssociationEnd mmTotalBookValueOfStatement = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement4.mmObject();
			isDerived = false;
			xmlTag = "TtlBookValOfStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValueOfStatement";
			definition = "Total book value of positions reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection14.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalValueInPageAndStatement4.mmTotalHoldingsValueOfPage, com.tools20022.repository.msg.TotalValueInPageAndStatement4.mmTotalHoldingsValueOfStatement,
						com.tools20022.repository.msg.TotalValueInPageAndStatement4.mmTotalBookValueOfStatement);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReport002V09.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceAccountingReport002V09.mmAlternateReportingCurrencyTotalAmounts);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalValueInPageAndStatement4";
				definition = "Totals for the value of the holdings reported in the statement or page.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndDirection14> getTotalHoldingsValueOfPage() {
		return totalHoldingsValueOfPage == null ? Optional.empty() : Optional.of(totalHoldingsValueOfPage);
	}

	public TotalValueInPageAndStatement4 setTotalHoldingsValueOfPage(com.tools20022.repository.msg.AmountAndDirection14 totalHoldingsValueOfPage) {
		this.totalHoldingsValueOfPage = totalHoldingsValueOfPage;
		return this;
	}

	public AmountAndDirection14 getTotalHoldingsValueOfStatement() {
		return totalHoldingsValueOfStatement;
	}

	public TotalValueInPageAndStatement4 setTotalHoldingsValueOfStatement(com.tools20022.repository.msg.AmountAndDirection14 totalHoldingsValueOfStatement) {
		this.totalHoldingsValueOfStatement = Objects.requireNonNull(totalHoldingsValueOfStatement);
		return this;
	}

	public Optional<AmountAndDirection14> getTotalBookValueOfStatement() {
		return totalBookValueOfStatement == null ? Optional.empty() : Optional.of(totalBookValueOfStatement);
	}

	public TotalValueInPageAndStatement4 setTotalBookValueOfStatement(com.tools20022.repository.msg.AmountAndDirection14 totalBookValueOfStatement) {
		this.totalBookValueOfStatement = totalBookValueOfStatement;
		return this;
	}
}