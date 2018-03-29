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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06;
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV06;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV07;
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.codeset.Referred1Code;
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
 * Provides the placement agent identification for a hedge fund if the investor
 * was referred by one.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReferredAgent2#mmReferred
 * ReferredAgent2.mmReferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReferredAgent2#mmReferredPlacementAgent
 * ReferredAgent2.mmReferredPlacementAgent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmPlacement
 * AccountOpeningInstructionV06.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmPlacement
 * AccountDetailsConfirmationV06.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmPlacement
 * AccountDetailsConfirmationV07.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmPlacement
 * AccountOpeningInstructionV07.mmPlacement}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintReferredPlacementAgentRule#forReferredAgent2
 * ConstraintReferredPlacementAgentRule.forReferredAgent2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReferredAgent2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the placement agent identification for a hedge fund if the investor was referred by one."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ReferredAgent1
 * ReferredAgent1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReferredAgent2", propOrder = {"referred", "referredPlacementAgent"})
public class ReferredAgent2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rfrd", required = true)
	protected Referred1Code referred;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Referred1Code
	 * Referred1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReferredAgent2 ReferredAgent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rfrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Referred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the investor was referred by a placement agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReferredAgent1#mmReferred
	 * ReferredAgent1.mmReferred}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReferredAgent2, Referred1Code> mmReferred = new MMMessageAttribute<ReferredAgent2, Referred1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReferredAgent2.mmObject();
			isDerived = false;
			xmlTag = "Rfrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Referred";
			definition = "Indicates if the investor was referred by a placement agent.";
			previousVersion_lazy = () -> ReferredAgent1.mmReferred;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Referred1Code.mmObject();
		}

		@Override
		public Referred1Code getValue(ReferredAgent2 obj) {
			return obj.getReferred();
		}

		@Override
		public void setValue(ReferredAgent2 obj, Referred1Code value) {
			obj.setReferred(value);
		}
	};
	@XmlElement(name = "RfrdPlcmntAgt")
	protected PartyIdentification70Choice referredPlacementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReferredAgent2 ReferredAgent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdPlcmntAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredPlacementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Placement agent that referred the investor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReferredAgent1#mmReferredPlacementAgent
	 * ReferredAgent1.mmReferredPlacementAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReferredAgent2, Optional<PartyIdentification70Choice>> mmReferredPlacementAgent = new MMMessageAssociationEnd<ReferredAgent2, Optional<PartyIdentification70Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReferredAgent2.mmObject();
			isDerived = false;
			xmlTag = "RfrdPlcmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredPlacementAgent";
			definition = "Placement agent that referred the investor.";
			previousVersion_lazy = () -> ReferredAgent1.mmReferredPlacementAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification70Choice> getValue(ReferredAgent2 obj) {
			return obj.getReferredPlacementAgent();
		}

		@Override
		public void setValue(ReferredAgent2 obj, Optional<PartyIdentification70Choice> value) {
			obj.setReferredPlacementAgent(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReferredAgent2.mmReferred, com.tools20022.repository.msg.ReferredAgent2.mmReferredPlacementAgent);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountOpeningInstructionV06.mmPlacement, AccountDetailsConfirmationV06.mmPlacement, AccountDetailsConfirmationV07.mmPlacement, AccountOpeningInstructionV07.mmPlacement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReferredPlacementAgentRule.forReferredAgent2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReferredAgent2";
				definition = "Provides the placement agent identification for a hedge fund if the investor was referred by one.";
				previousVersion_lazy = () -> ReferredAgent1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Referred1Code getReferred() {
		return referred;
	}

	public ReferredAgent2 setReferred(Referred1Code referred) {
		this.referred = Objects.requireNonNull(referred);
		return this;
	}

	public Optional<PartyIdentification70Choice> getReferredPlacementAgent() {
		return referredPlacementAgent == null ? Optional.empty() : Optional.of(referredPlacementAgent);
	}

	public ReferredAgent2 setReferredPlacementAgent(PartyIdentification70Choice referredPlacementAgent) {
		this.referredPlacementAgent = referredPlacementAgent;
		return this;
	}
}