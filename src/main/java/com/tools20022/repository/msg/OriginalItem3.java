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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalItemReference2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the original notification item, to which the cancellation advice
 * refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem3#mmOriginalItemIdentification
 * OriginalItem3.mmOriginalItemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem3#mmOriginalEndToEndIdentification
 * OriginalItem3.mmOriginalEndToEndIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem3#mmAmount
 * OriginalItem3.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem3#mmExpectedValueDate
 * OriginalItem3.mmExpectedValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalItem3#mmOriginalItemReference
 * OriginalItem3.mmOriginalItemReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalItem3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the original notification item, to which the cancellation advice refers."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem4 OriginalItem4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalItem3", propOrder = {"originalItemIdentification", "originalEndToEndIdentification", "amount", "expectedValueDate", "originalItemReference"})
public class OriginalItem3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlItmId", required = true)
	protected Max35Text originalItemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3 OriginalItem3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlItmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalItemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the original notification item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#mmOriginalItemIdentification
	 * OriginalItem4.mmOriginalItemIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalItem3, Max35Text> mmOriginalItemIdentification = new MMMessageAttribute<OriginalItem3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItem3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlItmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalItemIdentification";
			definition = "Identification of the original notification item.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItem4.mmOriginalItemIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalItem3 obj) {
			return obj.getOriginalItemIdentification();
		}

		@Override
		public void setValue(OriginalItem3 obj, Max35Text value) {
			obj.setOriginalItemIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlEndToEndId")
	protected Max35Text originalEndToEndIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3 OriginalItem3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlEndToEndId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalEndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification as assigned by the debtor to unambiguously identify the original underlying transaction to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#mmOriginalEndToEndIdentification
	 * OriginalItem4.mmOriginalEndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalItem3, Optional<Max35Text>> mmOriginalEndToEndIdentification = new MMMessageAttribute<OriginalItem3, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItem3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlEndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalEndToEndIdentification";
			definition = "Unique identification as assigned by the debtor to unambiguously identify the original underlying transaction to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItem4.mmOriginalEndToEndIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OriginalItem3 obj) {
			return obj.getOriginalEndToEndIdentification();
		}

		@Override
		public void setValue(OriginalItem3 obj, Optional<Max35Text> value) {
			obj.setOriginalEndToEndIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3 OriginalItem3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money expected to be credited to the account, as per the original notification to receive."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.OriginalItem4#mmAmount
	 * OriginalItem4.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalItem3, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<OriginalItem3, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItem3.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money expected to be credited to the account, as per the original notification to receive.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItem4.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(OriginalItem3 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(OriginalItem3 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "XpctdValDt")
	protected ISODate expectedValueDate;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3 OriginalItem3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value date on which the account was expected to be credited."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#mmExpectedValueDate
	 * OriginalItem4.mmExpectedValueDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalItem3, Optional<ISODate>> mmExpectedValueDate = new MMMessageAttribute<OriginalItem3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItem3.mmObject();
			isDerived = false;
			xmlTag = "XpctdValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedValueDate";
			definition = "Value date on which the account was expected to be credited.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItem4.mmExpectedValueDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(OriginalItem3 obj) {
			return obj.getExpectedValueDate();
		}

		@Override
		public void setValue(OriginalItem3 obj, Optional<ISODate> value) {
			obj.setExpectedValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlItmRef")
	protected OriginalItemReference2 originalItemReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OriginalItemReference2
	 * OriginalItemReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalItem3 OriginalItem3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlItmRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalItemReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides further information in order to identify a previous payment notification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItem4#mmOriginalItemReference
	 * OriginalItem4.mmOriginalItemReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalItem3, Optional<OriginalItemReference2>> mmOriginalItemReference = new MMMessageAssociationEnd<OriginalItem3, Optional<OriginalItemReference2>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalItem3.mmObject();
			isDerived = false;
			xmlTag = "OrgnlItmRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalItemReference";
			definition = "Provides further information in order to identify a previous payment notification.";
			nextVersions_lazy = () -> Arrays.asList(OriginalItem4.mmOriginalItemReference);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalItemReference2.mmObject();
		}

		@Override
		public Optional<OriginalItemReference2> getValue(OriginalItem3 obj) {
			return obj.getOriginalItemReference();
		}

		@Override
		public void setValue(OriginalItem3 obj, Optional<OriginalItemReference2> value) {
			obj.setOriginalItemReference(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalItem3.mmOriginalItemIdentification, com.tools20022.repository.msg.OriginalItem3.mmOriginalEndToEndIdentification,
						com.tools20022.repository.msg.OriginalItem3.mmAmount, com.tools20022.repository.msg.OriginalItem3.mmExpectedValueDate, com.tools20022.repository.msg.OriginalItem3.mmOriginalItemReference);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalItem3";
				definition = "Identifies the original notification item, to which the cancellation advice refers.";
				nextVersions_lazy = () -> Arrays.asList(OriginalItem4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalItemIdentification() {
		return originalItemIdentification;
	}

	public OriginalItem3 setOriginalItemIdentification(Max35Text originalItemIdentification) {
		this.originalItemIdentification = Objects.requireNonNull(originalItemIdentification);
		return this;
	}

	public Optional<Max35Text> getOriginalEndToEndIdentification() {
		return originalEndToEndIdentification == null ? Optional.empty() : Optional.of(originalEndToEndIdentification);
	}

	public OriginalItem3 setOriginalEndToEndIdentification(Max35Text originalEndToEndIdentification) {
		this.originalEndToEndIdentification = originalEndToEndIdentification;
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public OriginalItem3 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<ISODate> getExpectedValueDate() {
		return expectedValueDate == null ? Optional.empty() : Optional.of(expectedValueDate);
	}

	public OriginalItem3 setExpectedValueDate(ISODate expectedValueDate) {
		this.expectedValueDate = expectedValueDate;
		return this;
	}

	public Optional<OriginalItemReference2> getOriginalItemReference() {
		return originalItemReference == null ? Optional.empty() : Optional.of(originalItemReference);
	}

	public OriginalItem3 setOriginalItemReference(OriginalItemReference2 originalItemReference) {
		this.originalItemReference = originalItemReference;
		return this;
	}
}