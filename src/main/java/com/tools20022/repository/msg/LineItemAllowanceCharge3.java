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
import com.tools20022.repository.choice.DiscountOrChargeType1Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.LineItem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Quantity16;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Pricing component, such as a service, promotion, allowance or charge, for
 * this line item.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3#mmChargeIndicator
 * LineItemAllowanceCharge3.mmChargeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3#mmActualAmount
 * LineItemAllowanceCharge3.mmActualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3#mmBasisQuantity
 * LineItemAllowanceCharge3.mmBasisQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3#mmCalculationPercent
 * LineItemAllowanceCharge3.mmCalculationPercent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3#mmSequenceNumber
 * LineItemAllowanceCharge3.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3#mmReason
 * LineItemAllowanceCharge3.mmReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
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
 * "LineItemAllowanceCharge3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Pricing component, such as a service, promotion, allowance or charge, for this line item."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2
 * LineItemAllowanceCharge2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItemAllowanceCharge3", propOrder = {"chargeIndicator", "actualAmount", "basisQuantity", "calculationPercent", "sequenceNumber", "reason"})
public class LineItemAllowanceCharge3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ChrgInd")
	protected YesNoIndicator chargeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeIndicator
	 * Adjustment.mmChargeIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3
	 * LineItemAllowanceCharge3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether or not this allowance charge is a charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmChargeIndicator
	 * LineItemAllowanceCharge2.mmChargeIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemAllowanceCharge3, Optional<YesNoIndicator>> mmChargeIndicator = new MMMessageAttribute<LineItemAllowanceCharge3, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemAllowanceCharge3.mmObject();
			isDerived = false;
			xmlTag = "ChrgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge.";
			previousVersion_lazy = () -> LineItemAllowanceCharge2.mmChargeIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(LineItemAllowanceCharge3 obj) {
			return obj.getChargeIndicator();
		}

		@Override
		public void setValue(LineItemAllowanceCharge3 obj, Optional<YesNoIndicator> value) {
			obj.setChargeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ActlAmt")
	protected List<CurrencyAndAmount> actualAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3
	 * LineItemAllowanceCharge3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual monetary value of this allowance charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmActualAmount
	 * LineItemAllowanceCharge2.mmActualAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemAllowanceCharge3, List<CurrencyAndAmount>> mmActualAmount = new MMMessageAttribute<LineItemAllowanceCharge3, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemAllowanceCharge3.mmObject();
			isDerived = false;
			xmlTag = "ActlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualAmount";
			definition = "Actual monetary value of this allowance charge.";
			previousVersion_lazy = () -> LineItemAllowanceCharge2.mmActualAmount;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(LineItemAllowanceCharge3 obj) {
			return obj.getActualAmount();
		}

		@Override
		public void setValue(LineItemAllowanceCharge3 obj, List<CurrencyAndAmount> value) {
			obj.setActualAmount(value);
		}
	};
	@XmlElement(name = "BsisQty")
	protected Quantity16 basisQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Quantity16
	 * Quantity16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmBilledQuantity
	 * LineItem.mmBilledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3
	 * LineItemAllowanceCharge3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsisQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity on which this allowance charge is based."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmBasisQuantity
	 * LineItemAllowanceCharge2.mmBasisQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemAllowanceCharge3, Optional<Quantity16>> mmBasisQuantity = new MMMessageAttribute<LineItemAllowanceCharge3, Optional<Quantity16>>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmBilledQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemAllowanceCharge3.mmObject();
			isDerived = false;
			xmlTag = "BsisQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisQuantity";
			definition = "Quantity on which this allowance charge is based.";
			previousVersion_lazy = () -> LineItemAllowanceCharge2.mmBasisQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Quantity16.mmObject();
		}

		@Override
		public Optional<Quantity16> getValue(LineItemAllowanceCharge3 obj) {
			return obj.getBasisQuantity();
		}

		@Override
		public void setValue(LineItemAllowanceCharge3 obj, Optional<Quantity16> value) {
			obj.setBasisQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "ClctnPct")
	protected PercentageRate calculationPercent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3
	 * LineItemAllowanceCharge3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnPct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationPercent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage applied to calculate this allowance charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmCalculationPercent
	 * LineItemAllowanceCharge2.mmCalculationPercent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemAllowanceCharge3, Optional<PercentageRate>> mmCalculationPercent = new MMMessageAttribute<LineItemAllowanceCharge3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemAllowanceCharge3.mmObject();
			isDerived = false;
			xmlTag = "ClctnPct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationPercent";
			definition = "Percentage applied to calculate this allowance charge.";
			previousVersion_lazy = () -> LineItemAllowanceCharge2.mmCalculationPercent;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(LineItemAllowanceCharge3 obj) {
			return obj.getCalculationPercent();
		}

		@Override
		public void setValue(LineItemAllowanceCharge3 obj, Optional<PercentageRate> value) {
			obj.setCalculationPercent(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqNb")
	protected Number sequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3
	 * LineItemAllowanceCharge3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the order in which the allowance or charge is applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmSequenceNumber
	 * LineItemAllowanceCharge2.mmSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemAllowanceCharge3, Optional<Number>> mmSequenceNumber = new MMMessageAttribute<LineItemAllowanceCharge3, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemAllowanceCharge3.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Specifies the order in which the allowance or charge is applied.";
			previousVersion_lazy = () -> LineItemAllowanceCharge2.mmSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(LineItemAllowanceCharge3 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(LineItemAllowanceCharge3 obj, Optional<Number> value) {
			obj.setSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected DiscountOrChargeType1Choice reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DiscountOrChargeType1Choice
	 * DiscountOrChargeType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmReason
	 * Adjustment.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge3
	 * LineItemAllowanceCharge3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason, expressed as text, for this allowance charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemAllowanceCharge2#mmReason
	 * LineItemAllowanceCharge2.mmReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemAllowanceCharge3, Optional<DiscountOrChargeType1Choice>> mmReason = new MMMessageAttribute<LineItemAllowanceCharge3, Optional<DiscountOrChargeType1Choice>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemAllowanceCharge3.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason, expressed as text, for this allowance charge.";
			previousVersion_lazy = () -> LineItemAllowanceCharge2.mmReason;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DiscountOrChargeType1Choice.mmObject();
		}

		@Override
		public Optional<DiscountOrChargeType1Choice> getValue(LineItemAllowanceCharge3 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(LineItemAllowanceCharge3 obj, Optional<DiscountOrChargeType1Choice> value) {
			obj.setReason(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemAllowanceCharge3.mmChargeIndicator, com.tools20022.repository.msg.LineItemAllowanceCharge3.mmActualAmount,
						com.tools20022.repository.msg.LineItemAllowanceCharge3.mmBasisQuantity, com.tools20022.repository.msg.LineItemAllowanceCharge3.mmCalculationPercent,
						com.tools20022.repository.msg.LineItemAllowanceCharge3.mmSequenceNumber, com.tools20022.repository.msg.LineItemAllowanceCharge3.mmReason);
				trace_lazy = () -> Adjustment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItemAllowanceCharge3";
				definition = "Pricing component, such as a service, promotion, allowance or charge, for this line item.";
				previousVersion_lazy = () -> LineItemAllowanceCharge2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getChargeIndicator() {
		return chargeIndicator == null ? Optional.empty() : Optional.of(chargeIndicator);
	}

	public LineItemAllowanceCharge3 setChargeIndicator(YesNoIndicator chargeIndicator) {
		this.chargeIndicator = chargeIndicator;
		return this;
	}

	public List<CurrencyAndAmount> getActualAmount() {
		return actualAmount == null ? actualAmount = new ArrayList<>() : actualAmount;
	}

	public LineItemAllowanceCharge3 setActualAmount(List<CurrencyAndAmount> actualAmount) {
		this.actualAmount = Objects.requireNonNull(actualAmount);
		return this;
	}

	public Optional<Quantity16> getBasisQuantity() {
		return basisQuantity == null ? Optional.empty() : Optional.of(basisQuantity);
	}

	public LineItemAllowanceCharge3 setBasisQuantity(Quantity16 basisQuantity) {
		this.basisQuantity = basisQuantity;
		return this;
	}

	public Optional<PercentageRate> getCalculationPercent() {
		return calculationPercent == null ? Optional.empty() : Optional.of(calculationPercent);
	}

	public LineItemAllowanceCharge3 setCalculationPercent(PercentageRate calculationPercent) {
		this.calculationPercent = calculationPercent;
		return this;
	}

	public Optional<Number> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public LineItemAllowanceCharge3 setSequenceNumber(Number sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public Optional<DiscountOrChargeType1Choice> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public LineItemAllowanceCharge3 setReason(DiscountOrChargeType1Choice reason) {
		this.reason = reason;
		return this;
	}
}