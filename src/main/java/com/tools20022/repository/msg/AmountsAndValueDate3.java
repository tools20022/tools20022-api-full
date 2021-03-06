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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.CurrencyOption;
import com.tools20022.repository.entity.Option;
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
 * Specifies the value date and the amounts traded in a foreign exchange option
 * trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3#mmCallAmount
 * AmountsAndValueDate3.mmCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3#mmPutAmount
 * AmountsAndValueDate3.mmPutAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3#mmFinalSettlementDate
 * AmountsAndValueDate3.mmFinalSettlementDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyOption
 * CurrencyOption}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountsAndValueDate3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the value date and the amounts traded in a foreign exchange option trade."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountsAndValueDate3", propOrder = {"callAmount", "putAmount", "finalSettlementDate"})
public class AmountsAndValueDate3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CallAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount callAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmCallAmount
	 * CurrencyOption.mmCallAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3
	 * AmountsAndValueDate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CallAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Call amount and currency of a foreign exchange option trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountsAndValueDate3, ActiveOrHistoricCurrencyAndAmount> mmCallAmount = new MMMessageAttribute<AmountsAndValueDate3, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CurrencyOption.mmCallAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate3.mmObject();
			isDerived = false;
			xmlTag = "CallAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallAmount";
			definition = "Call amount and currency of a foreign exchange option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(AmountsAndValueDate3 obj) {
			return obj.getCallAmount();
		}

		@Override
		public void setValue(AmountsAndValueDate3 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setCallAmount(value);
		}
	};
	@XmlElement(name = "PutAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount putAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPutAmount
	 * CurrencyOption.mmPutAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3
	 * AmountsAndValueDate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PutAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Put amount and currency of a foreign exchange option trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountsAndValueDate3, ActiveOrHistoricCurrencyAndAmount> mmPutAmount = new MMMessageAttribute<AmountsAndValueDate3, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CurrencyOption.mmPutAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate3.mmObject();
			isDerived = false;
			xmlTag = "PutAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutAmount";
			definition = "Put amount and currency of a foreign exchange option trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(AmountsAndValueDate3 obj) {
			return obj.getPutAmount();
		}

		@Override
		public void setValue(AmountsAndValueDate3 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setPutAmount(value);
		}
	};
	@XmlElement(name = "FnlSttlmDt")
	protected ISODate finalSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmFinalSettlementDate
	 * Option.mmFinalSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate3
	 * AmountsAndValueDate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the trade is settled, ie, the amounts are due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountsAndValueDate3, Optional<ISODate>> mmFinalSettlementDate = new MMMessageAttribute<AmountsAndValueDate3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Option.mmFinalSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate3.mmObject();
			isDerived = false;
			xmlTag = "FnlSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalSettlementDate";
			definition = "Date on which the trade is settled, ie, the amounts are due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AmountsAndValueDate3 obj) {
			return obj.getFinalSettlementDate();
		}

		@Override
		public void setValue(AmountsAndValueDate3 obj, Optional<ISODate> value) {
			obj.setFinalSettlementDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountsAndValueDate3.mmCallAmount, com.tools20022.repository.msg.AmountsAndValueDate3.mmPutAmount,
						com.tools20022.repository.msg.AmountsAndValueDate3.mmFinalSettlementDate);
				trace_lazy = () -> CurrencyOption.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AmountsAndValueDate3";
				definition = "Specifies the value date and the amounts traded in a foreign exchange option trade.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getCallAmount() {
		return callAmount;
	}

	public AmountsAndValueDate3 setCallAmount(ActiveOrHistoricCurrencyAndAmount callAmount) {
		this.callAmount = Objects.requireNonNull(callAmount);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getPutAmount() {
		return putAmount;
	}

	public AmountsAndValueDate3 setPutAmount(ActiveOrHistoricCurrencyAndAmount putAmount) {
		this.putAmount = Objects.requireNonNull(putAmount);
		return this;
	}

	public Optional<ISODate> getFinalSettlementDate() {
		return finalSettlementDate == null ? Optional.empty() : Optional.of(finalSettlementDate);
	}

	public AmountsAndValueDate3 setFinalSettlementDate(ISODate finalSettlementDate) {
		this.finalSettlementDate = finalSettlementDate;
		return this;
	}
}