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
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.PaymentTerms;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentPeriod4;
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
 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice#mmPaymentCode
 * PaymentCodeOrOther2Choice.mmPaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice#mmPaymentDueDate
 * PaymentCodeOrOther2Choice.mmPaymentDueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice#mmOtherPaymentTerms
 * PaymentCodeOrOther2Choice.mmOtherPaymentTerms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentTerms
 * PaymentTerms}</li>
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
 * "PaymentCodeOrOther2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a payment term in a coded or free format."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice
 * PaymentCodeOrOther1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCodeOrOther2Choice", propOrder = {"paymentCode", "paymentDueDate", "otherPaymentTerms"})
public class PaymentCodeOrOther2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtCd", required = true)
	protected PaymentPeriod4 paymentCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentPeriod4
	 * PaymentPeriod4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms PaymentTerms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice
	 * PaymentCodeOrOther2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice#mmPaymentCode
	 * PaymentCodeOrOther1Choice.mmPaymentCode}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentCode = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentTerms.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentCodeOrOther2Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCode";
			definition = "Specifies the payment period in coded form and a number of days.";
			previousVersion_lazy = () -> PaymentCodeOrOther1Choice.mmPaymentCode;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentPeriod4.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentDueDate
	 * PaymentObligation.mmPaymentDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice
	 * PaymentCodeOrOther2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice#mmPaymentDueDate
	 * PaymentCodeOrOther1Choice.mmPaymentDueDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentDueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentDueDate;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentCodeOrOther2Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtDueDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentDueDate";
			definition = "Specifies the payment date as a fixed date.";
			previousVersion_lazy = () -> PaymentCodeOrOther1Choice.mmPaymentDueDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther2Choice
	 * PaymentCodeOrOther2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentCodeOrOther1Choice#mmOtherPaymentTerms
	 * PaymentCodeOrOther1Choice.mmOtherPaymentTerms}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherPaymentTerms = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentCodeOrOther2Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrPmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPaymentTerms";
			definition = "Specifies payment terms not present in a code list.";
			previousVersion_lazy = () -> PaymentCodeOrOther1Choice.mmOtherPaymentTerms;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentCodeOrOther2Choice.mmPaymentCode, com.tools20022.repository.choice.PaymentCodeOrOther2Choice.mmPaymentDueDate,
						com.tools20022.repository.choice.PaymentCodeOrOther2Choice.mmOtherPaymentTerms);
				trace_lazy = () -> PaymentTerms.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCodeOrOther2Choice";
				definition = "Choice between a payment term in a coded or free format.";
				previousVersion_lazy = () -> PaymentCodeOrOther1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentPeriod4 getPaymentCode() {
		return paymentCode;
	}

	public PaymentCodeOrOther2Choice setPaymentCode(PaymentPeriod4 paymentCode) {
		this.paymentCode = Objects.requireNonNull(paymentCode);
		return this;
	}

	public ISODate getPaymentDueDate() {
		return paymentDueDate;
	}

	public PaymentCodeOrOther2Choice setPaymentDueDate(ISODate paymentDueDate) {
		this.paymentDueDate = Objects.requireNonNull(paymentDueDate);
		return this;
	}

	public Max140Text getOtherPaymentTerms() {
		return otherPaymentTerms;
	}

	public PaymentCodeOrOther2Choice setOtherPaymentTerms(Max140Text otherPaymentTerms) {
		this.otherPaymentTerms = Objects.requireNonNull(otherPaymentTerms);
		return this;
	}
}