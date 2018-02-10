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
import com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09;
import com.tools20022.repository.entity.AssetHolding;
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
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3#mmTotalHoldingsValueOfPage
 * TotalValueInPageAndStatement3.mmTotalHoldingsValueOfPage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3#mmTotalHoldingsValueOfStatement
 * TotalValueInPageAndStatement3.mmTotalHoldingsValueOfStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3#mmTotalBookValueOfStatement
 * TotalValueInPageAndStatement3.mmTotalBookValueOfStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3#mmTotalEligibleCollateralValue
 * TotalValueInPageAndStatement3.mmTotalEligibleCollateralValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReport002V09#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReport002V09.mmAccountBaseCurrencyTotalAmounts}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleCollateralValueRule#forTotalValueInPageAndStatement3
 * ConstraintTotalEligibleCollateralValueRule.forTotalValueInPageAndStatement3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalValueInPageAndStatement3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Totals for the value of the holdings reported in the statement or page."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalValueInPageAndStatement3", propOrder = {"totalHoldingsValueOfPage", "totalHoldingsValueOfStatement", "totalBookValueOfStatement", "totalEligibleCollateralValue"})
public class TotalValueInPageAndStatement3 {

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
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3
	 * TotalValueInPageAndStatement3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3
	 * TotalValueInPageAndStatement3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3
	 * TotalValueInPageAndStatement3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement3.mmObject();
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
	@XmlElement(name = "TtlElgblCollVal")
	protected AmountAndDirection14 totalEligibleCollateralValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection14
	 * AmountAndDirection14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmEligibleCollateralValue
	 * AssetHolding.mmEligibleCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement3
	 * TotalValueInPageAndStatement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlElgblCollVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEligibleCollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of the holdings eligible for collateral purposes reported in this statement (a statement may comprise one or more messages)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalEligibleCollateralValue = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmEligibleCollateralValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement3.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblCollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleCollateralValue";
			definition = "Total value of the holdings eligible for collateral purposes reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection14.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalValueInPageAndStatement3.mmTotalHoldingsValueOfPage, com.tools20022.repository.msg.TotalValueInPageAndStatement3.mmTotalHoldingsValueOfStatement,
						com.tools20022.repository.msg.TotalValueInPageAndStatement3.mmTotalBookValueOfStatement, com.tools20022.repository.msg.TotalValueInPageAndStatement3.mmTotalEligibleCollateralValue);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceCustodyReport002V09.mmAccountBaseCurrencyTotalAmounts);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalEligibleCollateralValueRule.forTotalValueInPageAndStatement3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalValueInPageAndStatement3";
				definition = "Totals for the value of the holdings reported in the statement or page.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndDirection14> getTotalHoldingsValueOfPage() {
		return totalHoldingsValueOfPage == null ? Optional.empty() : Optional.of(totalHoldingsValueOfPage);
	}

	public TotalValueInPageAndStatement3 setTotalHoldingsValueOfPage(com.tools20022.repository.msg.AmountAndDirection14 totalHoldingsValueOfPage) {
		this.totalHoldingsValueOfPage = totalHoldingsValueOfPage;
		return this;
	}

	public AmountAndDirection14 getTotalHoldingsValueOfStatement() {
		return totalHoldingsValueOfStatement;
	}

	public TotalValueInPageAndStatement3 setTotalHoldingsValueOfStatement(com.tools20022.repository.msg.AmountAndDirection14 totalHoldingsValueOfStatement) {
		this.totalHoldingsValueOfStatement = Objects.requireNonNull(totalHoldingsValueOfStatement);
		return this;
	}

	public Optional<AmountAndDirection14> getTotalBookValueOfStatement() {
		return totalBookValueOfStatement == null ? Optional.empty() : Optional.of(totalBookValueOfStatement);
	}

	public TotalValueInPageAndStatement3 setTotalBookValueOfStatement(com.tools20022.repository.msg.AmountAndDirection14 totalBookValueOfStatement) {
		this.totalBookValueOfStatement = totalBookValueOfStatement;
		return this;
	}

	public Optional<AmountAndDirection14> getTotalEligibleCollateralValue() {
		return totalEligibleCollateralValue == null ? Optional.empty() : Optional.of(totalEligibleCollateralValue);
	}

	public TotalValueInPageAndStatement3 setTotalEligibleCollateralValue(com.tools20022.repository.msg.AmountAndDirection14 totalEligibleCollateralValue) {
		this.totalEligibleCollateralValue = totalEligibleCollateralValue;
		return this;
	}
}