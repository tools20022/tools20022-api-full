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
import com.tools20022.repository.choice.StatusReason4Choice;
import com.tools20022.repository.codeset.TechnicalValidationStatus1Code;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.InvoiceFinancingStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the status of a specific message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1#mmStatus
 * ValidationStatusInformation1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1#mmStatusReason
 * ValidationStatusInformation1.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1#mmAdditionalStatusReasonInformation
 * ValidationStatusInformation1.mmAdditionalStatusReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
 * InvoiceFinancingStatus}</li>
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
 * "ValidationStatusInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the status of a specific message."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ValidationStatusInformation1", propOrder = {"status", "statusReason", "additionalStatusReasonInformation"})
public class ValidationStatusInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Sts", required = true)
	protected TechnicalValidationStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TechnicalValidationStatus1Code
	 * TechnicalValidationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmValidationStatus
	 * InvoiceFinancingStatus.mmValidationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1
	 * ValidationStatusInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The result of the technical validation (e.g. Accepted, Reception error) executed on the request message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingStatus.mmValidationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValidationStatusInformation1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "The result of the technical validation (e.g. Accepted, Reception error) executed on the request message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TechnicalValidationStatus1Code.mmObject();
		}
	};
	@XmlElement(name = "StsRsn")
	protected StatusReason4Choice statusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatusReason4Choice
	 * StatusReason4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmValidationStatusReason
	 * InvoiceFinancingStatus.mmValidationStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1
	 * ValidationStatusInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The reason for the validation status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingStatus.mmValidationStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValidationStatusInformation1.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "The reason for the validation status.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatusReason4Choice.mmObject();
		}
	};
	@XmlElement(name = "AddtlStsRsnInf")
	protected List<Max105Text> additionalStatusReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1
	 * ValidationStatusInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlStsRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalStatusReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the validation status reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalStatusReasonInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValidationStatusInformation1.mmObject();
			isDerived = false;
			xmlTag = "AddtlStsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalStatusReasonInformation";
			definition = "Further details on the validation status reason.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValidationStatusInformation1.mmStatus, com.tools20022.repository.msg.ValidationStatusInformation1.mmStatusReason,
						com.tools20022.repository.msg.ValidationStatusInformation1.mmAdditionalStatusReasonInformation);
				trace_lazy = () -> InvoiceFinancingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValidationStatusInformation1";
				definition = "Information about the status of a specific message.";
			}
		});
		return mmObject_lazy.get();
	}

	public TechnicalValidationStatus1Code getStatus() {
		return status;
	}

	public ValidationStatusInformation1 setStatus(TechnicalValidationStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<StatusReason4Choice> getStatusReason() {
		return statusReason == null ? Optional.empty() : Optional.of(statusReason);
	}

	public ValidationStatusInformation1 setStatusReason(StatusReason4Choice statusReason) {
		this.statusReason = statusReason;
		return this;
	}

	public List<Max105Text> getAdditionalStatusReasonInformation() {
		return additionalStatusReasonInformation == null ? additionalStatusReasonInformation = new ArrayList<>() : additionalStatusReasonInformation;
	}

	public ValidationStatusInformation1 setAdditionalStatusReasonInformation(List<Max105Text> additionalStatusReasonInformation) {
		this.additionalStatusReasonInformation = Objects.requireNonNull(additionalStatusReasonInformation);
		return this;
	}
}