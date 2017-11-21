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
import com.tools20022.repository.codeset.CancellationStatus4Code;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.InvoiceFinancingStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the business status of a cancellation request message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusInformation1#mmStatus
 * CancellationStatusInformation1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusInformation1#mmStatusReason
 * CancellationStatusInformation1.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CancellationStatusInformation1#mmAdditionalStatusReasonInformation
 * CancellationStatusInformation1.mmAdditionalStatusReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus
 * InvoiceFinancingStatus}</li>
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
 * "CancellationStatusInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the business status of a cancellation request message."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CancellationStatusInformation1", propOrder = {"status", "statusReason", "additionalStatusReasonInformation"})
public class CancellationStatusInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CancellationStatus4Code status;
	/**
	 * Information on the business status of the cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationStatus4Code
	 * CancellationStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmCancellationStatus
	 * InvoiceFinancingStatus.mmCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusInformation1
	 * CancellationStatusInformation1}</li>
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
	 * definition} = "Information on the business status of the cancellation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingStatus.mmCancellationStatus;
			componentContext_lazy = () -> CancellationStatusInformation1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Information on the business status of the cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CancellationStatus4Code.mmObject();
		}
	};
	protected StatusReason4Choice statusReason;
	/**
	 * The reason for the cancellation status.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingStatus#mmCancellationStatusReason
	 * InvoiceFinancingStatus.mmCancellationStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusInformation1
	 * CancellationStatusInformation1}</li>
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
	 * definition} = "The reason for the cancellation status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingStatus.mmCancellationStatusReason;
			componentContext_lazy = () -> CancellationStatusInformation1.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "The reason for the cancellation status.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatusReason4Choice.mmObject();
		}
	};
	protected List<Max105Text> additionalStatusReasonInformation;
	/**
	 * Further details on the cancellation status reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDescription
	 * Status.mmStatusDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusInformation1
	 * CancellationStatusInformation1}</li>
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
	 * definition} = "Further details on the cancellation status reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalStatusReasonInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDescription;
			componentContext_lazy = () -> CancellationStatusInformation1.mmObject();
			isDerived = false;
			xmlTag = "AddtlStsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalStatusReasonInformation";
			definition = "Further details on the cancellation status reason.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CancellationStatusInformation1.mmStatus, CancellationStatusInformation1.mmStatusReason, CancellationStatusInformation1.mmAdditionalStatusReasonInformation);
				trace_lazy = () -> InvoiceFinancingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationStatusInformation1";
				definition = "Information about the business status of a cancellation request message.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Sts", required = true)
	public CancellationStatus4Code getStatus() {
		return status;
	}

	public void setStatus(CancellationStatus4Code status) {
		this.status = status;
	}

	@XmlElement(name = "StsRsn")
	public StatusReason4Choice getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(StatusReason4Choice statusReason) {
		this.statusReason = statusReason;
	}

	@XmlElement(name = "AddtlStsRsnInf")
	public List<Max105Text> getAdditionalStatusReasonInformation() {
		return additionalStatusReasonInformation;
	}

	public void setAdditionalStatusReasonInformation(List<Max105Text> additionalStatusReasonInformation) {
		this.additionalStatusReasonInformation = additionalStatusReasonInformation;
	}
}