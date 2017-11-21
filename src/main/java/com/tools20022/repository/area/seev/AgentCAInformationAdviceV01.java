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
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by a CSD to an issuer (or its agent) to provide
 * information about the certification and/or the delivery details to the issuer
 * (or its agent).<br>
 * <b>Usage</b><br>
 * This message can be used in the case of a corporate action event without an
 * election.<br>
 * This message can also be used in the case of a corporate action event with
 * election when the election details and the additional information cannot be
 * provided in the same message. In this case, the Agent Corporate Action
 * Election Advice Identification must be used to link this message to the
 * election advice for which additional information is provided.
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
 * xmlTag} = "AgtCAInfAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmIdentification
 * AgentCAInformationAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmAgentCAElectionAdviceIdentification
 * AgentCAInformationAdviceV01.mmAgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmCorporateActionGeneralInformation
 * AgentCAInformationAdviceV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmAccountDetails
 * AgentCAInformationAdviceV01.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmCorporateActionAdditionalInformation
 * AgentCAInformationAdviceV01.mmCorporateActionAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmContactDetails
 * AgentCAInformationAdviceV01.mmContactDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.023.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAInformationAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to provide information about the certification and/or the delivery details to the issuer (or its agent).\r\nUsage\r\nThis message can be used in the case of a corporate action event without an election.\r\nThis message can also be used in the case of a corporate action event with election when the election details and the additional information cannot be provided in the same message. In this case, the Agent Corporate Action Election Advice Identification must be used to link this message to the election advice for which additional information is provided."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AgentCAInformationAdviceV01", propOrder = {"identification", "agentCAElectionAdviceIdentification", "corporateActionGeneralInformation", "accountDetails", "corporateActionAdditionalInformation", "contactDetails"})
public class AgentCAInformationAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification8 identification;
	/**
	 * Identification assigned by the Sender to unambiguously identify the
	 * advice.
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
	 * "Identification assigned by the Sender to unambiguously identify the advice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAInformationAdviceV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DocumentIdentification8 agentCAElectionAdviceIdentification;
	/**
	 * Identification of the linked Agent CA Election Advice Identification
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCAElctnAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAElectionAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Election Advice Identification"</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCAElectionAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAElctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAdviceIdentification";
			definition = "Identification of the linked Agent CA Election Advice Identification";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAInformationAdviceV01.class.getMethod("getAgentCAElectionAdviceIdentification", new Class[]{});
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
				return AgentCAInformationAdviceV01.class.getMethod("getCorporateActionGeneralInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesAccount7 accountDetails;
	/**
	 * Information about the account for which additional information is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount7
	 * SecuritiesAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the account for which additional information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "Information about the account for which additional information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAInformationAdviceV01.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionAdditionalInformation1 corporateActionAdditionalInformation;
	/**
	 * Additional information about the corporate action such as the delivery
	 * details.
	 * <p>
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
	public static final MMMessageBuildingBlock mmCorporateActionAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionAdditionalInformation";
			definition = "Additional information about the corporate action such as the delivery details.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAInformationAdviceV01.class.getMethod("getCorporateActionAdditionalInformation", new Class[]{});
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
				return AgentCAInformationAdviceV01.class.getMethod("getContactDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAInformationAdviceV01";
				definition = "Scope\r\nThis message is sent by a CSD to an issuer (or its agent) to provide information about the certification and/or the delivery details to the issuer (or its agent).\r\nUsage\r\nThis message can be used in the case of a corporate action event without an election.\r\nThis message can also be used in the case of a corporate action event with election when the election details and the additional information cannot be provided in the same message. In this case, the Agent Corporate Action Election Advice Identification must be used to link this message to the election advice for which additional information is provided.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCAInfAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAInformationAdviceV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAInformationAdviceV01.mmAgentCAElectionAdviceIdentification, com.tools20022.repository.area.seev.AgentCAInformationAdviceV01.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.AgentCAInformationAdviceV01.mmAccountDetails, com.tools20022.repository.area.seev.AgentCAInformationAdviceV01.mmCorporateActionAdditionalInformation,
						com.tools20022.repository.area.seev.AgentCAInformationAdviceV01.mmContactDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "023";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAInformationAdviceV01.class;
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

	@XmlElement(name = "AgtCAElctnAdvcId")
	public DocumentIdentification8 getAgentCAElectionAdviceIdentification() {
		return agentCAElectionAdviceIdentification;
	}

	public void setAgentCAElectionAdviceIdentification(DocumentIdentification8 agentCAElectionAdviceIdentification) {
		this.agentCAElectionAdviceIdentification = agentCAElectionAdviceIdentification;
	}

	@XmlElement(name = "CorpActnGnlInf", required = true)
	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public void setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = corporateActionGeneralInformation;
	}

	@XmlElement(name = "AcctDtls", required = true)
	public SecuritiesAccount7 getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(SecuritiesAccount7 accountDetails) {
		this.accountDetails = accountDetails;
	}

	@XmlElement(name = "CorpActnAddtlInf", required = true)
	public CorporateActionAdditionalInformation1 getCorporateActionAdditionalInformation() {
		return corporateActionAdditionalInformation;
	}

	public void setCorporateActionAdditionalInformation(CorporateActionAdditionalInformation1 corporateActionAdditionalInformation) {
		this.corporateActionAdditionalInformation = corporateActionAdditionalInformation;
	}

	@XmlElement(name = "CtctDtls")
	public ContactPerson1 getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactPerson1 contactDetails) {
		this.contactDetails = contactDetails;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.023.01.01")
	static public class Document {
		@XmlElement(name = "AgtCAInfAdvc", required = true)
		public AgentCAInformationAdviceV01 messageBody;
	}
}