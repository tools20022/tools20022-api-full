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
import com.tools20022.repository.area.TerminalManagementPreviousVersion;
import com.tools20022.repository.msg.ContentInformationType12;
import com.tools20022.repository.msg.Header29;
import com.tools20022.repository.msg.MaintenanceDelegationRequest3;
import com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * A terminal manager requests to the master terminal manager the delegation of
 * maintenance functions or maintenance operation on the terminal estate managed
 * by the master terminal manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03#mmHeader
 * MaintenanceDelegationRequestV03.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03#mmMaintenanceDelegationRequest
 * MaintenanceDelegationRequestV03.mmMaintenanceDelegationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03#mmSecurityTrailer
 * MaintenanceDelegationRequestV03.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOPreviousversion
 * CardPaymentsExchangesTerminalManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MntncDlgtnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TerminalManagementPreviousVersion
 * TerminalManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.005.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MaintenanceDelegationRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A terminal manager requests to the master terminal manager the delegation of maintenance functions or maintenance operation on the terminal estate managed by the master terminal manager."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV04
 * MaintenanceDelegationRequestV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02
 * MaintenanceDelegationRequestV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegationRequestV03", propOrder = {"header", "maintenanceDelegationRequest", "securityTrailer"})
public class MaintenanceDelegationRequestV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr")
	protected Header29 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header29
	 * Header29}</li>
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
	 * definition} = "Information related to the protocol management."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV04#mmHeader
	 * MaintenanceDelegationRequestV04.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02#mmHeader
	 * MaintenanceDelegationRequestV02.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MaintenanceDelegationRequestV03, Optional<Header29>> mmHeader = new MMMessageBuildingBlock<MaintenanceDelegationRequestV03, Optional<Header29>>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequestV04.mmHeader);
			previousVersion_lazy = () -> MaintenanceDelegationRequestV02.mmHeader;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Header29.mmObject();
		}

		@Override
		public Optional<Header29> getValue(MaintenanceDelegationRequestV03 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(MaintenanceDelegationRequestV03 obj, Optional<Header29> value) {
			obj.setHeader(value.orElse(null));
		}
	};
	@XmlElement(name = "MntncDlgtnReq", required = true)
	protected MaintenanceDelegationRequest3 maintenanceDelegationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest3
	 * MaintenanceDelegationRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntncDlgtnReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaintenanceDelegationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the request of maintenance delegations."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV04#mmMaintenanceDelegationRequest
	 * MaintenanceDelegationRequestV04.mmMaintenanceDelegationRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02#mmMaintenanceDelegationRequest
	 * MaintenanceDelegationRequestV02.mmMaintenanceDelegationRequest}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MaintenanceDelegationRequestV03, MaintenanceDelegationRequest3> mmMaintenanceDelegationRequest = new MMMessageBuildingBlock<MaintenanceDelegationRequestV03, MaintenanceDelegationRequest3>() {
		{
			xmlTag = "MntncDlgtnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceDelegationRequest";
			definition = "Information related to the request of maintenance delegations.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequestV04.mmMaintenanceDelegationRequest);
			previousVersion_lazy = () -> MaintenanceDelegationRequestV02.mmMaintenanceDelegationRequest;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MaintenanceDelegationRequest3.mmObject();
		}

		@Override
		public MaintenanceDelegationRequest3 getValue(MaintenanceDelegationRequestV03 obj) {
			return obj.getMaintenanceDelegationRequest();
		}

		@Override
		public void setValue(MaintenanceDelegationRequestV03 obj, MaintenanceDelegationRequest3 value) {
			obj.setMaintenanceDelegationRequest(value);
		}
	};
	@XmlElement(name = "SctyTrlr", required = true)
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
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV04#mmSecurityTrailer
	 * MaintenanceDelegationRequestV04.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02#mmSecurityTrailer
	 * MaintenanceDelegationRequestV02.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MaintenanceDelegationRequestV03, ContentInformationType12> mmSecurityTrailer = new MMMessageBuildingBlock<MaintenanceDelegationRequestV03, ContentInformationType12>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequestV04.mmSecurityTrailer);
			previousVersion_lazy = () -> MaintenanceDelegationRequestV02.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType12.mmObject();
		}

		@Override
		public ContentInformationType12 getValue(MaintenanceDelegationRequestV03 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(MaintenanceDelegationRequestV03 obj, ContentInformationType12 value) {
			obj.setSecurityTrailer(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegationRequestV03";
				definition = "A terminal manager requests to the master terminal manager the delegation of maintenance functions or maintenance operation on the terminal estate managed by the master terminal manager.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequestV04.mmObject());
				previousVersion_lazy = () -> MaintenanceDelegationRequestV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesTerminalManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "MntncDlgtnReq";
				businessArea_lazy = () -> TerminalManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03.mmHeader,
						com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03.mmMaintenanceDelegationRequest, com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "005";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MaintenanceDelegationRequestV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Header29> getHeader() {
		return header == null ? Optional.empty() : Optional.of(header);
	}

	public MaintenanceDelegationRequestV03 setHeader(Header29 header) {
		this.header = header;
		return this;
	}

	public MaintenanceDelegationRequest3 getMaintenanceDelegationRequest() {
		return maintenanceDelegationRequest;
	}

	public MaintenanceDelegationRequestV03 setMaintenanceDelegationRequest(MaintenanceDelegationRequest3 maintenanceDelegationRequest) {
		this.maintenanceDelegationRequest = Objects.requireNonNull(maintenanceDelegationRequest);
		return this;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return securityTrailer;
	}

	public MaintenanceDelegationRequestV03 setSecurityTrailer(ContentInformationType12 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.005.001.03")
	static public class Document {
		@XmlElement(name = "MntncDlgtnReq", required = true)
		public MaintenanceDelegationRequestV03 messageBody;
	}
}