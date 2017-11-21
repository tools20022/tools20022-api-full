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
import com.tools20022.repository.codeset.ThresholdType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides amounts taken in to account to calculate the collateral position.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmThresholdAmount
 * SummaryAmounts1.mmThresholdAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmThresholdType
 * SummaryAmounts1.mmThresholdType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmPreHaircutCollateralValue
 * SummaryAmounts1.mmPreHaircutCollateralValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmAdjustedExposure
 * SummaryAmounts1.mmAdjustedExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmCollateralRequired
 * SummaryAmounts1.mmCollateralRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmMinimumTransferAmount
 * SummaryAmounts1.mmMinimumTransferAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmRoundingAmount
 * SummaryAmounts1.mmRoundingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmPreviousExposureValue
 * SummaryAmounts1.mmPreviousExposureValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmPreviousCollateralValue
 * SummaryAmounts1.mmPreviousCollateralValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmTotalPendingIncomingCollateral
 * SummaryAmounts1.mmTotalPendingIncomingCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmTotalPendingOutgoingCollateral
 * SummaryAmounts1.mmTotalPendingOutgoingCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmTotalAccruedInterestAmount
 * SummaryAmounts1.mmTotalAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmTotalFees
 * SummaryAmounts1.mmTotalFees}</li>
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
 * "SummaryAmounts1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides amounts taken in to account to calculate the collateral position."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SummaryAmounts1", propOrder = {"thresholdAmount", "thresholdType", "preHaircutCollateralValue", "adjustedExposure", "collateralRequired", "minimumTransferAmount", "roundingAmount", "previousExposureValue",
		"previousCollateralValue", "totalPendingIncomingCollateral", "totalPendingOutgoingCollateral", "totalAccruedInterestAmount", "totalFees"})
public class SummaryAmounts1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount thresholdAmount;
	/**
	 * Amount of unsecured exposure a counterparty will accept before issuing a
	 * margin call in the base currency.
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
	 * {@linkplain com.tools20022.repository.entity.VariationMarginTerm#mmThresholdAmount
	 * VariationMarginTerm.mmThresholdAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrshldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThresholdAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of unsecured exposure a counterparty will accept before issuing a margin call in the base currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmThresholdAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VariationMarginTerm.mmThresholdAmount;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "ThrshldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdAmount";
			definition = "Amount of unsecured exposure a counterparty will accept before issuing a margin call in the base currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ThresholdType1Code thresholdType;
	/**
	 * Specifies if the threshold amount is secured or unsecured.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ThresholdType1Code
	 * ThresholdType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VariationMarginTerm#mmThresholdType
	 * VariationMarginTerm.mmThresholdType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrshldTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThresholdType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the threshold amount is secured or unsecured."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmThresholdType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VariationMarginTerm.mmThresholdType;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "ThrshldTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdType";
			definition = "Specifies if the threshold amount is secured or unsecured.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ThresholdType1Code.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount preHaircutCollateralValue;
	/**
	 * Total value of posted collateral (pre-haircut) held by the taker.
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalCollateralCurrentValue
	 * ExposureCalculation.mmTotalCollateralCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreHrcutCollVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreHaircutCollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of posted collateral (pre-haircut) held by the taker."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreHaircutCollateralValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalCollateralCurrentValue;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "PreHrcutCollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreHaircutCollateralValue";
			definition = "Total value of posted collateral (pre-haircut) held by the taker.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount adjustedExposure;
	/**
	 * Total amount of collateral required (unrounded).
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalExposedAmount
	 * ExposureCalculation.mmTotalExposedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstdXpsr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedExposure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of collateral required (unrounded)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdjustedExposure = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalExposedAmount;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "AdjstdXpsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedExposure";
			definition = "Total amount of collateral required (unrounded).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount collateralRequired;
	/**
	 * Total amount of collateral required (rounded).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of collateral required (rounded)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralRequired = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "CollReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralRequired";
			definition = "Total amount of collateral required (rounded).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount minimumTransferAmount;
	/**
	 * Minimum amount to pay/receive as specified in the agreement in the base
	 * currency (to avoid the need to transfer an inconveniently small amount of
	 * collateral).
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
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmMinimumTransferAmount
	 * ExposureTerm.mmMinimumTransferAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinTrfAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTransferAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of collateral)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumTransferAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmMinimumTransferAmount;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "MinTrfAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTransferAmount";
			definition = "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of collateral).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount roundingAmount;
	/**
	 * Amount specified to avoid the need to transfer uneven amounts of
	 * collateral.
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
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRoundingAmount
	 * ExposureTerm.mmRoundingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount specified to avoid the need to transfer uneven amounts of collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRoundingAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmRoundingAmount;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "RndgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingAmount";
			definition = "Amount specified to avoid the need to transfer uneven amounts of collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount previousExposureValue;
	/**
	 * Exposure value at previous valuation.
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalExposedAmount
	 * ExposureCalculation.mmTotalExposedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsXpsrVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousExposureValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exposure value at previous valuation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousExposureValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalExposedAmount;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "PrvsXpsrVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousExposureValue";
			definition = "Exposure value at previous valuation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount previousCollateralValue;
	/**
	 * Value of collateral at previous valuation.
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
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalCollateralCurrentValue
	 * ExposureCalculation.mmTotalCollateralCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsCollVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousCollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of collateral at previous valuation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreviousCollateralValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalCollateralCurrentValue;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "PrvsCollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousCollateralValue";
			definition = "Value of collateral at previous valuation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalPendingIncomingCollateral;
	/**
	 * Value of incoming collateral, to be settled.
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmInTransit
	 * CollateralBalance.mmInTransit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlPdgIncmgColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPendingIncomingCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of incoming collateral, to be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalPendingIncomingCollateral = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmInTransit;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "TtlPdgIncmgColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPendingIncomingCollateral";
			definition = "Value of incoming collateral, to be settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalPendingOutgoingCollateral;
	/**
	 * Value of outgoing collateral, to be settled.
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
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmInTransit
	 * CollateralBalance.mmInTransit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlPdgOutgngColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPendingOutgoingCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of outgoing collateral, to be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalPendingOutgoingCollateral = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmInTransit;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "TtlPdgOutgngColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPendingOutgoingCollateral";
			definition = "Value of outgoing collateral, to be settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalAccruedInterestAmount;
	/**
	 * Sum of accrued interest.
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
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum of accrued interest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "TtlAcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAccruedInterestAmount";
			definition = "Sum of accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalFees;
	/**
	 * Sum of fees/commissions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1
	 * SummaryAmounts1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum of fees/commissions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalFees = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "TtlFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalFees";
			definition = "Sum of fees/commissions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SummaryAmounts1.mmThresholdAmount, SummaryAmounts1.mmThresholdType, SummaryAmounts1.mmPreHaircutCollateralValue, SummaryAmounts1.mmAdjustedExposure,
						SummaryAmounts1.mmCollateralRequired, SummaryAmounts1.mmMinimumTransferAmount, SummaryAmounts1.mmRoundingAmount, SummaryAmounts1.mmPreviousExposureValue, SummaryAmounts1.mmPreviousCollateralValue,
						SummaryAmounts1.mmTotalPendingIncomingCollateral, SummaryAmounts1.mmTotalPendingOutgoingCollateral, SummaryAmounts1.mmTotalAccruedInterestAmount, SummaryAmounts1.mmTotalFees);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SummaryAmounts1";
				definition = "Provides amounts taken in to account to calculate the collateral position.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ThrshldAmt")
	public ActiveCurrencyAndAmount getThresholdAmount() {
		return thresholdAmount;
	}

	public void setThresholdAmount(ActiveCurrencyAndAmount thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	@XmlElement(name = "ThrshldTp")
	public ThresholdType1Code getThresholdType() {
		return thresholdType;
	}

	public void setThresholdType(ThresholdType1Code thresholdType) {
		this.thresholdType = thresholdType;
	}

	@XmlElement(name = "PreHrcutCollVal")
	public ActiveCurrencyAndAmount getPreHaircutCollateralValue() {
		return preHaircutCollateralValue;
	}

	public void setPreHaircutCollateralValue(ActiveCurrencyAndAmount preHaircutCollateralValue) {
		this.preHaircutCollateralValue = preHaircutCollateralValue;
	}

	@XmlElement(name = "AdjstdXpsr")
	public ActiveCurrencyAndAmount getAdjustedExposure() {
		return adjustedExposure;
	}

	public void setAdjustedExposure(ActiveCurrencyAndAmount adjustedExposure) {
		this.adjustedExposure = adjustedExposure;
	}

	@XmlElement(name = "CollReqrd")
	public ActiveCurrencyAndAmount getCollateralRequired() {
		return collateralRequired;
	}

	public void setCollateralRequired(ActiveCurrencyAndAmount collateralRequired) {
		this.collateralRequired = collateralRequired;
	}

	@XmlElement(name = "MinTrfAmt")
	public ActiveCurrencyAndAmount getMinimumTransferAmount() {
		return minimumTransferAmount;
	}

	public void setMinimumTransferAmount(ActiveCurrencyAndAmount minimumTransferAmount) {
		this.minimumTransferAmount = minimumTransferAmount;
	}

	@XmlElement(name = "RndgAmt")
	public ActiveCurrencyAndAmount getRoundingAmount() {
		return roundingAmount;
	}

	public void setRoundingAmount(ActiveCurrencyAndAmount roundingAmount) {
		this.roundingAmount = roundingAmount;
	}

	@XmlElement(name = "PrvsXpsrVal")
	public ActiveCurrencyAndAmount getPreviousExposureValue() {
		return previousExposureValue;
	}

	public void setPreviousExposureValue(ActiveCurrencyAndAmount previousExposureValue) {
		this.previousExposureValue = previousExposureValue;
	}

	@XmlElement(name = "PrvsCollVal")
	public ActiveCurrencyAndAmount getPreviousCollateralValue() {
		return previousCollateralValue;
	}

	public void setPreviousCollateralValue(ActiveCurrencyAndAmount previousCollateralValue) {
		this.previousCollateralValue = previousCollateralValue;
	}

	@XmlElement(name = "TtlPdgIncmgColl")
	public ActiveCurrencyAndAmount getTotalPendingIncomingCollateral() {
		return totalPendingIncomingCollateral;
	}

	public void setTotalPendingIncomingCollateral(ActiveCurrencyAndAmount totalPendingIncomingCollateral) {
		this.totalPendingIncomingCollateral = totalPendingIncomingCollateral;
	}

	@XmlElement(name = "TtlPdgOutgngColl")
	public ActiveCurrencyAndAmount getTotalPendingOutgoingCollateral() {
		return totalPendingOutgoingCollateral;
	}

	public void setTotalPendingOutgoingCollateral(ActiveCurrencyAndAmount totalPendingOutgoingCollateral) {
		this.totalPendingOutgoingCollateral = totalPendingOutgoingCollateral;
	}

	@XmlElement(name = "TtlAcrdIntrstAmt")
	public ActiveCurrencyAndAmount getTotalAccruedInterestAmount() {
		return totalAccruedInterestAmount;
	}

	public void setTotalAccruedInterestAmount(ActiveCurrencyAndAmount totalAccruedInterestAmount) {
		this.totalAccruedInterestAmount = totalAccruedInterestAmount;
	}

	@XmlElement(name = "TtlFees")
	public ActiveCurrencyAndAmount getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(ActiveCurrencyAndAmount totalFees) {
		this.totalFees = totalFees;
	}
}