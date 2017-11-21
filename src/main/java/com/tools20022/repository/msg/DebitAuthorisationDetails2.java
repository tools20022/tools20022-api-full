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
import com.tools20022.repository.codeset.CancellationReason3Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.DebitAuthorisation;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the reason for requesting a debit authorisation as well as the
 * amount of the requested debit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails2#mmCancellationReason
 * DebitAuthorisationDetails2.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails2#mmAmountToDebit
 * DebitAuthorisationDetails2.mmAmountToDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails2#mmValueDateToDebit
 * DebitAuthorisationDetails2.mmValueDateToDebit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DebitAuthorisation
 * DebitAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebitAuthorisationDetails2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the reason for requesting a debit authorisation as well as the amount of the requested debit."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DebitAuthorisationDetails2", propOrder = {"cancellationReason", "amountToDebit", "valueDateToDebit"})
public class DebitAuthorisationDetails2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CancellationReason3Code cancellationReason;
	/**
	 * Indicates the reason for cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code
	 * CancellationReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCancellationReason
	 * PaymentStatus.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails2
	 * DebitAuthorisationDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the reason for cancellation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmCancellationReason;
			componentContext_lazy = () -> DebitAuthorisationDetails2.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Indicates the reason for cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationReason3Code.mmObject();
		}
	};
	protected CurrencyAndAmount amountToDebit;
	/**
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmAmountToDebit
	 * DebitAuthorisation.mmAmountToDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails2
	 * DebitAuthorisationDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountToDebit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DebitAuthorisation.mmAmountToDebit;
			componentContext_lazy = () -> DebitAuthorisationDetails2.mmObject();
			isDerived = false;
			xmlTag = "AmtToDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToDebit";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ISODate valueDateToDebit;
	/**
	 * Value date for debiting the amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DebitAuthorisation#mmValueDateToDebit
	 * DebitAuthorisation.mmValueDateToDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebitAuthorisationDetails2
	 * DebitAuthorisationDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDtToDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateToDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value date for debiting the amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDateToDebit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DebitAuthorisation.mmValueDateToDebit;
			componentContext_lazy = () -> DebitAuthorisationDetails2.mmObject();
			isDerived = false;
			xmlTag = "ValDtToDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateToDebit";
			definition = "Value date for debiting the amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DebitAuthorisationDetails2.mmCancellationReason, DebitAuthorisationDetails2.mmAmountToDebit, DebitAuthorisationDetails2.mmValueDateToDebit);
				trace_lazy = () -> DebitAuthorisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DebitAuthorisationDetails2";
				definition = "Provides the reason for requesting a debit authorisation as well as the amount of the requested debit.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CxlRsn", required = true)
	public CancellationReason3Code getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(CancellationReason3Code cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	@XmlElement(name = "AmtToDbt")
	public CurrencyAndAmount getAmountToDebit() {
		return amountToDebit;
	}

	public void setAmountToDebit(CurrencyAndAmount amountToDebit) {
		this.amountToDebit = amountToDebit;
	}

	@XmlElement(name = "ValDtToDbt")
	public ISODate getValueDateToDebit() {
		return valueDateToDebit;
	}

	public void setValueDateToDebit(ISODate valueDateToDebit) {
		this.valueDateToDebit = valueDateToDebit;
	}
}