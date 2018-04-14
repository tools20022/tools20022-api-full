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
import com.tools20022.repository.area.cain.AcquirerRejection;
import com.tools20022.repository.codeset.RejectReason1Code;
import com.tools20022.repository.datatype.Max100KBinary;
import com.tools20022.repository.entity.CardPaymentStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ErrorReporting1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.AcceptorRejection4#mmRejectReason
 * AcceptorRejection4.mmRejectReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorRejection4#mmErrorReporting
 * AcceptorRejection4.mmErrorReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorRejection4#mmMessageInError
 * AcceptorRejection4.mmMessageInError}</li>
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
 * {@linkplain com.tools20022.repository.area.cain.AcquirerRejection#mmReject
 * AcquirerRejection.mmReject}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorRejection4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reject of an exchange."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2
 * AcceptorRejection2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorRejection4", propOrder = {"rejectReason", "errorReporting", "messageInError"})
public class AcceptorRejection4 {

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
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection4
	 * AcceptorRejection4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reject reason of the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2#mmRejectReason
	 * AcceptorRejection2.mmRejectReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcceptorRejection4, RejectReason1Code> mmRejectReason = new MMMessageAttribute<AcceptorRejection4, RejectReason1Code>() {
		{
			businessElementTrace_lazy = () -> CardPaymentStatus.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorRejection4.mmObject();
			isDerived = false;
			xmlTag = "RjctRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectReason";
			definition = "Reject reason of the message.";
			previousVersion_lazy = () -> AcceptorRejection2.mmRejectReason;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RejectReason1Code.mmObject();
		}

		@Override
		public RejectReason1Code getValue(AcceptorRejection4 obj) {
			return obj.getRejectReason();
		}

		@Override
		public void setValue(AcceptorRejection4 obj, RejectReason1Code value) {
			obj.setRejectReason(value);
		}
	};
	@XmlElement(name = "ErrRptg")
	protected List<ErrorReporting1> errorReporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorReporting1
	 * ErrorReporting1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection4
	 * AcceptorRejection4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ErrRptg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed description of an error that caused the rejection for further analysis."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptorRejection4, List<ErrorReporting1>> mmErrorReporting = new MMMessageAssociationEnd<AcceptorRejection4, List<ErrorReporting1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorRejection4.mmObject();
			isDerived = false;
			xmlTag = "ErrRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorReporting";
			definition = "Detailed description of an error that caused the rejection for further analysis.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ErrorReporting1.mmObject();
		}

		@Override
		public List<ErrorReporting1> getValue(AcceptorRejection4 obj) {
			return obj.getErrorReporting();
		}

		@Override
		public void setValue(AcceptorRejection4 obj, List<ErrorReporting1> value) {
			obj.setErrorReporting(value);
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
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection4
	 * AcceptorRejection4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgInErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageInError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original request that caused the party to reject it."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorRejection2#mmMessageInError
	 * AcceptorRejection2.mmMessageInError}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcceptorRejection4, Optional<Max100KBinary>> mmMessageInError = new MMMessageAttribute<AcceptorRejection4, Optional<Max100KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorRejection4.mmObject();
			isDerived = false;
			xmlTag = "MsgInErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageInError";
			definition = "Original request that caused the party to reject it.";
			previousVersion_lazy = () -> AcceptorRejection2.mmMessageInError;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max100KBinary.mmObject();
		}

		@Override
		public Optional<Max100KBinary> getValue(AcceptorRejection4 obj) {
			return obj.getMessageInError();
		}

		@Override
		public void setValue(AcceptorRejection4 obj, Optional<Max100KBinary> value) {
			obj.setMessageInError(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorRejection4.mmRejectReason, com.tools20022.repository.msg.AcceptorRejection4.mmErrorReporting,
						com.tools20022.repository.msg.AcceptorRejection4.mmMessageInError);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcquirerRejection.mmReject);
				trace_lazy = () -> CardPaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorRejection4";
				definition = "Reject of an exchange.";
				previousVersion_lazy = () -> AcceptorRejection2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public RejectReason1Code getRejectReason() {
		return rejectReason;
	}

	public AcceptorRejection4 setRejectReason(RejectReason1Code rejectReason) {
		this.rejectReason = Objects.requireNonNull(rejectReason);
		return this;
	}

	public List<ErrorReporting1> getErrorReporting() {
		return errorReporting == null ? errorReporting = new ArrayList<>() : errorReporting;
	}

	public AcceptorRejection4 setErrorReporting(List<ErrorReporting1> errorReporting) {
		this.errorReporting = Objects.requireNonNull(errorReporting);
		return this;
	}

	public Optional<Max100KBinary> getMessageInError() {
		return messageInError == null ? Optional.empty() : Optional.of(messageInError);
	}

	public AcceptorRejection4 setMessageInError(Max100KBinary messageInError) {
		this.messageInError = messageInError;
		return this;
	}
}