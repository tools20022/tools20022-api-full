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
import com.tools20022.repository.area.colr.MarginCallRequestV03;
import com.tools20022.repository.area.colr.MarginCallRequestV04;
import com.tools20022.repository.area.colr.MarginCallResponseV03;
import com.tools20022.repository.area.colr.MarginCallResponseV04;
import com.tools20022.repository.choice.CollateralBalance1Choice;
import com.tools20022.repository.choice.MarginTerms1Choice;
import com.tools20022.repository.codeset.ExposureConventionType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.CollateralAgreement;
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.entity.VariationMarginTerm;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AggregatedIndependentAmount1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the margin call request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall1#mmExposedAmountPartyA
 * MarginCall1.mmExposedAmountPartyA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall1#mmExposedAmountPartyB
 * MarginCall1.mmExposedAmountPartyB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall1#mmExposureConvention
 * MarginCall1.mmExposureConvention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall1#mmIndependentAmountPartyA
 * MarginCall1.mmIndependentAmountPartyA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall1#mmIndependentAmountPartyB
 * MarginCall1.mmIndependentAmountPartyB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall1#mmMarginTerms
 * MarginCall1.mmMarginTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall1#mmCollateralBalance
 * MarginCall1.mmCollateralBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmMarginDetailsDueToA
 * MarginCallResponseV03.mmMarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#mmMarginDetailsDueToB
 * MarginCallResponseV03.mmMarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmMarginDetailsDueToA
 * MarginCallRequestV03.mmMarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#mmMarginDetailsDueToB
 * MarginCallRequestV03.mmMarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginDetailsDueToA
 * MarginCallRequestV04.mmMarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#mmMarginDetailsDueToB
 * MarginCallRequestV04.mmMarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmMarginDetailsDueToA
 * MarginCallResponseV04.mmMarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#mmMarginDetailsDueToB
 * MarginCallResponseV04.mmMarginDetailsDueToB}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarginCall1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the margin call request."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MarginCall1", propOrder = {"exposedAmountPartyA", "exposedAmountPartyB", "exposureConvention", "independentAmountPartyA", "independentAmountPartyB", "marginTerms", "collateralBalance"})
public class MarginCall1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XpsdAmtPtyA")
	protected ActiveCurrencyAndAmount exposedAmountPartyA;
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalExposedAmount
	 * ExposureCalculation.mmTotalExposedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsdAmtPtyA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposedAmountPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the exposures of all transactions which are in the favour of party A. That is, all transactions which would have an amount payable by party B to party A if they were being terminated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginCall1, Optional<ActiveCurrencyAndAmount>> mmExposedAmountPartyA = new MMMessageAttribute<MarginCall1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalExposedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall1.mmObject();
			isDerived = false;
			xmlTag = "XpsdAmtPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmountPartyA";
			definition = "Sum of the exposures of all transactions which are in the favour of party A. That is, all transactions which would have an amount payable by party B to party A if they were being terminated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MarginCall1 obj) {
			return obj.getExposedAmountPartyA();
		}

		@Override
		public void setValue(MarginCall1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setExposedAmountPartyA(value.orElse(null));
		}
	};
	@XmlElement(name = "XpsdAmtPtyB")
	protected ActiveCurrencyAndAmount exposedAmountPartyB;
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalExposedAmount
	 * ExposureCalculation.mmTotalExposedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsdAmtPtyB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposedAmountPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the exposures of all transactions which are in the favour of party B. That is, all transactions which would have an amount payable by party A to party B if they were being terminated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginCall1, Optional<ActiveCurrencyAndAmount>> mmExposedAmountPartyB = new MMMessageAttribute<MarginCall1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalExposedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall1.mmObject();
			isDerived = false;
			xmlTag = "XpsdAmtPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmountPartyB";
			definition = "Sum of the exposures of all transactions which are in the favour of party B. That is, all transactions which would have an amount payable by party A to party B if they were being terminated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(MarginCall1 obj) {
			return obj.getExposedAmountPartyB();
		}

		@Override
		public void setValue(MarginCall1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setExposedAmountPartyB(value.orElse(null));
		}
	};
	@XmlElement(name = "XpsrCnvntn")
	protected ExposureConventionType1Code exposureConvention;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureConventionType1Code
	 * ExposureConventionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmMarginConvention
	 * CollateralAgreement.mmMarginConvention}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrCnvntn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Determines how the variation margin requirement is to be calculated:\r\n- either Net, in which the exposure of all transactions in favour of party A and the the exposure of all transactions in favour of party B will be netted together or\r\n- gross in which two separate variation margin requirements will be determined."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MarginCall1, Optional<ExposureConventionType1Code>> mmExposureConvention = new MMMessageAttribute<MarginCall1, Optional<ExposureConventionType1Code>>() {
		{
			businessElementTrace_lazy = () -> CollateralAgreement.mmMarginConvention;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall1.mmObject();
			isDerived = false;
			xmlTag = "XpsrCnvntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureConvention";
			definition = "Determines how the variation margin requirement is to be calculated:\r\n- either Net, in which the exposure of all transactions in favour of party A and the the exposure of all transactions in favour of party B will be netted together or\r\n- gross in which two separate variation margin requirements will be determined.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExposureConventionType1Code.mmObject();
		}

		@Override
		public Optional<ExposureConventionType1Code> getValue(MarginCall1 obj) {
			return obj.getExposureConvention();
		}

		@Override
		public void setValue(MarginCall1 obj, Optional<ExposureConventionType1Code> value) {
			obj.setExposureConvention(value.orElse(null));
		}
	};
	@XmlElement(name = "IndpdntAmtPtyA")
	protected AggregatedIndependentAmount1 independentAmountPartyA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1
	 * AggregatedIndependentAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentIndependentAmount
	 * ExposureCalculation.mmCurrentIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndpdntAmtPtyA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndependentAmountPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount applied as an add-on to the exposure (to party A) usually intended to cover a possible increase in exposure before the next valuation date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall1, Optional<AggregatedIndependentAmount1>> mmIndependentAmountPartyA = new MMMessageAssociationEnd<MarginCall1, Optional<AggregatedIndependentAmount1>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmCurrentIndependentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall1.mmObject();
			isDerived = false;
			xmlTag = "IndpdntAmtPtyA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndependentAmountPartyA";
			definition = "Amount applied as an add-on to the exposure (to party A) usually intended to cover a possible increase in exposure before the next valuation date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregatedIndependentAmount1.mmObject();
		}

		@Override
		public Optional<AggregatedIndependentAmount1> getValue(MarginCall1 obj) {
			return obj.getIndependentAmountPartyA();
		}

		@Override
		public void setValue(MarginCall1 obj, Optional<AggregatedIndependentAmount1> value) {
			obj.setIndependentAmountPartyA(value.orElse(null));
		}
	};
	@XmlElement(name = "IndpdntAmtPtyB")
	protected AggregatedIndependentAmount1 independentAmountPartyB;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1
	 * AggregatedIndependentAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmCurrentIndependentAmount
	 * ExposureCalculation.mmCurrentIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndpdntAmtPtyB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndependentAmountPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An amount applied as an add-on to the exposure (to party B) usually intended to cover a possible increase in exposure before the next valuation date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall1, Optional<AggregatedIndependentAmount1>> mmIndependentAmountPartyB = new MMMessageAssociationEnd<MarginCall1, Optional<AggregatedIndependentAmount1>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmCurrentIndependentAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall1.mmObject();
			isDerived = false;
			xmlTag = "IndpdntAmtPtyB";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndependentAmountPartyB";
			definition = "An amount applied as an add-on to the exposure (to party B) usually intended to cover a possible increase in exposure before the next valuation date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregatedIndependentAmount1.mmObject();
		}

		@Override
		public Optional<AggregatedIndependentAmount1> getValue(MarginCall1 obj) {
			return obj.getIndependentAmountPartyB();
		}

		@Override
		public void setValue(MarginCall1 obj, Optional<AggregatedIndependentAmount1> value) {
			obj.setIndependentAmountPartyB(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnTerms")
	protected MarginTerms1Choice marginTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.MarginTerms1Choice
	 * MarginTerms1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariationMarginTerm
	 * VariationMarginTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnTerms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information like threshold amount, threshold type, minimum transfer amount, rouding amount or rounding convention, that applies to either the variation margin or the segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall1, Optional<MarginTerms1Choice>> mmMarginTerms = new MMMessageAssociationEnd<MarginCall1, Optional<MarginTerms1Choice>>() {
		{
			businessComponentTrace_lazy = () -> VariationMarginTerm.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall1.mmObject();
			isDerived = false;
			xmlTag = "MrgnTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginTerms";
			definition = "Provides information like threshold amount, threshold type, minimum transfer amount, rouding amount or rounding convention, that applies to either the variation margin or the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarginTerms1Choice.mmObject();
		}

		@Override
		public Optional<MarginTerms1Choice> getValue(MarginCall1 obj) {
			return obj.getMarginTerms();
		}

		@Override
		public void setValue(MarginCall1 obj, Optional<MarginTerms1Choice> value) {
			obj.setMarginTerms(value.orElse(null));
		}
	};
	@XmlElement(name = "CollBal")
	protected CollateralBalance1Choice collateralBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CollateralBalance1Choice
	 * CollateralBalance1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalCollateralCurrentValue
	 * ExposureCalculation.mmTotalCollateralCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the collateral held, in transit or that still needs to be agreed by both parties with a segregation between variation margin and segregated independent amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MarginCall1, Optional<CollateralBalance1Choice>> mmCollateralBalance = new MMMessageAssociationEnd<MarginCall1, Optional<CollateralBalance1Choice>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalCollateralCurrentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.MarginCall1.mmObject();
			isDerived = false;
			xmlTag = "CollBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBalance";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties with a segregation between variation margin and segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralBalance1Choice.mmObject();
		}

		@Override
		public Optional<CollateralBalance1Choice> getValue(MarginCall1 obj) {
			return obj.getCollateralBalance();
		}

		@Override
		public void setValue(MarginCall1 obj, Optional<CollateralBalance1Choice> value) {
			obj.setCollateralBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarginCall1.mmExposedAmountPartyA, com.tools20022.repository.msg.MarginCall1.mmExposedAmountPartyB,
						com.tools20022.repository.msg.MarginCall1.mmExposureConvention, com.tools20022.repository.msg.MarginCall1.mmIndependentAmountPartyA, com.tools20022.repository.msg.MarginCall1.mmIndependentAmountPartyB,
						com.tools20022.repository.msg.MarginCall1.mmMarginTerms, com.tools20022.repository.msg.MarginCall1.mmCollateralBalance);
				messageBuildingBlock_lazy = () -> Arrays.asList(MarginCallResponseV03.mmMarginDetailsDueToA, MarginCallResponseV03.mmMarginDetailsDueToB, MarginCallRequestV03.mmMarginDetailsDueToA,
						MarginCallRequestV03.mmMarginDetailsDueToB, MarginCallRequestV04.mmMarginDetailsDueToA, MarginCallRequestV04.mmMarginDetailsDueToB, MarginCallResponseV04.mmMarginDetailsDueToA,
						MarginCallResponseV04.mmMarginDetailsDueToB);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarginCall1";
				definition = "Details of the margin call request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getExposedAmountPartyA() {
		return exposedAmountPartyA == null ? Optional.empty() : Optional.of(exposedAmountPartyA);
	}

	public MarginCall1 setExposedAmountPartyA(ActiveCurrencyAndAmount exposedAmountPartyA) {
		this.exposedAmountPartyA = exposedAmountPartyA;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getExposedAmountPartyB() {
		return exposedAmountPartyB == null ? Optional.empty() : Optional.of(exposedAmountPartyB);
	}

	public MarginCall1 setExposedAmountPartyB(ActiveCurrencyAndAmount exposedAmountPartyB) {
		this.exposedAmountPartyB = exposedAmountPartyB;
		return this;
	}

	public Optional<ExposureConventionType1Code> getExposureConvention() {
		return exposureConvention == null ? Optional.empty() : Optional.of(exposureConvention);
	}

	public MarginCall1 setExposureConvention(ExposureConventionType1Code exposureConvention) {
		this.exposureConvention = exposureConvention;
		return this;
	}

	public Optional<AggregatedIndependentAmount1> getIndependentAmountPartyA() {
		return independentAmountPartyA == null ? Optional.empty() : Optional.of(independentAmountPartyA);
	}

	public MarginCall1 setIndependentAmountPartyA(AggregatedIndependentAmount1 independentAmountPartyA) {
		this.independentAmountPartyA = independentAmountPartyA;
		return this;
	}

	public Optional<AggregatedIndependentAmount1> getIndependentAmountPartyB() {
		return independentAmountPartyB == null ? Optional.empty() : Optional.of(independentAmountPartyB);
	}

	public MarginCall1 setIndependentAmountPartyB(AggregatedIndependentAmount1 independentAmountPartyB) {
		this.independentAmountPartyB = independentAmountPartyB;
		return this;
	}

	public Optional<MarginTerms1Choice> getMarginTerms() {
		return marginTerms == null ? Optional.empty() : Optional.of(marginTerms);
	}

	public MarginCall1 setMarginTerms(MarginTerms1Choice marginTerms) {
		this.marginTerms = marginTerms;
		return this;
	}

	public Optional<CollateralBalance1Choice> getCollateralBalance() {
		return collateralBalance == null ? Optional.empty() : Optional.of(collateralBalance);
	}

	public MarginCall1 setCollateralBalance(CollateralBalance1Choice collateralBalance) {
		this.collateralBalance = collateralBalance;
		return this;
	}
}