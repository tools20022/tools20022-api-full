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
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SummaryAmounts1", propOrder = {"thresholdAmount", "thresholdType", "preHaircutCollateralValue", "adjustedExposure", "collateralRequired", "minimumTransferAmount", "roundingAmount", "previousExposureValue",
		"previousCollateralValue", "totalPendingIncomingCollateral", "totalPendingOutgoingCollateral", "totalAccruedInterestAmount", "totalFees"})
public class SummaryAmounts1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ThrshldAmt")
	protected ActiveCurrencyAndAmount thresholdAmount;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmThresholdAmount = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> VariationMarginTerm.mmThresholdAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "ThrshldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdAmount";
			definition = "Amount of unsecured exposure a counterparty will accept before issuing a margin call in the base currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getThresholdAmount();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setThresholdAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ThrshldTp")
	protected ThresholdType1Code thresholdType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ThresholdType1Code>> mmThresholdType = new MMMessageAttribute<SummaryAmounts1, Optional<ThresholdType1Code>>() {
		{
			businessElementTrace_lazy = () -> VariationMarginTerm.mmThresholdType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "ThrshldTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdType";
			definition = "Specifies if the threshold amount is secured or unsecured.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ThresholdType1Code.mmObject();
		}

		@Override
		public Optional<ThresholdType1Code> getValue(SummaryAmounts1 obj) {
			return obj.getThresholdType();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ThresholdType1Code> value) {
			obj.setThresholdType(value.orElse(null));
		}
	};
	@XmlElement(name = "PreHrcutCollVal")
	protected ActiveCurrencyAndAmount preHaircutCollateralValue;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmPreHaircutCollateralValue = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalCollateralCurrentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "PreHrcutCollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreHaircutCollateralValue";
			definition = "Total value of posted collateral (pre-haircut) held by the taker.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getPreHaircutCollateralValue();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setPreHaircutCollateralValue(value.orElse(null));
		}
	};
	@XmlElement(name = "AdjstdXpsr")
	protected ActiveCurrencyAndAmount adjustedExposure;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmAdjustedExposure = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalExposedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "AdjstdXpsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedExposure";
			definition = "Total amount of collateral required (unrounded).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getAdjustedExposure();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAdjustedExposure(value.orElse(null));
		}
	};
	@XmlElement(name = "CollReqrd")
	protected ActiveCurrencyAndAmount collateralRequired;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmCollateralRequired = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessComponentTrace_lazy = () -> MarginCall.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "CollReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralRequired";
			definition = "Total amount of collateral required (rounded).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getCollateralRequired();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCollateralRequired(value.orElse(null));
		}
	};
	@XmlElement(name = "MinTrfAmt")
	protected ActiveCurrencyAndAmount minimumTransferAmount;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmMinimumTransferAmount = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmMinimumTransferAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "MinTrfAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTransferAmount";
			definition = "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of collateral).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getMinimumTransferAmount();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setMinimumTransferAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RndgAmt")
	protected ActiveCurrencyAndAmount roundingAmount;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmRoundingAmount = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmRoundingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "RndgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingAmount";
			definition = "Amount specified to avoid the need to transfer uneven amounts of collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getRoundingAmount();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setRoundingAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsXpsrVal")
	protected ActiveCurrencyAndAmount previousExposureValue;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmPreviousExposureValue = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalExposedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "PrvsXpsrVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousExposureValue";
			definition = "Exposure value at previous valuation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getPreviousExposureValue();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setPreviousExposureValue(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsCollVal")
	protected ActiveCurrencyAndAmount previousCollateralValue;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmPreviousCollateralValue = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalCollateralCurrentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "PrvsCollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousCollateralValue";
			definition = "Value of collateral at previous valuation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getPreviousCollateralValue();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setPreviousCollateralValue(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlPdgIncmgColl")
	protected ActiveCurrencyAndAmount totalPendingIncomingCollateral;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmTotalPendingIncomingCollateral = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmInTransit;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "TtlPdgIncmgColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPendingIncomingCollateral";
			definition = "Value of incoming collateral, to be settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getTotalPendingIncomingCollateral();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalPendingIncomingCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlPdgOutgngColl")
	protected ActiveCurrencyAndAmount totalPendingOutgoingCollateral;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmTotalPendingOutgoingCollateral = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralBalance.mmInTransit;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "TtlPdgOutgngColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPendingOutgoingCollateral";
			definition = "Value of outgoing collateral, to be settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getTotalPendingOutgoingCollateral();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalPendingOutgoingCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlAcrdIntrstAmt")
	protected ActiveCurrencyAndAmount totalAccruedInterestAmount;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmTotalAccruedInterestAmount = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "TtlAcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAccruedInterestAmount";
			definition = "Sum of accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getTotalAccruedInterestAmount();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalAccruedInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlFees")
	protected ActiveCurrencyAndAmount totalFees;
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
	public static final MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>> mmTotalFees = new MMMessageAttribute<SummaryAmounts1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SummaryAmounts1.mmObject();
			isDerived = false;
			xmlTag = "TtlFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalFees";
			definition = "Sum of fees/commissions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SummaryAmounts1 obj) {
			return obj.getTotalFees();
		}

		@Override
		public void setValue(SummaryAmounts1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalFees(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SummaryAmounts1.mmThresholdAmount, com.tools20022.repository.msg.SummaryAmounts1.mmThresholdType,
						com.tools20022.repository.msg.SummaryAmounts1.mmPreHaircutCollateralValue, com.tools20022.repository.msg.SummaryAmounts1.mmAdjustedExposure, com.tools20022.repository.msg.SummaryAmounts1.mmCollateralRequired,
						com.tools20022.repository.msg.SummaryAmounts1.mmMinimumTransferAmount, com.tools20022.repository.msg.SummaryAmounts1.mmRoundingAmount, com.tools20022.repository.msg.SummaryAmounts1.mmPreviousExposureValue,
						com.tools20022.repository.msg.SummaryAmounts1.mmPreviousCollateralValue, com.tools20022.repository.msg.SummaryAmounts1.mmTotalPendingIncomingCollateral,
						com.tools20022.repository.msg.SummaryAmounts1.mmTotalPendingOutgoingCollateral, com.tools20022.repository.msg.SummaryAmounts1.mmTotalAccruedInterestAmount, com.tools20022.repository.msg.SummaryAmounts1.mmTotalFees);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SummaryAmounts1";
				definition = "Provides amounts taken in to account to calculate the collateral position.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getThresholdAmount() {
		return thresholdAmount == null ? Optional.empty() : Optional.of(thresholdAmount);
	}

	public SummaryAmounts1 setThresholdAmount(ActiveCurrencyAndAmount thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
		return this;
	}

	public Optional<ThresholdType1Code> getThresholdType() {
		return thresholdType == null ? Optional.empty() : Optional.of(thresholdType);
	}

	public SummaryAmounts1 setThresholdType(ThresholdType1Code thresholdType) {
		this.thresholdType = thresholdType;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getPreHaircutCollateralValue() {
		return preHaircutCollateralValue == null ? Optional.empty() : Optional.of(preHaircutCollateralValue);
	}

	public SummaryAmounts1 setPreHaircutCollateralValue(ActiveCurrencyAndAmount preHaircutCollateralValue) {
		this.preHaircutCollateralValue = preHaircutCollateralValue;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAdjustedExposure() {
		return adjustedExposure == null ? Optional.empty() : Optional.of(adjustedExposure);
	}

	public SummaryAmounts1 setAdjustedExposure(ActiveCurrencyAndAmount adjustedExposure) {
		this.adjustedExposure = adjustedExposure;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCollateralRequired() {
		return collateralRequired == null ? Optional.empty() : Optional.of(collateralRequired);
	}

	public SummaryAmounts1 setCollateralRequired(ActiveCurrencyAndAmount collateralRequired) {
		this.collateralRequired = collateralRequired;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMinimumTransferAmount() {
		return minimumTransferAmount == null ? Optional.empty() : Optional.of(minimumTransferAmount);
	}

	public SummaryAmounts1 setMinimumTransferAmount(ActiveCurrencyAndAmount minimumTransferAmount) {
		this.minimumTransferAmount = minimumTransferAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getRoundingAmount() {
		return roundingAmount == null ? Optional.empty() : Optional.of(roundingAmount);
	}

	public SummaryAmounts1 setRoundingAmount(ActiveCurrencyAndAmount roundingAmount) {
		this.roundingAmount = roundingAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getPreviousExposureValue() {
		return previousExposureValue == null ? Optional.empty() : Optional.of(previousExposureValue);
	}

	public SummaryAmounts1 setPreviousExposureValue(ActiveCurrencyAndAmount previousExposureValue) {
		this.previousExposureValue = previousExposureValue;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getPreviousCollateralValue() {
		return previousCollateralValue == null ? Optional.empty() : Optional.of(previousCollateralValue);
	}

	public SummaryAmounts1 setPreviousCollateralValue(ActiveCurrencyAndAmount previousCollateralValue) {
		this.previousCollateralValue = previousCollateralValue;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalPendingIncomingCollateral() {
		return totalPendingIncomingCollateral == null ? Optional.empty() : Optional.of(totalPendingIncomingCollateral);
	}

	public SummaryAmounts1 setTotalPendingIncomingCollateral(ActiveCurrencyAndAmount totalPendingIncomingCollateral) {
		this.totalPendingIncomingCollateral = totalPendingIncomingCollateral;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalPendingOutgoingCollateral() {
		return totalPendingOutgoingCollateral == null ? Optional.empty() : Optional.of(totalPendingOutgoingCollateral);
	}

	public SummaryAmounts1 setTotalPendingOutgoingCollateral(ActiveCurrencyAndAmount totalPendingOutgoingCollateral) {
		this.totalPendingOutgoingCollateral = totalPendingOutgoingCollateral;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalAccruedInterestAmount() {
		return totalAccruedInterestAmount == null ? Optional.empty() : Optional.of(totalAccruedInterestAmount);
	}

	public SummaryAmounts1 setTotalAccruedInterestAmount(ActiveCurrencyAndAmount totalAccruedInterestAmount) {
		this.totalAccruedInterestAmount = totalAccruedInterestAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalFees() {
		return totalFees == null ? Optional.empty() : Optional.of(totalFees);
	}

	public SummaryAmounts1 setTotalFees(ActiveCurrencyAndAmount totalFees) {
		this.totalFees = totalFees;
		return this;
	}
}