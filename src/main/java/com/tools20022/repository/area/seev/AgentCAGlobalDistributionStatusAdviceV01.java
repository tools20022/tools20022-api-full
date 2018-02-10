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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.msg.CorporateActionInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msg.GlobalDistributionStatus1;
import com.tools20022.repository.msg.IndividualMovementStatus1;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by an issuer (or its agent) to the CSD to
 * authorise/prohibit the CSD to process the entitlement movements.<br>
 * <b>Usage</b><br>
 * This message is used to authorise/prohibit the CSD to process the movements
 * requested in the Global Distribution Authorisation Request message.<br>
 * Once the amendment request has been accepted by the issuer (or its agent),
 * the CSD will process any resource movement and send an Agent Corporate Action
 * Election Advice message with the function, option change, to confirm that the
 * amendment has been booked at the CSD.<br>
 * The issuer (or its agent) can provide the status in 2 different ways:<br>
 * - Provide a global status, in which case the building block Global Movement
 * Status must be present; or<br>
 * - Provide a status by individual movements, in which case, the building block
 * Individual Movement Status must be present. An individual movement cannot be
 * rejected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#GlobalMovementStatusOrIndividualMovementStatusRule
 * AgentCAGlobalDistributionStatusAdviceV01.
 * GlobalMovementStatusOrIndividualMovementStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmIdentification
 * AgentCAGlobalDistributionStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmAgentCAGlobalDistributionAuthorisationRequestIdentification
 * AgentCAGlobalDistributionStatusAdviceV01.
 * mmAgentCAGlobalDistributionAuthorisationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmCorporateActionGeneralInformation
 * AgentCAGlobalDistributionStatusAdviceV01.mmCorporateActionGeneralInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmGlobalMovementStatus
 * AgentCAGlobalDistributionStatusAdviceV01.mmGlobalMovementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmIndividualMovementStatus
 * AgentCAGlobalDistributionStatusAdviceV01.mmIndividualMovementStatus}</li>
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
 * xmlTag} = "AgtCAGblDstrbtnStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.018.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAGlobalDistributionStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to authorise/prohibit the CSD to process the entitlement movements.\r\nUsage\r\nThis message is used to authorise/prohibit the CSD to process the movements requested in the Global Distribution Authorisation Request message.\r\nOnce the amendment request has been accepted by the issuer (or its agent), the CSD will process any resource movement and send an Agent Corporate Action Election Advice message with the function, option change, to confirm that the amendment has been booked at the CSD.\r\nThe issuer (or its agent) can provide the status in 2 different ways:\r\n- Provide a global status, in which case the building block Global Movement Status must be present; or\r\n- Provide a status by individual movements, in which case, the building block Individual Movement Status must be present. An individual movement cannot be rejected."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCAGlobalDistributionStatusAdviceV01", propOrder = {"identification", "agentCAGlobalDistributionAuthorisationRequestIdentification", "corporateActionGeneralInformation", "globalMovementStatus",
		"individualMovementStatus"})
public class AgentCAGlobalDistributionStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either GlobalMovementStatus or IndividualMovementStatus must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01
	 * AgentCAGlobalDistributionStatusAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmGlobalMovementStatus
	 * AgentCAGlobalDistributionStatusAdviceV01.mmGlobalMovementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01#mmIndividualMovementStatus
	 * AgentCAGlobalDistributionStatusAdviceV01.mmIndividualMovementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalMovementStatusOrIndividualMovementStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either GlobalMovementStatus or IndividualMovementStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor GlobalMovementStatusOrIndividualMovementStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalMovementStatusOrIndividualMovementStatusRule";
			definition = "Either GlobalMovementStatus or IndividualMovementStatus must be present.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.mmGlobalMovementStatus,
					com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.mmIndividualMovementStatus);
		}
	};
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
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the status advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAGlobalDistributionStatusAdviceV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AgtCAGblDstrbtnAuthstnReqId", required = true)
	protected DocumentIdentification8 agentCAGlobalDistributionAuthorisationRequestIdentification;
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
	 * xmlTag} = "AgtCAGblDstrbtnAuthstnReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAGlobalDistributionAuthorisationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Global Distribution Authorisation Request for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCAGlobalDistributionAuthorisationRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAGblDstrbtnAuthstnReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAGlobalDistributionAuthorisationRequestIdentification";
			definition = "Identification of the linked Agent CA Global Distribution Authorisation Request for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAGlobalDistributionStatusAdviceV01.class.getMethod("getAgentCAGlobalDistributionAuthorisationRequestIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionInformation1 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAGlobalDistributionStatusAdviceV01.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "GblMvmntSts", required = true)
	protected GlobalDistributionStatus1 globalMovementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionStatus1
	 * GlobalDistributionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GblMvmntSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalMovementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the status of the global movement."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGlobalMovementStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "GblMvmntSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalMovementStatus";
			definition = "Provides information about the status of the global movement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GlobalDistributionStatus1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAGlobalDistributionStatusAdviceV01.class.getMethod("getGlobalMovementStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "IndvMvmntSts", required = true)
	protected List<IndividualMovementStatus1> individualMovementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualMovementStatus1
	 * IndividualMovementStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvMvmntSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualMovementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the status of an individual movement."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIndividualMovementStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "IndvMvmntSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualMovementStatus";
			definition = "Provides information about the status of an individual movement.";
			minOccurs = 1;
			complexType_lazy = () -> IndividualMovementStatus1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAGlobalDistributionStatusAdviceV01.class.getMethod("getIndividualMovementStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAGlobalDistributionStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to authorise/prohibit the CSD to process the entitlement movements.\r\nUsage\r\nThis message is used to authorise/prohibit the CSD to process the movements requested in the Global Distribution Authorisation Request message.\r\nOnce the amendment request has been accepted by the issuer (or its agent), the CSD will process any resource movement and send an Agent Corporate Action Election Advice message with the function, option change, to confirm that the amendment has been booked at the CSD.\r\nThe issuer (or its agent) can provide the status in 2 different ways:\r\n- Provide a global status, in which case the building block Global Movement Status must be present; or\r\n- Provide a status by individual movements, in which case, the building block Individual Movement Status must be present. An individual movement cannot be rejected.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.GlobalMovementStatusOrIndividualMovementStatusRule);
				rootElement = "Document";
				xmlTag = "AgtCAGblDstrbtnStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.mmAgentCAGlobalDistributionAuthorisationRequestIdentification,
						com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.mmCorporateActionGeneralInformation, com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.mmGlobalMovementStatus,
						com.tools20022.repository.area.seev.AgentCAGlobalDistributionStatusAdviceV01.mmIndividualMovementStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "018";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAGlobalDistributionStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCAGlobalDistributionStatusAdviceV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DocumentIdentification8 getAgentCAGlobalDistributionAuthorisationRequestIdentification() {
		return agentCAGlobalDistributionAuthorisationRequestIdentification;
	}

	public AgentCAGlobalDistributionStatusAdviceV01 setAgentCAGlobalDistributionAuthorisationRequestIdentification(DocumentIdentification8 agentCAGlobalDistributionAuthorisationRequestIdentification) {
		this.agentCAGlobalDistributionAuthorisationRequestIdentification = Objects.requireNonNull(agentCAGlobalDistributionAuthorisationRequestIdentification);
		return this;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public AgentCAGlobalDistributionStatusAdviceV01 setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public GlobalDistributionStatus1 getGlobalMovementStatus() {
		return globalMovementStatus;
	}

	public AgentCAGlobalDistributionStatusAdviceV01 setGlobalMovementStatus(GlobalDistributionStatus1 globalMovementStatus) {
		this.globalMovementStatus = Objects.requireNonNull(globalMovementStatus);
		return this;
	}

	public List<IndividualMovementStatus1> getIndividualMovementStatus() {
		return individualMovementStatus == null ? individualMovementStatus = new ArrayList<>() : individualMovementStatus;
	}

	public AgentCAGlobalDistributionStatusAdviceV01 setIndividualMovementStatus(List<IndividualMovementStatus1> individualMovementStatus) {
		this.individualMovementStatus = Objects.requireNonNull(individualMovementStatus);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.018.001.01")
	static public class Document {
		@XmlElement(name = "AgtCAGblDstrbtnStsAdvc", required = true)
		public AgentCAGlobalDistributionStatusAdviceV01 messageBody;
	}
}