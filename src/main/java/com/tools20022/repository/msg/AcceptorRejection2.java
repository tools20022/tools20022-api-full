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
import com.tools20022.repository.area.caaa.AcceptorRejectionV03;
import com.tools20022.repository.area.caaa.AcceptorRejectionV04;
import com.tools20022.repository.area.caaa.AcceptorRejectionV05;
import com.tools20022.repository.area.catm.TerminalManagementRejectionV02;
import com.tools20022.repository.codeset.RejectReason1Code;
import com.tools20022.repository.datatype.Max100KBinary;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.entity.CardPaymentStatus;
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
 * Reject of an exchange.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2#mmRejectReason
 * AcceptorRejection2.mmRejectReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2#mmAdditionalInformation
 * AcceptorRejection2.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2#mmMessageInError
 * AcceptorRejection2.mmMessageInError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentStatus
 * CardPaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.TerminalManagementRejectionV02#mmReject
 * TerminalManagementRejectionV02.mmReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV03#mmReject
 * AcceptorRejectionV03.mmReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV04#mmReject
 * AcceptorRejectionV04.mmReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorRejectionV05#mmReject
 * AcceptorRejectionV05.mmReject}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorRejection2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reject of an exchange."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorRejection3
 * AcceptorRejection3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorRejection4
 * AcceptorRejection4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorRejection1
 * AcceptorRejection1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorRejection2", propOrder = {"rejectReason", "additionalInformation", "messageInError"})
public class AcceptorRejection2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RjctRsn", required = true)
	protected RejectReason1Code rejectReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code
	 * RejectReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentStatus#mmRejectionReason
	 * CardPaymentStatus.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2
	 * AcceptorRejection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reject reason of the request or the advice."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection3#mmRejectReason
	 * AcceptorRejection3.mmRejectReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection4#mmRejectReason
	 * AcceptorRejection4.mmRejectReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection1#mmRejectReason
	 * AcceptorRejection1.mmRejectReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcceptorRejection2, RejectReason1Code> mmRejectReason = new MMMessageAttribute<AcceptorRejection2, RejectReason1Code>() {
		{
			businessElementTrace_lazy = () -> CardPaymentStatus.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorRejection2.mmObject();
			isDerived = false;
			xmlTag = "RjctRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectReason";
			definition = "Reject reason of the request or the advice.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorRejection3.mmRejectReason, AcceptorRejection4.mmRejectReason);
			previousVersion_lazy = () -> AcceptorRejection1.mmRejectReason;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectReason1Code.mmObject();
		}

		@Override
		public RejectReason1Code getValue(AcceptorRejection2 obj) {
			return obj.getRejectReason();
		}

		@Override
		public void setValue(AcceptorRejection2 obj, RejectReason1Code value) {
			obj.setRejectReason(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max500Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2
	 * AcceptorRejection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the reject of the exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection3#mmAdditionalInformation
	 * AcceptorRejection3.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection1#mmAdditionalInformation
	 * AcceptorRejection1.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcceptorRejection2, Optional<Max500Text>> mmAdditionalInformation = new MMMessageAttribute<AcceptorRejection2, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorRejection2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information related to the reject of the exchange.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorRejection3.mmAdditionalInformation);
			previousVersion_lazy = () -> AcceptorRejection1.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(AcceptorRejection2 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(AcceptorRejection2 obj, Optional<Max500Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgInErr")
	protected Max100KBinary messageInError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max100KBinary
	 * Max100KBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2
	 * AcceptorRejection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgInErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageInError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original request that caused the recipient party to reject it."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection3#mmMessageInError
	 * AcceptorRejection3.mmMessageInError}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection4#mmMessageInError
	 * AcceptorRejection4.mmMessageInError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection1#mmMessageInError
	 * AcceptorRejection1.mmMessageInError}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcceptorRejection2, Optional<Max100KBinary>> mmMessageInError = new MMMessageAttribute<AcceptorRejection2, Optional<Max100KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorRejection2.mmObject();
			isDerived = false;
			xmlTag = "MsgInErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageInError";
			definition = "Original request that caused the recipient party to reject it.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorRejection3.mmMessageInError, AcceptorRejection4.mmMessageInError);
			previousVersion_lazy = () -> AcceptorRejection1.mmMessageInError;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max100KBinary.mmObject();
		}

		@Override
		public Optional<Max100KBinary> getValue(AcceptorRejection2 obj) {
			return obj.getMessageInError();
		}

		@Override
		public void setValue(AcceptorRejection2 obj, Optional<Max100KBinary> value) {
			obj.setMessageInError(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorRejection2.mmRejectReason, com.tools20022.repository.msg.AcceptorRejection2.mmAdditionalInformation,
						com.tools20022.repository.msg.AcceptorRejection2.mmMessageInError);
				messageBuildingBlock_lazy = () -> Arrays.asList(TerminalManagementRejectionV02.mmReject, AcceptorRejectionV03.mmReject, AcceptorRejectionV04.mmReject, AcceptorRejectionV05.mmReject);
				trace_lazy = () -> CardPaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorRejection2";
				definition = "Reject of an exchange.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorRejection3.mmObject(), AcceptorRejection4.mmObject());
				previousVersion_lazy = () -> AcceptorRejection1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public RejectReason1Code getRejectReason() {
		return rejectReason;
	}

	public AcceptorRejection2 setRejectReason(RejectReason1Code rejectReason) {
		this.rejectReason = Objects.requireNonNull(rejectReason);
		return this;
	}

	public Optional<Max500Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public AcceptorRejection2 setAdditionalInformation(Max500Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public Optional<Max100KBinary> getMessageInError() {
		return messageInError == null ? Optional.empty() : Optional.of(messageInError);
	}

	public AcceptorRejection2 setMessageInError(Max100KBinary messageInError) {
		this.messageInError = messageInError;
		return this;
	}
}