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
import com.tools20022.repository.msg.CorporateActionInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msg.GlobalDistributionRequest1;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to an issuer (or its agent) to request the
 * authorisation to process the entitlement movements (cash and/or securities)
 * calculated by the CSD for a given corporate action entire event, a given
 * corporate action option and optionally a given resource.<br>
 * This message can also be sent to request the issuer (or its agent) to make
 * available / deliver the relevant resources to the CSD.<br>
 * <b>Usage</b><br>
 * This message is used to request the authorisation to process the entitlement
 * movements calculated by the CSD for a given corporate action event and
 * option. An Agent Corporate Action Global Distribution Authorisation Request
 * message must be sent for each option and if several resources are associated
 * to an option, an Agent Corporate Action Global Distribution Authorisation
 * Request message can be sent for each resource.<br>
 * This message can also be used to pre-advise a global distribution
 * authorisation request, in which case the value of the field pre-advice
 * indicator must be set to yes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.017.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion
 * IssuersAgentsCommunicationISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AgtCAGblDstrbtnAuthstnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionAuthorisationRequestV01#mmIdentification
 * AgentCAGlobalDistributionAuthorisationRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionAuthorisationRequestV01#mmCorporateActionGeneralInformation
 * AgentCAGlobalDistributionAuthorisationRequestV01.
 * mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAGlobalDistributionAuthorisationRequestV01#mmGlobalDistributionDetails
 * AgentCAGlobalDistributionAuthorisationRequestV01.mmGlobalDistributionDetails}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAGlobalDistributionAuthorisationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to request the authorisation to process the entitlement movements (cash and/or securities) calculated by the CSD for a given corporate action entire event, a given corporate action option and optionally a given resource.\r\nThis message can also be sent to request the issuer (or its agent) to make available / deliver the relevant resources to the CSD.\r\nUsage\r\nThis message is used to request the authorisation to process the entitlement movements calculated by the CSD for a given corporate action event and option. An Agent Corporate Action Global Distribution Authorisation Request message must be sent for each option and if several resources are associated to an option, an Agent Corporate Action Global Distribution Authorisation Request message can be sent for each resource.\r\nThis message can also be used to pre-advise a global distribution authorisation request, in which case the value of the field pre-advice indicator must be set to yes."
 * </li>
 * </ul>
 */
public class AgentCAGlobalDistributionAuthorisationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification8 identification;
	/**
	 * Identification assigned by the Sender to unambiguously identify the
	 * request.
	 * <p>
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
	 * "Identification assigned by the Sender to unambiguously identify the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected CorporateActionInformation1 corporateActionGeneralInformation;
	/**
	 * General information about the corporate action event.
	 * <p>
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
	};
	protected GlobalDistributionRequest1 globalDistributionDetails;
	/**
	 * Provides detailed information about the global distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GlobalDistributionRequest1
	 * GlobalDistributionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GblDstrbtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalDistributionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides detailed information about the global distribution."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGlobalDistributionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "GblDstrbtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalDistributionDetails";
			definition = "Provides detailed information about the global distribution.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GlobalDistributionRequest1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAGlobalDistributionAuthorisationRequestV01";
				definition = "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to request the authorisation to process the entitlement movements (cash and/or securities) calculated by the CSD for a given corporate action entire event, a given corporate action option and optionally a given resource.\r\nThis message can also be sent to request the issuer (or its agent) to make available / deliver the relevant resources to the CSD.\r\nUsage\r\nThis message is used to request the authorisation to process the entitlement movements calculated by the CSD for a given corporate action event and option. An Agent Corporate Action Global Distribution Authorisation Request message must be sent for each option and if several resources are associated to an option, an Agent Corporate Action Global Distribution Authorisation Request message can be sent for each resource.\r\nThis message can also be used to pre-advise a global distribution authorisation request, in which case the value of the field pre-advice indicator must be set to yes.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCAGblDstrbtnAuthstnReq";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAGlobalDistributionAuthorisationRequestV01.mmIdentification, AgentCAGlobalDistributionAuthorisationRequestV01.mmCorporateActionGeneralInformation,
						AgentCAGlobalDistributionAuthorisationRequestV01.mmGlobalDistributionDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "017";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification8 identification) {
		this.identification = identification;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	public GlobalDistributionRequest1 getGlobalDistributionDetails() {
		return globalDistributionDetails;
	}

	public void setGlobalDistributionDetails(GlobalDistributionRequest1 globalDistributionDetails) {
		this.globalDistributionDetails = globalDistributionDetails;
	}
}