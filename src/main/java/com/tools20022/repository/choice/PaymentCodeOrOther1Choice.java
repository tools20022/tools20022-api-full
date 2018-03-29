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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentPeriod3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a payment term in a coded or free format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice#mmPaymentCode
 * PaymentCodeOrOther1Choice.mmPaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice#mmPaymentDueDate
 * PaymentCodeOrOther1Choice.mmPaymentDueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice#mmOtherPaymentTerms
 * PaymentCodeOrOther1Choice.mmOtherPaymentTerms}</li>
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
 * "PaymentCodeOrOther1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a payment term in a coded or free format."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice
 * PaymentCodeOrOther2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCodeOrOther1Choice", propOrder = {"paymentCode", "paymentDueDate", "otherPaymentTerms"})
public class PaymentCodeOrOther1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtCd", required = true)
	protected PaymentPeriod3 paymentCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentPeriod3
	 * PaymentPeriod3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice
	 * PaymentCodeOrOther1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the payment period in coded form and a number of days."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice#mmPaymentCode
	 * PaymentCodeOrOther2Choice.mmPaymentCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentCodeOrOther1Choice, PaymentPeriod3> mmPaymentCode = new MMMessageAssociationEnd<PaymentCodeOrOther1Choice, PaymentPeriod3>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentCodeOrOther1Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCode";
			definition = "Specifies the payment period in coded form and a number of days.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCodeOrOther2Choice.mmPaymentCode);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentPeriod3.mmObject();
		}

		@Override
		public PaymentPeriod3 getValue(PaymentCodeOrOther1Choice obj) {
			return obj.getPaymentCode();
		}

		@Override
		public void setValue(PaymentCodeOrOther1Choice obj, PaymentPeriod3 value) {
			obj.setPaymentCode(value);
		}
	};
	@XmlElement(name = "PmtDueDt", required = true)
	protected ISODate paymentDueDate;
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
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice
	 * PaymentCodeOrOther1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtDueDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the payment date as a fixed date."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice#mmPaymentDueDate
	 * PaymentCodeOrOther2Choice.mmPaymentDueDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCodeOrOther1Choice, ISODate> mmPaymentDueDate = new MMMessageAttribute<PaymentCodeOrOther1Choice, ISODate>() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentCodeOrOther1Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtDueDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDueDate";
			definition = "Specifies the payment date as a fixed date.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCodeOrOther2Choice.mmPaymentDueDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(PaymentCodeOrOther1Choice obj) {
			return obj.getPaymentDueDate();
		}

		@Override
		public void setValue(PaymentCodeOrOther1Choice obj, ISODate value) {
			obj.setPaymentDueDate(value);
		}
	};
	@XmlElement(name = "OthrPmtTerms", required = true)
	protected Max140Text otherPaymentTerms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice
	 * PaymentCodeOrOther1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPmtTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies payment terms not present in a code list."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice#mmOtherPaymentTerms
	 * PaymentCodeOrOther2Choice.mmOtherPaymentTerms}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentCodeOrOther1Choice, Max140Text> mmOtherPaymentTerms = new MMMessageAttribute<PaymentCodeOrOther1Choice, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentCodeOrOther1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrPmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPaymentTerms";
			definition = "Specifies payment terms not present in a code list.";
			nextVersions_lazy = () -> Arrays.asList(PaymentCodeOrOther2Choice.mmOtherPaymentTerms);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(PaymentCodeOrOther1Choice obj) {
			return obj.getOtherPaymentTerms();
		}

		@Override
		public void setValue(PaymentCodeOrOther1Choice obj, Max140Text value) {
			obj.setOtherPaymentTerms(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentCodeOrOther1Choice.mmPaymentCode, com.tools20022.repository.choice.PaymentCodeOrOther1Choice.mmPaymentDueDate,
						com.tools20022.repository.choice.PaymentCodeOrOther1Choice.mmOtherPaymentTerms);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCodeOrOther1Choice";
				definition = "Choice between a payment term in a coded or free format.";
				nextVersions_lazy = () -> Arrays.asList(PaymentCodeOrOther2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentPeriod3 getPaymentCode() {
		return paymentCode;
	}

	public PaymentCodeOrOther1Choice setPaymentCode(PaymentPeriod3 paymentCode) {
		this.paymentCode = Objects.requireNonNull(paymentCode);
		return this;
	}

	public ISODate getPaymentDueDate() {
		return paymentDueDate;
	}

	public PaymentCodeOrOther1Choice setPaymentDueDate(ISODate paymentDueDate) {
		this.paymentDueDate = Objects.requireNonNull(paymentDueDate);
		return this;
	}

	public Max140Text getOtherPaymentTerms() {
		return otherPaymentTerms;
	}

	public PaymentCodeOrOther1Choice setOtherPaymentTerms(Max140Text otherPaymentTerms) {
		this.otherPaymentTerms = Objects.requireNonNull(otherPaymentTerms);
		return this;
	}
}