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

package com.tools20022.repository.area.catm;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TerminalManagementLatestVersion;
import com.tools20022.repository.msg.AcceptorConfiguration4;
import com.tools20022.repository.msg.ContentInformationType12;
import com.tools20022.repository.msg.Header14;
import com.tools20022.repository.msgset.CAPETerminalManagementMaintenance20142015;
import com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Update of the acceptor configuration to be downloaded by the terminal
 * management system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TerminalManagementLatestVersion
 * TerminalManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOPreviousversion
 * CardPaymentsExchangesTerminalManagementISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CAPETerminalManagementMaintenance20142015
 * CAPETerminalManagementMaintenance20142015}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrCfgtnUpd"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmHeader
 * AcceptorConfigurationUpdateV04.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmAcceptorConfiguration
 * AcceptorConfigurationUpdateV04.mmAcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmSecurityTrailer
 * AcceptorConfigurationUpdateV04.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.003.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorConfigurationUpdateV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Update of the acceptor configuration to be downloaded by the terminal management system."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05
 * AcceptorConfigurationUpdateV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03
 * AcceptorConfigurationUpdateV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcceptorConfigurationUpdateV04", propOrder = {"header", "acceptorConfiguration", "securityTrailer"})
public class AcceptorConfigurationUpdateV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header14 header;
	/**
	 * Set of characteristics related to the transfer of the acceptor
	 * parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header14
	 * Header14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics related to the transfer of the acceptor parameters."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05#mmHeader
	 * AcceptorConfigurationUpdateV05.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03#mmHeader
	 * AcceptorConfigurationUpdateV03.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics related to the transfer of the acceptor parameters.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV05.mmHeader);
			previousVersion_lazy = () -> AcceptorConfigurationUpdateV03.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorConfigurationUpdateV04.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AcceptorConfiguration4 acceptorConfiguration;
	/**
	 * Acceptor configuration to be downloaded from the terminal management
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4
	 * AcceptorConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptrCfgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptor configuration to be downloaded from the terminal management system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05#mmAcceptorConfiguration
	 * AcceptorConfigurationUpdateV05.mmAcceptorConfiguration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03#mmAcceptorConfiguration
	 * AcceptorConfigurationUpdateV03.mmAcceptorConfiguration}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAcceptorConfiguration = new MMMessageBuildingBlock() {
		{
			xmlTag = "AccptrCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorConfiguration";
			definition = "Acceptor configuration to be downloaded from the terminal management system.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV05.mmAcceptorConfiguration);
			previousVersion_lazy = () -> AcceptorConfigurationUpdateV03.mmAcceptorConfiguration;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorConfiguration4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorConfigurationUpdateV04.class.getMethod("getAcceptorConfiguration", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContentInformationType12 securityTrailer;
	/**
	 * Trailer of the message containing a MAC or a digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trailer of the message containing a MAC or a digital signature."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05#mmSecurityTrailer
	 * AcceptorConfigurationUpdateV05.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03#mmSecurityTrailer
	 * AcceptorConfigurationUpdateV03.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV05.mmSecurityTrailer);
			previousVersion_lazy = () -> AcceptorConfigurationUpdateV03.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType12.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorConfigurationUpdateV04.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfigurationUpdateV04";
				definition = "Update of the acceptor configuration to be downloaded by the terminal management system.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV05.mmObject());
				previousVersion_lazy = () -> AcceptorConfigurationUpdateV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesTerminalManagementISOPreviousversion.mmObject(), CAPETerminalManagementMaintenance20142015.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCfgtnUpd";
				businessArea_lazy = () -> TerminalManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04.mmHeader, com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04.mmAcceptorConfiguration,
						com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "003";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorConfigurationUpdateV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public Header14 getHeader() {
		return header;
	}

	public void setHeader(Header14 header) {
		this.header = header;
	}

	@XmlElement(name = "AccptrCfgtn", required = true)
	public AcceptorConfiguration4 getAcceptorConfiguration() {
		return acceptorConfiguration;
	}

	public void setAcceptorConfiguration(AcceptorConfiguration4 acceptorConfiguration) {
		this.acceptorConfiguration = acceptorConfiguration;
	}

	@XmlElement(name = "SctyTrlr", required = true)
	public ContentInformationType12 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.04.04")
	static public class Document {
		@XmlElement(name = "AccptrCfgtnUpd", required = true)
		public AcceptorConfigurationUpdateV04 messageBody;
	}
}