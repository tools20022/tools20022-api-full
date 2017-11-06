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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.Vote3Choice;
import com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice;
import com.tools20022.repository.entity.VoteInstructionRequest;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies detailed voting instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteDetails3#mmVoteInstructionForAgendaResolution
 * VoteDetails3.mmVoteInstructionForAgendaResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteDetails3#mmVoteInstructionForMeetingResolution
 * VoteDetails3.mmVoteInstructionForMeetingResolution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
 * VoteInstructionRequest}</li>
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
 * "VoteDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies detailed voting instructions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.VoteDetails2
 * VoteDetails2}</li>
 * </ul>
 */
public class VoteDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Vote3Choice voteInstructionForAgendaResolution;
	/**
	 * Indicates the vote instruction for the resolutions that are announced via
	 * the meeting agenda in advance of the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Vote3Choice
	 * Vote3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVotePerResolution
	 * VoteInstructionRequest.mmVotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteDetails3 VoteDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstrForAgndRsltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionForAgendaResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the vote instruction for the resolutions that are announced via the meeting agenda in advance of the meeting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteDetails2#mmVoteInstructionForAgendaResolution
	 * VoteDetails2.mmVoteInstructionForAgendaResolution}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVoteInstructionForAgendaResolution = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmVotePerResolution;
			componentContext_lazy = () -> VoteDetails3.mmObject();
			isDerived = false;
			xmlTag = "VoteInstrForAgndRsltn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionForAgendaResolution";
			definition = "Indicates the vote instruction for the resolutions that are announced via the meeting agenda in advance of the meeting.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteDetails2.mmVoteInstructionForAgendaResolution;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Vote3Choice.mmObject();
		}
	};
	protected VoteInstructionForMeetingResolution2Choice voteInstructionForMeetingResolution;
	/**
	 * Indicates the vote instruction for the resolutions that may arise at the
	 * meeting but were not previously provided in the agenda.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice
	 * VoteInstructionForMeetingResolution2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVoteForMeetingResolution
	 * VoteInstructionRequest.mmVoteForMeetingResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteDetails3 VoteDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstrForMtgRsltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionForMeetingResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the vote instruction for the resolutions that may arise at the meeting but were not previously provided in the agenda."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.VoteDetails2#mmVoteInstructionForMeetingResolution
	 * VoteDetails2.mmVoteInstructionForMeetingResolution}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVoteInstructionForMeetingResolution = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmVoteForMeetingResolution;
			componentContext_lazy = () -> VoteDetails3.mmObject();
			isDerived = false;
			xmlTag = "VoteInstrForMtgRsltn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionForMeetingResolution";
			definition = "Indicates the vote instruction for the resolutions that may arise at the meeting but were not previously provided in the agenda.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.VoteDetails2.mmVoteInstructionForMeetingResolution;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> VoteInstructionForMeetingResolution2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteDetails3.mmVoteInstructionForAgendaResolution, com.tools20022.repository.msg.VoteDetails3.mmVoteInstructionForMeetingResolution);
				trace_lazy = () -> VoteInstructionRequest.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "VoteDetails3";
				definition = "Specifies detailed voting instructions.";
				previousVersion_lazy = () -> VoteDetails2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Vote3Choice getVoteInstructionForAgendaResolution() {
		return voteInstructionForAgendaResolution;
	}

	public void setVoteInstructionForAgendaResolution(Vote3Choice voteInstructionForAgendaResolution) {
		this.voteInstructionForAgendaResolution = voteInstructionForAgendaResolution;
	}

	public VoteInstructionForMeetingResolution2Choice getVoteInstructionForMeetingResolution() {
		return voteInstructionForMeetingResolution;
	}

	public void setVoteInstructionForMeetingResolution(VoteInstructionForMeetingResolution2Choice voteInstructionForMeetingResolution) {
		this.voteInstructionForMeetingResolution = voteInstructionForMeetingResolution;
	}
}