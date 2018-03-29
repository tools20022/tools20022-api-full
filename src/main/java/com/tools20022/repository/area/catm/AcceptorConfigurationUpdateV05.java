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
import com.tools20022.repository.area.TerminalManagementArchive;
import com.tools20022.repository.msg.AcceptorConfiguration5;
import com.tools20022.repository.msg.ContentInformationType12;
import com.tools20022.repository.msg.Header27;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * Update of the acceptor configuration to be downloaded by the terminal
 * management system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05#mmHeader
 * AcceptorConfigurationUpdateV05.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05#mmAcceptorConfiguration
 * AcceptorConfigurationUpdateV05.mmAcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05#mmSecurityTrailer
 * AcceptorConfigurationUpdateV05.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrCfgtnUpd"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TerminalManagementArchive
 * TerminalManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.003.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorConfigurationUpdateV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Update of the acceptor configuration to be downloaded by the terminal management system."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV06
 * AcceptorConfigurationUpdateV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04
 * AcceptorConfigurationUpdateV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorConfigurationUpdateV05", propOrder = {"header", "acceptorConfiguration", "securityTrailer"})
public class AcceptorConfigurationUpdateV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header27 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header27
	 * Header27}</li>
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
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV06#mmHeader
	 * AcceptorConfigurationUpdateV06.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmHeader
	 * AcceptorConfigurationUpdateV04.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorConfigurationUpdateV05, Header27> mmHeader = new MMMessageBuildingBlock<AcceptorConfigurationUpdateV05, Header27>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics related to the transfer of the acceptor parameters.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV06.mmHeader);
			previousVersion_lazy = () -> AcceptorConfigurationUpdateV04.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header27.mmObject();
		}

		@Override
		public Header27 getValue(AcceptorConfigurationUpdateV05 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorConfigurationUpdateV05 obj, Header27 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "AccptrCfgtn", required = true)
	protected AcceptorConfiguration5 acceptorConfiguration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration5
	 * AcceptorConfiguration5}</li>
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
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV06#mmAcceptorConfiguration
	 * AcceptorConfigurationUpdateV06.mmAcceptorConfiguration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmAcceptorConfiguration
	 * AcceptorConfigurationUpdateV04.mmAcceptorConfiguration}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorConfigurationUpdateV05, AcceptorConfiguration5> mmAcceptorConfiguration = new MMMessageBuildingBlock<AcceptorConfigurationUpdateV05, AcceptorConfiguration5>() {
		{
			xmlTag = "AccptrCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorConfiguration";
			definition = "Acceptor configuration to be downloaded from the terminal management system.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV06.mmAcceptorConfiguration);
			previousVersion_lazy = () -> AcceptorConfigurationUpdateV04.mmAcceptorConfiguration;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorConfiguration5.mmObject();
		}

		@Override
		public AcceptorConfiguration5 getValue(AcceptorConfigurationUpdateV05 obj) {
			return obj.getAcceptorConfiguration();
		}

		@Override
		public void setValue(AcceptorConfigurationUpdateV05 obj, AcceptorConfiguration5 value) {
			obj.setAcceptorConfiguration(value);
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType12 securityTrailer;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV06#mmSecurityTrailer
	 * AcceptorConfigurationUpdateV06.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmSecurityTrailer
	 * AcceptorConfigurationUpdateV04.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorConfigurationUpdateV05, Optional<ContentInformationType12>> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorConfigurationUpdateV05, Optional<ContentInformationType12>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV06.mmSecurityTrailer);
			previousVersion_lazy = () -> AcceptorConfigurationUpdateV04.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType12.mmObject();
		}

		@Override
		public Optional<ContentInformationType12> getValue(AcceptorConfigurationUpdateV05 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorConfigurationUpdateV05 obj, Optional<ContentInformationType12> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfigurationUpdateV05";
				definition = "Update of the acceptor configuration to be downloaded by the terminal management system.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV06.mmObject());
				previousVersion_lazy = () -> AcceptorConfigurationUpdateV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCfgtnUpd";
				businessArea_lazy = () -> TerminalManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05.mmHeader, com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05.mmAcceptorConfiguration,
						com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "003";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorConfigurationUpdateV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header27 getHeader() {
		return header;
	}

	public AcceptorConfigurationUpdateV05 setHeader(Header27 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorConfiguration5 getAcceptorConfiguration() {
		return acceptorConfiguration;
	}

	public AcceptorConfigurationUpdateV05 setAcceptorConfiguration(AcceptorConfiguration5 acceptorConfiguration) {
		this.acceptorConfiguration = Objects.requireNonNull(acceptorConfiguration);
		return this;
	}

	public Optional<ContentInformationType12> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public AcceptorConfigurationUpdateV05 setSecurityTrailer(ContentInformationType12 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.05")
	static public class Document {
		@XmlElement(name = "AccptrCfgtnUpd", required = true)
		public AcceptorConfigurationUpdateV05 messageBody;
	}
}