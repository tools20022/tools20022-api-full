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
import com.tools20022.repository.area.seev.AgentCAElectionAdviceV01;
import com.tools20022.repository.codeset.ElectionType1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DocumentIdentification8;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the type of election advice and linked messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElectionAdviceFunction1#mmElectionType
 * ElectionAdviceFunction1.mmElectionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElectionAdviceFunction1#mmPreviousAgentCAElectionAdviceIdentification
 * ElectionAdviceFunction1.mmPreviousAgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElectionAdviceFunction1#mmAgentCAElectionStatusAdviceIdentification
 * ElectionAdviceFunction1.mmAgentCAElectionStatusAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ElectionAdviceFunction1#mmAgentCAElectionAmendmentRequestIdentification
 * ElectionAdviceFunction1.mmAgentCAElectionAmendmentRequestIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmElectionAdviceTypeAndLinkage
 * AgentCAElectionAdviceV01.mmElectionAdviceTypeAndLinkage}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintElectionTypeRule#forElectionAdviceFunction1
 * ConstraintElectionTypeRule.forElectionAdviceFunction1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ElectionAdviceFunction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the type of election advice and linked messages."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ElectionAdviceFunction1", propOrder = {"electionType", "previousAgentCAElectionAdviceIdentification", "agentCAElectionStatusAdviceIdentification", "agentCAElectionAmendmentRequestIdentification"})
public class ElectionAdviceFunction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ElctnTp", required = true)
	protected ElectionType1Code electionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionType1Code
	 * ElectionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ElectionAdviceFunction1
	 * ElectionAdviceFunction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of election advice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ElectionAdviceFunction1, ElectionType1Code> mmElectionType = new MMMessageAttribute<ElectionAdviceFunction1, ElectionType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ElectionAdviceFunction1.mmObject();
			isDerived = false;
			xmlTag = "ElctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionType";
			definition = "Type of election advice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ElectionType1Code.mmObject();
		}

		@Override
		public ElectionType1Code getValue(ElectionAdviceFunction1 obj) {
			return obj.getElectionType();
		}

		@Override
		public void setValue(ElectionAdviceFunction1 obj, ElectionType1Code value) {
			obj.setElectionType(value);
		}
	};
	@XmlElement(name = "PrvsAgtCAElctnAdvcId")
	protected DocumentIdentification8 previousAgentCAElectionAdviceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ElectionAdviceFunction1
	 * ElectionAdviceFunction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsAgtCAElctnAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousAgentCAElectionAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the previous Agent Corporate Action Election Advice that is being amended."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ElectionAdviceFunction1, Optional<DocumentIdentification8>> mmPreviousAgentCAElectionAdviceIdentification = new MMMessageAttribute<ElectionAdviceFunction1, Optional<DocumentIdentification8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ElectionAdviceFunction1.mmObject();
			isDerived = false;
			xmlTag = "PrvsAgtCAElctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousAgentCAElectionAdviceIdentification";
			definition = "Identification of the previous Agent Corporate Action Election Advice that is being amended.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public Optional<DocumentIdentification8> getValue(ElectionAdviceFunction1 obj) {
			return obj.getPreviousAgentCAElectionAdviceIdentification();
		}

		@Override
		public void setValue(ElectionAdviceFunction1 obj, Optional<DocumentIdentification8> value) {
			obj.setPreviousAgentCAElectionAdviceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtCAElctnStsAdvcId")
	protected DocumentIdentification8 agentCAElectionStatusAdviceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ElectionAdviceFunction1
	 * ElectionAdviceFunction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCAElctnStsAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAElectionStatusAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Agent Corporate Action Election Status Advice by which the issuer (agent) accepts the election amendment request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ElectionAdviceFunction1, Optional<DocumentIdentification8>> mmAgentCAElectionStatusAdviceIdentification = new MMMessageAttribute<ElectionAdviceFunction1, Optional<DocumentIdentification8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ElectionAdviceFunction1.mmObject();
			isDerived = false;
			xmlTag = "AgtCAElctnStsAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionStatusAdviceIdentification";
			definition = "Identification of the Agent Corporate Action Election Status Advice by which the issuer (agent) accepts the election amendment request.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public Optional<DocumentIdentification8> getValue(ElectionAdviceFunction1 obj) {
			return obj.getAgentCAElectionStatusAdviceIdentification();
		}

		@Override
		public void setValue(ElectionAdviceFunction1 obj, Optional<DocumentIdentification8> value) {
			obj.setAgentCAElectionStatusAdviceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AgtCAElctnAmdmntReqId")
	protected DocumentIdentification8 agentCAElectionAmendmentRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ElectionAdviceFunction1
	 * ElectionAdviceFunction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCAElctnAmdmntReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAElectionAmendmentRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Agent Corporate Action Election Amendment Request by which the CSD request the authorisation to amend an election."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ElectionAdviceFunction1, Optional<DocumentIdentification8>> mmAgentCAElectionAmendmentRequestIdentification = new MMMessageAttribute<ElectionAdviceFunction1, Optional<DocumentIdentification8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ElectionAdviceFunction1.mmObject();
			isDerived = false;
			xmlTag = "AgtCAElctnAmdmntReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAmendmentRequestIdentification";
			definition = "Identification of the Agent Corporate Action Election Amendment Request by which the CSD request the authorisation to amend an election.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public Optional<DocumentIdentification8> getValue(ElectionAdviceFunction1 obj) {
			return obj.getAgentCAElectionAmendmentRequestIdentification();
		}

		@Override
		public void setValue(ElectionAdviceFunction1 obj, Optional<DocumentIdentification8> value) {
			obj.setAgentCAElectionAmendmentRequestIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ElectionAdviceFunction1.mmElectionType, com.tools20022.repository.msg.ElectionAdviceFunction1.mmPreviousAgentCAElectionAdviceIdentification,
						com.tools20022.repository.msg.ElectionAdviceFunction1.mmAgentCAElectionStatusAdviceIdentification, com.tools20022.repository.msg.ElectionAdviceFunction1.mmAgentCAElectionAmendmentRequestIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAElectionAdviceV01.mmElectionAdviceTypeAndLinkage);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintElectionTypeRule.forElectionAdviceFunction1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ElectionAdviceFunction1";
				definition = "Provides information about the type of election advice and linked messages.";
			}
		});
		return mmObject_lazy.get();
	}

	public ElectionType1Code getElectionType() {
		return electionType;
	}

	public ElectionAdviceFunction1 setElectionType(ElectionType1Code electionType) {
		this.electionType = Objects.requireNonNull(electionType);
		return this;
	}

	public Optional<DocumentIdentification8> getPreviousAgentCAElectionAdviceIdentification() {
		return previousAgentCAElectionAdviceIdentification == null ? Optional.empty() : Optional.of(previousAgentCAElectionAdviceIdentification);
	}

	public ElectionAdviceFunction1 setPreviousAgentCAElectionAdviceIdentification(DocumentIdentification8 previousAgentCAElectionAdviceIdentification) {
		this.previousAgentCAElectionAdviceIdentification = previousAgentCAElectionAdviceIdentification;
		return this;
	}

	public Optional<DocumentIdentification8> getAgentCAElectionStatusAdviceIdentification() {
		return agentCAElectionStatusAdviceIdentification == null ? Optional.empty() : Optional.of(agentCAElectionStatusAdviceIdentification);
	}

	public ElectionAdviceFunction1 setAgentCAElectionStatusAdviceIdentification(DocumentIdentification8 agentCAElectionStatusAdviceIdentification) {
		this.agentCAElectionStatusAdviceIdentification = agentCAElectionStatusAdviceIdentification;
		return this;
	}

	public Optional<DocumentIdentification8> getAgentCAElectionAmendmentRequestIdentification() {
		return agentCAElectionAmendmentRequestIdentification == null ? Optional.empty() : Optional.of(agentCAElectionAmendmentRequestIdentification);
	}

	public ElectionAdviceFunction1 setAgentCAElectionAmendmentRequestIdentification(DocumentIdentification8 agentCAElectionAmendmentRequestIdentification) {
		this.agentCAElectionAmendmentRequestIdentification = agentCAElectionAmendmentRequestIdentification;
		return this;
	}
}