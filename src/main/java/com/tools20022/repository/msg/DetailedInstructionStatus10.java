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
import com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV05;
import com.tools20022.repository.choice.PartyIdentification40Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.VoteInstructionRequest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Vote6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmInstructionIdentification
 * DetailedInstructionStatus10.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmAccountIdentification
 * DetailedInstructionStatus10.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmAccountOwner
 * DetailedInstructionStatus10.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmSubAccountIdentification
 * DetailedInstructionStatus10.mmSubAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmRightsHolder
 * DetailedInstructionStatus10.mmRightsHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmStandingInstruction
 * DetailedInstructionStatus10.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10#mmVotePerResolution
 * DetailedInstructionStatus10.mmVotePerResolution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV05#mmVoteInstructions
 * MeetingVoteExecutionConfirmationV05.mmVoteInstructions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline#forDetailedInstructionStatus10
 * ConstraintRightsHolderMultiplicty1Guideline.forDetailedInstructionStatus10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccount1Rule#forDetailedInstructionStatus10
 * ConstraintSubAccount1Rule.forDetailedInstructionStatus10}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DetailedInstructionStatus10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status applying to individual instructions of a MeetingInstruction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9
 * DetailedInstructionStatus9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DetailedInstructionStatus10", propOrder = {"instructionIdentification", "accountIdentification", "accountOwner", "subAccountIdentification", "rightsHolder", "standingInstruction", "votePerResolution"})
public class DetailedInstructionStatus10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrId", required = true)
	protected Max35Text instructionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10
	 * DetailedInstructionStatus10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the detailed instruction with an instruction message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#mmInstructionIdentification
	 * DetailedInstructionStatus9.mmInstructionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedInstructionStatus10, Max35Text> mmInstructionIdentification = new MMMessageAttribute<DetailedInstructionStatus10, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus10.mmObject();
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identifies the detailed instruction with an instruction message.";
			previousVersion_lazy = () -> DetailedInstructionStatus9.mmInstructionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DetailedInstructionStatus10 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(DetailedInstructionStatus10 obj, Max35Text value) {
			obj.setInstructionIdentification(value);
		}
	};
	@XmlElement(name = "AcctId")
	protected Max35Text accountIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10
	 * DetailedInstructionStatus10}</li>
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
	 * definition} = "Identifies the safekeeping account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#mmAccountIdentification
	 * DetailedInstructionStatus9.mmAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedInstructionStatus10, Optional<Max35Text>> mmAccountIdentification = new MMMessageAttribute<DetailedInstructionStatus10, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus10.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Identifies the safekeeping account.";
			previousVersion_lazy = () -> DetailedInstructionStatus9.mmAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DetailedInstructionStatus10 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(DetailedInstructionStatus10 obj, Optional<Max35Text> value) {
			obj.setAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification40Choice accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10
	 * DetailedInstructionStatus10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#mmAccountOwner
	 * DetailedInstructionStatus9.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedInstructionStatus10, Optional<PartyIdentification40Choice>> mmAccountOwner = new MMMessageAssociationEnd<DetailedInstructionStatus10, Optional<PartyIdentification40Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus10.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> DetailedInstructionStatus9.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification40Choice> getValue(DetailedInstructionStatus10 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(DetailedInstructionStatus10 obj, Optional<PartyIdentification40Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SubAcctId")
	protected Max35Text subAccountIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10
	 * DetailedInstructionStatus10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the subaccount of the safekeeping account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#mmSubAccountIdentification
	 * DetailedInstructionStatus9.mmSubAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedInstructionStatus10, Optional<Max35Text>> mmSubAccountIdentification = new MMMessageAttribute<DetailedInstructionStatus10, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus10.mmObject();
			isDerived = false;
			xmlTag = "SubAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountIdentification";
			definition = "Identifies the subaccount of the safekeeping account.";
			previousVersion_lazy = () -> DetailedInstructionStatus9.mmSubAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DetailedInstructionStatus10 obj) {
			return obj.getSubAccountIdentification();
		}

		@Override
		public void setValue(DetailedInstructionStatus10 obj, Optional<Max35Text> value) {
			obj.setSubAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RghtsHldr")
	protected List<PartyIdentification40Choice> rightsHolder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification40Choice
	 * PartyIdentification40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10
	 * DetailedInstructionStatus10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RghtsHldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the voting rights."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#mmRightsHolder
	 * DetailedInstructionStatus9.mmRightsHolder}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedInstructionStatus10, List<PartyIdentification40Choice>> mmRightsHolder = new MMMessageAssociationEnd<DetailedInstructionStatus10, List<PartyIdentification40Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus10.mmObject();
			isDerived = false;
			xmlTag = "RghtsHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsHolder";
			definition = "Owner of the voting rights.";
			previousVersion_lazy = () -> DetailedInstructionStatus9.mmRightsHolder;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification40Choice.mmObject();
		}

		@Override
		public List<PartyIdentification40Choice> getValue(DetailedInstructionStatus10 obj) {
			return obj.getRightsHolder();
		}

		@Override
		public void setValue(DetailedInstructionStatus10 obj, List<PartyIdentification40Choice> value) {
			obj.setRightsHolder(value);
		}
	};
	@XmlElement(name = "StgInstr", required = true)
	protected YesNoIndicator standingInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10
	 * DetailedInstructionStatus10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether standing instructions have been applied or not."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#mmStandingInstruction
	 * DetailedInstructionStatus9.mmStandingInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedInstructionStatus10, YesNoIndicator> mmStandingInstruction = new MMMessageAttribute<DetailedInstructionStatus10, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus10.mmObject();
			isDerived = false;
			xmlTag = "StgInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			definition = "Indicates whether standing instructions have been applied or not.";
			previousVersion_lazy = () -> DetailedInstructionStatus9.mmStandingInstruction;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(DetailedInstructionStatus10 obj) {
			return obj.getStandingInstruction();
		}

		@Override
		public void setValue(DetailedInstructionStatus10 obj, YesNoIndicator value) {
			obj.setStandingInstruction(value);
		}
	};
	@XmlElement(name = "VotePerRsltn")
	protected List<Vote6> votePerResolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Vote6 Vote6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVotePerResolution
	 * VoteInstructionRequest.mmVotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus10
	 * DetailedInstructionStatus10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VotePerRsltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotePerResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the vote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus9#mmVotePerResolution
	 * DetailedInstructionStatus9.mmVotePerResolution}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedInstructionStatus10, List<Vote6>> mmVotePerResolution = new MMMessageAssociationEnd<DetailedInstructionStatus10, List<Vote6>>() {
		{
			businessElementTrace_lazy = () -> VoteInstructionRequest.mmVotePerResolution;
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus10.mmObject();
			isDerived = false;
			xmlTag = "VotePerRsltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotePerResolution";
			definition = "Details of the vote.";
			previousVersion_lazy = () -> DetailedInstructionStatus9.mmVotePerResolution;
			maxOccurs = 1000;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Vote6.mmObject();
		}

		@Override
		public List<Vote6> getValue(DetailedInstructionStatus10 obj) {
			return obj.getVotePerResolution();
		}

		@Override
		public void setValue(DetailedInstructionStatus10 obj, List<Vote6> value) {
			obj.setVotePerResolution(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DetailedInstructionStatus10.mmInstructionIdentification, com.tools20022.repository.msg.DetailedInstructionStatus10.mmAccountIdentification,
						com.tools20022.repository.msg.DetailedInstructionStatus10.mmAccountOwner, com.tools20022.repository.msg.DetailedInstructionStatus10.mmSubAccountIdentification,
						com.tools20022.repository.msg.DetailedInstructionStatus10.mmRightsHolder, com.tools20022.repository.msg.DetailedInstructionStatus10.mmStandingInstruction,
						com.tools20022.repository.msg.DetailedInstructionStatus10.mmVotePerResolution);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingVoteExecutionConfirmationV05.mmVoteInstructions);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRightsHolderMultiplicty1Guideline.forDetailedInstructionStatus10,
						com.tools20022.repository.constraints.ConstraintSubAccount1Rule.forDetailedInstructionStatus10);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DetailedInstructionStatus10";
				definition = "Status applying to individual instructions of a MeetingInstruction.";
				previousVersion_lazy = () -> DetailedInstructionStatus9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getInstructionIdentification() {
		return instructionIdentification;
	}

	public DetailedInstructionStatus10 setInstructionIdentification(Max35Text instructionIdentification) {
		this.instructionIdentification = Objects.requireNonNull(instructionIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public DetailedInstructionStatus10 setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<PartyIdentification40Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public DetailedInstructionStatus10 setAccountOwner(PartyIdentification40Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<Max35Text> getSubAccountIdentification() {
		return subAccountIdentification == null ? Optional.empty() : Optional.of(subAccountIdentification);
	}

	public DetailedInstructionStatus10 setSubAccountIdentification(Max35Text subAccountIdentification) {
		this.subAccountIdentification = subAccountIdentification;
		return this;
	}

	public List<PartyIdentification40Choice> getRightsHolder() {
		return rightsHolder == null ? rightsHolder = new ArrayList<>() : rightsHolder;
	}

	public DetailedInstructionStatus10 setRightsHolder(List<PartyIdentification40Choice> rightsHolder) {
		this.rightsHolder = Objects.requireNonNull(rightsHolder);
		return this;
	}

	public YesNoIndicator getStandingInstruction() {
		return standingInstruction;
	}

	public DetailedInstructionStatus10 setStandingInstruction(YesNoIndicator standingInstruction) {
		this.standingInstruction = Objects.requireNonNull(standingInstruction);
		return this;
	}

	public List<Vote6> getVotePerResolution() {
		return votePerResolution == null ? votePerResolution = new ArrayList<>() : votePerResolution;
	}

	public DetailedInstructionStatus10 setVotePerResolution(List<Vote6> votePerResolution) {
		this.votePerResolution = Objects.requireNonNull(votePerResolution);
		return this;
	}
}