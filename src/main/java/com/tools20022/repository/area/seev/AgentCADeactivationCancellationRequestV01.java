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
import com.tools20022.repository.msg.CorporateActionDeactivationInstruction1;
import com.tools20022.repository.msg.CorporateActionInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by an issuer (or its agent) to the CSD to request the
 * cancellation of a previously sent corporate action deactivation instruction.<br>
 * <b>Usage</b><br>
 * This message is used to request the cancellation of a pending deactivation
 * instruction. The cancellation must apply to exactly the same level as the
 * original instruction, ie to the entire CA event or to an option as per the
 * original instruction.<br>
 * This message must be sent before the deactivation execution date.<br>
 * In case a corporate action or option is already deactivated, this message can
 * not be used to reactivate the corporate action entire event or option; the
 * notification advice message must be used to reactivate a corporate action or
 * option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01#mmIdentification
 * AgentCADeactivationCancellationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01#mmAgentCADeactivationInstructionIdentification
 * AgentCADeactivationCancellationRequestV01.
 * mmAgentCADeactivationInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01#mmCorporateActionGeneralInformation
 * AgentCADeactivationCancellationRequestV01.mmCorporateActionGeneralInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01#mmDeactivationInstructionDetails
 * AgentCADeactivationCancellationRequestV01.mmDeactivationInstructionDetails}</li>
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
 * xmlTag} = "AgtCADeactvtnCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.029.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCADeactivationCancellationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to request the cancellation of a previously sent corporate action deactivation instruction.\r\nUsage\r\nThis message is used to request the cancellation of a pending deactivation instruction. The cancellation must apply to exactly the same level as the original instruction, ie to the entire CA event or to an option as per the original instruction.\r\nThis message must be sent before the deactivation execution date.\r\nIn case a corporate action or option is already deactivated, this message can not be used to reactivate the corporate action entire event or option; the notification advice message must be used to reactivate a corporate action or option."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCADeactivationCancellationRequestV01", propOrder = {"identification", "agentCADeactivationInstructionIdentification", "corporateActionGeneralInformation", "deactivationInstructionDetails"})
public class AgentCADeactivationCancellationRequestV01 {

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
	 * "Identification assigned by the Sender to unambiguously identify the cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCADeactivationCancellationRequestV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AgtCADeactvtnInstrId", required = true)
	protected DocumentIdentification8 agentCADeactivationInstructionIdentification;
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
	 * xmlTag} = "AgtCADeactvtnInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCADeactivationInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Agent CA Deactivation Instruction to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCADeactivationInstructionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCADeactvtnInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCADeactivationInstructionIdentification";
			definition = "Identification of the Agent CA Deactivation Instruction to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCADeactivationCancellationRequestV01.class.getMethod("getAgentCADeactivationInstructionIdentification", new Class[]{});
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
				return AgentCADeactivationCancellationRequestV01.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "DeactvtnInstrDtls")
	protected CorporateActionDeactivationInstruction1 deactivationInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstruction1
	 * CorporateActionDeactivationInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeactvtnInstrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the deactivation instruction to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDeactivationInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "DeactvtnInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationInstructionDetails";
			definition = "Details of the deactivation instruction to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionDeactivationInstruction1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCADeactivationCancellationRequestV01.class.getMethod("getDeactivationInstructionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCADeactivationCancellationRequestV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to request the cancellation of a previously sent corporate action deactivation instruction.\r\nUsage\r\nThis message is used to request the cancellation of a pending deactivation instruction. The cancellation must apply to exactly the same level as the original instruction, ie to the entire CA event or to an option as per the original instruction.\r\nThis message must be sent before the deactivation execution date.\r\nIn case a corporate action or option is already deactivated, this message can not be used to reactivate the corporate action entire event or option; the notification advice message must be used to reactivate a corporate action or option.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCADeactvtnCxlReq";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01.mmAgentCADeactivationInstructionIdentification,
						com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01.mmDeactivationInstructionDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "029";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCADeactivationCancellationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCADeactivationCancellationRequestV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DocumentIdentification8 getAgentCADeactivationInstructionIdentification() {
		return agentCADeactivationInstructionIdentification;
	}

	public AgentCADeactivationCancellationRequestV01 setAgentCADeactivationInstructionIdentification(DocumentIdentification8 agentCADeactivationInstructionIdentification) {
		this.agentCADeactivationInstructionIdentification = Objects.requireNonNull(agentCADeactivationInstructionIdentification);
		return this;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public AgentCADeactivationCancellationRequestV01 setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public Optional<CorporateActionDeactivationInstruction1> getDeactivationInstructionDetails() {
		return deactivationInstructionDetails == null ? Optional.empty() : Optional.of(deactivationInstructionDetails);
	}

	public AgentCADeactivationCancellationRequestV01 setDeactivationInstructionDetails(CorporateActionDeactivationInstruction1 deactivationInstructionDetails) {
		this.deactivationInstructionDetails = deactivationInstructionDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.029.001.01")
	static public class Document {
		@XmlElement(name = "AgtCADeactvtnCxlReq", required = true)
		public AgentCADeactivationCancellationRequestV01 messageBody;
	}
}