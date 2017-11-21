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
import com.tools20022.repository.entity.AcquirerRole;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the reconciliation for the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19#mmAcquirerIdentification
 * CardPaymentEnvironment19.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19#mmMerchantIdentification
 * CardPaymentEnvironment19.mmMerchantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19#mmPOIIdentification
 * CardPaymentEnvironment19.mmPOIIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardPaymentEnvironment19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the reconciliation for the acquirer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38
 * CardPaymentEnvironment38}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment7
 * CardPaymentEnvironment7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentEnvironment19", propOrder = {"acquirerIdentification", "merchantIdentification", "POIIdentification"})
public class CardPaymentEnvironment19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification32 acquirerIdentification;
	/**
	 * Acquirer involved in the card payment reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcquirerRole AcquirerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19
	 * CardPaymentEnvironment19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer involved in the card payment reconciliation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38#mmAcquirerIdentification
	 * CardPaymentEnvironment38.mmAcquirerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirerIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcquirerRole.mmObject();
			componentContext_lazy = () -> CardPaymentEnvironment19.mmObject();
			isDerived = false;
			xmlTag = "AcqrrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerIdentification";
			definition = "Acquirer involved in the card payment reconciliation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment38.mmAcquirerIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification32.mmObject();
		}
	};
	protected GenericIdentification32 merchantIdentification;
	/**
	 * Identification of the merchant requesting the reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19
	 * CardPaymentEnvironment19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrchntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the merchant requesting the reconciliation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38#mmMerchantIdentification
	 * CardPaymentEnvironment38.mmMerchantIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMerchantIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> CardPaymentEnvironment19.mmObject();
			isDerived = false;
			xmlTag = "MrchntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantIdentification";
			definition = "Identification of the merchant requesting the reconciliation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment38.mmMerchantIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification32.mmObject();
		}
	};
	protected GenericIdentification32 pOIIdentification;
	/**
	 * Identification of the POI requesting the reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment19
	 * CardPaymentEnvironment19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the POI requesting the reconciliation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment38#mmPOIIdentification
	 * CardPaymentEnvironment38.mmPOIIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> CardPaymentEnvironment19.mmObject();
			isDerived = false;
			xmlTag = "POIId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentification";
			definition = "Identification of the POI requesting the reconciliation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment38.mmPOIIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification32.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentEnvironment19.mmAcquirerIdentification, CardPaymentEnvironment19.mmMerchantIdentification, CardPaymentEnvironment19.mmPOIIdentification);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentEnvironment19";
				definition = "Environment of the reconciliation for the acquirer.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentEnvironment38.mmObject());
				previousVersion_lazy = () -> CardPaymentEnvironment7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcqrrId", required = true)
	public GenericIdentification32 getAcquirerIdentification() {
		return acquirerIdentification;
	}

	public void setAcquirerIdentification(com.tools20022.repository.msg.GenericIdentification32 acquirerIdentification) {
		this.acquirerIdentification = acquirerIdentification;
	}

	@XmlElement(name = "MrchntId")
	public GenericIdentification32 getMerchantIdentification() {
		return merchantIdentification;
	}

	public void setMerchantIdentification(com.tools20022.repository.msg.GenericIdentification32 merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
	}

	@XmlElement(name = "POIId")
	public GenericIdentification32 getPOIIdentification() {
		return pOIIdentification;
	}

	public void setPOIIdentification(com.tools20022.repository.msg.GenericIdentification32 pOIIdentification) {
		this.pOIIdentification = pOIIdentification;
	}
}