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
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RejectionReason2", propOrder = {"rejectingPartyReason", "rejectionDateTime", "errorLocation", "reasonDescription", "additionalData"})
public class RejectionReason2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RjctgPtyRsn", required = true)
	protected Max35Text rejectingPartyReason;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<RejectionReason2, Max35Text> mmRejectingPartyReason = new MMMessageAttribute<RejectionReason2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectionReason2.mmObject();
			isDerived = false;
			xmlTag = "RjctgPtyRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectingPartyReason";
			definition = "Reason of the rejection provided by the rejecting party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(RejectionReason2 obj) {
			return obj.getRejectingPartyReason();
		}

		@Override
		public void setValue(RejectionReason2 obj, Max35Text value) {
			obj.setRejectingPartyReason(value);
		}
	};
	@XmlElement(name = "RjctnDtTm")
	protected ISODateTime rejectionDateTime;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<RejectionReason2, Optional<ISODateTime>> mmRejectionDateTime = new MMMessageAttribute<RejectionReason2, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectionReason2.mmObject();
			isDerived = false;
			xmlTag = "RjctnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionDateTime";
			definition = "Date and time at which the rejection was generated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(RejectionReason2 obj) {
			return obj.getRejectionDateTime();
		}

		@Override
		public void setValue(RejectionReason2 obj, Optional<ISODateTime> value) {
			obj.setRejectionDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "ErrLctn")
	protected Max350Text errorLocation;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<RejectionReason2, Optional<Max350Text>> mmErrorLocation = new MMMessageAttribute<RejectionReason2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectionReason2.mmObject();
			isDerived = false;
			xmlTag = "ErrLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorLocation";
			definition = "Description of the precise location of the potential error in a message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(RejectionReason2 obj) {
			return obj.getErrorLocation();
		}

		@Override
		public void setValue(RejectionReason2 obj, Optional<Max350Text> value) {
			obj.setErrorLocation(value.orElse(null));
		}
	};
	@XmlElement(name = "RsnDesc")
	protected Max350Text reasonDescription;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<RejectionReason2, Optional<Max350Text>> mmReasonDescription = new MMMessageAttribute<RejectionReason2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectionReason2.mmObject();
			isDerived = false;
			xmlTag = "RsnDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonDescription";
			definition = "Detailed description of the rejection reason.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(RejectionReason2 obj) {
			return obj.getReasonDescription();
		}

		@Override
		public void setValue(RejectionReason2 obj, Optional<Max350Text> value) {
			obj.setReasonDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlData")
	protected Max20000Text additionalData;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<RejectionReason2, Optional<Max20000Text>> mmAdditionalData = new MMMessageAttribute<RejectionReason2, Optional<Max20000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectionReason2.mmObject();
			isDerived = false;
			xmlTag = "AddtlData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalData";
			definition = "Additional information related to the rejection and meant to allow for the precise identification of the rejection reason. This could include a copy of the rejected message in part or in full.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max20000Text.mmObject();
		}

		@Override
		public Optional<Max20000Text> getValue(RejectionReason2 obj) {
			return obj.getAdditionalData();
		}

		@Override
		public void setValue(RejectionReason2 obj, Optional<Max20000Text> value) {
			obj.setAdditionalData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RejectionReason2.mmRejectingPartyReason, com.tools20022.repository.msg.RejectionReason2.mmRejectionDateTime,
						com.tools20022.repository.msg.RejectionReason2.mmErrorLocation, com.tools20022.repository.msg.RejectionReason2.mmReasonDescription, com.tools20022.repository.msg.RejectionReason2.mmAdditionalData);
				messageBuildingBlock_lazy = () -> Arrays.asList(MessageRejectV01.mmReason);
				trace_lazy = () -> StatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason2";
				definition = "General information about the reason of the rejection.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getRejectingPartyReason() {
		return rejectingPartyReason;
	}

	public RejectionReason2 setRejectingPartyReason(Max35Text rejectingPartyReason) {
		this.rejectingPartyReason = Objects.requireNonNull(rejectingPartyReason);
		return this;
	}

	public Optional<ISODateTime> getRejectionDateTime() {
		return rejectionDateTime == null ? Optional.empty() : Optional.of(rejectionDateTime);
	}

	public RejectionReason2 setRejectionDateTime(ISODateTime rejectionDateTime) {
		this.rejectionDateTime = rejectionDateTime;
		return this;
	}

	public Optional<Max350Text> getErrorLocation() {
		return errorLocation == null ? Optional.empty() : Optional.of(errorLocation);
	}

	public RejectionReason2 setErrorLocation(Max350Text errorLocation) {
		this.errorLocation = errorLocation;
		return this;
	}

	public Optional<Max350Text> getReasonDescription() {
		return reasonDescription == null ? Optional.empty() : Optional.of(reasonDescription);
	}

	public RejectionReason2 setReasonDescription(Max350Text reasonDescription) {
		this.reasonDescription = reasonDescription;
		return this;
	}

	public Optional<Max20000Text> getAdditionalData() {
		return additionalData == null ? Optional.empty() : Optional.of(additionalData);
	}

	public RejectionReason2 setAdditionalData(Max20000Text additionalData) {
		this.additionalData = additionalData;
		return this;
	}
}