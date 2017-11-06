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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.ATMServiceType9Code;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Inquiry service provided by the ATM inside the session.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMService23#mmServiceReference
 * ATMService23.mmServiceReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService23#mmATMServiceCode
 * ATMService23.mmATMServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService23#mmHostServiceCode
 * ATMService23.mmHostServiceCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService23#mmServiceType
 * ATMService23.mmServiceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMService23#mmServiceVariantIdentification
 * ATMService23.mmServiceVariantIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMService23"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Inquiry service provided by the ATM inside the session."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMService24 ATMService24}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMService22
 * ATMService22}</li>
 * </ul>
 */
public class ATMService23 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text serviceReference;
	/**
	 * Unique identification of the customer session in which the transfer is
	 * performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService23 ATMService23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the customer session in which the transfer is performed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMService24#mmServiceReference
	 * ATMService24.mmServiceReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService22#mmServiceReference
	 * ATMService22.mmServiceReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService23.mmObject();
			isDerived = false;
			xmlTag = "SvcRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceReference";
			definition = "Unique identification of the customer session in which the transfer is performed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService24.mmServiceReference);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMService22.mmServiceReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text aTMServiceCode;
	/**
	 * Codification of the type of service for the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService23 ATMService23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMSvcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Codification of the type of service for the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMService24#mmATMServiceCode
	 * ATMService24.mmATMServiceCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService22#mmATMServiceCode
	 * ATMService22.mmATMServiceCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService23.mmObject();
			isDerived = false;
			xmlTag = "ATMSvcCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMServiceCode";
			definition = "Codification of the type of service for the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService24.mmATMServiceCode);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMService22.mmATMServiceCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text hostServiceCode;
	/**
	 * Codification of the type of service for the host.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService23 ATMService23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstSvcCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostServiceCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Codification of the type of service for the host."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMService24#mmHostServiceCode
	 * ATMService24.mmHostServiceCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostServiceCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService23.mmObject();
			isDerived = false;
			xmlTag = "HstSvcCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostServiceCode";
			definition = "Codification of the type of service for the host.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService24.mmHostServiceCode);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ATMServiceType9Code serviceType;
	/**
	 * Describes the type of fund transfer selected by the customer or the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code
	 * ATMServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService23 ATMService23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of fund transfer selected by the customer or the ATM."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMService24#mmServiceType
	 * ATMService24.mmServiceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService22#mmServiceType
	 * ATMService22.mmServiceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService23.mmObject();
			isDerived = false;
			xmlTag = "SvcTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceType";
			definition = "Describes the type of fund transfer selected by the customer or the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService24.mmServiceType);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMService22.mmServiceType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMServiceType9Code.mmObject();
		}
	};
	protected List<Max35Text> serviceVariantIdentification;
	/**
	 * Identification of the variant of the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMService23 ATMService23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcVarntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceVariantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the variant of the service."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMService24#mmServiceVariantIdentification
	 * ATMService24.mmServiceVariantIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMService22#mmServiceVariantIdentification
	 * ATMService22.mmServiceVariantIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceVariantIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMService23.mmObject();
			isDerived = false;
			xmlTag = "SvcVarntId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceVariantIdentification";
			definition = "Identification of the variant of the service.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService24.mmServiceVariantIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMService22.mmServiceVariantIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMService23.mmServiceReference, com.tools20022.repository.msg.ATMService23.mmATMServiceCode,
						com.tools20022.repository.msg.ATMService23.mmHostServiceCode, com.tools20022.repository.msg.ATMService23.mmServiceType, com.tools20022.repository.msg.ATMService23.mmServiceVariantIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMService23";
				definition = "Inquiry service provided by the ATM inside the session.";
				nextVersions_lazy = () -> Arrays.asList(ATMService24.mmObject());
				previousVersion_lazy = () -> ATMService22.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getServiceReference() {
		return serviceReference;
	}

	public void setServiceReference(Max35Text serviceReference) {
		this.serviceReference = serviceReference;
	}

	public Max35Text getATMServiceCode() {
		return aTMServiceCode;
	}

	public void setATMServiceCode(Max35Text aTMServiceCode) {
		this.aTMServiceCode = aTMServiceCode;
	}

	public Max35Text getHostServiceCode() {
		return hostServiceCode;
	}

	public void setHostServiceCode(Max35Text hostServiceCode) {
		this.hostServiceCode = hostServiceCode;
	}

	public ATMServiceType9Code getServiceType() {
		return serviceType;
	}

	public void setServiceType(ATMServiceType9Code serviceType) {
		this.serviceType = serviceType;
	}

	public List<Max35Text> getServiceVariantIdentification() {
		return serviceVariantIdentification;
	}

	public void setServiceVariantIdentification(List<Max35Text> serviceVariantIdentification) {
		this.serviceVariantIdentification = serviceVariantIdentification;
	}
}