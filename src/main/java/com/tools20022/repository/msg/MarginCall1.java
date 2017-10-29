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
import com.tools20022.repository.choice.CollateralBalance1Choice;
import com.tools20022.repository.choice.MarginTerms1Choice;
import com.tools20022.repository.codeset.ExposureConventionType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.entity.VariationMarginTerm;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.MarginCall1#ExposedAmountPartyA
 * MarginCall1.ExposedAmountPartyA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall1#ExposedAmountPartyB
 * MarginCall1.ExposedAmountPartyB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall1#ExposureConvention
 * MarginCall1.ExposureConvention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall1#IndependentAmountPartyA
 * MarginCall1.IndependentAmountPartyA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MarginCall1#IndependentAmountPartyB
 * MarginCall1.IndependentAmountPartyB}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall1#MarginTerms
 * MarginCall1.MarginTerms}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall1#CollateralBalance
 * MarginCall1.CollateralBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#MarginDetailsDueToA
 * MarginCallResponseV03.MarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV03#MarginDetailsDueToB
 * MarginCallResponseV03.MarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#MarginDetailsDueToA
 * MarginCallRequestV03.MarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV03#MarginDetailsDueToB
 * MarginCallRequestV03.MarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#MarginDetailsDueToA
 * MarginCallRequestV04.MarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallRequestV04#MarginDetailsDueToB
 * MarginCallRequestV04.MarginDetailsDueToB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#MarginDetailsDueToA
 * MarginCallResponseV04.MarginDetailsDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.MarginCallResponseV04#MarginDetailsDueToB
 * MarginCallResponseV04.MarginDetailsDueToB}</li>
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
 * "MarginCall1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the margin call request."</li>
 * </ul>
 */
public class MarginCall1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Sum of the exposures of all transactions which are in the favour of party
	 * A. That is, all transactions which would have an amount payable by party
	 * B to party A if they were being terminated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#TotalExposedAmount
	 * ExposureCalculation.TotalExposedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsdAmtPtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposedAmountPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the exposures of all transactions which are in the favour of party A. That is, all transactions which would have an amount payable by party B to party A if they were being terminated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExposedAmountPartyA = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarginCall1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.TotalExposedAmount;
			isDerived = false;
			xmlTag = "XpsdAmtPtyA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmountPartyA";
			definition = "Sum of the exposures of all transactions which are in the favour of party A. That is, all transactions which would have an amount payable by party B to party A if they were being terminated.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Sum of the exposures of all transactions which are in the favour of party
	 * B. That is, all transactions which would have an amount payable by party
	 * A to party B if they were being terminated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#TotalExposedAmount
	 * ExposureCalculation.TotalExposedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsdAmtPtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposedAmountPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the exposures of all transactions which are in the favour of party B. That is, all transactions which would have an amount payable by party A to party B if they were being terminated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExposedAmountPartyB = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarginCall1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.TotalExposedAmount;
			isDerived = false;
			xmlTag = "XpsdAmtPtyB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposedAmountPartyB";
			definition = "Sum of the exposures of all transactions which are in the favour of party B. That is, all transactions which would have an amount payable by party A to party B if they were being terminated.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Determines how the variation margin requirement is to be calculated:<br>
	 * - either Net, in which the exposure of all transactions in favour of
	 * party A and the the exposure of all transactions in favour of party B
	 * will be netted together or<br>
	 * - gross in which two separate variation margin requirements will be
	 * determined.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#MarginConvention
	 * CollateralAgreement.MarginConvention}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrCnvntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureConvention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Determines how the variation margin requirement is to be calculated:\r\n- either Net, in which the exposure of all transactions in favour of party A and the the exposure of all transactions in favour of party B will be netted together or\r\n- gross in which two separate variation margin requirements will be determined."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExposureConvention = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarginCall1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.MarginConvention;
			isDerived = false;
			xmlTag = "XpsrCnvntn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureConvention";
			definition = "Determines how the variation margin requirement is to be calculated:\r\n- either Net, in which the exposure of all transactions in favour of party A and the the exposure of all transactions in favour of party B will be netted together or\r\n- gross in which two separate variation margin requirements will be determined.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ExposureConventionType1Code.mmObject();
		}
	};
	/**
	 * Amount applied as an add-on to the exposure (to party A) usually intended
	 * to cover a possible increase in exposure before the next valuation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1
	 * AggregatedIndependentAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CurrentIndependentAmount
	 * ExposureCalculation.CurrentIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndpdntAmtPtyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndependentAmountPartyA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount applied as an add-on to the exposure (to party A) usually intended to cover a possible increase in exposure before the next valuation date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd IndependentAmountPartyA = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MarginCall1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CurrentIndependentAmount;
			isDerived = false;
			xmlTag = "IndpdntAmtPtyA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndependentAmountPartyA";
			definition = "Amount applied as an add-on to the exposure (to party A) usually intended to cover a possible increase in exposure before the next valuation date.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AggregatedIndependentAmount1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * An amount applied as an add-on to the exposure (to party B) usually
	 * intended to cover a possible increase in exposure before the next
	 * valuation date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregatedIndependentAmount1
	 * AggregatedIndependentAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#CurrentIndependentAmount
	 * ExposureCalculation.CurrentIndependentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndpdntAmtPtyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndependentAmountPartyB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An amount applied as an add-on to the exposure (to party B) usually intended to cover a possible increase in exposure before the next valuation date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd IndependentAmountPartyB = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MarginCall1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.CurrentIndependentAmount;
			isDerived = false;
			xmlTag = "IndpdntAmtPtyB";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndependentAmountPartyB";
			definition = "An amount applied as an add-on to the exposure (to party B) usually intended to cover a possible increase in exposure before the next valuation date.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AggregatedIndependentAmount1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides information like threshold amount, threshold type, minimum
	 * transfer amount, rouding amount or rounding convention, that applies to
	 * either the variation margin or the segregated independent amount.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information like threshold amount, threshold type, minimum transfer amount, rouding amount or rounding convention, that applies to either the variation margin or the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MarginTerms = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MarginCall1.mmObject();
			businessComponentTrace_lazy = () -> VariationMarginTerm.mmObject();
			isDerived = false;
			xmlTag = "MrgnTerms";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginTerms";
			definition = "Provides information like threshold amount, threshold type, minimum transfer amount, rouding amount or rounding convention, that applies to either the variation margin or the segregated independent amount.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> MarginTerms1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Provides details about the collateral held, in transit or that still
	 * needs to be agreed by both parties with a segregation between variation
	 * margin and segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CollateralBalance1Choice
	 * CollateralBalance1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#TotalCollateralCurrentValue
	 * ExposureCalculation.TotalCollateralCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MarginCall1 MarginCall1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the collateral held, in transit or that still needs to be agreed by both parties with a segregation between variation margin and segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CollateralBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MarginCall1.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ExposureCalculation.TotalCollateralCurrentValue;
			isDerived = false;
			xmlTag = "CollBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBalance";
			definition = "Provides details about the collateral held, in transit or that still needs to be agreed by both parties with a segregation between variation margin and segregated independent amount.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CollateralBalance1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MarginCall1.ExposedAmountPartyA, com.tools20022.repository.msg.MarginCall1.ExposedAmountPartyB,
						com.tools20022.repository.msg.MarginCall1.ExposureConvention, com.tools20022.repository.msg.MarginCall1.IndependentAmountPartyA, com.tools20022.repository.msg.MarginCall1.IndependentAmountPartyB,
						com.tools20022.repository.msg.MarginCall1.MarginTerms, com.tools20022.repository.msg.MarginCall1.CollateralBalance);
				trace_lazy = () -> MarginCall.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.MarginCallResponseV03.MarginDetailsDueToA, com.tools20022.repository.area.colr.MarginCallResponseV03.MarginDetailsDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV03.MarginDetailsDueToA, com.tools20022.repository.area.colr.MarginCallRequestV03.MarginDetailsDueToB,
						com.tools20022.repository.area.colr.MarginCallRequestV04.MarginDetailsDueToA, com.tools20022.repository.area.colr.MarginCallRequestV04.MarginDetailsDueToB,
						com.tools20022.repository.area.colr.MarginCallResponseV04.MarginDetailsDueToA, com.tools20022.repository.area.colr.MarginCallResponseV04.MarginDetailsDueToB);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarginCall1";
				definition = "Details of the margin call request.";
			}
		});
		return mmObject_lazy.get();
	}
}