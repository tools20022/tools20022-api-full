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
import com.tools20022.repository.codeset.ExternalEnquiryRequestType1Code;
import com.tools20022.repository.codeset.ExternalPaymentControlRequestType1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the type of action to be performed in the request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RequestType4Choice#mmPaymentControl
 * RequestType4Choice.mmPaymentControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RequestType4Choice#mmEnquiry
 * RequestType4Choice.mmEnquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RequestType4Choice#mmProprietary
 * RequestType4Choice.mmProprietary}</li>
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
 * "RequestType4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the type of action to be performed in the request."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.RequestType2Choice
 * RequestType2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestType4Choice", propOrder = {"paymentControl", "enquiry", "proprietary"})
public class RequestType4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtCtrl", required = true)
	protected ExternalPaymentControlRequestType1Code paymentControl;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalPaymentControlRequestType1Code
	 * ExternalPaymentControlRequestType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RequestType4Choice
	 * RequestType4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCtrl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request type is a control command on a set of transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.RequestType2Choice#mmPaymentControl
	 * RequestType2Choice.mmPaymentControl}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestType4Choice, ExternalPaymentControlRequestType1Code> mmPaymentControl = new MMMessageAttribute<RequestType4Choice, ExternalPaymentControlRequestType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RequestType4Choice.mmObject();
			isDerived = false;
			xmlTag = "PmtCtrl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentControl";
			definition = "Request type is a control command on a set of transactions.";
			previousVersion_lazy = () -> RequestType2Choice.mmPaymentControl;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalPaymentControlRequestType1Code.mmObject();
		}

		@Override
		public ExternalPaymentControlRequestType1Code getValue(RequestType4Choice obj) {
			return obj.getPaymentControl();
		}

		@Override
		public void setValue(RequestType4Choice obj, ExternalPaymentControlRequestType1Code value) {
			obj.setPaymentControl(value);
		}
	};
	@XmlElement(name = "Enqry", required = true)
	protected ExternalEnquiryRequestType1Code enquiry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalEnquiryRequestType1Code
	 * ExternalEnquiryRequestType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RequestType4Choice
	 * RequestType4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Enqry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request type is an enquiry on a position or a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.RequestType2Choice#mmEnquiry
	 * RequestType2Choice.mmEnquiry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestType4Choice, ExternalEnquiryRequestType1Code> mmEnquiry = new MMMessageAttribute<RequestType4Choice, ExternalEnquiryRequestType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RequestType4Choice.mmObject();
			isDerived = false;
			xmlTag = "Enqry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enquiry";
			definition = "Request type is an enquiry on a position or a transaction.";
			previousVersion_lazy = () -> RequestType2Choice.mmEnquiry;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalEnquiryRequestType1Code.mmObject();
		}

		@Override
		public ExternalEnquiryRequestType1Code getValue(RequestType4Choice obj) {
			return obj.getEnquiry();
		}

		@Override
		public void setValue(RequestType4Choice obj, ExternalEnquiryRequestType1Code value) {
			obj.setEnquiry(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification1 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RequestType4Choice
	 * RequestType4Choice}</li>
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
	 * definition} = "Request type is in proprietary format."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.RequestType2Choice#mmProprietary
	 * RequestType2Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RequestType4Choice, GenericIdentification1> mmProprietary = new MMMessageAttribute<RequestType4Choice, GenericIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RequestType4Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Request type is in proprietary format.";
			previousVersion_lazy = () -> RequestType2Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification1.mmObject();
		}

		@Override
		public GenericIdentification1 getValue(RequestType4Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(RequestType4Choice obj, GenericIdentification1 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RequestType4Choice.mmPaymentControl, com.tools20022.repository.choice.RequestType4Choice.mmEnquiry,
						com.tools20022.repository.choice.RequestType4Choice.mmProprietary);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestType4Choice";
				definition = "Defines the type of action to be performed in the request.";
				previousVersion_lazy = () -> RequestType2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ExternalPaymentControlRequestType1Code getPaymentControl() {
		return paymentControl;
	}

	public RequestType4Choice setPaymentControl(ExternalPaymentControlRequestType1Code paymentControl) {
		this.paymentControl = Objects.requireNonNull(paymentControl);
		return this;
	}

	public ExternalEnquiryRequestType1Code getEnquiry() {
		return enquiry;
	}

	public RequestType4Choice setEnquiry(ExternalEnquiryRequestType1Code enquiry) {
		this.enquiry = Objects.requireNonNull(enquiry);
		return this;
	}

	public GenericIdentification1 getProprietary() {
		return proprietary;
	}

	public RequestType4Choice setProprietary(GenericIdentification1 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}