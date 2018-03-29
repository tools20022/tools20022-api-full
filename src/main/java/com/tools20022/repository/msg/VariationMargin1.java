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
import com.tools20022.repository.codeset.RoundingMethod1Code;
import com.tools20022.repository.codeset.ThresholdType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.entity.VariationMarginTerm;
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
 * Elements used to calculate the collateral margin call for the variation
 * margin.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmThresholdAmount
 * VariationMargin1.mmThresholdAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmThresholdType
 * VariationMargin1.mmThresholdType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmMinimumTransferAmount
 * VariationMargin1.mmMinimumTransferAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmRoundingAmount
 * VariationMargin1.mmRoundingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmRoundingMethod
 * VariationMargin1.mmRoundingMethod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VariationMarginTerm
 * VariationMarginTerm}</li>
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
 * "VariationMargin1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Elements used to calculate the collateral margin call for the variation margin."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "VariationMargin1", propOrder = {"thresholdAmount", "thresholdType", "minimumTransferAmount", "roundingAmount", "roundingMethod"})
public class VariationMargin1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ThrshldAmt", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1
	 * VariationMargin1}</li>
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
	public static final MMMessageAttribute<VariationMargin1, ActiveCurrencyAndAmount> mmThresholdAmount = new MMMessageAttribute<VariationMargin1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> VariationMarginTerm.mmThresholdAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin1.mmObject();
			isDerived = false;
			xmlTag = "ThrshldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdAmount";
			definition = "Amount of unsecured exposure a counterparty will accept before issuing a margin call in the base currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(VariationMargin1 obj) {
			return obj.getThresholdAmount();
		}

		@Override
		public void setValue(VariationMargin1 obj, ActiveCurrencyAndAmount value) {
			obj.setThresholdAmount(value);
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1
	 * VariationMargin1}</li>
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
	public static final MMMessageAttribute<VariationMargin1, Optional<ThresholdType1Code>> mmThresholdType = new MMMessageAttribute<VariationMargin1, Optional<ThresholdType1Code>>() {
		{
			businessElementTrace_lazy = () -> VariationMarginTerm.mmThresholdType;
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin1.mmObject();
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
		public Optional<ThresholdType1Code> getValue(VariationMargin1 obj) {
			return obj.getThresholdType();
		}

		@Override
		public void setValue(VariationMargin1 obj, Optional<ThresholdType1Code> value) {
			obj.setThresholdType(value.orElse(null));
		}
	};
	@XmlElement(name = "MinTrfAmt", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1
	 * VariationMargin1}</li>
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
	 * "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of variation margin)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VariationMargin1, ActiveCurrencyAndAmount> mmMinimumTransferAmount = new MMMessageAttribute<VariationMargin1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmMinimumTransferAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin1.mmObject();
			isDerived = false;
			xmlTag = "MinTrfAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTransferAmount";
			definition = "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of variation margin).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(VariationMargin1 obj) {
			return obj.getMinimumTransferAmount();
		}

		@Override
		public void setValue(VariationMargin1 obj, ActiveCurrencyAndAmount value) {
			obj.setMinimumTransferAmount(value);
		}
	};
	@XmlElement(name = "RndgAmt", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1
	 * VariationMargin1}</li>
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
	public static final MMMessageAttribute<VariationMargin1, ActiveCurrencyAndAmount> mmRoundingAmount = new MMMessageAttribute<VariationMargin1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmRoundingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin1.mmObject();
			isDerived = false;
			xmlTag = "RndgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingAmount";
			definition = "Amount specified to avoid the need to transfer uneven amounts of collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(VariationMargin1 obj) {
			return obj.getRoundingAmount();
		}

		@Override
		public void setValue(VariationMargin1 obj, ActiveCurrencyAndAmount value) {
			obj.setRoundingAmount(value);
		}
	};
	@XmlElement(name = "RndgMtd", required = true)
	protected RoundingMethod1Code roundingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethod1Code
	 * RoundingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRoundingMethod
	 * ExposureTerm.mmRoundingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1
	 * VariationMargin1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines how the rounding amount was applied in the calculation. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<VariationMargin1, RoundingMethod1Code> mmRoundingMethod = new MMMessageAttribute<VariationMargin1, RoundingMethod1Code>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmRoundingMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.VariationMargin1.mmObject();
			isDerived = false;
			xmlTag = "RndgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingMethod";
			definition = "Defines how the rounding amount was applied in the calculation. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingMethod1Code.mmObject();
		}

		@Override
		public RoundingMethod1Code getValue(VariationMargin1 obj) {
			return obj.getRoundingMethod();
		}

		@Override
		public void setValue(VariationMargin1 obj, RoundingMethod1Code value) {
			obj.setRoundingMethod(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMargin1.mmThresholdAmount, com.tools20022.repository.msg.VariationMargin1.mmThresholdType,
						com.tools20022.repository.msg.VariationMargin1.mmMinimumTransferAmount, com.tools20022.repository.msg.VariationMargin1.mmRoundingAmount, com.tools20022.repository.msg.VariationMargin1.mmRoundingMethod);
				trace_lazy = () -> VariationMarginTerm.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VariationMargin1";
				definition = "Elements used to calculate the collateral margin call for the variation margin.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getThresholdAmount() {
		return thresholdAmount;
	}

	public VariationMargin1 setThresholdAmount(ActiveCurrencyAndAmount thresholdAmount) {
		this.thresholdAmount = Objects.requireNonNull(thresholdAmount);
		return this;
	}

	public Optional<ThresholdType1Code> getThresholdType() {
		return thresholdType == null ? Optional.empty() : Optional.of(thresholdType);
	}

	public VariationMargin1 setThresholdType(ThresholdType1Code thresholdType) {
		this.thresholdType = thresholdType;
		return this;
	}

	public ActiveCurrencyAndAmount getMinimumTransferAmount() {
		return minimumTransferAmount;
	}

	public VariationMargin1 setMinimumTransferAmount(ActiveCurrencyAndAmount minimumTransferAmount) {
		this.minimumTransferAmount = Objects.requireNonNull(minimumTransferAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getRoundingAmount() {
		return roundingAmount;
	}

	public VariationMargin1 setRoundingAmount(ActiveCurrencyAndAmount roundingAmount) {
		this.roundingAmount = Objects.requireNonNull(roundingAmount);
		return this;
	}

	public RoundingMethod1Code getRoundingMethod() {
		return roundingMethod;
	}

	public VariationMargin1 setRoundingMethod(RoundingMethod1Code roundingMethod) {
		this.roundingMethod = Objects.requireNonNull(roundingMethod);
		return this;
	}
}