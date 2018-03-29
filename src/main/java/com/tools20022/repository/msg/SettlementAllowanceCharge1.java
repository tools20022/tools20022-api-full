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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Allowance;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a pricing component, such as a service, promotion, allowance or
 * charge, for this trade settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1#mmAllowanceChargeIndicator
 * SettlementAllowanceCharge1.mmAllowanceChargeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1#mmActualAmount
 * SettlementAllowanceCharge1.mmActualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1#mmReason
 * SettlementAllowanceCharge1.mmReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Allowance Allowance}</li>
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
 * "SettlementAllowanceCharge1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a pricing component, such as a service, promotion, allowance or charge, for this trade settlement."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementAllowanceCharge1", propOrder = {"allowanceChargeIndicator", "actualAmount", "reason"})
public class SettlementAllowanceCharge1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AllwncChrgInd")
	protected YesNoIndicator allowanceChargeIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAllowanceChargeIndicator
	 * Adjustment.mmAllowanceChargeIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1
	 * SettlementAllowanceCharge1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwncChrgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceChargeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether or not this allowance charge is a charge."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementAllowanceCharge1, Optional<YesNoIndicator>> mmAllowanceChargeIndicator = new MMMessageAttribute<SettlementAllowanceCharge1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAllowanceChargeIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAllowanceCharge1.mmObject();
			isDerived = false;
			xmlTag = "AllwncChrgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowanceChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SettlementAllowanceCharge1 obj) {
			return obj.getAllowanceChargeIndicator();
		}

		@Override
		public void setValue(SettlementAllowanceCharge1 obj, Optional<YesNoIndicator> value) {
			obj.setAllowanceChargeIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1
	 * SettlementAllowanceCharge1}</li>
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
	 * definition} =
	 * "Actual monetary amount specified for the allowance or charge."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementAllowanceCharge1, List<CurrencyAndAmount>> mmActualAmount = new MMMessageAttribute<SettlementAllowanceCharge1, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAllowanceCharge1.mmObject();
			isDerived = false;
			xmlTag = "ActlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualAmount";
			definition = "Actual monetary amount specified for the allowance or charge.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(SettlementAllowanceCharge1 obj) {
			return obj.getActualAmount();
		}

		@Override
		public void setValue(SettlementAllowanceCharge1 obj, List<CurrencyAndAmount> value) {
			obj.setActualAmount(value);
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
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1
	 * SettlementAllowanceCharge1}</li>
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
	 * definition} = "Reason, expressed as text, for this allowance or charge."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementAllowanceCharge1, Optional<DiscountOrChargeType1Choice>> mmReason = new MMMessageAttribute<SettlementAllowanceCharge1, Optional<DiscountOrChargeType1Choice>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementAllowanceCharge1.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason, expressed as text, for this allowance or charge.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DiscountOrChargeType1Choice.mmObject();
		}

		@Override
		public Optional<DiscountOrChargeType1Choice> getValue(SettlementAllowanceCharge1 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(SettlementAllowanceCharge1 obj, Optional<DiscountOrChargeType1Choice> value) {
			obj.setReason(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementAllowanceCharge1.mmAllowanceChargeIndicator, com.tools20022.repository.msg.SettlementAllowanceCharge1.mmActualAmount,
						com.tools20022.repository.msg.SettlementAllowanceCharge1.mmReason);
				trace_lazy = () -> Allowance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementAllowanceCharge1";
				definition = "Specifies a pricing component, such as a service, promotion, allowance or charge, for this trade settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getAllowanceChargeIndicator() {
		return allowanceChargeIndicator == null ? Optional.empty() : Optional.of(allowanceChargeIndicator);
	}

	public SettlementAllowanceCharge1 setAllowanceChargeIndicator(YesNoIndicator allowanceChargeIndicator) {
		this.allowanceChargeIndicator = allowanceChargeIndicator;
		return this;
	}

	public List<CurrencyAndAmount> getActualAmount() {
		return actualAmount == null ? actualAmount = new ArrayList<>() : actualAmount;
	}

	public SettlementAllowanceCharge1 setActualAmount(List<CurrencyAndAmount> actualAmount) {
		this.actualAmount = Objects.requireNonNull(actualAmount);
		return this;
	}

	public Optional<DiscountOrChargeType1Choice> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public SettlementAllowanceCharge1 setReason(DiscountOrChargeType1Choice reason) {
		this.reason = reason;
		return this;
	}
}