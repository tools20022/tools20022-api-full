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
import com.tools20022.repository.msg.ContentInformationType12;
import com.tools20022.repository.msg.Header16;
import com.tools20022.repository.msg.MaintenanceDelegationRequest1;
import com.tools20022.repository.msgset.CAPETerminalManagementMaintenance20142015;
import com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV01#mmHeader
 * MaintenanceDelegationRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV01#mmMaintenanceDelegationRequest
 * MaintenanceDelegationRequestV01.mmMaintenanceDelegationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV01#mmSecurityTrailer
 * MaintenanceDelegationRequestV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MntncDlgtnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TerminalManagementLatestVersion
 * TerminalManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.005.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MaintenanceDelegationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A terminal manager requests to the master terminal manager the delegation of maintenance functions or maintenance operation on the terminal estate managed by the master terminal manager."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02
 * MaintenanceDelegationRequestV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegationRequestV01", propOrder = {"header", "maintenanceDelegationRequest", "securityTrailer"})
public class MaintenanceDelegationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header16 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header16
	 * Header16}</li>
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
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02#mmHeader
	 * MaintenanceDelegationRequestV02.mmHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequestV02.mmHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MaintenanceDelegationRequestV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MntncDlgtnReq", required = true)
	protected MaintenanceDelegationRequest1 maintenanceDelegationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationRequest1
	 * MaintenanceDelegationRequest1}</li>
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
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02#mmMaintenanceDelegationRequest
	 * MaintenanceDelegationRequestV02.mmMaintenanceDelegationRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMaintenanceDelegationRequest = new MMMessageBuildingBlock() {
		{
			xmlTag = "MntncDlgtnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceDelegationRequest";
			definition = "Information related to the request of maintenance delegations.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequestV02.mmMaintenanceDelegationRequest);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MaintenanceDelegationRequest1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MaintenanceDelegationRequestV01.class.getMethod("getMaintenanceDelegationRequest", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02#mmSecurityTrailer
	 * MaintenanceDelegationRequestV02.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequestV02.mmSecurityTrailer);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType12.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MaintenanceDelegationRequestV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegationRequestV01";
				definition = "A terminal manager requests to the master terminal manager the delegation of maintenance functions or maintenance operation on the terminal estate managed by the master terminal manager.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationRequestV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesTerminalManagementISOPreviousversion.mmObject(), CAPETerminalManagementMaintenance20142015.mmObject());
				rootElement = "Document";
				xmlTag = "MntncDlgtnReq";
				businessArea_lazy = () -> TerminalManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.MaintenanceDelegationRequestV01.mmHeader,
						com.tools20022.repository.area.catm.MaintenanceDelegationRequestV01.mmMaintenanceDelegationRequest, com.tools20022.repository.area.catm.MaintenanceDelegationRequestV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "005";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MaintenanceDelegationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header16 getHeader() {
		return header;
	}

	public MaintenanceDelegationRequestV01 setHeader(Header16 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public MaintenanceDelegationRequest1 getMaintenanceDelegationRequest() {
		return maintenanceDelegationRequest;
	}

	public MaintenanceDelegationRequestV01 setMaintenanceDelegationRequest(MaintenanceDelegationRequest1 maintenanceDelegationRequest) {
		this.maintenanceDelegationRequest = Objects.requireNonNull(maintenanceDelegationRequest);
		return this;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return securityTrailer;
	}

	public MaintenanceDelegationRequestV01 setSecurityTrailer(ContentInformationType12 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.005.001.01")
	static public class Document {
		@XmlElement(name = "MntncDlgtnReq", required = true)
		public MaintenanceDelegationRequestV01 messageBody;
	}
}