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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.codeset.VoteInstructionAtMeeting1Code;
import com.tools20022.repository.entity.VoteInstructionRequest;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Vote instruction applying to resolutions added during the meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1#mmVoteIndicationOrShareholderRule
 * VoteInstructionForMeetingResolution1.mmVoteIndicationOrShareholderRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1#mmVoteIndication
 * VoteInstructionForMeetingResolution1.mmVoteIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1#mmShareholder
 * VoteInstructionForMeetingResolution1.mmShareholder}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VoteInstructionForMeetingResolution1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Vote instruction applying to resolutions added during the meeting."</li>
 * </ul>
 */
public class VoteInstructionForMeetingResolution1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected VoteInstructionAtMeeting1Code voteIndication;
	/**
	 * Specifies the vote recommendation for resolutions added during the
	 * meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstructionAtMeeting1Code
	 * VoteInstructionAtMeeting1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVoteForMeetingResolution
	 * VoteInstructionRequest.mmVoteForMeetingResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1
	 * VoteInstructionForMeetingResolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the vote recommendation for resolutions added during the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteIndication = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.VoteInstructionRequest.mmVoteForMeetingResolution;
			componentContext_lazy = () -> VoteInstructionForMeetingResolution1.mmObject();
			isDerived = false;
			xmlTag = "VoteIndctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteIndication";
			definition = "Specifies the vote recommendation for resolutions added during the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionAtMeeting1Code.mmObject();
		}
	};
	protected NameAndAddress9 shareholder;
	/**
	 * Specifies the name and address of the shareholder to whom the rights to
	 * vote are transferred for resolutions added during the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress9
	 * NameAndAddress9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1
	 * VoteInstructionForMeetingResolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Shrhldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shareholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the name and address of the shareholder to whom the rights to vote are transferred for resolutions added during the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShareholder = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> VoteInstructionForMeetingResolution1.mmObject();
			isDerived = false;
			xmlTag = "Shrhldr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shareholder";
			definition = "Specifies the name and address of the shareholder to whom the rights to vote are transferred for resolutions added during the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress9.mmObject();
		}
	};
	/**
	 * Either VoteIndication or Shareholder must be present but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1#mmVoteIndication
	 * VoteInstructionForMeetingResolution1.mmVoteIndication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1#mmShareholder
	 * VoteInstructionForMeetingResolution1.mmShareholder}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.VoteInstructionForMeetingResolution1
	 * VoteInstructionForMeetingResolution1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteIndicationOrShareholderRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either VoteIndication or Shareholder must be present but not both."</li>
	 * </ul>
	 */
	public static final MMXor mmVoteIndicationOrShareholderRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteIndicationOrShareholderRule";
			definition = "Either VoteIndication or Shareholder must be present but not both.";
			messageComponent_lazy = () -> VoteInstructionForMeetingResolution1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteInstructionForMeetingResolution1.mmVoteIndication, com.tools20022.repository.msg.VoteInstructionForMeetingResolution1.mmShareholder);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteInstructionForMeetingResolution1.mmVoteIndication, com.tools20022.repository.msg.VoteInstructionForMeetingResolution1.mmShareholder);
				trace_lazy = () -> VoteInstructionRequest.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "VoteInstructionForMeetingResolution1";
				definition = "Vote instruction applying to resolutions added during the meeting.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VoteInstructionForMeetingResolution1.mmVoteIndicationOrShareholderRule);
			}
		});
		return mmObject_lazy.get();
	}

	public VoteInstructionAtMeeting1Code getVoteIndication() {
		return voteIndication;
	}

	public void setVoteIndication(VoteInstructionAtMeeting1Code voteIndication) {
		this.voteIndication = voteIndication;
	}

	public NameAndAddress9 getShareholder() {
		return shareholder;
	}

	public void setShareholder(com.tools20022.repository.msg.NameAndAddress9 shareholder) {
		this.shareholder = shareholder;
	}
}