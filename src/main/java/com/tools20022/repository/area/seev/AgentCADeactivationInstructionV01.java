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
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by an issuer (or its agent) to the CSD to instruct the
 * deactivation of a corporate action event or to deactivate one or more
 * specific options of the corporate action. As of the deactivation date, the
 * CSD is allowed to reject any related election instruction received from
 * clients.<br>
 * <b>Usage</b><br>
 * Deactivation refers only to the empowerment of the CSD to reject further
 * elections. To withdraw an event, the Agent Corporate Action Notification
 * Advice message must be used.<br>
 * This message can be used to deactivate all the options of a corporate action
 * event, in which case, no option should be mentioned in the message.<br>
 * This message can also be used to deactivate one or more specific corporate
 * action options, in which case, the option type and option number must be
 * present.<br>
 * This message can only be used when the deactivation date is after the market
 * deadline. Before the market deadline, an updated notification advice message
 * must be sent with option availability status: inactive or cancelled.<br>
 * An un-effected deactivation (pending deactivation date/time) can be cancelled
 * with an Agent Corporate Action Deactivation Cancellation Request.<br>
 * The amendment of a deactivation is effected by cancel/replace mechanism.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * xmlTag} = "AgtCADeactvtnInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01#mmIdentification
 * AgentCADeactivationInstructionV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01#mmCorporateActionGeneralInformation
 * AgentCADeactivationInstructionV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01#mmDeactivationDetails
 * AgentCADeactivationInstructionV01.mmDeactivationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.028.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCADeactivationInstructionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to instruct the deactivation of a corporate action event or to deactivate one or more specific options of the corporate action. As of the deactivation date, the CSD is allowed to reject any related election instruction received from clients.\r\nUsage\r\nDeactivation refers only to the empowerment of the CSD to reject further elections. To withdraw an event, the Agent Corporate Action Notification Advice message must be used.\r\nThis message can be used to deactivate all the options of a corporate action event, in which case, no option should be mentioned in the message.\r\nThis message can also be used to deactivate one or more specific corporate action options, in which case, the option type and option number must be present.\r\nThis message can only be used when the deactivation date is after the market deadline. Before the market deadline, an updated notification advice message must be sent with option availability status: inactive or cancelled.\r\nAn un-effected deactivation (pending deactivation date/time) can be cancelled with an Agent Corporate Action Deactivation Cancellation Request.\r\nThe amendment of a deactivation is effected by cancel/replace mechanism."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AgentCADeactivationInstructionV01", propOrder = {"identification", "corporateActionGeneralInformation", "deactivationDetails"})
public class AgentCADeactivationInstructionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification8 identification;
	/**
	 * Identification assigned by the Sender to unambiguously identify the
	 * instruction.
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
	 * "Identification assigned by the Sender to unambiguously identify the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCADeactivationInstructionV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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

		public Method getGetterMethod() {
			try {
				return AgentCADeactivationInstructionV01.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionDeactivationInstruction1 deactivationDetails;
	/**
	 * Information related to the deactivation of a CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstruction1
	 * CorporateActionDeactivationInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeactvtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the deactivation of a CA event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDeactivationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "DeactvtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationDetails";
			definition = "Information related to the deactivation of a CA event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionDeactivationInstruction1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCADeactivationInstructionV01.class.getMethod("getDeactivationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCADeactivationInstructionV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to the CSD to instruct the deactivation of a corporate action event or to deactivate one or more specific options of the corporate action. As of the deactivation date, the CSD is allowed to reject any related election instruction received from clients.\r\nUsage\r\nDeactivation refers only to the empowerment of the CSD to reject further elections. To withdraw an event, the Agent Corporate Action Notification Advice message must be used.\r\nThis message can be used to deactivate all the options of a corporate action event, in which case, no option should be mentioned in the message.\r\nThis message can also be used to deactivate one or more specific corporate action options, in which case, the option type and option number must be present.\r\nThis message can only be used when the deactivation date is after the market deadline. Before the market deadline, an updated notification advice message must be sent with option availability status: inactive or cancelled.\r\nAn un-effected deactivation (pending deactivation date/time) can be cancelled with an Agent Corporate Action Deactivation Cancellation Request.\r\nThe amendment of a deactivation is effected by cancel/replace mechanism.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCADeactvtnInstr";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01.mmCorporateActionGeneralInformation, com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01.mmDeactivationDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "028";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCADeactivationInstructionV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification8 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "CorpActnGnlInf", required = true)
	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	@XmlElement(name = "DeactvtnDtls", required = true)
	public CorporateActionDeactivationInstruction1 getDeactivationDetails() {
		return deactivationDetails;
	}

	public void setDeactivationDetails(CorporateActionDeactivationInstruction1 deactivationDetails) {
		this.deactivationDetails = deactivationDetails;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.028.01.01")
	static public class Document {
		@XmlElement(name = "AgtCADeactvtnInstr", required = true)
		public AgentCADeactivationInstructionV01 messageBody;
	}
}