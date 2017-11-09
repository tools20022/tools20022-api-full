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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#mmPayloadDetails
 * PayloadDescription1.mmPayloadDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#mmApplicationSpecificInformation
 * PayloadDescription1.mmApplicationSpecificInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#mmPayloadTypeDetails
 * PayloadDescription1.mmPayloadTypeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PayloadDescription1#mmManifestDetails
 * PayloadDescription1.mmManifestDetails}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PayloadDescription1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contains information about the payload."</li>
 * </ul>
 */
public class PayloadDescription1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PayloadDetails1 payloadDetails;
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
	public static final MMMessageAssociationEnd mmPayloadDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "PyldDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadDetails";
			definition = "This component is used to identify the instance of the document exchanged.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PayloadDetails1.mmObject();
		}
	};
	protected ApplicationSpecifics1 applicationSpecificInformation;
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
	public static final MMMessageAssociationEnd mmApplicationSpecificInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "ApplSpcfcInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationSpecificInformation";
			definition = "Contains business information that is considered as necessary by the service provider.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ApplicationSpecifics1.mmObject();
		}
	};
	protected PayloadTypeDetails1 payloadTypeDetails;
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
	public static final MMMessageAssociationEnd mmPayloadTypeDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "PyldTpDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayloadTypeDetails";
			definition = "Identification of the type of payload.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PayloadTypeDetails1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ManifestDetails1> manifestDetails;
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
	public static final MMMessageAssociationEnd mmManifestDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PayloadDescription1.mmObject();
			isDerived = false;
			xmlTag = "MnfstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManifestDetails";
			definition = "Manifest that describes the related items or attachments.\r\nThis block is repeated for each different type of item.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ManifestDetails1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PayloadDescription1.mmPayloadDetails, PayloadDescription1.mmApplicationSpecificInformation, PayloadDescription1.mmPayloadTypeDetails, PayloadDescription1.mmManifestDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PayloadDescription1";
				definition = "Contains information about the payload.";
			}
		});
		return mmObject_lazy.get();
	}

	public PayloadDetails1 getPayloadDetails() {
		return payloadDetails;
	}

	public void setPayloadDetails(com.tools20022.repository.msg.PayloadDetails1 payloadDetails) {
		this.payloadDetails = payloadDetails;
	}

	public ApplicationSpecifics1 getApplicationSpecificInformation() {
		return applicationSpecificInformation;
	}

	public void setApplicationSpecificInformation(com.tools20022.repository.msg.ApplicationSpecifics1 applicationSpecificInformation) {
		this.applicationSpecificInformation = applicationSpecificInformation;
	}

	public PayloadTypeDetails1 getPayloadTypeDetails() {
		return payloadTypeDetails;
	}

	public void setPayloadTypeDetails(com.tools20022.repository.msg.PayloadTypeDetails1 payloadTypeDetails) {
		this.payloadTypeDetails = payloadTypeDetails;
	}

	public List<ManifestDetails1> getManifestDetails() {
		return manifestDetails;
	}

	public void setManifestDetails(List<com.tools20022.repository.msg.ManifestDetails1> manifestDetails) {
		this.manifestDetails = manifestDetails;
	}
}