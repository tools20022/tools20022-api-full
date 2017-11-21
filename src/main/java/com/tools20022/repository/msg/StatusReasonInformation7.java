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
import com.tools20022.repository.choice.StatusReason1Choice;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Further information on the status reason of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7#mmStatusOriginator
 * StatusReasonInformation7.mmStatusOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7#mmStatusReason
 * StatusReasonInformation7.mmStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7#mmAdditionalStatusReasonInformation
 * StatusReasonInformation7.mmAdditionalStatusReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentStatus
 * PaymentStatus}</li>
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
 * "StatusReasonInformation7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Further information on the status reason of the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatusReasonInformation7", propOrder = {"statusOriginator", "statusReason", "additionalStatusReasonInformation"})
public class StatusReasonInformation7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification14 statusOriginator;
	/**
	 * Party issuing the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification14
	 * PartyIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7
	 * StatusReasonInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party issuing the status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusOriginator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> StatusReasonInformation7.mmObject();
			isDerived = false;
			xmlTag = "StsOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusOriginator";
			definition = "Party issuing the status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification14.mmObject();
		}
	};
	protected StatusReason1Choice statusReason;
	/**
	 * Specifies the reason for the status report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.StatusReason1Choice
	 * StatusReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7
	 * StatusReasonInformation7}</li>
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
	 * definition} = "Specifies the reason for the status report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusReason = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentStatus.mmObject();
			componentContext_lazy = () -> StatusReasonInformation7.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Specifies the reason for the status report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> StatusReason1Choice.mmObject();
		}
	};
	protected List<Max105Text> additionalStatusReasonInformation;
	/**
	 * Further details on the status reason.
	 * 
	 * Usage: Additional information can be used for several purposes, e.g. to
	 * report repaired information, or to further detail the status reason.
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
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation7
	 * StatusReasonInformation7}</li>
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
	 * definition} =
	 * "Further details on the status reason.\n\nUsage: Additional information can be used for several purposes, e.g. to report repaired information, or to further detail the status reason."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalStatusReasonInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> StatusReasonInformation7.mmObject();
			isDerived = false;
			xmlTag = "AddtlStsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalStatusReasonInformation";
			definition = "Further details on the status reason.\n\nUsage: Additional information can be used for several purposes, e.g. to report repaired information, or to further detail the status reason.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatusReasonInformation7.mmStatusOriginator, StatusReasonInformation7.mmStatusReason, StatusReasonInformation7.mmAdditionalStatusReasonInformation);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "StatusReasonInformation7";
				definition = "Further information on the status reason of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "StsOrgtr", required = true)
	public PartyIdentification14 getStatusOriginator() {
		return statusOriginator;
	}

	public void setStatusOriginator(com.tools20022.repository.msg.PartyIdentification14 statusOriginator) {
		this.statusOriginator = statusOriginator;
	}

	@XmlElement(name = "StsRsn", required = true)
	public StatusReason1Choice getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(StatusReason1Choice statusReason) {
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