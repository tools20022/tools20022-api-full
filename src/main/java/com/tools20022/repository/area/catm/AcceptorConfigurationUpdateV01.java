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
import com.tools20022.repository.msg.AcceptorConfiguration1;
import com.tools20022.repository.msg.ContentInformationType1;
import com.tools20022.repository.msg.Header4;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AcceptorConfigurationUpdate message is sent by the master terminal
 * manager or delegated terminal manager to the acceptor system for the update
 * of acquirer parameters, merchant parameters, vendor parameters or
 * cryptographic keys of the acquirer.<br>
 * <b>Usage</b><br>
 * The AcceptorConfigurationUpdate message may embed the information required by
 * the acceptor system for the configuration of:<br>
 * - the application parameters necessary for software applications processed by
 * the POI system,<br>
 * - the acquirer protocol parameters for the message content and message
 * exchange behaviour of the acquirer protocol supported by the POI system,<br>
 * - the host communication parameters to define the addresses of the connected
 * acquirer hosts, and<br>
 * - the merchant parameters needed for the retailer protocol settings of the
 * POI system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV01#mmHeader
 * AcceptorConfigurationUpdateV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV01#mmAcceptorConfiguration
 * AcceptorConfigurationUpdateV01.mmAcceptorConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV01#mmSecurityTrailer
 * AcceptorConfigurationUpdateV01.mmSecurityTrailer}</li>
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
 * messageDefinitionIdentifier} = {@code catm.003.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorConfigurationUpdateV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AcceptorConfigurationUpdate message is sent by the master terminal manager or delegated terminal manager to the acceptor system for the update of acquirer parameters, merchant parameters, vendor parameters or cryptographic keys of the acquirer.\r\nUsage\r\nThe AcceptorConfigurationUpdate message may embed the information required by the acceptor system for the configuration of:\r\n- the application parameters necessary for software applications processed by the POI system,\r\n- the acquirer protocol parameters for the message content and message exchange behaviour of the acquirer protocol supported by the POI system,\r\n- the host communication parameters to define the addresses of the connected acquirer hosts, and\r\n- the merchant parameters needed for the retailer protocol settings of the POI system."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV02
 * AcceptorConfigurationUpdateV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorConfigurationUpdateV01", propOrder = {"header", "acceptorConfiguration", "securityTrailer"})
public class AcceptorConfigurationUpdateV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header4 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header4 Header4}
	 * </li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics related to the transfer of the acceptor parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorConfigurationUpdateV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AccptrCfgtn", required = true)
	protected AcceptorConfiguration1 acceptorConfiguration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration1
	 * AcceptorConfiguration1}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAcceptorConfiguration = new MMMessageBuildingBlock() {
		{
			xmlTag = "AccptrCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorConfiguration";
			definition = "Acceptor configuration to be downloaded from the terminal management system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorConfiguration1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorConfigurationUpdateV01.class.getMethod("getAcceptorConfiguration", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SctyTrlr", required = true)
	protected ContentInformationType1 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType1
	 * ContentInformationType1}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorConfigurationUpdateV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfigurationUpdateV01";
				definition = "Scope\r\nThe AcceptorConfigurationUpdate message is sent by the master terminal manager or delegated terminal manager to the acceptor system for the update of acquirer parameters, merchant parameters, vendor parameters or cryptographic keys of the acquirer.\r\nUsage\r\nThe AcceptorConfigurationUpdate message may embed the information required by the acceptor system for the configuration of:\r\n- the application parameters necessary for software applications processed by the POI system,\r\n- the acquirer protocol parameters for the message content and message exchange behaviour of the acquirer protocol supported by the POI system,\r\n- the host communication parameters to define the addresses of the connected acquirer hosts, and\r\n- the merchant parameters needed for the retailer protocol settings of the POI system.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCfgtnUpd";
				businessArea_lazy = () -> TerminalManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV01.mmHeader, com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV01.mmAcceptorConfiguration,
						com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "003";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorConfigurationUpdateV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header4 getHeader() {
		return header;
	}

	public AcceptorConfigurationUpdateV01 setHeader(Header4 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorConfiguration1 getAcceptorConfiguration() {
		return acceptorConfiguration;
	}

	public AcceptorConfigurationUpdateV01 setAcceptorConfiguration(AcceptorConfiguration1 acceptorConfiguration) {
		this.acceptorConfiguration = Objects.requireNonNull(acceptorConfiguration);
		return this;
	}

	public ContentInformationType1 getSecurityTrailer() {
		return securityTrailer;
	}

	public AcceptorConfigurationUpdateV01 setSecurityTrailer(ContentInformationType1 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.003.001.01")
	static public class Document {
		@XmlElement(name = "AccptrCfgtnUpd", required = true)
		public AcceptorConfigurationUpdateV01 messageBody;
	}
}