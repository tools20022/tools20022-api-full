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
import com.tools20022.repository.msg.ContactPerson1;
import com.tools20022.repository.msg.CorporateActionStandingInstruction1;
import com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to the issuer (or its agent) to provide the
 * issuer (or its agent) with the CSD's client details for the distribution of
 * the proceeds of a corporate action event:<br>
 * - Gross or net payments.<br>
 * - Delivery details for securities that have to be delivered outside of the
 * CSD.<br>
 * - Delivery details for cash amounts that have to be delivered outside of the
 * CSD.<br>
 * <b>Usage</b><br>
 * This message is used to request the issuer (or its agent) to put a standing
 * instruction in place for proceeds.<br>
 * The amendment of a standing instruction is done through a cancel-and-replace
 * mechanism. First a standing instruction cancellation request is sent followed
 * by a new standing instruction request.
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
 * xmlTag} = "AgtCAStgInstrReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01#mmIdentification
 * AgentCAStandingInstructionRequestV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01#mmStandingInstructionGeneralInformation
 * AgentCAStandingInstructionRequestV01.mmStandingInstructionGeneralInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01#mmStandingInstructionDetails
 * AgentCAStandingInstructionRequestV01.mmStandingInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01#mmContactDetails
 * AgentCAStandingInstructionRequestV01.mmContactDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.025.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAStandingInstructionRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to the issuer (or its agent) to provide the issuer (or its agent) with the CSD's client details for the distribution of the proceeds of a corporate action event:\r\n- Gross or net payments.\r\n- Delivery details for securities that have to be delivered outside of the CSD.\r\n- Delivery details for cash amounts that have to be delivered outside of the CSD.\r\nUsage\r\nThis message is used to request the issuer (or its agent) to put a standing instruction in place for proceeds.\r\nThe amendment of a standing instruction is done through a cancel-and-replace mechanism. First a standing instruction cancellation request is sent followed by a new standing instruction request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AgentCAStandingInstructionRequestV01", propOrder = {"identification", "standingInstructionGeneralInformation", "standingInstructionDetails", "contactDetails"})
public class AgentCAStandingInstructionRequestV01 {

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

		public Method getGetterMethod() {
			try {
				return AgentCAStandingInstructionRequestV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionStandingInstructionGeneralInformation1 standingInstructionGeneralInformation;
	/**
	 * General information about the standing instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstructionGeneralInformation1
	 * CorporateActionStandingInstructionGeneralInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstrGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstructionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the standing instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingInstructionGeneralInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgInstrGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionGeneralInformation";
			definition = "General information about the standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionStandingInstructionGeneralInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAStandingInstructionRequestV01.class.getMethod("getStandingInstructionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionStandingInstruction1 standingInstructionDetails;
	/**
	 * Provides detailed information about the standing instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionStandingInstruction1
	 * CorporateActionStandingInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides detailed information about the standing instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstructionDetails";
			definition = "Provides detailed information about the standing instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionStandingInstruction1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAStandingInstructionRequestV01.class.getMethod("getStandingInstructionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContactPerson1 contactDetails;
	/**
	 * Contact responsible for the transaction identified in the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ContactPerson1
	 * ContactPerson1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contact responsible for the transaction identified in the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmContactDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactDetails";
			definition = "Contact responsible for the transaction identified in the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContactPerson1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAStandingInstructionRequestV01.class.getMethod("getContactDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAStandingInstructionRequestV01";
				definition = "Scope\r\nThis message is sent by a CSD to the issuer (or its agent) to provide the issuer (or its agent) with the CSD's client details for the distribution of the proceeds of a corporate action event:\r\n- Gross or net payments.\r\n- Delivery details for securities that have to be delivered outside of the CSD.\r\n- Delivery details for cash amounts that have to be delivered outside of the CSD.\r\nUsage\r\nThis message is used to request the issuer (or its agent) to put a standing instruction in place for proceeds.\r\nThe amendment of a standing instruction is done through a cancel-and-replace mechanism. First a standing instruction cancellation request is sent followed by a new standing instruction request.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCAStgInstrReq";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01.mmStandingInstructionGeneralInformation,
						com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01.mmStandingInstructionDetails, com.tools20022.repository.area.seev.AgentCAStandingInstructionRequestV01.mmContactDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "025";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAStandingInstructionRequestV01.class;
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

	@XmlElement(name = "StgInstrGnlInf", required = true)
	public CorporateActionStandingInstructionGeneralInformation1 getStandingInstructionGeneralInformation() {
		return standingInstructionGeneralInformation;
	}

	public void setStandingInstructionGeneralInformation(CorporateActionStandingInstructionGeneralInformation1 standingInstructionGeneralInformation) {
		this.standingInstructionGeneralInformation = standingInstructionGeneralInformation;
	}

	@XmlElement(name = "StgInstrDtls", required = true)
	public CorporateActionStandingInstruction1 getStandingInstructionDetails() {
		return standingInstructionDetails;
	}

	public void setStandingInstructionDetails(CorporateActionStandingInstruction1 standingInstructionDetails) {
		this.standingInstructionDetails = standingInstructionDetails;
	}

	@XmlElement(name = "CtctDtls")
	public ContactPerson1 getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactPerson1 contactDetails) {
		this.contactDetails = contactDetails;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.025.01.01")
	static public class Document {
		@XmlElement(name = "AgtCAStgInstrReq", required = true)
		public AgentCAStandingInstructionRequestV01 messageBody;
	}
}