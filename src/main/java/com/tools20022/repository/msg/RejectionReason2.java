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
import com.tools20022.repository.area.admi.MessageRejectV01;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max20000Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General information about the reason of the rejection.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason2#mmRejectingPartyReason
 * RejectionReason2.mmRejectingPartyReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason2#mmRejectionDateTime
 * RejectionReason2.mmRejectionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason2#mmErrorLocation
 * RejectionReason2.mmErrorLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason2#mmReasonDescription
 * RejectionReason2.mmReasonDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason2#mmAdditionalData
 * RejectionReason2.mmAdditionalData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.admi.MessageRejectV01#mmReason
 * MessageRejectV01.mmReason}</li>
 * </ul>
 * </li>
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
 * "RejectionReason2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "General information about the reason of the rejection."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RejectionReason2", propOrder = {"rejectingPartyReason", "rejectionDateTime", "errorLocation", "reasonDescription", "additionalData"})
public class RejectionReason2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text rejectingPartyReason;
	/**
	 * Reason of the rejection provided by the rejecting party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason2
	 * RejectionReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctgPtyRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectingPartyReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of the rejection provided by the rejecting party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectingPartyReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RejectionReason2.mmObject();
			isDerived = false;
			xmlTag = "RjctgPtyRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectingPartyReason";
			definition = "Reason of the rejection provided by the rejecting party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime rejectionDateTime;
	/**
	 * Date and time at which the rejection was generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason2
	 * RejectionReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the rejection was generated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRejectionDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RejectionReason2.mmObject();
			isDerived = false;
			xmlTag = "RjctnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionDateTime";
			definition = "Date and time at which the rejection was generated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max350Text errorLocation;
	/**
	 * Description of the precise location of the potential error in a message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason2
	 * RejectionReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ErrLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the precise location of the potential error in a message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmErrorLocation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RejectionReason2.mmObject();
			isDerived = false;
			xmlTag = "ErrLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorLocation";
			definition = "Description of the precise location of the potential error in a message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text reasonDescription;
	/**
	 * Detailed description of the rejection reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason2
	 * RejectionReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsnDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed description of the rejection reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReasonDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RejectionReason2.mmObject();
			isDerived = false;
			xmlTag = "RsnDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonDescription";
			definition = "Detailed description of the rejection reason.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max20000Text additionalData;
	/**
	 * Additional information related to the rejection and meant to allow for
	 * the precise identification of the rejection reason. This could include a
	 * copy of the rejected message in part or in full.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max20000Text Max20000Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason2
	 * RejectionReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the rejection and meant to allow for the precise identification of the rejection reason. This could include a copy of the rejected message in part or in full."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RejectionReason2.mmObject();
			isDerived = false;
			xmlTag = "AddtlData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalData";
			definition = "Additional information related to the rejection and meant to allow for the precise identification of the rejection reason. This could include a copy of the rejected message in part or in full.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max20000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RejectionReason2.mmRejectingPartyReason, RejectionReason2.mmRejectionDateTime, RejectionReason2.mmErrorLocation, RejectionReason2.mmReasonDescription,
						RejectionReason2.mmAdditionalData);
				messageBuildingBlock_lazy = () -> Arrays.asList(MessageRejectV01.mmReason);
				trace_lazy = () -> StatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason2";
				definition = "General information about the reason of the rejection.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RjctgPtyRsn", required = true)
	public Max35Text getRejectingPartyReason() {
		return rejectingPartyReason;
	}

	public void setRejectingPartyReason(Max35Text rejectingPartyReason) {
		this.rejectingPartyReason = rejectingPartyReason;
	}

	@XmlElement(name = "RjctnDtTm")
	public ISODateTime getRejectionDateTime() {
		return rejectionDateTime;
	}

	public void setRejectionDateTime(ISODateTime rejectionDateTime) {
		this.rejectionDateTime = rejectionDateTime;
	}

	@XmlElement(name = "ErrLctn")
	public Max350Text getErrorLocation() {
		return errorLocation;
	}

	public void setErrorLocation(Max350Text errorLocation) {
		this.errorLocation = errorLocation;
	}

	@XmlElement(name = "RsnDesc")
	public Max350Text getReasonDescription() {
		return reasonDescription;
	}

	public void setReasonDescription(Max350Text reasonDescription) {
		this.reasonDescription = reasonDescription;
	}

	@XmlElement(name = "AddtlData")
	public Max20000Text getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(Max20000Text additionalData) {
		this.additionalData = additionalData;
	}
}