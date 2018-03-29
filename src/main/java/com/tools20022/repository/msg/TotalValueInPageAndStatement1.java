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
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection6;
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
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1#mmTotalHoldingsValueOfPage
 * TotalValueInPageAndStatement1.mmTotalHoldingsValueOfPage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1#mmTotalHoldingsValueOfStatement
 * TotalValueInPageAndStatement1.mmTotalHoldingsValueOfStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1#mmTotalBookValueOfStatement
 * TotalValueInPageAndStatement1.mmTotalBookValueOfStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1#mmTotalEligibleCollateralValue
 * TotalValueInPageAndStatement1.mmTotalEligibleCollateralValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV03.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV04#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV04.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV05#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV05.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV06#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV06.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV07#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV07.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV08#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV08.mmAccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09#mmAccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceCustodyReportV09.mmAccountBaseCurrencyTotalAmounts}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalEligibleCollateralValueRule#forTotalValueInPageAndStatement1
 * ConstraintTotalEligibleCollateralValueRule.forTotalValueInPageAndStatement1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalValueInPageAndStatement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Totals for the value of the holdings reported in the statement or page."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalValueInPageAndStatement1", propOrder = {"totalHoldingsValueOfPage", "totalHoldingsValueOfStatement", "totalBookValueOfStatement", "totalEligibleCollateralValue"})
public class TotalValueInPageAndStatement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlHldgsValOfPg")
	protected AmountAndDirection6 totalHoldingsValueOfPage;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1
	 * TotalValueInPageAndStatement1}</li>
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
	public static final MMMessageAttribute<TotalValueInPageAndStatement1, Optional<AmountAndDirection6>> mmTotalHoldingsValueOfPage = new MMMessageAttribute<TotalValueInPageAndStatement1, Optional<AmountAndDirection6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement1.mmObject();
			isDerived = false;
			xmlTag = "TtlHldgsValOfPg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalHoldingsValueOfPage";
			definition = "Total value of positions reported in this message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public Optional<AmountAndDirection6> getValue(TotalValueInPageAndStatement1 obj) {
			return obj.getTotalHoldingsValueOfPage();
		}

		@Override
		public void setValue(TotalValueInPageAndStatement1 obj, Optional<AmountAndDirection6> value) {
			obj.setTotalHoldingsValueOfPage(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlHldgsValOfStmt", required = true)
	protected AmountAndDirection6 totalHoldingsValueOfStatement;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1
	 * TotalValueInPageAndStatement1}</li>
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
	public static final MMMessageAttribute<TotalValueInPageAndStatement1, AmountAndDirection6> mmTotalHoldingsValueOfStatement = new MMMessageAttribute<TotalValueInPageAndStatement1, AmountAndDirection6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement1.mmObject();
			isDerived = false;
			xmlTag = "TtlHldgsValOfStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalHoldingsValueOfStatement";
			definition = "Total value of positions reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public AmountAndDirection6 getValue(TotalValueInPageAndStatement1 obj) {
			return obj.getTotalHoldingsValueOfStatement();
		}

		@Override
		public void setValue(TotalValueInPageAndStatement1 obj, AmountAndDirection6 value) {
			obj.setTotalHoldingsValueOfStatement(value);
		}
	};
	@XmlElement(name = "TtlBookValOfStmt")
	protected AmountAndDirection6 totalBookValueOfStatement;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1
	 * TotalValueInPageAndStatement1}</li>
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
	public static final MMMessageAttribute<TotalValueInPageAndStatement1, Optional<AmountAndDirection6>> mmTotalBookValueOfStatement = new MMMessageAttribute<TotalValueInPageAndStatement1, Optional<AmountAndDirection6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement1.mmObject();
			isDerived = false;
			xmlTag = "TtlBookValOfStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValueOfStatement";
			definition = "Total book value of positions reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public Optional<AmountAndDirection6> getValue(TotalValueInPageAndStatement1 obj) {
			return obj.getTotalBookValueOfStatement();
		}

		@Override
		public void setValue(TotalValueInPageAndStatement1 obj, Optional<AmountAndDirection6> value) {
			obj.setTotalBookValueOfStatement(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlElgblCollVal")
	protected AmountAndDirection6 totalEligibleCollateralValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmEligibleCollateralValue
	 * AssetHolding.mmEligibleCollateralValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement1
	 * TotalValueInPageAndStatement1}</li>
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
	public static final MMMessageAttribute<TotalValueInPageAndStatement1, Optional<AmountAndDirection6>> mmTotalEligibleCollateralValue = new MMMessageAttribute<TotalValueInPageAndStatement1, Optional<AmountAndDirection6>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmEligibleCollateralValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalValueInPageAndStatement1.mmObject();
			isDerived = false;
			xmlTag = "TtlElgblCollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalEligibleCollateralValue";
			definition = "Total value of the holdings eligible for collateral purposes reported in this statement (a statement may comprise one or more messages).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}

		@Override
		public Optional<AmountAndDirection6> getValue(TotalValueInPageAndStatement1 obj) {
			return obj.getTotalEligibleCollateralValue();
		}

		@Override
		public void setValue(TotalValueInPageAndStatement1 obj, Optional<AmountAndDirection6> value) {
			obj.setTotalEligibleCollateralValue(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalValueInPageAndStatement1.mmTotalHoldingsValueOfPage, com.tools20022.repository.msg.TotalValueInPageAndStatement1.mmTotalHoldingsValueOfStatement,
						com.tools20022.repository.msg.TotalValueInPageAndStatement1.mmTotalBookValueOfStatement, com.tools20022.repository.msg.TotalValueInPageAndStatement1.mmTotalEligibleCollateralValue);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceCustodyReportV03.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceCustodyReportV04.mmAccountBaseCurrencyTotalAmounts,
						SecuritiesBalanceCustodyReportV05.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceCustodyReportV06.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceCustodyReportV07.mmAccountBaseCurrencyTotalAmounts,
						SecuritiesBalanceCustodyReportV08.mmAccountBaseCurrencyTotalAmounts, SecuritiesBalanceCustodyReportV09.mmAccountBaseCurrencyTotalAmounts);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalEligibleCollateralValueRule.forTotalValueInPageAndStatement1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalValueInPageAndStatement1";
				definition = "Totals for the value of the holdings reported in the statement or page.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmountAndDirection6> getTotalHoldingsValueOfPage() {
		return totalHoldingsValueOfPage == null ? Optional.empty() : Optional.of(totalHoldingsValueOfPage);
	}

	public TotalValueInPageAndStatement1 setTotalHoldingsValueOfPage(AmountAndDirection6 totalHoldingsValueOfPage) {
		this.totalHoldingsValueOfPage = totalHoldingsValueOfPage;
		return this;
	}

	public AmountAndDirection6 getTotalHoldingsValueOfStatement() {
		return totalHoldingsValueOfStatement;
	}

	public TotalValueInPageAndStatement1 setTotalHoldingsValueOfStatement(AmountAndDirection6 totalHoldingsValueOfStatement) {
		this.totalHoldingsValueOfStatement = Objects.requireNonNull(totalHoldingsValueOfStatement);
		return this;
	}

	public Optional<AmountAndDirection6> getTotalBookValueOfStatement() {
		return totalBookValueOfStatement == null ? Optional.empty() : Optional.of(totalBookValueOfStatement);
	}

	public TotalValueInPageAndStatement1 setTotalBookValueOfStatement(AmountAndDirection6 totalBookValueOfStatement) {
		this.totalBookValueOfStatement = totalBookValueOfStatement;
		return this;
	}

	public Optional<AmountAndDirection6> getTotalEligibleCollateralValue() {
		return totalEligibleCollateralValue == null ? Optional.empty() : Optional.of(totalEligibleCollateralValue);
	}

	public TotalValueInPageAndStatement1 setTotalEligibleCollateralValue(AmountAndDirection6 totalEligibleCollateralValue) {
		this.totalEligibleCollateralValue = totalEligibleCollateralValue;
		return this;
	}
}