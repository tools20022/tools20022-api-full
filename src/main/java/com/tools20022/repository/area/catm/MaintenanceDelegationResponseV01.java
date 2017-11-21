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
import com.tools20022.repository.msg.MaintenanceDelegationResponse1;
import com.tools20022.repository.msgset.CAPETerminalManagementMaintenance20142015;
import com.tools20022.repository.msgset.CardPaymentsExchangesTerminalManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The master terminal manager provides the outcome of a maintenance delegation
 * request to a terminal manager.
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
 * xmlTag} = "MntncDlgtnRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV01#mmHeader
 * MaintenanceDelegationResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV01#mmMaintenanceDelegationResponse
 * MaintenanceDelegationResponseV01.mmMaintenanceDelegationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV01#mmSecurityTrailer
 * MaintenanceDelegationResponseV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.006.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MaintenanceDelegationResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The master terminal manager provides the outcome of a maintenance delegation request to a terminal manager."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02
 * MaintenanceDelegationResponseV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MaintenanceDelegationResponseV01", propOrder = {"header", "maintenanceDelegationResponse", "securityTrailer"})
public class MaintenanceDelegationResponseV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header16 header;
	/**
	 * Maintenance delegation response message management information.
	 * <p>
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
	 * definition} =
	 * "Maintenance delegation response message management information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02#mmHeader
	 * MaintenanceDelegationResponseV02.mmHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Maintenance delegation response message management information.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationResponseV02.mmHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MaintenanceDelegationResponseV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MaintenanceDelegationResponse1 maintenanceDelegationResponse;
	/**
	 * Information related to the request of maintenance delegations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegationResponse1
	 * MaintenanceDelegationResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntncDlgtnRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaintenanceDelegationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the request of maintenance delegations."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02#mmMaintenanceDelegationResponse
	 * MaintenanceDelegationResponseV02.mmMaintenanceDelegationResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMaintenanceDelegationResponse = new MMMessageBuildingBlock() {
		{
			xmlTag = "MntncDlgtnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceDelegationResponse";
			definition = "Information related to the request of maintenance delegations.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationResponseV02.mmMaintenanceDelegationResponse);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MaintenanceDelegationResponse1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MaintenanceDelegationResponseV01.class.getMethod("getMaintenanceDelegationResponse", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02#mmSecurityTrailer
	 * MaintenanceDelegationResponseV02.mmSecurityTrailer}</li>
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
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationResponseV02.mmSecurityTrailer);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType12.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MaintenanceDelegationResponseV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegationResponseV01";
				definition = "The master terminal manager provides the outcome of a maintenance delegation request to a terminal manager.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegationResponseV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesTerminalManagementISOPreviousversion.mmObject(), CAPETerminalManagementMaintenance20142015.mmObject());
				rootElement = "Document";
				xmlTag = "MntncDlgtnRspn";
				businessArea_lazy = () -> TerminalManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.MaintenanceDelegationResponseV01.mmHeader,
						com.tools20022.repository.area.catm.MaintenanceDelegationResponseV01.mmMaintenanceDelegationResponse, com.tools20022.repository.area.catm.MaintenanceDelegationResponseV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "006";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MaintenanceDelegationResponseV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public Header16 getHeader() {
		return header;
	}

	public void setHeader(Header16 header) {
		this.header = header;
	}

	@XmlElement(name = "MntncDlgtnRspn", required = true)
	public MaintenanceDelegationResponse1 getMaintenanceDelegationResponse() {
		return maintenanceDelegationResponse;
	}

	public void setMaintenanceDelegationResponse(MaintenanceDelegationResponse1 maintenanceDelegationResponse) {
		this.maintenanceDelegationResponse = maintenanceDelegationResponse;
	}

	@XmlElement(name = "SctyTrlr", required = true)
	public ContentInformationType12 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:catm.006.01.01")
	static public class Document {
		@XmlElement(name = "MntncDlgtnRspn", required = true)
		public MaintenanceDelegationResponseV01 messageBody;
	}
}