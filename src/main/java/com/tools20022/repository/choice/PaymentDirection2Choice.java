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
import com.tools20022.repository.datatype.PaymentDirectionIndicator;
import com.tools20022.repository.entity.Debt;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification20;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the payment direction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentDirection2Choice#mmIndicator
 * PaymentDirection2Choice.mmIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentDirection2Choice#mmProprietary
 * PaymentDirection2Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentDirection2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the payment direction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentDirection2Choice", propOrder = {"indicator", "proprietary"})
public class PaymentDirection2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentDirectionIndicator indicator;
	/**
	 * Indicates the direction of payment for asset or mortgage backed
	 * securities, ie, whether the repaid capital is distributed (payment
	 * direction is down) or capitalized (payment direction is up).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PaymentDirectionIndicator
	 * PaymentDirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPaymentDirectionIndicator
	 * Debt.mmPaymentDirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection2Choice
	 * PaymentDirection2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Indicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPaymentDirectionIndicator;
			componentContext_lazy = () -> PaymentDirection2Choice.mmObject();
			isDerived = false;
			xmlTag = "Ind";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indicator";
			definition = "Indicates the direction of payment for asset or mortgage backed securities, ie, whether the repaid capital is distributed (payment direction is down) or capitalized (payment direction is up).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentDirectionIndicator.mmObject();
		}
	};
	protected GenericIdentification20 proprietary;
	/**
	 * Payment direction expressed as a proprietary code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification20
	 * GenericIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Debt#mmPaymentDirectionIndicator
	 * Debt.mmPaymentDirectionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentDirection2Choice
	 * PaymentDirection2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment direction expressed as a proprietary code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietary = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Debt.mmPaymentDirectionIndicator;
			componentContext_lazy = () -> PaymentDirection2Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Payment direction expressed as a proprietary code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification20.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentDirection2Choice.mmIndicator, PaymentDirection2Choice.mmProprietary);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentDirection2Choice";
				definition = "Choice of format for the payment direction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ind", required = true)
	public PaymentDirectionIndicator getIndicator() {
		return indicator;
	}

	public void setIndicator(PaymentDirectionIndicator indicator) {
		this.indicator = indicator;
	}

	@XmlElement(name = "Prtry", required = true)
	public GenericIdentification20 getProprietary() {
		return proprietary;
	}

	public void setProprietary(GenericIdentification20 proprietary) {
		this.proprietary = proprietary;
	}
}