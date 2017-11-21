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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PaymentType3Code;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice beween a payment type from a predefined list and a proprietary payment
 * type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentType2Choice#mmPaymentType
 * PaymentType2Choice.mmPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentType2Choice#mmProprietaryPaymentType
 * PaymentType2Choice.mmProprietaryPaymentType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "PaymentType2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice beween a payment type from a predefined list and a proprietary payment type."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentType2Choice", propOrder = {"paymentType", "proprietaryPaymentType"})
public class PaymentType2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentType3Code paymentType;
	/**
	 * Type, or nature, of the payment, eg, express payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentType3Code
	 * PaymentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmType
	 * Payment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentType2Choice
	 * PaymentType2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type, or nature, of the payment, eg, express payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmType;
			componentContext_lazy = () -> PaymentType2Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentType";
			definition = "Type, or nature, of the payment, eg, express payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentType3Code.mmObject();
		}
	};
	protected Max4AlphaNumericText proprietaryPaymentType;
	/**
	 * Payment type that is not included in a predefined list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmType
	 * Payment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentType2Choice
	 * PaymentType2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryPmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryPaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment type that is not included in a predefined list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryPaymentType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmType;
			componentContext_lazy = () -> PaymentType2Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryPmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryPaymentType";
			definition = "Payment type that is not included in a predefined list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentType2Choice.mmPaymentType, PaymentType2Choice.mmProprietaryPaymentType);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentType2Choice";
				definition = "Choice beween a payment type from a predefined list and a proprietary payment type.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtTp", required = true)
	public PaymentType3Code getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType3Code paymentType) {
		this.paymentType = paymentType;
	}

	@XmlElement(name = "PrtryPmtTp", required = true)
	public Max4AlphaNumericText getProprietaryPaymentType() {
		return proprietaryPaymentType;
	}

	public void setProprietaryPaymentType(Max4AlphaNumericText proprietaryPaymentType) {
		this.proprietaryPaymentType = proprietaryPaymentType;
	}
}