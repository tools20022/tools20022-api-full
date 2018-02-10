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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.VoteInstructionAtMeeting1Code;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.VoteInstructionRequest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NameAndAddress9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Vote instruction applying to resolutions added during the meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice#mmVoteIndication
 * VoteInstructionForMeetingResolution1Choice.mmVoteIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice#mmShareholder
 * VoteInstructionForMeetingResolution1Choice.mmShareholder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
 * VoteInstructionRequest}</li>
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
 * "VoteInstructionForMeetingResolution1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Vote instruction applying to resolutions added during the meeting."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice
 * VoteInstructionForMeetingResolution2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "VoteInstructionForMeetingResolution1Choice", propOrder = {"voteIndication", "shareholder"})
public class VoteInstructionForMeetingResolution1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "VoteIndctn", required = true)
	protected VoteInstructionAtMeeting1Code voteIndication;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice
	 * VoteInstructionForMeetingResolution1Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice#mmVoteIndication
	 * VoteInstructionForMeetingResolution2Choice.mmVoteIndication}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoteIndication = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> VoteInstructionRequest.mmVoteForMeetingResolution;
			componentContext_lazy = () -> com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice.mmObject();
			isDerived = false;
			xmlTag = "VoteIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteIndication";
			definition = "Specifies the vote recommendation for resolutions added during the meeting.";
			nextVersions_lazy = () -> Arrays.asList(VoteInstructionForMeetingResolution2Choice.mmVoteIndication);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VoteInstructionAtMeeting1Code.mmObject();
		}
	};
	@XmlElement(name = "Shrhldr", required = true)
	protected NameAndAddress9 shareholder;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice
	 * VoteInstructionForMeetingResolution1Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.VoteInstructionForMeetingResolution2Choice#mmShareholder
	 * VoteInstructionForMeetingResolution2Choice.mmShareholder}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShareholder = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice.mmObject();
			isDerived = false;
			xmlTag = "Shrhldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shareholder";
			definition = "Specifies the name and address of the shareholder to whom the rights to vote are transferred for resolutions added during the meeting.";
			nextVersions_lazy = () -> Arrays.asList(VoteInstructionForMeetingResolution2Choice.mmShareholder);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NameAndAddress9.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice.mmVoteIndication,
						com.tools20022.repository.choice.VoteInstructionForMeetingResolution1Choice.mmShareholder);
				trace_lazy = () -> VoteInstructionRequest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "VoteInstructionForMeetingResolution1Choice";
				definition = "Vote instruction applying to resolutions added during the meeting.";
				nextVersions_lazy = () -> Arrays.asList(VoteInstructionForMeetingResolution2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public VoteInstructionAtMeeting1Code getVoteIndication() {
		return voteIndication;
	}

	public VoteInstructionForMeetingResolution1Choice setVoteIndication(VoteInstructionAtMeeting1Code voteIndication) {
		this.voteIndication = Objects.requireNonNull(voteIndication);
		return this;
	}

	public NameAndAddress9 getShareholder() {
		return shareholder;
	}

	public VoteInstructionForMeetingResolution1Choice setShareholder(NameAndAddress9 shareholder) {
		this.shareholder = Objects.requireNonNull(shareholder);
		return this;
	}
}