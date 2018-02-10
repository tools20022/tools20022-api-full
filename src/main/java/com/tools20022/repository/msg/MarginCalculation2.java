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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.MarginResult1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details on the margin calculation per financial instrument or
 * per currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmFinancialInstrumentIdentification
 * MarginCalculation2.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmExposureAmount
 * MarginCalculation2.mmExposureAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmTotalMarginAmount
 * MarginCalculation2.mmTotalMarginAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmCollateralOnDeposit
 * MarginCalculation2.mmCollateralOnDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmMinimumRequirementDeposit
 * MarginCalculation2.mmMinimumRequirementDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmMarginResult
 * MarginCalculation2.mmMarginResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmMarginTypeAmount
 * MarginCalculation2.mmMarginTypeAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMarginTypePresenceRule#forMarginCalculation2
 * ConstraintMarginTypePresenceRule.forMarginCalculation2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCalculation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details on the margin calculation per financial instrument or per currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginCalculation2", propOrder = {"financialInstrumentIdentification", "exposureAmount", "totalMarginAmount", "collateralOnDeposit", "minimumRequirementDeposit", "marginResult", "marginTypeAmount"})
public class MarginCalculation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2
	 * MarginCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the security identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCalculation2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Provides details about the security identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};
	@XmlElement(name = "XpsrAmt")
	protected Amount2 exposureAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount2 Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalExposedAmount
	 * ExposureCalculation.mmTotalExposedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2
	 * MarginCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net total of the transaction exposure of all outstanding deals."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExposureAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalExposedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCalculation2.mmObject();
			isDerived = false;
			xmlTag = "XpsrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureAmount";
			definition = "Net total of the transaction exposure of all outstanding deals.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Amount2.mmObject();
		}
	};
	@XmlElement(name = "TtlMrgnAmt", required = true)
	protected AmountAndDirection20 totalMarginAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection20
	 * AmountAndDirection20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmTotalMarginAmount
	 * MarginCall.mmTotalMarginAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2
	 * MarginCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlMrgnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the total margin amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalMarginAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmTotalMarginAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCalculation2.mmObject();
			isDerived = false;
			xmlTag = "TtlMrgnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarginAmount";
			definition = "Provides the total margin amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection20.mmObject();
		}
	};
	@XmlElement(name = "CollOnDpst")
	protected List<com.tools20022.repository.msg.Collateral6> collateralOnDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Collateral6
	 * Collateral6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalCollateralCurrentValue
	 * ExposureCalculation.mmTotalCollateralCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2
	 * MarginCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOnDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOnDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the valuation of the collateral on deposit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralOnDeposit = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalCollateralCurrentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCalculation2.mmObject();
			isDerived = false;
			xmlTag = "CollOnDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOnDeposit";
			definition = "Provides details on the valuation of the collateral on deposit.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Collateral6.mmObject();
		}
	};
	@XmlElement(name = "MinRqrmntDpst")
	protected ActiveCurrencyAndAmount minimumRequirementDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmMinimumRequirementDeposit
	 * ExposureTerm.mmMinimumRequirementDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2
	 * MarginCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinRqrmntDpst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumRequirementDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum requirement (expressed in the reporting currency) for a participant if their requirement falls below a specific amount set by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumRequirementDeposit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmMinimumRequirementDeposit;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCalculation2.mmObject();
			isDerived = false;
			xmlTag = "MinRqrmntDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumRequirementDeposit";
			definition = "Minimum requirement (expressed in the reporting currency) for a participant if their requirement falls below a specific amount set by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "MrgnRslt")
	protected MarginResult1Choice marginResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.MarginResult1Choice
	 * MarginResult1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmCollateralMovement
	 * MarginCall.mmCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2
	 * MarginCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide details on the margin result taking into consideration the total margin amount and the minimum requirements deposit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmCollateralMovement;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCalculation2.mmObject();
			isDerived = false;
			xmlTag = "MrgnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginResult";
			definition = "Provide details on the margin result taking into consideration the total margin amount and the minimum requirements deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarginResult1Choice.mmObject();
		}
	};
	@XmlElement(name = "MrgnTpAmt")
	protected Margin3 marginTypeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Margin3 Margin3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2
	 * MarginCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnTpAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginTypeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides margin calculation details such as the initial margin amount, the variation margin amount or other margin type amounts."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMarginTypeAmount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCalculation2.mmObject();
			isDerived = false;
			xmlTag = "MrgnTpAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginTypeAmount";
			definition = "Provides margin calculation details such as the initial margin amount, the variation margin amount or other margin type amounts.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Margin3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarginCalculation2.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.MarginCalculation2.mmExposureAmount,
						com.tools20022.repository.msg.MarginCalculation2.mmTotalMarginAmount, com.tools20022.repository.msg.MarginCalculation2.mmCollateralOnDeposit,
						com.tools20022.repository.msg.MarginCalculation2.mmMinimumRequirementDeposit, com.tools20022.repository.msg.MarginCalculation2.mmMarginResult, com.tools20022.repository.msg.MarginCalculation2.mmMarginTypeAmount);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMarginTypePresenceRule.forMarginCalculation2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCalculation2";
				definition = "Provides the details on the margin calculation per financial instrument or per currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public MarginCalculation2 setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<Amount2> getExposureAmount() {
		return exposureAmount == null ? Optional.empty() : Optional.of(exposureAmount);
	}

	public MarginCalculation2 setExposureAmount(com.tools20022.repository.msg.Amount2 exposureAmount) {
		this.exposureAmount = exposureAmount;
		return this;
	}

	public AmountAndDirection20 getTotalMarginAmount() {
		return totalMarginAmount;
	}

	public MarginCalculation2 setTotalMarginAmount(com.tools20022.repository.msg.AmountAndDirection20 totalMarginAmount) {
		this.totalMarginAmount = Objects.requireNonNull(totalMarginAmount);
		return this;
	}

	public List<Collateral6> getCollateralOnDeposit() {
		return collateralOnDeposit == null ? collateralOnDeposit = new ArrayList<>() : collateralOnDeposit;
	}

	public MarginCalculation2 setCollateralOnDeposit(List<com.tools20022.repository.msg.Collateral6> collateralOnDeposit) {
		this.collateralOnDeposit = Objects.requireNonNull(collateralOnDeposit);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMinimumRequirementDeposit() {
		return minimumRequirementDeposit == null ? Optional.empty() : Optional.of(minimumRequirementDeposit);
	}

	public MarginCalculation2 setMinimumRequirementDeposit(ActiveCurrencyAndAmount minimumRequirementDeposit) {
		this.minimumRequirementDeposit = minimumRequirementDeposit;
		return this;
	}

	public Optional<MarginResult1Choice> getMarginResult() {
		return marginResult == null ? Optional.empty() : Optional.of(marginResult);
	}

	public MarginCalculation2 setMarginResult(MarginResult1Choice marginResult) {
		this.marginResult = marginResult;
		return this;
	}

	public Optional<Margin3> getMarginTypeAmount() {
		return marginTypeAmount == null ? Optional.empty() : Optional.of(marginTypeAmount);
	}

	public MarginCalculation2 setMarginTypeAmount(com.tools20022.repository.msg.Margin3 marginTypeAmount) {
		this.marginTypeAmount = marginTypeAmount;
		return this;
	}
}