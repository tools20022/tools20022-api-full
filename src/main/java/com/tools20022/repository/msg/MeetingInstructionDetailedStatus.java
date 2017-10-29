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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.MeetingStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status applying to individual instructions of a MeetingInstruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#AccountIdentification
 * MeetingInstructionDetailedStatus.AccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#ParticipationRegistrationConfirmation
 * MeetingInstructionDetailedStatus.ParticipationRegistrationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#VotingInstructionConfirmation
 * MeetingInstructionDetailedStatus.VotingInstructionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#ProxyAssignmentConfirmation
 * MeetingInstructionDetailedStatus.ProxyAssignmentConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#MeetingAttendanceConfirmation
 * MeetingInstructionDetailedStatus.MeetingAttendanceConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#SecuritiesRegistrationConfirmation
 * MeetingInstructionDetailedStatus.SecuritiesRegistrationConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionDetailedStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status applying to individual instructions of a MeetingInstruction."</li>
 * </ul>
 */
public class MeetingInstructionDetailedStatus {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AccountIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Status relative to vote participation instruction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcptnRegnConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipationRegistrationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status relative to vote participation instruction(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ParticipationRegistrationConfirmation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			xmlTag = "PrtcptnRegnConf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipationRegistrationConfirmation";
			definition = "Status relative to vote participation instruction(s).";
			minOccurs = 0;
			type_lazy = () -> DetailedInstructionConfirmation.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Status relative to vote instruction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VtngInstrConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingInstructionConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status relative to vote instruction(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd VotingInstructionConfirmation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			xmlTag = "VtngInstrConf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingInstructionConfirmation";
			definition = "Status relative to vote instruction(s).";
			minOccurs = 0;
			type_lazy = () -> DetailedInstructionConfirmation.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Status relative to proxy assignment instruction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyAssgnmtConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAssignmentConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status relative to proxy assignment instruction(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProxyAssignmentConfirmation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			xmlTag = "PrxyAssgnmtConf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAssignmentConfirmation";
			definition = "Status relative to proxy assignment instruction(s).";
			minOccurs = 0;
			type_lazy = () -> DetailedInstructionConfirmation.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Status relative to attendance registration instruction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgAttndncConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingAttendanceConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status relative to attendance registration instruction(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd MeetingAttendanceConfirmation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			xmlTag = "MtgAttndncConf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingAttendanceConfirmation";
			definition = "Status relative to attendance registration instruction(s).";
			minOccurs = 0;
			type_lazy = () -> DetailedInstructionConfirmation.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Status relative to securities registration instruction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRegnConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRegistrationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status relative to securities registration instruction(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SecuritiesRegistrationConfirmation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			isDerived = false;
			xmlTag = "SctiesRegnConf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRegistrationConfirmation";
			definition = "Status relative to securities registration instruction(s).";
			minOccurs = 0;
			type_lazy = () -> DetailedInstructionConfirmation.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionDetailedStatus.AccountIdentification,
						com.tools20022.repository.msg.MeetingInstructionDetailedStatus.ParticipationRegistrationConfirmation, com.tools20022.repository.msg.MeetingInstructionDetailedStatus.VotingInstructionConfirmation,
						com.tools20022.repository.msg.MeetingInstructionDetailedStatus.ProxyAssignmentConfirmation, com.tools20022.repository.msg.MeetingInstructionDetailedStatus.MeetingAttendanceConfirmation,
						com.tools20022.repository.msg.MeetingInstructionDetailedStatus.SecuritiesRegistrationConfirmation);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MeetingInstructionDetailedStatus";
				definition = "Status applying to individual instructions of a MeetingInstruction.";
			}
		});
		return mmObject_lazy.get();
	}
}