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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contains information about the payload.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#PayloadDetails
 * PayloadDescription1.PayloadDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#ApplicationSpecificInformation
 * PayloadDescription1.ApplicationSpecificInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#PayloadTypeDetails
 * PayloadDescription1.PayloadTypeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#ManifestDetails
 * PayloadDescription1.ManifestDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PayloadDescription1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contains information about the payload."</li>
 * </ul>
 */
public class PayloadDescription1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * This component is used to identify the instance of the document
	 * exchanged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PayloadDetails1
	 * PayloadDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDescription1
	 * PayloadDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyldDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayloadDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This component is used to identify the instance of the document exchanged."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PayloadDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "PyldDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadDetails";
			definition = "This component is used to identify the instance of the document exchanged.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PayloadDetails1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Contains business information that is considered as necessary by the
	 * service provider.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ApplicationSpecifics1
	 * ApplicationSpecifics1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDescription1
	 * PayloadDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplSpcfcInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationSpecificInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains business information that is considered as necessary by the service provider."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ApplicationSpecificInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "ApplSpcfcInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationSpecificInformation";
			definition = "Contains business information that is considered as necessary by the service provider.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ApplicationSpecifics1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the type of payload.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PayloadTypeDetails1
	 * PayloadTypeDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDescription1
	 * PayloadDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyldTpDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayloadTypeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the type of payload."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PayloadTypeDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "PyldTpDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadTypeDetails";
			definition = "Identification of the type of payload.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PayloadTypeDetails1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Manifest that describes the related items or attachments.<br>
	 * This block is repeated for each different type of item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ManifestDetails1
	 * ManifestDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PayloadDescription1
	 * PayloadDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnfstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManifestDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manifest that describes the related items or attachments.\r\nThis block is repeated for each different type of item."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ManifestDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "MnfstDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManifestDetails";
			definition = "Manifest that describes the related items or attachments.\r\nThis block is repeated for each different type of item.";
			minOccurs = 0;
			type_lazy = () -> ManifestDetails1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PayloadDescription1.PayloadDetails, com.tools20022.repository.msg.PayloadDescription1.ApplicationSpecificInformation,
						com.tools20022.repository.msg.PayloadDescription1.PayloadTypeDetails, com.tools20022.repository.msg.PayloadDescription1.ManifestDetails);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PayloadDescription1";
				definition = "Contains information about the payload.";
			}
		});
		return mmObject_lazy.get();
	}
}