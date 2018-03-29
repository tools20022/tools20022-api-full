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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.choice.CorporateActionInformationStatus1Choice;
import com.tools20022.repository.msg.CorporateActionAdditionalInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by an issuer (or its agent) to a CSD to report the
 * status, or change in status, of an information advice.<br>
 * <b>Usage</b><br>
 * This message must be used in response to an Agent Corporate Action
 * Information Advice in the case of a rejection. However, it may also be used
 * to report other statuses.<br>
 * The information advice identification must be present to link this message to
 * the information advice for which the status is provided.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmIdentification
 * AgentCAInformationStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmAgentCAInformationAdviceIdentification
 * AgentCAInformationStatusAdviceV01.mmAgentCAInformationAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmCorporateActionAdditionalInformation
 * AgentCAInformationStatusAdviceV01.mmCorporateActionAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmInformationStatusDetails
 * AgentCAInformationStatusAdviceV01.mmInformationStatusDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion
 * IssuersAgentsCommunicationISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AgtCAInfStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.024.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAInformationStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an issuer (or its agent) to a CSD to report the status, or change in status, of an information advice.\r\nUsage\r\nThis message must be used in response to an Agent Corporate Action Information Advice in the case of a rejection. However, it may also be used to report other statuses.\r\nThe information advice identification must be present to link this message to the information advice for which the status is provided."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCAInformationStatusAdviceV01", propOrder = {"identification", "agentCAInformationAdviceIdentification", "corporateActionAdditionalInformation", "informationStatusDetails"})
public class AgentCAInformationStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification8 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the Sender to unambiguously identify the status advice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAInformationStatusAdviceV01, DocumentIdentification8> mmIdentification = new MMMessageBuildingBlock<AgentCAInformationStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the status advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAInformationStatusAdviceV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AgentCAInformationStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAInfAdvcId", required = true)
	protected DocumentIdentification8 agentCAInformationAdviceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCAInfAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAInformationAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Information Advice for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAInformationStatusAdviceV01, DocumentIdentification8> mmAgentCAInformationAdviceIdentification = new MMMessageBuildingBlock<AgentCAInformationStatusAdviceV01, DocumentIdentification8>() {
		{
			xmlTag = "AgtCAInfAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAInformationAdviceIdentification";
			definition = "Identification of the linked Agent CA Information Advice for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAInformationStatusAdviceV01 obj) {
			return obj.getAgentCAInformationAdviceIdentification();
		}

		@Override
		public void setValue(AgentCAInformationStatusAdviceV01 obj, DocumentIdentification8 value) {
			obj.setAgentCAInformationAdviceIdentification(value);
		}
	};
	@XmlElement(name = "CorpActnAddtlInf")
	protected CorporateActionAdditionalInformation1 corporateActionAdditionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
	 * CorporateActionAdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the corporate action such as the delivery details."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAInformationStatusAdviceV01, Optional<CorporateActionAdditionalInformation1>> mmCorporateActionAdditionalInformation = new MMMessageBuildingBlock<AgentCAInformationStatusAdviceV01, Optional<CorporateActionAdditionalInformation1>>() {
		{
			xmlTag = "CorpActnAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionAdditionalInformation";
			definition = "Additional information about the corporate action such as the delivery details.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
		}

		@Override
		public Optional<CorporateActionAdditionalInformation1> getValue(AgentCAInformationStatusAdviceV01 obj) {
			return obj.getCorporateActionAdditionalInformation();
		}

		@Override
		public void setValue(AgentCAInformationStatusAdviceV01 obj, Optional<CorporateActionAdditionalInformation1> value) {
			obj.setCorporateActionAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "InfStsDtls", required = true)
	protected CorporateActionInformationStatus1Choice informationStatusDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice
	 * CorporateActionInformationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfStsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationStatusDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the information advice sent by the CSD."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAInformationStatusAdviceV01, CorporateActionInformationStatus1Choice> mmInformationStatusDetails = new MMMessageBuildingBlock<AgentCAInformationStatusAdviceV01, CorporateActionInformationStatus1Choice>() {
		{
			xmlTag = "InfStsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationStatusDetails";
			definition = "Status of the information advice sent by the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionInformationStatus1Choice.mmObject();
		}

		@Override
		public CorporateActionInformationStatus1Choice getValue(AgentCAInformationStatusAdviceV01 obj) {
			return obj.getInformationStatusDetails();
		}

		@Override
		public void setValue(AgentCAInformationStatusAdviceV01 obj, CorporateActionInformationStatus1Choice value) {
			obj.setInformationStatusDetails(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAInformationStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to a CSD to report the status, or change in status, of an information advice.\r\nUsage\r\nThis message must be used in response to an Agent Corporate Action Information Advice in the case of a rejection. However, it may also be used to report other statuses.\r\nThe information advice identification must be present to link this message to the information advice for which the status is provided.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCAInfStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01.mmAgentCAInformationAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01.mmCorporateActionAdditionalInformation, com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01.mmInformationStatusDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "024";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAInformationStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCAInformationStatusAdviceV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DocumentIdentification8 getAgentCAInformationAdviceIdentification() {
		return agentCAInformationAdviceIdentification;
	}

	public AgentCAInformationStatusAdviceV01 setAgentCAInformationAdviceIdentification(DocumentIdentification8 agentCAInformationAdviceIdentification) {
		this.agentCAInformationAdviceIdentification = Objects.requireNonNull(agentCAInformationAdviceIdentification);
		return this;
	}

	public Optional<CorporateActionAdditionalInformation1> getCorporateActionAdditionalInformation() {
		return corporateActionAdditionalInformation == null ? Optional.empty() : Optional.of(corporateActionAdditionalInformation);
	}

	public AgentCAInformationStatusAdviceV01 setCorporateActionAdditionalInformation(CorporateActionAdditionalInformation1 corporateActionAdditionalInformation) {
		this.corporateActionAdditionalInformation = corporateActionAdditionalInformation;
		return this;
	}

	public CorporateActionInformationStatus1Choice getInformationStatusDetails() {
		return informationStatusDetails;
	}

	public AgentCAInformationStatusAdviceV01 setInformationStatusDetails(CorporateActionInformationStatus1Choice informationStatusDetails) {
		this.informationStatusDetails = Objects.requireNonNull(informationStatusDetails);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.024.001.01")
	static public class Document {
		@XmlElement(name = "AgtCAInfStsAdvc", required = true)
		public AgentCAInformationStatusAdviceV01 messageBody;
	}
}