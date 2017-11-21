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
import com.tools20022.repository.codeset.PaymentTime2Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.PaymentTerms;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the payment terms by means of a code and a period.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentPeriod2#mmCode
 * PaymentPeriod2.mmCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentPeriod2#mmNumberOfDays
 * PaymentPeriod2.mmNumberOfDays}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentTerms
 * PaymentTerms}</li>
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
 * "PaymentPeriod2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment terms by means of a code and a period."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentPeriod3 PaymentPeriod3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentPeriod2", propOrder = {"code", "numberOfDays"})
public class PaymentPeriod2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentTime2Code code;
	/**
	 * Code for the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code
	 * PaymentTime2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentTerms#mmPaymentTime
	 * PaymentTerms.mmPaymentTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentPeriod2 PaymentPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for the payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentPeriod3#mmCode
	 * PaymentPeriod3.mmCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentTerms.mmPaymentTime;
			componentContext_lazy = () -> PaymentPeriod2.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Code for the payment.";
			nextVersions_lazy = () -> Arrays.asList(PaymentPeriod3.mmCode);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentTime2Code.mmObject();
		}
	};
	protected Number numberOfDays;
	/**
	 * Number of days after which the payment must be effected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentPeriod2 PaymentPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of days after which the payment must be effected."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentPeriod3#mmNumberOfDays
	 * PaymentPeriod3.mmNumberOfDays}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDays = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> PaymentPeriod2.mmObject();
			isDerived = false;
			xmlTag = "NbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDays";
			definition = "Number of days after which the payment must be effected.";
			nextVersions_lazy = () -> Arrays.asList(PaymentPeriod3.mmNumberOfDays);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentPeriod2.mmCode, PaymentPeriod2.mmNumberOfDays);
				trace_lazy = () -> PaymentTerms.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentPeriod2";
				definition = "Specifies the payment terms by means of a code and a period.";
				nextVersions_lazy = () -> Arrays.asList(PaymentPeriod3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Cd", required = true)
	public PaymentTime2Code getCode() {
		return code;
	}

	public void setCode(PaymentTime2Code code) {
		this.code = code;
	}

	@XmlElement(name = "NbOfDays")
	public Number getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(Number numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
}